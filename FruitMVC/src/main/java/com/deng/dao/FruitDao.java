package com.deng.dao;

import com.deng.bean.Fruit;

import java.util.List;

/**
 * @Classname FruitDao
 * @Description
 * @Version 1.0.0
 * @Date 2023/5/3 12:52
 * @Created by helloDeng
 */
public interface FruitDao {

    List<Fruit> getFruitList();
    Fruit getFruitById(int fid);
}
