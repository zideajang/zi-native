package arch.zidea.com.zinative.bridge.queue;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/**
 *
 */
public class MessageQueueThreadHandler extends Handler {
    private final QueueThreadExceptionHandler mExceptionHandler;

    public MessageQueueThreadHandler(Looper looper, QueueThreadExceptionHandler mExceptionHandler) {
        super(looper);
        this.mExceptionHandler = mExceptionHandler;
    }

    @Override
    public void dispatchMessage(Message msg) {
        try {
            super.dispatchMessage(msg);
        } catch (Exception e) {
            mExceptionHandler.handleException(e);
        }
    }
}
