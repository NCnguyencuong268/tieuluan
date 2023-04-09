package quanlykhothucpham;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
        
package quanlykhothucpham;

public class ThucPham {
private int maHang;
private String tenHang;
private float khoiLuong;
private double donGia;
private date nSX, hSD;

public ThucPham(){
}
public ThucPham (String tenHang,int maHang, float khoiLuong, double donGia, date nSX, date hSD){
this.tenHang = ten;
this.maHang = maHang;
this.khoiLuong = khoiLuong;
this.donGia = donGia;
this.nSX = nSX;
this.hSD = hSD;
}
public String getTenHang(){
        return tenHang;
}
 
public void setTenHang(String tenHang){
        this.tenHang = tenHang;
}
public int getMaHang() {
        return maHang;
    }
 
    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }
public float getKhoiLuong(float khoiLuong){
        return khoiLuong;
}
 
public void setKhoiLuong(float khoiLuong){
        this.khoiLuong = khoiLuong;
}
public double getDonGia(){
        return donGia;
}
 
public void setDonGia(double donGia){
        this.donGia = donGia;
}
 
public Date getNSX(){
        return nSX;
    }
 
    public void setNSX(Date nSX){
        this.nSX = nSX;
}
 
    public Date getHSD(){
        return hSD;
}
 
    public void setHSD(Date hSD){
        this.hSD = hSD;
}
  @Override
    public String toString() {
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeVN);
        String str = numberFormat.format(donGia);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String str1 = simpleDateFormat.format(nSX);
        String str2 = simpleDateFormat.format(hSD);
 return "Thông tin về thực phẩm: \n" +
         "Mã hàng : " + maHang +
         "\nTên hàng : " + tenHang +
         "\nKhối lượng : " + khoiLuong +
         "\nĐơn giá : " + str +
         "\nNgày sản xuất : " + str1 +
         "\nHạn sử dụng : " + str2 ;
    }
    public void setNSX(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        this.nSX = calendar.getTime();
    }
 
    public void setHSD(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        this.hSD = calendar.getTime();
    }
 
    public boolean kiemTraTenHang(boolean k) {
        if (this.tenHang == "" || this.tenHang.isEmpty()) {
            System.out.println("Tên hàng không được để trống : ");
        } else {
            k = false;
        }
        return k;
    }
 
    public boolean kiemTraNgay(boolean t) {
        if (this.getnSX().compareTo(this.gethSD()) < 0) {
            t = false;
        } else {
            System.out.println("Ngày hết hạn không được nhỏ hơn ngày sản xuất : ");
        }
        return t;
    }
 
    public void kiemTraHSD() {
        Date today = new Date();
        today.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String st = simpleDateFormat.format(today);
        if (this.gethSD().compareTo(today) < 0) {
            System.out.println("Hôm nay là ngày " + st + ", hàng hóa đã hết hạn ");
        } else {
            System.out.println("Hôm nay là ngày " + st + ", hàng hóa vẫn còn hạn ");
        }
}
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma hang: ");
        this.maHang = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ten hang: ");
        this.tenHang = sc.nextLine();
        System.out.println("Nhap khoi luong: ");
        this.khoiLuong = Float.parseFloat(sc.nextLine());
        System.out.println("Nhap don gia: ");
        this.donGia = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap ngay/thang/nam san xuat");
        this.nSX = Date.parseDate(sc.nextLine());
        System.out.println("Nhap ngay/thang/nam han su dung");
        this.hSD = Date.parseDate(sc.nextLine());
        
    }
    
    
}
