package codeptit.QuanLyCuaHangLapTop.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class NhanVien {
    private String maNV, tenNV, gioiTinh;
    private Date ngaySinh;
    private String diaChi;
    private String dienThoai;
    private long luong;
    private Connection con;

    public NhanVien(String maNV, String tenNV, String gioiTinh, Date ngaySinh, String diaChi, String dienThoai, long luong) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.dienThoai = dienThoai;
        this.luong = luong;
    }

    
    
    public NhanVien() {
        this.maNV = "";
        this.tenNV = "";
        this.gioiTinh = "";
        this.ngaySinh = null;
        this.diaChi = "";
        this.dienThoai = "";
        this.luong = 0;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public long getLuong() {
        return luong;
    }

    public void setLuong(long luong) {
        this.luong = luong;
    }
    
    public void nhapDuLieuUser() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        try {
            String connectionUrl = "jdbc:sqlserver://localhost:1433;DatabaseName=DBComputerStore;user=sa;password=123456;encrypt=true;trustServerCertificate=true";
            con = DriverManager.getConnection(connectionUrl);
            String sql = "UPDATE tblNhanVien SET TenNV = ?, GioiTinh = ?, NgaySinh = ?, DiaChi = ?, DienThoai = ?, Luong = ? WHERE MaNV = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, tenNV);
            pst.setString(2, gioiTinh);
            pst.setString(3, sdf.format(ngaySinh));
            pst.setString(4, diaChi);
            pst.setString(5, dienThoai);
            pst.setLong(6, luong);
            pst.setString(7, maNV);
            pst.executeUpdate();
            pst.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void layDuLieuUser(String tenTK) {
        try {
            String connectionUrl = "jdbc:sqlserver://localhost:1433;DatabaseName=DBComputerStore;user=sa;password=123456;encrypt=true;trustServerCertificate=true";
            con = DriverManager.getConnection(connectionUrl);
            String sql = "SELECT * FROM tblNhanVien WHERE MaNV = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, tenTK);
            ResultSet rs = pst.executeQuery();
            if(rs.next()) {
                this.maNV = rs.getString(1);
                this.tenNV = rs.getNString(2);
                this.gioiTinh = rs.getNString(3);
                this.ngaySinh = rs.getDate(4);
                this.diaChi = rs.getNString(5);
                this.dienThoai = rs.getString(6);
                this.luong = rs.getLong(7);
            }
            pst.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static ArrayList<NhanVien> nhanVienList() {
        ArrayList<NhanVien> list = new ArrayList<>();
        try {
            String connectionUrl = "jdbc:sqlserver://localhost:1433;DatabaseName=DBComputerStore;user=sa;password=123456;encrypt=true;trustServerCertificate=true";
            Connection con = DriverManager.getConnection(connectionUrl);
            String sql = "SELECT * FROM tblNhanVien;";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            NhanVien nv;
            while(rs.next()) {
                nv = new NhanVien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5), rs.getString(6), rs.getLong(7));
                list.add(nv);
            }
            pst.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public void nhapDuLieuNhanVien() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        try {
            String connectionUrl = "jdbc:sqlserver://localhost:1433;DatabaseName=DBComputerStore;user=sa;password=123456;encrypt=true;trustServerCertificate=true";
            con = DriverManager.getConnection(connectionUrl);
            String sql = "INSERT INTO tblNhanVien VALUES (?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, maNV);
            pst.setString(2, tenNV);
            pst.setString(3, gioiTinh);
            pst.setString(4, sdf.format(ngaySinh));
            pst.setString(5, diaChi);
            pst.setString(6, dienThoai);
            pst.setLong(7, luong);
            pst.executeUpdate();
            pst.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void suaDuLieuNhanVien() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        try {
            String connectionUrl = "jdbc:sqlserver://localhost:1433;DatabaseName=DBComputerStore;user=sa;password=123456;encrypt=true;trustServerCertificate=true";
            con = DriverManager.getConnection(connectionUrl);
            String sql = "UPDATE tblNhanVien SET TenNV = ?, GioiTinh = ?, NgaySinh = ?, DiaChi = ?, DienThoai = ?, Luong = ? WHERE MaNV = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, tenNV);
            pst.setString(2, gioiTinh);
            pst.setString(3, sdf.format(ngaySinh));
            pst.setString(4, diaChi);
            pst.setString(5, dienThoai);
            pst.setLong(6, luong);
            pst.setString(7, maNV);
            pst.executeUpdate();
            pst.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void xoaDuLieuNhanVien(String maNV) {
        try {
            String connectionUrl = "jdbc:sqlserver://localhost:1433;DatabaseName=DBComputerStore;user=sa;password=123456;encrypt=true;trustServerCertificate=true";
            Connection con = DriverManager.getConnection(connectionUrl);
            String sql = "DELETE FROM tblNhanVien WHERE MaNV = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, maNV);
            pst.executeUpdate();
            pst.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
