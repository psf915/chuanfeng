package Servlet;

import Dao.AdminDao;
import Dao.AdminDao;



import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/ActivityServlet")
public class ActivityServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String name=request.getParameter("name");
        String atime=request.getParameter("atime");
        String place=request.getParameter("place");
        String content=request.getParameter("content");

        boolean a= AdminDao.ractivity(name,atime,place,content);
        if(a){
            response.getWriter().print("添加成功");
            request.getRequestDispatcher("/manage.jsp").forward(request,response);
        }else {
            response.getWriter().print("添加失败");
            request.getRequestDispatcher("/activity.jsp").forward(request,response);
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        this.doPost(request,response);
    }
}
