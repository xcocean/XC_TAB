package xcocean.com.xc_tab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import xcocean.com.xc_tab.fragment.Fragment1;
import xcocean.com.xc_tab.fragment.Fragment2;
import xcocean.com.xc_tab.fragment.Fragment3;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomBar bottomBar = findViewById(R.id.bottom_bar);
        bottomBar.setContainer(R.id.fl_container)
                .setTitleBeforeAndAfterColor("#999999", "#ff5d5e")
                .addItem(Fragment1.class,
                        "菜单",
                        R.drawable.ico_tab_menu_1,
                        R.drawable.ico_tab_menu_2)
                .addItem(Fragment2.class,
                        "订单",
                        R.drawable.ico_tab_order_1,
                        R.drawable.ico_tab_order_2)
                .addItem(Fragment3.class,
                        "我的",
                        R.drawable.ico_tab_user_1,
                        R.drawable.ico_tab_user_2)
                .build();
    }
}
