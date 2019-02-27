package arch.zidea.com.zinative;

import android.app.Application;

import java.util.List;

public class MainZiNativeHost extends ZiNativeHost{

    protected MainZiNativeHost(Application mApplication) {
        super(mApplication);
    }

    @Override
    protected List<ZiPackage> getPackages() {
        return null;
    }
}
