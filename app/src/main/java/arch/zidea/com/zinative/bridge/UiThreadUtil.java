package arch.zidea.com.zinative.bridge;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;

public class UiThreadUtil {

    @Nullable
    private static Handler sMainHandler;

    public static boolean isOnUiThread() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /**
     * Throws an {@link AssertionException} if the current thread is not the UI thread.
     */
    public static void assertOnUiThread() {
//        SoftAssertions.assertCondition(isOnUiThread(), "Expected to run on UI thread!");
    }

    /**
     * Throws an {@link AssertionException} if the current thread is the UI thread.
     */
    public static void assertNotOnUiThread() {
//        SoftAssertions.assertCondition(!isOnUiThread(), "Expected not to run on UI thread!");
    }

    /**
     * Runs the given {@code Runnable} on the UI thread.
     */
    public static void runOnUiThread(Runnable runnable) {
        synchronized (UiThreadUtil.class) {
            if (sMainHandler == null) {
                sMainHandler = new Handler(Looper.getMainLooper());
            }
        }
        sMainHandler.post(runnable);
    }
}
