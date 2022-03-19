package cn.xxt.test;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.aliyun.common.utils.ToastUtil;
import com.aliyun.svideo.snap.record.AliyunVideoRecorder;
import com.aliyun.svideosdk.common.struct.common.AliyunSnapVideoParam;

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
                AliyunVideoRecorder.startRecordForResult(TestMainActivity.this, 0, new AliyunSnapVideoParam(), false);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

}
