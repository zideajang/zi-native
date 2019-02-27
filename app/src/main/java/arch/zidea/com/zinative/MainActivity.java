package arch.zidea.com.zinative;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuBuilder;
import android.util.Log;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupMenu;

import butterknife.BindDrawable;
import butterknife.ButterKnife;
import me.kareluo.ui.PopupMenuView;
import me.kareluo.ui.PopupView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, PopupMenu.OnMenuItemClickListener {

    private static final String TAG = "MainActivity";
    
    private Button popupBtn;
    private PopupMenuView menuView;

    @BindDrawable(R.drawable.popup_menu_bg)
    Drawable popupMenuBgDrawable;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        popupBtn = findViewById(R.id.activity_main_popup_button);
        popupBtn.setOnClickListener(this);

//        menuView = new PopupMenuView(this,R.menu.popup_menu, new MenuBuilder(this));
        menuView = new PopupMenuView(this, R.layout.layout_custom_menu);
        menuView.inflate(R.menu.popup_menu,new MenuBuilder(this));
        menuView.setSites(PopupView.SITE_BOTTOM);
        menuView.setOrientation(LinearLayout.VERTICAL);

    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        return false;
    }

    @SuppressLint("RestrictedApi")
    @Override
    public void onClick(View view) {
        Log.d(TAG, "onClick: ");
        menuView.show(view);
//        PopupMenu popupMenu = new PopupMenu(this,view);
//        MenuInflater inflater = popupMenu.getMenuInflater();
//        inflater.inflate(R.menu.popup_menu,popupMenu.getMenu());
//        popupMenu.setOnMenuItemClickListener(this);

//        popupMenu.show();


    }
}
