package arch.zidea.com.zinative.bridge.queue;

import android.os.Looper;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public class MessageQueueThreadImpl implements MessageQueueThread{

    private final String mName;
    private final Looper mLooper;
    private final MessageQueueThreadHandler mHandler;
//    private final String mAssertionErrorMessage;
    private MessageQueueThreadPerfStats mPerfStats;
    private volatile boolean mIsFinished = false;

    private MessageQueueThreadImpl(
            String name,
            Looper looper,
            QueueThreadExceptionHandler exceptionHandler) {
        this(name, looper, exceptionHandler, null);
    }

    private MessageQueueThreadImpl(
            String name,
            Looper looper,
            QueueThreadExceptionHandler exceptionHandler,
            MessageQueueThreadPerfStats stats) {
        mName = name;
        mLooper = looper;
        mHandler = new MessageQueueThreadHandler(looper, exceptionHandler);
        mPerfStats = stats;
    }


    @Override
    public void runOnQueue(Runnable runnable) {

    }

    @Override
    public <T> Future<T> callOnQueue(Callable<T> callable) {
        return null;
    }

    @Override
    public boolean isOnThread() {
        return false;
    }

    @Override
    public void assertIsOnThread() {

    }

    @Override
    public void assertIsOnThread(String message) {

    }

    @Override
    public void quitSynchronous() {

    }

    @Override
    public MessageQueueThreadPerfStats getPerfStats() {
        return null;
    }

    @Override
    public void resetPerfStats() {

    }
}
