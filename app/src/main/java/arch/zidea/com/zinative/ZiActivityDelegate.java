package arch.zidea.com.zinative;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;

public class ZiActivityDelegate {
    private final @Nullable
    Activity mActivity;
    private final @Nullable
    String mMainComponentName;

    private @Nullable
    ZiRootView mZiRootView;

    public ZiActivityDelegate(@Nullable Activity mActivity, @Nullable String mMainComponentName) {
        this.mActivity = mActivity;
        this.mMainComponentName = mMainComponentName;
    }

    protected ZiRootView createRootView() {
        return new ZiRootView(getContext());
    }

    protected Context getContext() {
        return mActivity;
    }

    protected void loadApp(String appKey) {
        if (mZiRootView != null) {
            throw new IllegalStateException("Cannot loadApp while app is already running.");
        }
        mZiRootView = createRootView();
//        mZiRootView.startReactApplication(
//                getReactNativeHost().getReactInstanceManager(),
//                appKey,
//                getLaunchOptions());
//        getPlainActivity().setContentView(mReactRootView);
    }

}
//    protected ZiNativeHost getReactNativeHost() {
//        return ((ZiApplication) getPlainActivity().getApplication()).getZiNativeHost();
//    }
//
//    public ZiInstanceManager getReactInstanceManager() {
//        return getReactNativeHost().getReactInstanceManager();
//    }
//}
