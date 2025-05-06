package cn.xxt.test;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.aliyun.player.alivcplayerexpand.constants.GlobalPlayerConfig;
import com.aliyun.player.aliyunplayerbase.util.OnDownloadClickListener;
import com.aliyun.vodplayerview.activity.AliyunPlayerSkinActivity;


public class TestMainActivity extends Activity {

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_main);
        this.context = this;

        Button btnAction = findViewById(R.id.btn_action);
        btnAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                AliyunVideoRecorder.startRecordForResult(TestMainActivity.this, 0, new AliyunSnapVideoParam(), false);
                GlobalPlayerConfig.mCurrentPlayType = GlobalPlayerConfig.PLAYTYPE.URL;
                GlobalPlayerConfig.PlayCacheConfig.mEnableCache = true;
                GlobalPlayerConfig.PlayCacheConfig.mDir = context.getCacheDir().getAbsolutePath();
                GlobalPlayerConfig.mUrlPath = "http://pic.xxt.cn/n/circle/dynamic/dynamicfile128187411720435194799.mp4";
                GlobalPlayerConfig.mTitle = "看看这是啥视频";
                GlobalPlayerConfig.IS_BARRAGE = false;
                GlobalPlayerConfig.PlayConfig.circlePlay = false;

                AliyunPlayerSkinActivity.setOnDownloadClickListener(new OnDownloadClickListener() {
                    @Override
                    public void onClickDownload() {
//                        ToastUtil.showToast(context, "点击了下载");
                    }
                });
                AliyunPlayerSkinActivity.start2PlayForResult(TestMainActivity.this, "");

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

}
