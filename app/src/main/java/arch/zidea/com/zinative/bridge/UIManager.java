package arch.zidea.com.zinative.bridge;

import android.support.annotation.Nullable;
import android.view.View;

public interface UIManager extends JSIModule{
    <T extends View> int addRootView(final T rootView, WritableMap initialProps, @Nullable String initialUITemplate);

    void removeRootView(int reactRootTag);
    void updateRootLayoutSpecs(int rootTag, int widthMeasureSpec, int heightMeasureSpec);

    void dispatchCommand(int reactTag, int commandId, @Nullable ReadableArray commandArgs);
    void synchronouslyUpdateViewOnUIThread(int reactTag, ReadableMap props);
}
