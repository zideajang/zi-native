package arch.zidea.com.zinative.bridge;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface ReactMethod {
    boolean isBlockingSynchronousMethod() default false;
}
