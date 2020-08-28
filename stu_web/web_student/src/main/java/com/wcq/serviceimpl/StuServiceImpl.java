package com.wcq.serviceimpl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.wcq.dao.StuMapper;
import com.wcq.entity.Classes;
import com.wcq.entity.Student;
import com.wcq.service.IClsService;
import com.wcq.service.IstuService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class StuServiceImpl implements IstuService {

    @Autowired
    private StuMapper stuMapper;

    @Reference
    private IClsService iClsService;

    @Override
    public List<Student> list() {
        List<Student> students = stuMapper.selectList(null);
        for (Student student : students) {
            Integer cid = student.getCid();
            Classes classes = iClsService.queryById(cid);
            student.setCls(classes);
        }
        return students;
    }
}
