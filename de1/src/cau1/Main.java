/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cau1;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ThisorQ
 */
public class Main {
    
    public static void trungnien(ArrayList<KHACHHANG> danhSachKhachHang) {
        for (KHACHHANG kh : danhSachKhachHang) {
            if (kh.phanloai(kh).equals("trung nien")) {
                kh.xuat();
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<KHACHHANG> danhSachKhachHang = new ArrayList<>();
        
        System.out.print("Nhập số lượng khách hàng: ");
        int soLuongKhachHang = sc.nextInt();
        
        for (int i = 0; i < soLuongKhachHang; i++) {
            System.out.println("Nhập thông tin khách hàng thứ " + (i + 1) + ":");
            KHACHHANG khachHang = new KHACHHANG("", 0, "", 0, "");
            khachHang.nhap();
            danhSachKhachHang.add(khachHang);
        }
         System.out.println("\nDanh sách khách hàng trung niên:");
        trungnien(danhSachKhachHang);
                 
    }
        
}
