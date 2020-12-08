package com.hdc.lsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.hdc.lsp.pojo.Course;
import com.hdc.lsp.service.CourseService;

@Controller
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	/**
	 * 查询某个课程下的所有选课学生。
	 * @param course
	 * @return course
	 */
	public Course findUsersByCourse(Course course) {
		return courseService.findUsersByCourse(course);
	}
}
