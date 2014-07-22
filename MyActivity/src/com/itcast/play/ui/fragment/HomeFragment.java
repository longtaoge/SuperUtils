package com.itcast.play.ui.fragment;

import android.os.SystemClock;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;
import com.itcast.play.Adapter.MyAdapter;
import com.itcast.play.holder.BaseHolder;
import com.itcast.play.holder.HomeHolder;
import com.itcast.play.ui.widget.BaseListView;
import com.itcast.play.ui.widget.LoadPager;
import com.itcast.play.utils.UIUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zlr on 2014/7/19.
 */
public class HomeFragment extends BaseFragment {
	private ListView mListView;
	private List<String> mData;

	@Override
	protected LoadPager.LoadResult load() {
		SystemClock.sleep(5000);
		mData = new ArrayList<String>();
		for (int i = 0; i < 100; i++) {
			mData.add("我是item:" + i);
		}
		return checkLoadResult(mData);
	}

	@Override
	protected View createdLoadedView() {
		mListView = new BaseListView(UIUtils.getContext());
		mListView.setAdapter(new HomeAdapter(mData, mListView));
		return mListView;
	}

	class HomeAdapter extends MyAdapter<String> {

		public HomeAdapter(List<String> data, AbsListView list) {
			super(data, list);
		}

		@Override
		public BaseHolder getHolder() {
			return new HomeHolder();
		}

		@Override
		protected List<String> onLoadMore(int index) {
			SystemClock.sleep(5000);
			return null;
		}
	}
}
