package arch.zidea.com.zinative;

import java.util.ArrayList;
import java.util.List;

public class ZiInstanceManagerBuilder {

    //应用中所有 package
    private final List<ZiPackage> mPackages = new ArrayList<>();

    public ZiInstanceManager build(){
        return new ZiInstanceManager();
    }
}
