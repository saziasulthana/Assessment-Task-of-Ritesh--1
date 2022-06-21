package com.api.ApiEndpoint.Services;

import java.util.ArrayList;
import java.util.List;

import com.api.ApiEndpoint.Entities.StudentCourses;

public class ServiceImpl implements Service{
	
	
	List<StudentCourses> list;
	public ServiceImpl() {
		list = new ArrayList<>();
		list.add(new StudentCourses("pavitra","AP101","science"));
		list.add(new StudentCourses("nandini1","SC202","maths"));
		list.add(new StudentCourses("lahari", "AP303","english"));
		
		
		
	}

	@Override
	public List<StudentCourses> getstudentCourses() {
		
		// TODO Auto-generated method stub
		return list;
	}

}
