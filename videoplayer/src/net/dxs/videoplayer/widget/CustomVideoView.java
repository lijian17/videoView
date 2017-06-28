package net.dxs.videoplayer.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.VideoView;

/**
 * 自定义VideoView,切换横屏时可以全屏播放
 * 
 * @author lijian
 * @date 2017-6-28 下午11:23:46
 */
public class CustomVideoView extends VideoView {

	private int defaultWidth;
	private int defaultHeight;

	public CustomVideoView(Context context) {
		this(context, null);
	}

	public CustomVideoView(Context context, AttributeSet attrs) {
		this(context, attrs, 0);
	}

	public CustomVideoView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		defaultWidth = context.getResources().getDisplayMetrics().widthPixels;
		defaultHeight = context.getResources().getDisplayMetrics().heightPixels;
	}

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		int width = getDefaultSize(defaultWidth, widthMeasureSpec);
		int height = getDefaultSize(defaultHeight, heightMeasureSpec);
		setMeasuredDimension(width, height);
	}

}
