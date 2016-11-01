package gersondeveloper.com.br.atomocreator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.proton)
    View proton;

    @BindView(R.id.neutron)
    View neutron;

    @BindView(R.id.eletron)
    View eletron;

    @BindView(R.id.proton_container)
    LinearLayout protonContainer;

    @BindView(R.id.neutron_container)
    LinearLayout neutronContainer;

    @BindView(R.id.eletron_container)
    LinearLayout eletronContainer;

    @BindView(R.id.core_container)
    LinearLayout coreContainer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(MainActivity.this);

        //objects to move
        proton.setOnTouchListener(new MyTouchListener());
        eletron.setOnTouchListener(new MyTouchListener());
        neutron.setOnTouchListener(new MyTouchListener());

        //containers that accept the objects
        protonContainer.setOnDragListener(new MyDragListener(getApplicationContext()));
        neutronContainer.setOnDragListener(new MyDragListener(getApplicationContext()));
        eletronContainer.setOnDragListener(new MyDragListener(getApplicationContext()));
        coreContainer.setOnDragListener(new MyDragListener(getApplicationContext()));
    }
}
