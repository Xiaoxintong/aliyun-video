/*
 * Copyright (C) 2010-2017 Alibaba Group Holding Limited.
 */

//package com.aliyun.svideo.base.widget;
package com.aliyun.svideo.media;

import android.view.View;

public interface SizeChangedNotifier {

    public interface Listener {
        void onSizeChanged(View view, int w, int h, int oldw, int oldh);
    }

    void setOnSizeChangedListener(Listener listener);

}
