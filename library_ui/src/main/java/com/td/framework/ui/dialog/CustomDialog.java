package com.td.framework.ui.dialog;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.StyleRes;
import android.support.v7.app.AlertDialog;
import android.view.ViewGroup;

import com.td.framework.utils.ScreenUtils;

/**
 * Created by jc on 2016/12/26 0026.
 * <p>Gihub https://github.com/aohanyao</p>
 * <p>解决弹窗的时候状态栏变黑的情况</p>
 */

public class CustomDialog extends AlertDialog {
    public CustomDialog(@NonNull Context context) {
        super(context);
    }

    public CustomDialog(@NonNull Context context, @StyleRes int theme) {
        super(context, theme);
    }

    protected CustomDialog(@NonNull Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int screenHeight = ScreenUtils.getScreenHeight(getContext());
        int statusBarHeight = ScreenUtils.getStatusHeight(getContext());
        int dialogHeight = screenHeight - statusBarHeight;
        getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, dialogHeight);
    }
}
