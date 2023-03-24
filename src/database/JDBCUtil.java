package database;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCUtil {
    public static void main(String[] args){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testjava30", "root", "Caxauxi@9599");
            Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            //statement.execute("create table if not exists brands(id int primary key auto_increment, name varchar(50))");
            /*int affectRow = statement.executeUpdate("insert into brands(name) values('Adidas')");
            System.out.println(affectRow);
            statement.executeUpdate("insert into brands(name) values('Puma')");
            statement.executeUpdate("insert into brands(name) values('Nike')");*/
            ResultSet resultSet = statement.executeQuery("SELECT * FROM brands");
            resultSet.absolute(2);
            while (resultSet.next()){
                System.out.println(resultSet.getInt("id") + " " + resultSet.getString("name"));
            }
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
