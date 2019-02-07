package com.youtubeandroidplayerapidemo.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeThumbnailView;
import com.youtubeandroidplayerapidemo.R;

/**
 * Created by sonu on 10/11/17.
 */

public class YoutubeViewHolder extends RecyclerView.ViewHolder {

    public YouTubeThumbnailView videoThumbnailImageView;
    public TextView videoTitle, videoDuration;

    public YoutubeViewHolder(View itemView) {
        super(itemView);
        videoThumbnailImageView = itemView.findViewById(R.id.video_thumbnail_image_view);
        videoTitle = itemView.findViewById(R.id.video_title_label);
        videoDuration = itemView.findViewById(R.id.video_duration_label);
    }
}
