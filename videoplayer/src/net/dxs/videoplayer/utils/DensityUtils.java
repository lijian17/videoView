package net.dxs.videoplayer.utils;

import android.content.Context;

public class DensityUtils {

	private static Context mContext;

	public static void init(Context context) {
		mContext = context;
	}

	public static int dp2px(float dpVal) {
		float density = mContext.getResources().getDisplayMetrics().density;
		return (int) (dpVal * density + 0.5f);
	}

	public static int px2dp(Context context, float pxVal) {
		float density = mContext.getResources().getDisplayMetrics().density;
		return (int) (pxVal / density + 0.5f);
	}
}
