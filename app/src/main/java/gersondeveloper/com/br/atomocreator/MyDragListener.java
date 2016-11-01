package gersondeveloper.com.br.atomocreator;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/**
 * Created by gerso on 31/10/2016.
 */

public class MyDragListener implements View.OnDragListener {

    Drawable core, neutron, eletron, proton;
    Context context;

    public MyDragListener(Context context) {
        this.context = context;
    }


    @Override
    public boolean onDrag(View v, DragEvent dragEvent) {
        core = context.getResources().getDrawable(R.drawable.core);
        neutron = context.getResources().getDrawable(R.drawable.neutron);
        eletron = context.getResources().getDrawable(R.drawable.eletron);
        proton = context.getResources().getDrawable(R.drawable.proton);

        int action = dragEvent.getAction();
        switch (action) {
            case DragEvent.ACTION_DRAG_STARTED:
                //view.setBackground(neutron);
                v.setVisibility(View.VISIBLE);
                return true;
            case DragEvent.ACTION_DRAG_ENTERED:
                //v.setBackground(core);
                break;
            case DragEvent.ACTION_DRAG_EXITED:
                //v.setBackground(neutron);
                break;
            case DragEvent.ACTION_DROP:
                Log.v("object","DROPPED");
                Log.v("object: ", "DROPPED");
                View view = (View) dragEvent.getLocalState();
                ViewGroup owner = (ViewGroup) view.getParent();
                owner.removeView(view);
                LinearLayout container = (LinearLayout) v;
                container.addView(view);
                view.setVisibility(View.VISIBLE);
                break;
            case DragEvent.ACTION_DRAG_ENDED:
                //v.setBackground(neutron);
                v.setVisibility(View.VISIBLE);
            default:
                break;
        }
        return true;
    }
}