import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.util.Scanner;
public class DBManager {
    static Statement stmt = null;
    public static void printTable(String sql){
        try{
            ResultSet rs = stmt.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnsNumber = rsmd.getColumnCount();
            while(rs.next()){
                for(int i=1; i< columnsNumber; i++){
                    if(i > 1) System.out.print(", ");
                    String columnValue = rs.getString(i);
                    System.out.print(columnValue + " ");
                }
                System.out.println();
            }
        }catch(Exception e){
            System.out.println("LEL");
        }
    }
    
    public static void createUser(String user, String pass, String name){
        String psql = "INSERT INTO usuario(\"User\",contrasena,nombre_usuario) " +
                      "VALUES(\'" + user + "\', \'" + pass + "\', \'" + name +"\');";
        try{
            stmt.executeUpdate(psql);
        }catch(Exception e){
            System.out.println("Unexpected Error while inserting User");
            e.printStackTrace();
        }
    }
    
    public static boolean checkUser(String user, String pass){
        String sql = "SELECT nombre_usuario FROM usuario where \"User\"='" +
                        user +"' and contrasena='" + pass + "';";
        try{
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.isBeforeFirst()) return true;
            else return false;
        }catch(Exception e){
            System.out.println("Unexpected Error while checking user");
            e.printStackTrace();
        }
        return false;
    }
    
    public static void main(String[] argv) {
        try {
            Class.forName("org.postgresql.Driver");

        } catch (ClassNotFoundException e) {

            System.out.println("Where is your PostgreSQL JDBC Driver? "
                    + "Include in your library path!");
            e.printStackTrace();
            return;
        }

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://127.0.0.1:5432/pathfinder", "postgres",
                    "pass");

        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return;
        }

        if (connection != null) {
            System.out.println("You made it, take control your database now!");
        } else {
            System.out.println("Failed to make connection!");
        }
        
        try{
            stmt =  connection.createStatement();
            stmt.close();
            connection.close();
        } catch ( Exception e ){
            System.out.println("Unexpectd error in the Statement");
            e.printStackTrace();
        } 
    }

}