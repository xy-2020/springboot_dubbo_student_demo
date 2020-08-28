package com.wcq.service;

import com.wcq.entity.Classes;

import java.util.List;

public interface IClsService {

    List<Classes> list();

    Classes queryById(Integer id);
}
