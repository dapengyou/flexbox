package com.example.ztt.flexbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.flexbox.FlexboxLayout;

public class MainActivity extends AppCompatActivity {
    private FlexboxLayout mFlexboxLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFlexboxLayout = (FlexboxLayout) findViewById(R.id.flexbox_layout);
// 通过代码向FlexboxLayout添加View
//        TextView textView = new TextView(this);
//        textView.setBackgroundResource(R.drawable.label_bg_shape);
//        textView.setText("Test  Label");
//        textView.setGravity(Gravity.CENTER);
//        textView.setPadding(30, 0, 30, 0);
//        textView.setTextColor(getResources().getColor(R.color.text_color));
//        mFlexboxLayout.addView(textView);
//通过FlexboxLayout.LayoutParams 设置子元素支持的属性
//        ViewGroup.LayoutParams params = textView.getLayoutParams();
//        if (params instanceof FlexboxLayout.LayoutParams) {
//            FlexboxLayout.LayoutParams layoutParams = (FlexboxLayout.LayoutParams) params;
//            layoutParams.setFlexBasisPercent(0.5f);
//        }
    }
}
