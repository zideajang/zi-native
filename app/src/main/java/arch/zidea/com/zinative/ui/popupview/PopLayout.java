package arch.zidea.com.zinative.ui.popupview;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public class PopLayout extends FrameLayout implements View.OnLayoutChangeListener {

    public static final int SITE_TOP = 0;
    public static final int SITE_LEFT = 1;
    public static final int SITE_RIGHT = 2;
    public static final int SITE_BOTTOM = 3;

    private static final int DEFAULT_RADIUS = 16;
    private static final int DEFAULT_BULGE_SIZE = 16;

    private int mOffset = 0;
    private int mRadiuSize = DEFAULT_RADIUS;

    public PopLayout(@NonNull Context context) {
        super(context);
    }

    public PopLayout(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public PopLayout(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void onLayoutChange(View view, int i, int i1, int i2, int i3, int i4, int i5, int i6, int i7) {
        resetMask();
        postInvalidate();
    }

    private void initialize(Context context,AttributeSet attrs, int defStyleAttr){
        TypedArray a = context.obtainStyledAttributes(attrs)
    }

    private void resetMask() {

        mPopMaskPath.reset();
        int width = getMeasuredWidth(), height = getMeasuredHeight();
    }

    public interface OnBulgeChangeCallback{
        
    }

}
