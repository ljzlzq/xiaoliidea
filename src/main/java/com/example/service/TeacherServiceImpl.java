package com.example.service;

import com.example.mapper.AdmitMapper;
import com.example.mapper.StudentMapper;
import com.example.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TeacherServiceImpl implements TeacherService{

    @Autowired
    StudentMapper studentMapper;
    @Autowired
    TeacherMapper teacherMapper;


}
