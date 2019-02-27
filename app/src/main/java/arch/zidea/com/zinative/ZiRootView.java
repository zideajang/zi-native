package arch.zidea.com.zinative;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

import arch.zidea.com.zinative.uimanager.RootView;

public class ZiRootView extends FrameLayout implements RootView {

    public ZiRootView(@NonNull Context context) {
        super(context);
    }

    public ZiRootView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    void runApplication(){

    }

   @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    public void onChildStartedNativeGesture(MotionEvent androidEvent) {

    }

    @Override
    public void handleException(Throwable t) {

    }
}
