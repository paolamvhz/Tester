package com.tester.app.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import com.tester.app.model.Category;
import com.tester.app.model.Video;

@Service
public class VideoServiceImpl implements IVideoService{
	List<Video> videos = new ArrayList<Video>();
	@Override
	public List<Video> showAll() {
		// TODO Auto-generated method stub
		Video video1 = new Video();
		video1.setVideoId(1);
		video1.setDescName("Test1");
		video1.setUrl("https://www.youtube.com/watch?v=swsvDS8m-Cc");
		video1.setProducts("Shampoo");
		video1.setYoutuber("yuya");
		
		Video video2 = new Video();
		video2.setVideoId(2);
		video2.setDescName("Test2");
		video2.setUrl("https://www.youtube.com/watch?v=swsvDS8m-Cc");
		video2.setProducts("Cream");
		video2.setYoutuber("MarthaDebayle");
		
		videos.add(video1);
		videos.add(video2);
		return videos;
	}

	@Override
	public Video getById(int idVideo) {
		// TODO Auto-generated method stub
		
		return videos.get(idVideo);
	}

	@Override
	public void insert(Video video) {
		// TODO Auto-generated method stub
		videos.add(video);
		
	}

}
