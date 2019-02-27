package arch.zidea.com.zinative.bridge;

import android.content.Context;

public abstract class JSBundleLoader {

    public static JSBundleLoader createAssetLoader(
            final Context context,
            final String assetUrl,
            final boolean loadSynchronously
    ){
        return new JSBundleLoader() {

        };
    }
}
