package arch.zidea.com.zinative.modules;

import android.widget.Toast;

import arch.zidea.com.zinative.ZiApp;
import arch.zidea.com.zinative.bridge.ReactMethod;
import arch.zidea.com.zinative.bridge.UiThreadUtil;

public class ToastModule {
    public ToastModule(ZiApp ziApp) {
    }

    @ReactMethod
    public void show(final String message, final int duration) {
        UiThreadUtil.runOnUiThread(new Runnable() {
            @Override
            public void run() {
//                Toast.makeText(getReactApplicationContext(), message, duration).show();
            }
        });
    }


}
