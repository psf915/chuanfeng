package DBUtil;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;

public class DBUtil {
    public static DataSource getDataSource(){
        ComboPooledDataSource c3p0=new ComboPooledDataSource("psf");
        return c3p0;
    }
}
