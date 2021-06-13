package com.bjpowernode.dao;

import com.bjpowernode.domain.Student;
import com.bjpowernode.vo.VO;

import java.util.List;
import java.util.Map;


public interface StudentDao {
    public List<Student> findAll();
    public void deleteStudent(String id);

    List<Student> searchStudent(Student student);

    VO findAllInfo(String id);
}
