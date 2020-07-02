package mentariroti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Koneksi {

    private Connection connect;
    private Statement db;
    private String database = "nanda_rsh06949";

    public Koneksi() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Class Driver Ditemukan");
            try {
                connect = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "nanda_rsh06949", "nanda");
                System.out.println("Koneksi Database Sukses");
            } catch (SQLException se) {
                System.out.println("Koneksi Database Gagal : " + se);
            }
        } catch (ClassNotFoundException err) {
            System.out.println("Class Driver Tidak Ditemukan, Terjadi Kesalahan Pada : " + err);
        }
    }

    public ResultSet GetData(String sql) {
        try {
            db = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            return db.executeQuery(sql);
        } catch (SQLException e) {
            return null;
        }
    }

    public int ManipulasiData(String sql) {
        try {
            db = connect.createStatement();
            return db.executeUpdate(sql);
        } catch (SQLException e) {
            return 0;
        }
    }

}

