package arch.zidea.com.zinative;


import java.util.List;

import arch.zidea.com.zinative.bridge.NativeModule;

public interface ZiPackage {

    List<NativeModule> createNativeModules( ZiApplicationContext reactContext);
    List<ViewManager> createViewManagers(ZiApplicationContext reactContext);
}
