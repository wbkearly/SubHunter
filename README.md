# Android 游戏开发从零开始

### 初始化项目

1.创建空项目

2.清空项目，设置全屏

```xml
<activity android:name=".SubHunter"
    android:theme="@android:style/Theme.Holo.Light.NoActionBar.Fullscreen">
    <intent-filter>
        <action android:name="android.intent.action.MAIN" />
        <category android:name="android.intent.category.LAUNCHER" />
    </intent-filter>
</activity>
```

```java

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
        // 取消TITLE
        requestWindowFeature(Window.FEATURE_NO_TITLE);
    }
}
```