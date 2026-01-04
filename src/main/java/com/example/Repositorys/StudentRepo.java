package com.example.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entityes.Student;

public interface StudentRepo extends JpaRepository<Student,String>
{

}
