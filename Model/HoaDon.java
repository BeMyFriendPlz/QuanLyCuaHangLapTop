/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeptit.QuanLyCuaHangLapTop.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class HoaDon {
    private String maHD, maTK, maKH;
    private Date ngayBan;
    private long tongTien;
    private Connection con;

    public HoaDon(String maHD, String maTK, String maKH, Date ngayBan, long tongTien) {
        this.maHD = maHD;
        this.maTK = maTK;
        this.maKH = maKH;
        this.ngayBan = ngayBan;
        this.tongTien = tongTien;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getMaTK() {
        return maTK;
    }

    public void setMaTK(String maNV) {
        this.maTK = maNV;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public Date getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(Date ngayBan) {
        this.ngayBan = ngayBan;
    }

    public long getTongTien() {
        return tongTien;
    }

    public void setTongTien(long tongTien) {
        this.tongTien = tongTien;
    }
    
    public static ArrayList<HoaDon> hoaDonList() {
        ArrayList<HoaDon> list = new ArrayList<>();
        try {
            String connectionUrl = "jdbc:sqlserver://localhost:1433;DatabaseName=DBComputerStore;user=sa;password=123456;encrypt=true;trustServerCertificate=true";
            Connection con = DriverManager.getConnection(connectionUrl);
            String sql = "SELECT * FROM tblHDban;";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            HoaDon hd;
            while(rs.next()) {
                hd = new HoaDon(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getLong(5));
                list.add(hd);
            }
            pst.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public void nhapHoaDon() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        try {
            String connectionUrl = "jdbc:sqlserver://localhost:1433;DatabaseName=DBComputerStore;user=sa;password=123456;encrypt=true;trustServerCertificate=true";
            con = DriverManager.getConnection(connectionUrl);
            String sql = "INSERT INTO tblHDban VALUES (?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, maHD);
            pst.setString(2, maTK);
            pst.setString(3, maKH);
            pst.setString(4, sdf.format(ngayBan));
            pst.setLong(5, tongTien);
            pst.executeUpdate();
            pst.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static HoaDon layHoaDon(String maHD) {
        HoaDon hd = null;
        try {
            String connectionUrl = "jdbc:sqlserver://localhost:1433;DatabaseName=DBComputerStore;user=sa;password=123456;encrypt=true;trustServerCertificate=true";
            Connection con = DriverManager.getConnection(connectionUrl);
            String sql = "SELECT * FROM tblHDban WHERE MaHD = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, maHD);
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
                hd = new HoaDon(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getLong(5));
            }
            pst.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return hd;
    }
}
