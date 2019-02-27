package arch.zidea.com.zinative;


import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.view.ViewManager;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import arch.zidea.com.zinative.bridge.JSBundleLoader;
import arch.zidea.com.zinative.bridge.JavaScriptExecutorFactory;
import arch.zidea.com.zinative.bridge.ZiContext;
import arch.zidea.com.zinative.common.LifecycleState;
import arch.zidea.com.zinative.modules.core.DefaultHardwareBackBtnHandler;

public class ZiInstanceManager {

    public interface ZiInstanceEventListener{
        void OnZiContextInitialized(ZiContext context);
    }

    //
    private final Set<ZiRootView> mAttachedRootViews = Collections.synchronizedSet(
            new HashSet<ZiRootView>());

    private volatile LifecycleState mLifecycleState;
//    private @Nullable ZiContextInitParams mPendingReactContextInitParams;

    private final JavaScriptExecutorFactory mJavaScriptExecutorFactory;
    private final @Nullable JSBundleLoader mBundleLoader;

    public static ZiInstanceManagerBuilder builder() {
        return new ZiInstanceManagerBuilder();
    }

    ZiInstanceManager(
            Context applicationContext,
            @Nullable Activity currentActivity,
            @Nullable DefaultHardwareBackBtnHandler defaultHardwareBackBtnHandler
    )
//
//    private final @Nullable
//    JSBundleLoader mBundleLoader;
//    private final @Nullable String mJSMainModulePath; /* path to JS bundle root on packager server */
//    private final List<ZiPackage> mPackages;
//    private final DevSupportManager mDevSupportManager;
//    private final boolean mUseDeveloperSupport;
//    private final @Nullable NotThreadSafeBridgeIdleDebugListener mBridgeIdleDebugListener;
//    private final Object mReactContextLock = new Object();
//    private @Nullable volatile ReactContext mCurrentReactContext;
//    private final Context mApplicationContext;
//    private @Nullable @ThreadConfined(UI) DefaultHardwareBackBtnHandler mDefaultBackButtonImpl;
//    private @Nullable
//    Activity mCurrentActivity;
//    private final Collection<ReactInstanceEventListener> mReactInstanceEventListeners =
//            Collections.synchronizedSet(new HashSet<ZiInstanceEventListener>());
//    // Identifies whether the instance manager is or soon will be initialized (on background thread)
//    private volatile boolean mHasStartedCreatingInitialContext = false;
//    // Identifies whether the instance manager destroy function is in process,
//    // while true any spawned create thread should wait for proper clean up before initializing
//    private volatile Boolean mHasStartedDestroying = false;
//    private final MemoryPressureRouter mMemoryPressureRouter;
//    private final @Nullable NativeModuleCallExceptionHandler mNativeModuleCallExceptionHandler;
//    private final @Nullable JSIModulePackage mJSIModulePackage;
    private List<ViewManager> mViewManagers;

    private void processPackage(
        ZiPackage ziPackage,

    ){

    }
}
