package com.saw.smartybj.basepage;

import android.content.Context;
import android.view.Gravity;
import android.widget.TextView;

/**
 * @author Administrator
 * @创建时间 2016-6-15 下午10:26:38
 * @描述 TODO
 */
public class NewsCenterBaseTagPager extends BaseTagPage {

	public NewsCenterBaseTagPager(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void initData() {
		tv_title.setText("新闻中心");
		//要展示的内容，替换掉白纸 fl_content;//内容  FrameLayout
		TextView tv = new TextView(context);
		tv.setText("新闻中心的内容");
		tv.setTextSize(25);
		tv.setGravity(Gravity.CENTER);
		//添加到白纸中
		fl_content.addView(tv);
		super.initData();
	}

}
