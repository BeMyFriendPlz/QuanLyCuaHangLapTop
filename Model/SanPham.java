package codeptit.QuanLyCuaHangLapTop.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SanPham {
    private String maSP, tenSP, nhaCC;
    private int soLuong;
    private long giaNhap, giaBan;
    private byte [] anh;
    private String ghiChu;
    private Connection con;

    public SanPham(String maSP, String tenSP, String nhaCC, int soLuong, long giaNhap, long giaBan, byte [] anh, String ghiChu) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.nhaCC = nhaCC;
        this.soLuong = soLuong;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.anh = anh;
        this.ghiChu = ghiChu;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getNhaCC() {
        return nhaCC;
    }

    public void setNhaCC(String nhaCC) {
        this.nhaCC = nhaCC;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public long getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(long giaNhap) {
        this.giaNhap = giaNhap;
    }

    public long getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(long giaBan) {
        this.giaBan = giaBan;
    }

    public byte[] getAnh() {
        return anh;
    }

    public void setAnh(byte[] anh) {
        this.anh = anh;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
    
    public void nhapDuLieuSanPham() {
        try {
            String connectionUrl = "jdbc:sqlserver://localhost:1433;DatabaseName=DBComputerStore;user=sa;password=123456;encrypt=true;trustServerCertificate=true";
            con = DriverManager.getConnection(connectionUrl);
            String sql = "INSERT INTO tblSanPham VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, maSP);
            pst.setString(2, tenSP);
            pst.setString(3, nhaCC);
            pst.setInt(4, soLuong);
            pst.setLong(5, giaNhap);
            pst.setLong(6, giaBan);
            pst.setBytes(7, anh);
            pst.setString(8, ghiChu);
            pst.executeUpdate();
            pst.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void suaDuLieuSanPham() {
        try {
            String connectionUrl = "jdbc:sqlserver://localhost:1433;DatabaseName=DBComputerStore;user=sa;password=123456;encrypt=true;trustServerCertificate=true";
            con = DriverManager.getConnection(connectionUrl);
            String sql = "UPDATE tblSanPham SET TenSP = ?, MaNCC = ?, SoLuong = ?, DonGiaNhap = ?, DonGiaBan = ?, Anh = ?, GhiChu = ? WHERE MaSP = ?";
            PreparedStatement pst = con.prepareStatement(sql); 
            pst.setString(1, tenSP);
            pst.setString(2, nhaCC);
            pst.setInt(3, soLuong);
            pst.setLong(4, giaNhap);
            pst.setLong(5, giaBan);
            pst.setBytes(6, anh);
            pst.setString(7, ghiChu);
            pst.setString(8, maSP);
            pst.executeUpdate();
            pst.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void xoaDuLieuSanPham(String maSP) {
        try {
            String connectionUrl = "jdbc:sqlserver://localhost:1433;DatabaseName=DBComputerStore;user=sa;password=123456;encrypt=true;trustServerCertificate=true";
            Connection con = DriverManager.getConnection(connectionUrl);
            String sql = "DELETE FROM tblSanPham WHERE MaSP = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(8, maSP);
            pst.executeUpdate();
            pst.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static ArrayList<SanPham> sanPhamList() {
        ArrayList<SanPham> list = new ArrayList<>();
        try {
            String connectionUrl = "jdbc:sqlserver://localhost:1433;DatabaseName=DBComputerStore;user=sa;password=123456;encrypt=true;trustServerCertificate=true";
            Connection con = DriverManager.getConnection(connectionUrl);
            String sql = "SELECT * FROM tblSanPham;";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            SanPham sp;
            while(rs.next()) {
                sp = new SanPham(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4),
                    rs.getLong(5), rs.getLong(6), rs.getBytes(7), rs.getString(8));
                list.add(sp);
            }
            pst.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public static int getSoLuong(String maSP) {
        int SL = 0;
        try {
            String connectionUrl = "jdbc:sqlserver://localhost:1433;DatabaseName=DBComputerStore;user=sa;password=123456;encrypt=true;trustServerCertificate=true";
            Connection con = DriverManager.getConnection(connectionUrl);
            String sql = "SELECT SoLuong FROM tblSanPham WHERE MaSP = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, maSP);
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
                SL = rs.getInt(1);
            }
            pst.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return SL;
    }
    
    public static void suaSoLuongSP(String maSP, int daBan) {
        try {
            String connectionUrl = "jdbc:sqlserver://localhost:1433;DatabaseName=DBComputerStore;user=sa;password=123456;encrypt=true;trustServerCertificate=true";
            Connection con = DriverManager.getConnection(connectionUrl);
            String sql = "UPDATE tblSanPham SET SoLuong = ? WHERE MaSP = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, getSoLuong(maSP) - daBan);
            pst.setString(2, maSP);
            pst.executeUpdate();
            pst.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static String getTenSP(String maSP) {
        String tenSP = null;
        try {
            String connectionUrl = "jdbc:sqlserver://localhost:1433;DatabaseName=DBComputerStore;user=sa;password=123456;encrypt=true;trustServerCertificate=true";
            Connection con = DriverManager.getConnection(connectionUrl);
            String sql = "SELECT TenSP FROM tblSanPham WHERE MaSP = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, maSP);
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
                tenSP = rs.getString(1);
            }
            pst.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tenSP;
    }
    
    public static String getNCC(String maSP) {
        String maNCC = null;
        try {
            String connectionUrl = "jdbc:sqlserver://localhost:1433;DatabaseName=DBComputerStore;user=sa;password=123456;encrypt=true;trustServerCertificate=true";
            Connection con = DriverManager.getConnection(connectionUrl);
            String sql = "SELECT maNCC FROM tblSanPham WHERE MaSP = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, maSP);
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
                maNCC = rs.getString(1);
            }
            pst.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return maNCC;
    }
}
