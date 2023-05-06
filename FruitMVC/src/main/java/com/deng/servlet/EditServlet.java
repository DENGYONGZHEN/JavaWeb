package com.deng.servlet;

import com.deng.bean.Fruit;
import com.deng.dao.imp.FruitDaoImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Classname EditServlet
 * @Description
 * @Version 1.0.0
 * @Date 2023/5/3 22:54
 * @Created by helloDeng
 */
@WebServlet("/edit.do")
public class EditServlet extends ViewBaseServlet{

    FruitDaoImp fruitDaoImp = new FruitDaoImp();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String fid = req.getParameter("fid");
        if(fid != null && fid.length()>0){
            Fruit fruit = fruitDaoImp.getFruitById(Integer.parseInt(fid));
            System.out.println(fruit);
        }
    }
}
