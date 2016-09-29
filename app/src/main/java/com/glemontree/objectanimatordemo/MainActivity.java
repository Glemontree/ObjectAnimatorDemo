package com.glemontree.objectanimatordemo;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ObjectAnimator animator = ObjectAnimator.ofFloat(textView, "alpha", 1f, 0f, 1f);
        animator.setDuration(5000);
        animator.start();

        ObjectAnimator animator1 = ObjectAnimator.ofFloat(textView, "rotation", 0f, 360f);
        animator1.setDuration(5000);
        animator1.start();

        float x = textView.getTranslationX();
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(textView, "translationX", x, -500f, x);
        animator2.setDuration(5000);
        animator2.start();

        ObjectAnimator animator3 = ObjectAnimator.ofFloat(textView, "scaleY", 1f, 3f, 1f);
        animator3.setDuration(5000);
        animator3.start();

        ObjectAnimator moveIn = ObjectAnimator.ofFloat(textView, "translationX", -500f, 0f);
        ObjectAnimator rotate = ObjectAnimator.ofFloat(textView, "rotation", 0f, 360f);
        ObjectAnimator fadeInOut = ObjectAnimator.ofFloat(textView, "alpha", 1f, 0f, 1f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(rotate).with(fadeInOut).after(moveIn);
        animatorSet.setDuration(5000);
        animatorSet.start();

        animator.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {

            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });
    }
}
