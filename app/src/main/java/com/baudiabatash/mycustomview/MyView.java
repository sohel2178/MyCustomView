package com.baudiabatash.mycustomview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Sohel on 1/3/2017.
 */

public class MyView extends View {

    private Paint myPaint;
    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setBackgroundColor(Color.WHITE);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        myPaint= new Paint();
        myPaint.setAntiAlias(true);
        myPaint.setColor(Color.BLACK);
    }
}
