package org.sopt.service.impl;

import org.sopt.model.Student;
import org.sopt.model.builder.StudentBuilder;
import org.sopt.service.StudentService;

public class StudentServiceimpl implements StudentService {

    @Override
    public Student getByStuId(int stuId) {
//        return null;
//        StudentBuilder studentBuilder = new StudentBuilder();
//        Student student = studentBuilder
//                .setId(2014)
//                .setStuAdr("서울시 노원구")
//                .setStuAge("24")
//                .setStuDepart("컴퓨터학과")
//                .setStuEmail("123456@naver.com")
//                .setStuGrade("4학년")
//                .setStuName("안나랭")
//                .setStuState("휴학")
//                .build();

        StudentBuilder studentBuilder = new StudentBuilder();
        Student student = studentBuilder
                .build();

        return student;
    }
}
