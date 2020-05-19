package com.example.myapplication;

import android.app.Activity;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.annotation.SuppressLint;
import android.util.Log;

public class HengWuYuanActivity extends Activity {
    private int verdict_count=0;
    private int text_count=0;
    private float originalX;
    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hengwuyuan);

        final TextView ve=findViewById(R.id.verdict);
        ve.bringToFront();
        final TextView tv=findViewById(R.id.dialog);
        tv.bringToFront();
        final ImageView iv=findViewById(R.id.displayImage);
        iv.bringToFront();

        ImageView btn=findViewById(R.id.room);
        btn.bringToFront();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TypedArray ta=getResources().obtainTypedArray(R.array.xuebaochai_verdict);
                TypedArray tb=getResources().obtainTypedArray(R.array.xuebaochai);
                int id1=ta.getResourceId(verdict_count,-1);
                int id2=tb.getResourceId(text_count,-1);
                if(id1==R.string.occupation) {
                    verdict_count=0;
                    ta.recycle();
                    return;
                }
                if(id2==R.string.occupation) {
                    text_count=0;
                    tb.recycle();
                    return;
                }
                ve.setText(id1);
                ve.setVisibility(View.VISIBLE);
                tv.setText(id2);
                tv.setVisibility(View.VISIBLE);
            }
        });

        ve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TypedArray ta=getResources().obtainTypedArray(R.array.xuebaochai_verdict);
                int id=ta.getResourceId(verdict_count,-1);
                if(id==R.string.occupation) {
                    verdict_count=0;
                    ta.recycle();
                    return;
                }
                ve.setText(id);
                ve.setVisibility(View.VISIBLE);
                verdict_count=verdict_count+1;
                ta.recycle();
            }
        });

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TypedArray ta=getResources().obtainTypedArray(R.array.xuebaochai);
                int id=ta.getResourceId(text_count,-1);
                if(id==R.string.occupation) {
                    text_count=0;
                    ta.recycle();
                    return;
                }
                tv.setText(id);
                tv.setVisibility(View.VISIBLE);
                text_count=text_count+1;
                ta.recycle();
            }
        });

        Button b1=findViewById(R.id.back);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        iv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction()==MotionEvent.ACTION_DOWN)
                {
                    originalX=event.getRawX();
                    Log.v("originalX:",String.valueOf(originalX));
                }
                if(event.getAction()==MotionEvent.ACTION_MOVE)
                {
                    float currentX=event.getRawX();
                    Log.v("currentX:",String.valueOf(currentX));
                    iv.setX(iv.getX()+currentX-originalX);
                    originalX=currentX;
                }
                return true;
            }
        });
    }
}
