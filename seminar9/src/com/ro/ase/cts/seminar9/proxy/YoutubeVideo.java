package com.ro.ase.cts.seminar9.proxy;

public class YoutubeVideo {
private int id;
private String title;
private float duration;

public YoutubeVideo(int id, String title, float duration) {
	super();
	this.id = id;
	this.title = title;
	this.duration = duration;
}

public int getId() {
	return id;
}

public String getTitle() {
	return title;
}

public float getDuration() {
	return duration;
}

}
