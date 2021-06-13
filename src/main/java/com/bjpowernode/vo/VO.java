package com.bjpowernode.vo;

import com.bjpowernode.domain.ClassRoom;
import com.bjpowernode.domain.Student;

import java.util.Date;

public class VO {
    private String studentId;
    private String studentName;
    private Integer age;
    private String address;
    private String classroom_id;
    private Date brithday;

    private String classroomId;
    private String classroomName;

    public VO(String studentId, String studentName, Integer age, String address, String classroom_id, Date brithday, String classroomId, String classroomName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.address = address;
        this.classroom_id = classroom_id;
        this.brithday = brithday;
        this.classroomId = classroomId;
        this.classroomName = classroomName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getClassroom_id() {
        return classroom_id;
    }

    public void setClassroom_id(String classroom_id) {
        this.classroom_id = classroom_id;
    }

    public Date getBrithday() {
        return brithday;
    }

    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }

    public String getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(String classroomId) {
        this.classroomId = classroomId;
    }

    public String getClassroomName() {
        return classroomName;
    }

    public void setClassroomName(String classroomName) {
        this.classroomName = classroomName;
    }

    @Override
    public String toString() {
        return "VO{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", classroom_id='" + classroom_id + '\'' +
                ", brithday=" + brithday +
                ", classroomId='" + classroomId + '\'' +
                ", classroomName='" + classroomName + '\'' +
                '}';
    }
}
