package arch.zidea.com.zinative;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends ZiActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }

    @Override
    protected String getMainComponentName() {
        return "ziproject";
    }
}
