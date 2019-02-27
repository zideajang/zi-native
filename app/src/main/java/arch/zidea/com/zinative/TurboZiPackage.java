package arch.zidea.com.zinative;

import android.view.ViewManager;

import java.util.List;

import arch.zidea.com.zinative.bridge.NativeModule;

public class TurboZiPackage implements ZiPackage{
    @Override
    public List<NativeModule> createNativeModules(ZiApplicationContext reactContext) {
        return null;
    }

    @Override
    public List<ViewManager> createViewManagers(ZiApplicationContext reactContext) {
        return null;
    }
}
