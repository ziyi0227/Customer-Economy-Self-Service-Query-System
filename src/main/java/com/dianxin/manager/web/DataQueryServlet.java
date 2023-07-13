package com.dianxin.manager.web;

import com.dianxin.manager.entity.UserData;
import com.dianxin.manager.service.UserDataService;
import com.dianxin.manager.service.UserDataServiceImpl;
import com.google.gson.Gson;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/DataQueryServlet")
public class DataQueryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json; charset=UTF-8");

        String number = request.getParameter("number");
        UserDataService data = new UserDataServiceImpl();
        UserData userData = data.findUser(number);

        Gson gson = new Gson();
        String json = gson.toJson(userData);
        response.getWriter().write(json);
    }
}
