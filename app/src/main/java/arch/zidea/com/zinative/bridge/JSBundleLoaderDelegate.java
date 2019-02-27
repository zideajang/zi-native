package arch.zidea.com.zinative.bridge;

import android.content.res.AssetManager;

public interface JSBundleLoaderDelegate {
    void loadScriptFromAssets(AssetManager assetManager, String assetURL, boolean loadSynchronously);
    void loadScriptFromFile(String fileName, String sourceURL, boolean loadSynchronously);
}
