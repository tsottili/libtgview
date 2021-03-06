package toms.lib.libtgview;

import android.graphics.Canvas;
import android.graphics.Paint;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * Created by toms on 29/08/14.
 */
public class GStrokeCircle extends GCircle {
    public GStrokeCircle(GView view, String Id, float cx, float cy, float radius) {
        super(view, Id, cx, cy, radius);
        mPaint.setStyle(Paint.Style.STROKE);
    }

    public GStrokeCircle(GView view, String Id, float cx, float cy, float radius, int color) {
        this(view, Id, cx, cy, radius);
        setColor(color);
    }

    @Override
    public void draw(Canvas c) {
        c.drawCircle(mCenter.x, mCenter.y, mRadius, mPaint);
    }

    @Override
    public boolean isInside(float x, float y) {
        return (mCenter.distanceFrom(x, y) == mRadius);
    }

    public void save(DataOutputStream ds) throws IOException {
        super.save(ds);


    }

    public void load(DataInputStream ds) throws IOException {
        super.load(ds);


    }
}
