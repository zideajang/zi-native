package arch.zidea.com.zinative;

import android.app.Application;

public class MainAppliction extends Application implements ZiApplication{

    private final ZiNativeHost mZiNativeHost = new MainZiNativeHost(this);


    @Override
    public ZiNativeHost getZiNativeHost() {
        return mZiNativeHost;
    }
}
