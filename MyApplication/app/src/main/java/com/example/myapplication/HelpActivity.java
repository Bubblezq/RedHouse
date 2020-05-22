package com.example.myapplication;

import android.app.Activity;
import android.app.ActivityOptions;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class HelpActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help);

        Button b1=findViewById(R.id.back);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HelpActivity.this, MapActivity.class),
                        ActivityOptions.makeSceneTransitionAnimation(HelpActivity.this).toBundle());
            }
        });
    }
}
