package com.jiyun.text.day01;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by lenovo on 2017/9/11.
 * Name by  cwl
 */

public class CustomView  extends View {

    public CustomView(Context context) {
        super(context);

    }



    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);

    }

    public CustomView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }

    public CustomView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//1
        Paint p=new Paint();
        p.setTextSize(10);
        p.setColor(Color.BLUE);

        RectF rec=new RectF(70,800,180,1500);
        canvas.drawRect(rec,p);

//2
        Paint p1=new Paint();
        p1.setTextSize(10);
        p1.setColor(Color.RED);

        RectF rect=new RectF(300,1000,410,1500);   //左上右下
        canvas.drawRect(rect,p1);





    }
}
