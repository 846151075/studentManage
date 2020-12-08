package com.hdc.lsp.mapper;

import java.util.List;

import com.hdc.lsp.pojo.Course;
import com.hdc.lsp.pojo.User;

public interface CourseMapper {

	
//	8、查询某个课程下的所有选课学生。
	public Course findUsersByCourse(Course course);
}
