package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MapActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);

        Button btn1=findViewById(R.id.yihongyuan);
        btn1.bringToFront();
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MapActivity.this,YiHongYuanActivity.class);
                startActivity(intent);
            }
        });
        Button btn2=findViewById(R.id.xiaoxiangguan );
        btn2.bringToFront();
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MapActivity.this,XiaoXiangGuanActivity.class);
                startActivity(intent);
            }
        });
        Button btn3=findViewById(R.id.xingqinbieshu );
        btn3.bringToFront();
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MapActivity.this,XingQinBieShuActivity.class);
                startActivity(intent);
            }
        });
        Button btn4=findViewById(R.id.longcuian);
        btn4.bringToFront();
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MapActivity.this,LongCuiAnActivity.class);
                startActivity(intent);
            }
        });
        Button btn5=findViewById(R.id.zhuijinlou);
        btn5.bringToFront();
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MapActivity.this,ZhuiJinLouActivity.class);
                startActivity(intent);
            }
        });
        Button btn6=findViewById(R.id.hengwuyuan);
        btn6.bringToFront();
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MapActivity.this,HengWuYuanActivity.class);
                startActivity(intent);
            }
        });
        Button btn7=findViewById(R.id.hongxiangpu);
        btn7.bringToFront();
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MapActivity.this,HongXiangPuActivity.class);
                startActivity(intent);
            }
        });
        Button btn8=findViewById(R.id.daoxiangcun);
        btn8.bringToFront();
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MapActivity.this,DaoXiangCunActivity.class);
                startActivity(intent);
            }
        });
        Button btn9=findViewById(R.id.liaofengxuan);
        btn9.bringToFront();
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MapActivity.this,LiaoFengXuanActivity.class);
                startActivity(intent);
            }
        });
        Button btn10=findViewById(R.id.qiushuangzhai);
        btn10.bringToFront();
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MapActivity.this,QiuShuangZhaiActivity.class);
                startActivity(intent);
            }
        });

        Button btn11=findViewById(R.id.zhanhuaming);
        btn11.bringToFront();
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MapActivity.this,QiuShuangZhaiActivity.class);
                startActivity(intent);
            }
        });
        Button btn12=findViewById(R.id.yuanxiaodengmi);
        btn12.bringToFront();
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MapActivity.this,QiuShuangZhaiActivity.class);
                startActivity(intent);
            }
        });

        Button b1=findViewById(R.id.back);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.os.Process.killProcess(android.os.Process.myPid());
            }
        });
    }
}
