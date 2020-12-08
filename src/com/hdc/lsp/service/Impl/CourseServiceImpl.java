package com.hdc.lsp.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdc.lsp.mapper.CourseMapper;
import com.hdc.lsp.pojo.Course;
import com.hdc.lsp.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService{
	
	@Autowired
	private CourseMapper courseMapper;

	@Override
	public Course findUsersByCourse(Course course) {
		// TODO Auto-generated method stub
		return courseMapper.findUsersByCourse(course);
	}
	
	
}
