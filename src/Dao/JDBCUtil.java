package Dao;

import DBUtil.DBUtil;
import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUtil {

   /* public static Connection getconnection(){
        Connection conn=null;
        try {
            conn=dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }


    */
   public static Connection getconnect(){
       Connection con=null;
       DBUtil c3p0=new DBUtil();
       try {
           con=c3p0.getDataSource().getConnection();
       } catch (SQLException e) {
           e.printStackTrace();
       }
       return con;
   }

    public static PreparedStatement getpreparedStatement(Connection conn,String sql){
        PreparedStatement pre=null;
        if(conn!=null) {
            try {
                pre = conn.prepareStatement(sql);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }return pre;
    }


    public static PreparedStatement getpreparedStatement(Connection connection,String sql,Object[]objects){
        PreparedStatement pre=null;
        if(connection!=null){
            try {
                pre=connection.prepareStatement(sql);
                for(int i=0;i<objects.length;i++){
                    pre.setObject(i+1,objects[i]);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }return pre;
    }
    public static int getupdate(PreparedStatement sql){
        int rs=0;
        if(sql!=null){
            try {
                rs=sql.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }return rs;
    }
    public static ResultSet getQuery(PreparedStatement SQL){
        ResultSet rs=null;
        if(SQL!=null){
            try {
                rs=SQL.executeQuery();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return rs;
    }
    public static void close(Connection connection){
        try {
            if(connection!=null && connection.isClosed());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
