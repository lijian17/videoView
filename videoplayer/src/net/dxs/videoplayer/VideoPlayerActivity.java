package net.dxs.videoplayer;

import java.io.File;

import net.dxs.videoplayer.utils.CacheFileUtils;
import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

/**
 * 视频播放器基础用法
 * 
 * @author lijian
 * @date 2017-6-28 下午11:19:47
 */
public class VideoPlayerActivity extends Activity {

	private VideoView mVv_videoPlay;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_video_player);
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
		initMediaController();

		playLocalVideo();
		// playInternetVideo();
	}

	/**
	 * 初始化视频播放控制器
	 */
	private void initMediaController() {
		// 使用MediaController控制视频播放
		MediaController controller = new MediaController(this);

		// 设置VideoView与MediaController建立关联
		mVv_videoPlay.setMediaController(controller);

		// 设置MediaController与VideoView建立关联
		controller.setMediaPlayer(mVv_videoPlay);
	}

	/**
	 * 播放本地视频
	 */
	private void playLocalVideo() {
		String path = CacheFileUtils.empVideoPath + File.separator
				+ "father.mp4";
		mVv_videoPlay.setVideoPath(path);
	}

	/**
	 * 播放网络视频
	 */
	private void playInternetVideo() {
		String uriString = "http://video-js.zencoder.com/oceans-clip.mp4";
		mVv_videoPlay.setVideoURI(Uri.parse(uriString));
	}
}
