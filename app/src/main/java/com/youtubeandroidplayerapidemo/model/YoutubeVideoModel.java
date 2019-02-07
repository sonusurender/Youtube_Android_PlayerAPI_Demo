package com.youtubeandroidplayerapidemo.model;

/**
 * Created by sonu on 10/11/17.
 * class to set and get the video id, title and duration for a video
 */

public class YoutubeVideoModel {
    private String videoId, title,duration;

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "YoutubeVideoModel{" +
                "videoId='" + videoId + '\'' +
                ", title='" + title + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }
}
