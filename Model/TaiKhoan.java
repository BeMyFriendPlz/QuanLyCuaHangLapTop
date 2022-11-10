package codeptit.QuanLyCuaHangLapTop.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TaiKhoan {
    private String maTK, tenTK, matKhau;
    private Connection con;

    public TaiKhoan() {
        this.maTK = "";
        this.tenTK = "";
        this.maTK = "";
    }

    public TaiKhoan(String maTK, String tenTK, String matKhau) {
        this.maTK = maTK;
        this.tenTK = tenTK;
        this.matKhau = matKhau;
    }

    

    public String getMaTK() {
        return maTK;
    }

    public void setMaTK(String maTK) {
        this.maTK = maTK;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }
    
    public boolean kiemTraDangNhap() {
        boolean check = false;
        try {
            String connectionUrl = "jdbc:sqlserver://localhost:1433;DatabaseName=DBComputerStore;user=sa;password=123456;encrypt=true;trustServerCertificate=true";
            con = DriverManager.getConnection(connectionUrl);
            String sql = "SELECT * FROM tblLoginSys WHERE TenTK = ? AND MatKhau = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, tenTK);
            pst.setString(2, matKhau);
            ResultSet rs = pst.executeQuery();
            if(rs.next()) {
                check = true;
            } else {
                check = false;
            }
            pst.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return check;
    }
    
    public boolean doiMatKhau(String mkmoi) {
        boolean check = false;
        try {
            String connectionUrl = "jdbc:sqlserver://localhost:1433;DatabaseName=DBComputerStore;user=sa;password=123456;encrypt=true;trustServerCertificate=true";
            con = DriverManager.getConnection(connectionUrl);
            String sql = "SELECT * FROM tblLoginSys WHERE TenTK = ? AND MatKhau = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, tenTK);
            pst.setString(2, matKhau);
            ResultSet rs = pst.executeQuery();
            if(rs.next()) {
                check = true;
                sql = "UPDATE tblLoginSys SET MatKhau = ? WHERE TenTK = ?";
                pst = con.prepareStatement(sql);
                pst.setString(1, mkmoi);
                pst.setString(2, tenTK);
                pst.executeUpdate();
            } else {
                check = false;
            }
            pst.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return check;
    }
    
    public static TaiKhoan layTaiKhoan(String tenTK) {
        TaiKhoan tk = null;
        try {
            String connectionUrl = "jdbc:sqlserver://localhost:1433;DatabaseName=DBComputerStore;user=sa;password=123456;encrypt=true;trustServerCertificate=true";
            Connection con = DriverManager.getConnection(connectionUrl);
            String sql = "SELECT * FROM tblLoginSys WHERE TenTK = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, tenTK);
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
                tk = new TaiKhoan(rs.getString(1), rs.getString(2), rs.getString(3));
            } 
            pst.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return tk;
    }
    
    public static TaiKhoan layTK(String maTK) {
        TaiKhoan tk = null;
        try {
            String connectionUrl = "jdbc:sqlserver://localhost:1433;DatabaseName=DBComputerStore;user=sa;password=123456;encrypt=true;trustServerCertificate=true";
            Connection con = DriverManager.getConnection(connectionUrl);
            String sql = "SELECT * FROM tblLoginSys WHERE MaTK = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, maTK);
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
                tk = new TaiKhoan(rs.getString(1), rs.getString(2), rs.getString(3));
            } 
            pst.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return tk;
    }
    
    public static ArrayList<TaiKhoan> taiKhoanList() {
        ArrayList<TaiKhoan> list = new ArrayList<>();
        try {
            String connectionUrl = "jdbc:sqlserver://localhost:1433;DatabaseName=DBComputerStore;user=sa;password=123456;encrypt=true;trustServerCertificate=true";
            Connection con = DriverManager.getConnection(connectionUrl);
            String sql = "SELECT * FROM tblLoginSys;";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            TaiKhoan tk;
            while(rs.next()) {
                tk = new TaiKhoan(rs.getString(1), rs.getString(2), rs.getString(3));
                list.add(tk);
            }
            pst.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public void nhapDuLieuTaiKhoan() {
        try {
            String connectionUrl = "jdbc:sqlserver://localhost:1433;DatabaseName=DBComputerStore;user=sa;password=123456;encrypt=true;trustServerCertificate=true";
            con = DriverManager.getConnection(connectionUrl);
            String sql = "INSERT INTO tblLoginSys VALUES (?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, maTK);
            pst.setString(2, tenTK);
            pst.setString(3, matKhau);
            pst.executeUpdate();
            pst.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void suaDuLieuTaiKhoan() {
        try {
            String connectionUrl = "jdbc:sqlserver://localhost:1433;DatabaseName=DBComputerStore;user=sa;password=123456;encrypt=true;trustServerCertificate=true";
            con = DriverManager.getConnection(connectionUrl);
            String sql = "UPDATE tblLoginSys SET TenTK = ?, MatKhau = ? WHERE MaTK = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, tenTK);
            pst.setString(2, matKhau);
            pst.setString(3, maTK);
            pst.executeUpdate();
            pst.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void xoaDuLieuTaiKhoan(String maTK) {
        try {
            String connectionUrl = "jdbc:sqlserver://localhost:1433;DatabaseName=DBComputerStore;user=sa;password=123456;encrypt=true;trustServerCertificate=true";
            Connection con = DriverManager.getConnection(connectionUrl);
            String sql = "DELETE FROM tblLoginSys WHERE MaTK = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, maTK);
            pst.executeUpdate();
            pst.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
