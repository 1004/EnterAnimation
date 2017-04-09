package anim;

import android.graphics.Canvas;
import android.graphics.Region;
import android.util.Log;
import android.view.View;

/**
 * Created by wpm on 2017/3/30.
 */

public class AnimBaiYeChuang extends Anim {
    public AnimBaiYeChuang(View view) {
        super(view);
    }
    float lines = 6;

    @Override
    public void handleCanvas(Canvas canvas, float rate) {
        canvas.clipRect(0, 0, 0, 0);
        for(int i = 0;i<lines;i++) {
            float top = h / lines * i;
            float bottom = top + h / lines * rate;
            canvas.clipRect(0, top, w, bottom, Region.Op.UNION);
        }
        canvas.save();
    }
}
