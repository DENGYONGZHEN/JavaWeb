package com.deng.dao.imp;

import com.deng.bean.Fruit;
import com.deng.dao.FruitDao;
import com.deng.myssm.BaseDAO;

import java.util.List;

/**
 * @Classname FruitDaoImp
 * @Description
 * @Version 1.0.0
 * @Date 2023/5/3 12:59
 * @Created by helloDeng
 */
public class FruitDaoImp extends BaseDAO<Fruit> implements FruitDao {  //不加泛型会强转异常
    @Override
    public List<Fruit> getFruitList() {
        return super.executeQuery("select * from t_fruit");
    }

    @Override
    public Fruit getFruitById(int fid) {
        return super.load("select * from t_fruit where fid = ?", fid);
    }
}
