package com.example.quocc.listview;

public class Song {
    private int imageSongID;
    private String name;
    private String singer;
    private long view;
    private long like;
    private long dislike;
    private final int imageView = R.drawable.view_icon;
    private final int imageLike = R.drawable.like_icon;
    private final int imageDislike = R.drawable.dislike_icon;

    public Song(int imageSongID, String name, String singer, long view, long like, long dislike) {
        this.imageSongID = imageSongID;
        this.name = name;
        this.singer = singer;
        this.view = view;
        this.like = like;
        this.dislike = dislike;
    }

    public int getImageSongID() {
        return imageSongID;
    }

    public void setImageSongID(int imageSongID) {
        this.imageSongID = imageSongID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public long getView() {
        return view;
    }

    public void setView(long view) {
        this.view = view;
    }

    public long getLike() {
        return like;
    }

    public void setLike(long like) {
        this.like = like;
    }

    public long getDislike() {
        return dislike;
    }

    public void setDislike(long dislike) {
        this.dislike = dislike;
    }

    public int getImageView() {
        return imageView;
    }

    public int getImageLike() {
        return imageLike;
    }

    public int getImageDislike() {
        return imageDislike;
    }
}
