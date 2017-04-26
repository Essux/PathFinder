import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.util.Scanner;
import org.postgresql.util.PSQLException;
public class UserQuery
{
    Statement stmt = null;
      public UserQuery(Statement stmt)
    {
        this.stmt = stmt;
    }

    public void createUser(String user, String pass, String name) throws SQLException{
        String psql = "INSERT INTO usuario(\"User\",contrasena,nombre_usuario) " +
                      "VALUES(\'" + user + "\', \'" + pass + "\', \'" + name +"\');";
        stmt.executeUpdate(psql);
    }

    public void updateUser(String user, String pass, String name) throws SQLException{
        String psql = "UPDATE usuario " +
                      "SET nombre_usuario=\'"+ name + "\', contrasena=\'" + pass + "\' " + 
                      "WHERE \"User\"=\'" + user + "\';";
        stmt.executeUpdate(psql);
    }
     
    public boolean checkUser(String user, String pass) throws SQLException{
        String sql = "SELECT nombre_usuario FROM usuario where \"User\"='" +
                        user +"' and contrasena='" + pass + "';";
        ResultSet rs = stmt.executeQuery(sql);
        if(rs.isBeforeFirst()) return true;
        else return false;
    }
}