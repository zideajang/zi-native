package arch.zidea.com.zinative.uimanager;

import android.view.MotionEvent;

public interface RootView {
    void onChildStartedNativeGesture(MotionEvent androidEvent);
    void handleException(Throwable t);
}
