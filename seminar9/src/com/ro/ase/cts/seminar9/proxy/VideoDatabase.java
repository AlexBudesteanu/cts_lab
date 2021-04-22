package com.ro.ase.cts.seminar9.proxy;

import java.util.ArrayList;

public class VideoDatabase {

	private ArrayList<YoutubeVideo> videoCollection;
	
	public VideoDatabase() {
		videoCollection = new ArrayList<>();
		videoCollection.add(new YoutubeVideo(1, "How to cook omlette by Gordon Ramsay", 5));
		videoCollection.add(new YoutubeVideo(2, "Omlette recipe by Jamila", 10));
	}

	public ArrayList<YoutubeVideo> getVideoCollection() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return videoCollection;
	}
	
	public String getVideoInfo(int id) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (YoutubeVideo video: videoCollection) {
			if (id == video.getId()) {
				StringBuilder videoDescriptionBuilder = new StringBuilder();
				videoDescriptionBuilder.append(video.getTitle())
										.append(" takes you ")
										.append(video.getDuration())
										.append(" mintues to watch");
				return videoDescriptionBuilder.toString();
			}
		}
		return "Invalid id provided";
	}
}
