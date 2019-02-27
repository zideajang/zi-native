package arch.zidea.com.zinative;

import android.view.KeyEvent;

import java.util.Map;

import arch.zidea.com.zinative.common.MapBuilder;

public class ZiAndroidHWInputDeviceHelper {
    private static final Map<Integer, String> KEY_EVENTS_ACTIONS = MapBuilder.<Integer, String>builder()
            .put(KeyEvent.KEYCODE_DPAD_CENTER, "select")
            .put(KeyEvent.KEYCODE_ENTER, "select")
            .put(KeyEvent.KEYCODE_SPACE, "select")
            .put(KeyEvent.KEYCODE_MEDIA_PLAY_PAUSE, "playPause")
            .put(KeyEvent.KEYCODE_MEDIA_REWIND, "rewind")
            .put(KeyEvent.KEYCODE_MEDIA_FAST_FORWARD, "fastForward")
            .put(KeyEvent.KEYCODE_DPAD_UP, "up")
            .put(KeyEvent.KEYCODE_DPAD_RIGHT, "right")
            .put(KeyEvent.KEYCODE_DPAD_DOWN, "down")
            .put(KeyEvent.KEYCODE_DPAD_LEFT, "left")
            .build();
}
