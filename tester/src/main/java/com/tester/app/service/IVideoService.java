package com.tester.app.service;

import java.util.List;
import com.tester.app.model.Video;

public interface IVideoService {
	
	List<Video> showAll();
	Video getById(int idVideo);
	void insert(Video video);
	

}
