package net.dxs.videoplayer;

import net.dxs.videoplayer.utils.CacheFileUtils;
import net.dxs.videoplayer.utils.DensityUtils;
import android.app.Application;

public class App extends Application {
	private App mApp;

	@Override
	public void onCreate() {
		super.onCreate();
		mApp = this;

		DensityUtils.init(mApp);
		CacheFileUtils.initFiles();
		CacheFileUtils.copyAssetsFilesToSD(mApp, "video",
				CacheFileUtils.empVideoPath);
	}
}
