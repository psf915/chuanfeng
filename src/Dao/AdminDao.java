package Dao;


import java.sql.Connection;
import java.sql.PreparedStatement;

public class AdminDao {
    /*public static boolean activity(Activity activity){
        Connection conn=null;
        PreparedStatement pre=null;
        int rs=0;
        String sql="insert into activity(name,time,place,content) values(?,?,?,?)";
        Object[]objects={activity.getName(),activity.getTime(),activity.getPlace(),activity.getContent()};
        conn=JDBCUtil.getconnect();
        pre=JDBCUtil.getpreparedStatement(conn,sql,objects);
        rs=JDBCUtil.getupdate(pre);
        if (rs>0){
            return true;
        }else {
            return false;
        }
    }*/
    public static boolean ractivity(String name, String time, String place, String content) {
        Connection conn = null;
        PreparedStatement pre = null;
        int rs = 0;
        String sql = "insert into activity(name,time,place,content) values(?,?,?,?)";
        Object[] objects = {name, time, place, content};
        conn = JDBCUtil.getconnect();
        pre = JDBCUtil.getpreparedStatement(conn, sql, objects);
        rs = JDBCUtil.getupdate(pre);
        if (rs > 0) {
            return true;
        } else {
            return false;
        }
    }

    /*
        public static boolean uppainting(Painting painting){
        Connection conn=null;
        PreparedStatement pre=null;
        int rs=0;
        String sql="insert into painting(name,kind,length,width,author) values(?,?,?,?,?)";
        Object[]objects={painting.getName(),painting.getKind(),painting.getLength(),painting.getWidth(),painting.getAuthor()};
        conn= JDBCUtil.getconnect();
        pre= JDBCUtil.getpreparedStatement(conn,sql,objects);
        rs= JDBCUtil.getupdate(pre);
        if (rs>0){
            return true;
        }else {
            return false;
        }
    }*/
    public static boolean uppainting(String name, String kind, String length, String width, String author) {
        Connection conn = null;
        PreparedStatement pre = null;
        int rs = 0;
        String sql = "insert into painting(name,kind,length,width,author) values(?,?,?,?,?)";
        Object[] objects = {name, kind, length, width, author};
        conn = JDBCUtil.getconnect();
        pre = JDBCUtil.getpreparedStatement(conn, sql, objects);
        rs = JDBCUtil.getupdate(pre);
        if (rs > 0) {
            return true;
        } else {
            return false;
        }
    }
}
