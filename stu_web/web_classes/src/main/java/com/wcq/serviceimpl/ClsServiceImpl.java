package com.wcq.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wcq.dao.ClsMapper;
import com.wcq.entity.Classes;
import com.wcq.service.IClsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class ClsServiceImpl implements IClsService {

    @Autowired
    private ClsMapper clsMapper;


    @Override
    public List<Classes> list() {

        return clsMapper.selectList(null);
    }

    @Override
    public Classes queryById(Integer id) {
        return clsMapper.selectById(id);
    }
}
