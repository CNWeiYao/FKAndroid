package com.example.root.demo001;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import java.nio.file.attribute.AttributeView;

/**
 * Created by root on 17-11-14.
 */

public class DrawView extends View {
    //获取触摸位置
    public float currentX=0;
    public float currentY=0;
    Paint p =new Paint();//新建画笔
    public DrawView(Context context)
    {
        super(context);
    }//构造方法
    public DrawView(Context context, AttributeSet set)
    {
        super(context,set);
    }//重载构造方法
    public void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        p.setColor(Color.RED);//画笔颜色为红色
        canvas.drawCircle(currentX,currentY,20,p);//在（currentX,currentY）画一个半径位20的圆
    }//重写onDraw方法
    public boolean onTouchEvent(MotionEvent event)
    {
        currentX=event.getX();
        currentY=event.getY();
        invalidate();//通知当前组件重绘自己
        return true;//返回true代表已经处理该触摸事件
    }
}
