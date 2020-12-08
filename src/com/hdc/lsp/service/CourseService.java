package com.hdc.lsp.service;

import com.hdc.lsp.pojo.Course;

public interface CourseService {
	/**
	 * 查询某个课程下的所有选课学生。
	 * @param course
	 * @return course
	 */
	public Course findUsersByCourse(Course course);
}
