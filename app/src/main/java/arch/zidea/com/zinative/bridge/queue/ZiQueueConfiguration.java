package arch.zidea.com.zinative.bridge.queue;


public interface ZiQueueConfiguration {
    //获取 UI 队列线程
    MessageQueueThread getUIQueueThread();
    //native module 队列线程
    MessageQueueThread getNativeModulesQueueThread();
    //js 队列线程
    MessageQueueThread getJSQueueThread();
    void destroy();
}
