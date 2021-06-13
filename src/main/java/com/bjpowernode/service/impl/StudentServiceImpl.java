package com.bjpowernode.service.impl;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;
import com.bjpowernode.vo.VO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }

    @Override
    public void deleteStudent(String id) {
        System.out.println(1/0);
        studentDao.deleteStudent(id);
    }

    @Override
    public List<Student> searchStudent(Student student) {
        return studentDao.searchStudent(student);
    }

    @Override
    public VO findAllInfo(String id) {
        return studentDao.findAllInfo(id);
    }
}
