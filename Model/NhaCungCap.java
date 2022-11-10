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
import java.util.List;

/**
 *
 * @author Admin
 */
public class NhaCungCap {
    private String maNCC, tenNCC;
    private Connection con;

    public NhaCungCap(String maNCC, String tenNCC) {
        this.maNCC = maNCC;
        this.tenNCC = tenNCC;
    }

    public String getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(String maNCC) {
        this.maNCC = maNCC;
    }

    public String getTenNCC() {
        return tenNCC;
    }

    public void setTenNCC(String tenNCC) {
        this.tenNCC = tenNCC;
    }
    
    public void nhapDuLieuNCC() {
        try {
            String connectionUrl = "jdbc:sqlserver://localhost:1433;DatabaseName=DBComputerStore;user=sa;password=123456;encrypt=true;trustServerCertificate=true";
            con = DriverManager.getConnection(connectionUrl);
            String sql = "INSERT INTO tblNhaCC VALUES (?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, maNCC);
            pst.setString(2, tenNCC);
            pst.executeUpdate();
            pst.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void suaDuLieuNCC() {
        try {
            String connectionUrl = "jdbc:sqlserver://localhost:1433;DatabaseName=DBComputerStore;user=sa;password=123456;encrypt=true;trustServerCertificate=true";
            con = DriverManager.getConnection(connectionUrl);
            String sql = "UPDATE tblNhaCC SET TenNCC = ? WHERE MaNCC = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, tenNCC);
            pst.setString(2, maNCC);
            pst.executeUpdate();
            pst.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void xoaDuLieuNCC(String maNCC) {
        try {
            String connectionUrl = "jdbc:sqlserver://localhost:1433;DatabaseName=DBComputerStore;user=sa;password=123456;encrypt=true;trustServerCertificate=true";
            Connection con = DriverManager.getConnection(connectionUrl);
            String sql = "DELETE FROM tblNhaCC WHERE MaNCC = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, maNCC);
            pst.executeUpdate();
            pst.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static List<String> tenNCC() {
        List<String> ncc = new ArrayList<>();
        for (int i = 0; i < NCCList().size(); i++) {
            ncc.add(NCCList().get(i).getMaNCC() + "-" + NCCList().get(i).getTenNCC());
        }
        return ncc;
    }
    
    public static ArrayList<NhaCungCap> NCCList() {
        ArrayList<NhaCungCap> list = new ArrayList<>();
        try {
            String connectionUrl = "jdbc:sqlserver://localhost:1433;DatabaseName=DBComputerStore;user=sa;password=123456;encrypt=true;trustServerCertificate=true";
            Connection con = DriverManager.getConnection(connectionUrl);
            String sql = "SELECT * FROM tblNhaCC;";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            NhaCungCap ncc;
            while(rs.next()) {
                ncc = new NhaCungCap(rs.getString(1), rs.getString(2));
                list.add(ncc);
            }
            pst.close();
            con.close();
        } catch (Exception e) {
            System.out.println();
            e.printStackTrace();
        }
        return list;
    }
}
