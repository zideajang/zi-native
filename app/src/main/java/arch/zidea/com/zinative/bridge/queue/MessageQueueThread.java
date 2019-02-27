package arch.zidea.com.zinative.bridge.queue;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public interface MessageQueueThread {

    //线程运行
    void runOnQueue(Runnable runnable);

    <T> Future<T> callOnQueue(final Callable<T> callable);
    boolean isOnThread();
    void assertIsOnThread();
    void assertIsOnThread(String message);
    void quitSynchronous();

    MessageQueueThreadPerfStats getPerfStats();
    void resetPerfStats();
}
