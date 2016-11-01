package gersondeveloper.com.br.atomocreator;

import android.content.ClipData;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by gerso on 31/10/2016.
 */

public class MyTouchListener implements View.OnTouchListener {

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if(motionEvent.getAction() == MotionEvent.ACTION_DOWN)
        {
            ClipData clipData = ClipData.newPlainText("","");
            View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(view);
            view.startDrag(clipData, shadowBuilder, view, 0);
            view.setVisibility(View.INVISIBLE);
            return true;
        }
        else
        {
            return false;
        }

    }
}
