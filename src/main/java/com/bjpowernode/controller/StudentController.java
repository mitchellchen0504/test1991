package com.bjpowernode.controller;

import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;
import com.bjpowernode.vo.VO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/list")
    @ResponseBody
    public Object studentList(){
        List<Student> studentList = studentService.findAll();
        return studentList;
    }

    @RequestMapping("/delete")
    public ModelAndView deleteStudent(String id){
        ModelAndView modelAndView = new ModelAndView();
        studentService.deleteStudent(id);
        modelAndView.setViewName("redirect:/index.jsp");
        return modelAndView;
    }

    @RequestMapping("/search")
    public ModelAndView searchStudent(Student student){
        ModelAndView modelAndView = new ModelAndView();
        List<Student> studentList=  studentService.searchStudent(student);
        modelAndView.addObject("studentList", studentList);
        modelAndView.setViewName("studentList");
        return modelAndView;
    }

    @RequestMapping("/edit")
    public ModelAndView searchStudent(String id){
        ModelAndView modelAndView = new ModelAndView();
        VO student = studentService.findAllInfo(id);
        modelAndView.addObject("student", student);
        modelAndView.setViewName("studentDetails");
        return modelAndView;
    }
}
