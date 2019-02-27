package arch.zidea.com.zinative;

import android.app.Application;
import android.support.annotation.Nullable;

import java.util.List;

public abstract class ZiNativeHost {

    private final Application mApplication;
    private @Nullable ZiInstanceManager mZiInstanceManager;

    protected ZiNativeHost(Application mApplication) {
        this.mApplication = mApplication;
    }

    public ZiInstanceManager getZiInstanceManager(){
        if(mZiInstanceManager == null){
            mZiInstanceManager = createZiInstanceManager();
        }
    }

    protected ZiInstanceManager createZiInstanceManager(){

        for(ZiPackage ziPackage:getPackages());
    }


    protected abstract List<ZiPackage> getPackages();

}
