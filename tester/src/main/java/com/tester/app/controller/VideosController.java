package com.tester.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.tester.app.model.Video;
import java.util.List;
import com.tester.app.service.VideoServiceImpl;

@Controller
@RequestMapping("/videos")
public class VideosController {
	
	@Autowired
	private VideoServiceImpl impl;
	
	@GetMapping("/index")
	public String showIndex(Model model) {
		List<Video> list = impl.showAll();
		model.addAttribute("videos",list);
		return "videos/listVideos";
	}
	
	@GetMapping("/create")
	public String create(@ModelAttribute Video video){
		return "videos/formVideos";
	}

	@PostMapping("/save")
	public String save(@ModelAttribute Video video, BindingResult result, RedirectAttributes rAttr){
		
		if(result.hasErrors()) {
			System.out.println("There was an error :");
			for(ObjectError error: result.getAllErrors()) {
				System.out.println(error.getDefaultMessage());
			}
				
			return "videos/formVideos";
		}
		System.out.println(video.toString());
		impl.insert(video);
		rAttr.addFlashAttribute("msj","A new video has been created.");
		return "redirect:/videos/index";
	}
	
	@RequestMapping(value = "/videoDetail/{id}", method = RequestMethod.GET)
	public String showVideoDetails(@PathVariable("id") int videoId,Model model){
		
		Video v = impl.getById(videoId);
		System.out.println("Video "+v.toString());
		model.addAttribute( "video",v);
		return "videos/detailVideo";
	}

}
