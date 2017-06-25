package net.dxs.videoplayer;

import android.app.Activity;
import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity extends Activity {

	private VideoView mVv_videoPlay;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		init();
	}

	private void init() {
		initView();
		initData();
	}

	private void initView() {
		mVv_videoPlay = (VideoView) findViewById(R.id.vv_videoPlay);
	}

	private void initData() {

	}

}
