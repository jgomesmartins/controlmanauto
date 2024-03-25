package Banco;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Banco {

    private static Driver driver = null;
    private static Connection connect = null;
    private static Statement statement = null;

    public static void Conectar() throws Exception {

        try {
            
            driver = (Driver) Class.forName(Classes.Config.URLDRIVER).newInstance();
            connect = DriverManager.getConnection("jdbc:ucanaccess://" + Classes.Config.getCaminhoBanco() + ";memory=false;showSchema=true", Classes.Config.USER, Classes.Config.PASS);

        } catch (NoClassDefFoundError | ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException be) {

            throw new Exception(be.getMessage());
        }

    }

    public static void Disconectar() throws SQLException {
        Banco.connect.close();

    }

    public static ResultSet ExecutarConsultaSQL(String sql) throws SQLException, Exception {

        try {

            statement = connect.createStatement();
            return statement.executeQuery(sql);

        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        }

    }

    public static int ExecutarSQL(String sql) throws SQLException, Exception {

        try {

            statement = connect.createStatement();
            return statement.executeUpdate(sql);

        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        }

    }
    
    public static Connection getConn() throws SQLException, Exception {

       return connect;
    }    

}
