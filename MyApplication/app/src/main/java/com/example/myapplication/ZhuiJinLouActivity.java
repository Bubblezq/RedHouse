package com.example.myapplication;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class ZhuiJinLouActivity extends Activity {
    private int text_count=0;
    private float originalX;
    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zhuijinlou);

        /*Button b2=findViewById(R.id.unknown);
        Button b3=findViewById(R.id.more);*/

        final TextView tv=findViewById(R.id.dialog);
        tv.bringToFront();
        final ImageView iv=findViewById(R.id.displayImage);
        iv.bringToFront();

        ImageButton btn=findViewById(R.id.imageButton);
        btn.bringToFront();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TypedArray ta=getResources().obtainTypedArray(R.array.text);
                int id=ta.getResourceId(text_count,-1);
                tv.setText(id);
                tv.setVisibility(View.VISIBLE);
                iv.setVisibility(View.VISIBLE);
                text_count=text_count+1;
                ta.recycle();
            }
        });

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TypedArray ta=getResources().obtainTypedArray(R.array.text);
                int id=ta.getResourceId(text_count,-1);
                if(id==R.string.occupation) {
                    text_count=0;
                    tv.setVisibility(View.GONE);
                    iv.setVisibility(View.GONE);
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
