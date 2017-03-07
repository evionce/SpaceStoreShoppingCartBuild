package com.techelevator.ssg.controller;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.techelevator.ssg.model.forum.ForumDao;
import com.techelevator.ssg.model.forum.ForumPost;

@Controller
public class ForumController {
	@Autowired
	ForumDao dao;
	
	@RequestMapping(path ="/forum", method =RequestMethod.GET)
	public String displayHomePage(HttpServletRequest request) {
		request.setAttribute("posts", dao.getAllPosts());
		return "ForumView";
		
	}
	@RequestMapping(path="/forumPost", method=RequestMethod.POST)
	public String postforumpost(ForumPost post){
		post.setDatePosted(LocalDateTime.now());
		dao.save(post);
		return "redirect:/forum";
	}
	@RequestMapping(path="/forumPost", method=RequestMethod.GET)
	public String postforumget(){
		return "ForumPost";
	}
	
	
	
}