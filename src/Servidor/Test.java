package Servidor;

import java.sql.*;

/**
 * Created by Leandro on 11/04/2014.
 */
public class Test {
    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        String url = "jdbc:mysql://localhost:3306/projeto_pp";
        String user = "root";
        String password = "";

        try {
            con = DriverManager.getConnection(url, user, password);
            st = con.createStatement();
            rs = st.executeQuery("SELECT * from ofertas_emprego");

            ResultSetMetaData rsmd = rs.getMetaData();
            while (rs.next()) {
                System.out.println();
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    if (rsmd.getColumnType(i) == Types.INTEGER)
                        System.out.print(rs.getInt(i) + " | ");
                    else
                        System.out.print(rs.getString(i) + " | ");
                }
            }
        } catch (Exception ex){
            System.out.println(ex);
        }
        finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
                if (con != null) {
                    con.close();
                }
            }
            catch (Exception ex){
                System.out.println(ex.toString());
            }

        }
    }
}
