package com.example.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entityes.Student;
import com.example.Repositorys.StudentRepo;
import com.example.info.CollectingDatdFromController;

@Service
public class StudentService implements CollectingDatdFromController
{
	@Autowired
	StudentRepo repo;
	
	@Override
	public Student addingData(Student details) {
		
		return repo.save(details);
}
}
