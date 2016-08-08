package ayp.aug.beatbox;

import android.util.Log;

/**
 * Created by Hattapong on 8/8/2016.
 */
public class Sound {

    private static final String TAG = "Sound";
    //name and path of button
    private String assetPath;
    private String name;
    private Integer soundId;

    public Sound(String assetPath) {
        this.assetPath = assetPath;

        Log.d(TAG,"Asset Path = "+assetPath);
        String[] components = assetPath.split("/");
        String filename = components[components.length - 1];
        name = filename.replace(".wav","");
        Log.d(TAG,"name = "+name+" assetPath = "+assetPath);
    }

    public String getAssetPath() {
        return assetPath;
    }

    public String getName() {
        return name;
    }

    public Integer getSoundId() {
        return soundId;
    }

    public void setSoundId(Integer soundId) {
        this.soundId = soundId;
    }
}
