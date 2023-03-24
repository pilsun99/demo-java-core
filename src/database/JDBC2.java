package database;

import java.sql.*;

public class JDBC2 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testjava30", "root", "Caxauxi@9599");
            float price = 1000;
            String title = "Nike Air Max 90";
            String content = "Nike Air Max 90 gia re";
            int categoryID = 1;
            PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO product(price, title, content, categoryID) VALUES (?,?,?,?)");
            preparedStatement.setFloat(1, price);
            preparedStatement.setString(2, title);
            preparedStatement.setString(3, content);
            preparedStatement.setInt(4, categoryID);
            preparedStatement.executeUpdate();

            preparedStatement.setFloat(1,2000);
            preparedStatement.setString(2,"Nike Air Max 90");
            preparedStatement.setString(3,"Nike Air Max 90 gia re");
            preparedStatement.setInt(4,1);
            preparedStatement.execute();

            preparedStatement.setFloat(1,3000);
            preparedStatement.setString(2,"Nike Jodan");
            preparedStatement.setString(3,"Nike Jodan sin hon ");
            preparedStatement.setString(4,"2");
            preparedStatement.execute();

            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    }

