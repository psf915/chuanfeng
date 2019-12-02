package Servlet;

import Dao.AdminDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/UppaintingServlet")
public class UppaintingServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String name=request.getParameter("name");
        String kind=request.getParameter("kind");
        String length=request.getParameter("length");
        String width=request.getParameter("width");
        String author=request.getParameter("author");

        boolean flag= AdminDao.uppainting(name,kind,length,width,author);
        if(flag){
            response.getWriter().print("添加成功");
        }else {
            response.getWriter().print("添加失败");
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
