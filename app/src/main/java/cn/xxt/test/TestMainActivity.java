package cn.xxt.test;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.aliyun.common.utils.ToastUtil;
import com.aliyun.player.alivcplayerexpand.constants.GlobalPlayerConfig;
import com.aliyun.player.alivcplayerexpand.view.control.ControlView;
import com.aliyun.player.aliyunplayerbase.util.OnDownloadClickListener;
import com.aliyun.svideo.snap.record.AliyunVideoRecorder;
import com.aliyun.svideosdk.common.struct.common.AliyunSnapVideoParam;
import com.aliyun.vodplayerview.activity.AliyunPlayerSkinActivity;

import java.util.Map;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


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
                GlobalPlayerConfig.PlayCacheConfig.mEnableCache = false;
                GlobalPlayerConfig.PlayCacheConfig.mDir = "/storage/emulated/0/Android/data/com.xxt.jxlxandroid/files/ali/cache/";
                GlobalPlayerConfig.mUrlPath = "https://pic.xxt.cn/n/notice/manage/video/eeccc2fdeb784f19b3e99b71ea4b75ec1.mp4";
                GlobalPlayerConfig.mTitle = "看看这是啥视频";
                GlobalPlayerConfig.IS_BARRAGE = false;
                GlobalPlayerConfig.PlayConfig.circlePlay = false;

                AliyunPlayerSkinActivity.setOnDownloadClickListener(new OnDownloadClickListener() {
                    @Override
                    public void onClickDownload() {
                        ToastUtil.showToast(context, "点击了下载");
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
