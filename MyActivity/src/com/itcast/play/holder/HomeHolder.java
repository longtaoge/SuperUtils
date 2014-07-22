package com.itcast.play.holder;

import android.view.View;
import android.widget.TextView;
import com.itcast.play.utils.UIUtils;

/**
 * Created by zlr on 2014/7/19.
 */
public class HomeHolder extends BaseHolder<String> {
	TextView tv;
	@Override
	protected View initView() {
		tv = new TextView(UIUtils.getContext());
		return tv;
	}

	@Override
	protected void refreshView() {
		tv.setText(getData());
	}
}
