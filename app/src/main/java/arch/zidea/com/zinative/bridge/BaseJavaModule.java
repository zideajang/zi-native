package arch.zidea.com.zinative.bridge;

public class BaseJavaModule implements NativeModule{

    static final public String METHOD_TYPE_ASYNC = "async";
    static final public String METHOD_TYPE_PROMISE= "promise";
    static final public String METHOD_TYPE_SYNC = "sync";

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void initialize() {
        // dosomething
    }
}
