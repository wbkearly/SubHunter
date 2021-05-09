package priv.wbk.subhunter;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * @author wbk
 * instead of AppCompatActivity,
 * allows us to use the Window class,
 * which we will do in a moment.
 */
public class SubHunter extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 设置全屏
        requestWindowFeature(Window.FEATURE_NO_TITLE);
    }
}