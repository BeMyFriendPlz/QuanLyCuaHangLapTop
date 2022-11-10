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
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class ChiTietHoaDon {
    private String maHD, maSP;
    private int soLuong;
    private long donGia;
    private int giamGia;
    private long thanhTien;
    private Connection con;

    public ChiTietHoaDon(String maHD, String maSP, int soLuong, long donGia, int giamGia, long thanhTien) {
        this.maHD = maHD;
        this.maSP = maSP;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.giamGia = giamGia;
        this.thanhTien = thanhTien;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public long getDonGia() {
        return donGia;
    }

    public void setDonGia(long donGia) {
        this.donGia = donGia;
    }

    public int getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(int giamGia) {
        this.giamGia = giamGia;
    }

    public long getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(long thanhTien) {
        this.thanhTien = thanhTien;
    }

    public void nhapChiTietHoaDon() {
        try {
            String connectionUrl = "jdbc:sqlserver://localhost:1433;DatabaseName=DBComputerStore;user=sa;password=123456;encrypt=true;trustServerCertificate=true";
            con = DriverManager.getConnection(connectionUrl);
            String sql = "INSERT INTO tblChiTietHDBan VALUES (?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, maHD);
            pst.setString(2, maSP);
            pst.setInt(3, soLuong);
            pst.setLong(4, donGia);
            pst.setInt(5, giamGia);
            pst.setLong(6, thanhTien);
            pst.executeUpdate();
            pst.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static ArrayList<ChiTietHoaDon> ChiTietHoaDonList(String maHD) {
        ArrayList<ChiTietHoaDon> list = new ArrayList<>();
        try {
            String connectionUrl = "jdbc:sqlserver://localhost:1433;DatabaseName=DBComputerStore;user=sa;password=123456;encrypt=true;trustServerCertificate=true";
            Connection con = DriverManager.getConnection(connectionUrl);
            String sql = "SELECT * FROM tblChiTietHDBan WHERE MaHD = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, maHD);
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
                ChiTietHoaDon cthd = new ChiTietHoaDon(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getLong(4), rs.getInt(5), rs.getLong(6));
                list.add(cthd);
            }
            pst.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }
    
    public static ArrayList<ChiTietHoaDon> GetChiTietHoaDons(String maSP) {
        ArrayList<ChiTietHoaDon> list = new ArrayList<>();
        try {
            String connectionUrl = "jdbc:sqlserver://localhost:1433;DatabaseName=DBComputerStore;user=sa;password=123456;encrypt=true;trustServerCertificate=true";
            Connection con = DriverManager.getConnection(connectionUrl);
            String sql = "SELECT * FROM tblChiTietHDBan WHERE MaSP = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, maSP);
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
                ChiTietHoaDon cthd = new ChiTietHoaDon(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getLong(4), rs.getInt(5), rs.getLong(6));
                list.add(cthd);
            }
            pst.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }
}
