package com.greenfox.form.servicies;

import com.greenfox.form.models.Student;
import com.greenfox.form.repositories.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;

    public Student saveStudent(Student student){
        return studentRepo.save(student);
    }

    public List<Student> FindAll(){
        return studentRepo.findAll();
    }

    public Student findOne(Integer id){
        return  studentRepo.getOne(id);
    }

    public void delete(Student student){
        studentRepo.delete(student);
    }



}
