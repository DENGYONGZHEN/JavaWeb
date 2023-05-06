package com.deng.servlet;
/**
 * @Classname
 * @Description
 * @Version 1.0.0
 * @Date 2023/5/3 13:02
 * @Created by helloDeng
 */

import com.deng.bean.Fruit;
import com.deng.dao.imp.FruitDaoImp;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;
@WebServlet("/index.do")
public class IndexServlet extends ViewBaseServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        FruitDaoImp fruitDaoImp = new FruitDaoImp();
        List<Fruit> fruitList = fruitDaoImp.getFruitList();
        HttpSession session = request.getSession();
        session.setAttribute("fruitList",fruitList);
        super.processTemplate("index",request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
