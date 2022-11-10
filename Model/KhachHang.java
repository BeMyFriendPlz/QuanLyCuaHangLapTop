package codeptit.QuanLyCuaHangLapTop.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class KhachHang {
    private String maKH, tenKH;
    private String diaChi, dienThoai;
    private Connection con;

    public KhachHang(String maKH, String tenKH, String diaChi, String dienThoai) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.diaChi = diaChi;
        this.dienThoai = dienThoai;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }
    
    public void nhapDuLieuKhach() {
        try {
            String connectionUrl = "jdbc:sqlserver://localhost:1433;DatabaseName=DBComputerStore;user=sa;password=123456;encrypt=true;trustServerCertificate=true";
            con = DriverManager.getConnection(connectionUrl);
            String sql = "INSERT INTO tblKhach VALUES (?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, maKH);
            pst.setString(2, tenKH);
            pst.setString(3, diaChi);
            pst.setString(4, dienThoai);
            pst.executeUpdate();
            pst.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }      
    
    public void suaDuLieuKhach() {
        try {
            String connectionUrl = "jdbc:sqlserver://localhost:1433;DatabaseName=DBComputerStore;user=sa;password=123456;encrypt=true;trustServerCertificate=true";
            con = DriverManager.getConnection(connectionUrl);
            String sql = "UPDATE tblKhach SET TenKH = ?, DiaChi = ?, DienThoai = ? WHERE MaKH = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, tenKH);
            pst.setString(2, diaChi);
            pst.setString(3, dienThoai);
            pst.setString(4, maKH);
            pst.executeUpdate();
            pst.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void xoaDuLieuKhach(String maKH) {
        try {
            String connectionUrl = "jdbc:sqlserver://localhost:1433;DatabaseName=DBComputerStore;user=sa;password=123456;encrypt=true;trustServerCertificate=true";
            Connection con = DriverManager.getConnection(connectionUrl);
            String sql = "DELETE FROM tblKhach WHERE MaKH = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, maKH);
            pst.executeUpdate();
            pst.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static ArrayList<KhachHang> khachList() {
        ArrayList<KhachHang> list = new ArrayList<>();
        try {
            String connectionUrl = "jdbc:sqlserver://localhost:1433;DatabaseName=DBComputerStore;user=sa;password=123456;encrypt=true;trustServerCertificate=true";
            Connection con = DriverManager.getConnection(connectionUrl);
            String sql = "SELECT * FROM tblKhach;";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            KhachHang kh;
            while(rs.next()) {
                kh = new KhachHang(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
                list.add(kh);
            }
            pst.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
