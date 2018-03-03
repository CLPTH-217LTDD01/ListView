package com.example.quocc.listview;

public class Song {
    private int imageID;
    private String name;
    private String singer;
    private long view;
    private long like;
    private long dislike;

    public Song(int imageID, String name, String singer, long view, long like, long dislike) {
        this.imageID = imageID;
        this.name = name;
        this.singer = singer;
        this.view = view;
        this.like = like;
        this.dislike = dislike;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
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
}
