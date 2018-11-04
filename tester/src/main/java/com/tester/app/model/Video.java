package com.tester.app.model;

import java.util.Date;

public class Video {

	private int videoId;
	private String descName;
	private String url;
	private String youtuber;
	private Date date;
	private String products;
	
	public int getVideoId() {
		return videoId;
	}
	public void setVideoId(int videoId) {
		this.videoId = videoId;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getYoutuber() {
		return youtuber;
	}
	public void setYoutuber(String youtuber) {
		this.youtuber = youtuber;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getProducts() {
		return products;
	}
	public void setProducts(String products) {
		this.products = products;
	}

	
	
	@Override
	public String toString() {
		return "Video [videoId=" + videoId + ", url=" + url + ", youtuber=" + youtuber + ", date=" + date
				+ ", productos=" + products + "]";
	}
	public String getDescName() {
		return descName;
	}
	public void setDescName(String descName) {
		this.descName = descName;
	}

}
