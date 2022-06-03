import java.sql.*;
import javax.swing.*;
//la connection à notre base de donnée
public class MysqlConnect {
    Connection conn = null;
    public static Connection ConnectDB(){
        
        try {
        
           Class.forName("com.mysql.cj.jdbc.Driver"); //loading the driver
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://85.10.205.173/empdb98?characterEncoding=latin1","carellihoula98","0755738668@Luco");
            
           // JOptionPane.showMessageDialog(null, "connection avec succes"); //verification de la connexion
            return conn;
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
    }
                
        
    }
}
