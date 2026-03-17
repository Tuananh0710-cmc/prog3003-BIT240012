/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.baitaphashmap;

import java.util.HashMap;

/**
 *
 * @author panhh
 */

public class QuanLyNhanVien {
    public static void main(String[] args) {
        // 1. Khởi tạo HashMap
        HashMap<Integer, String> employeeMap = new HashMap<>();

        // 2. Thêm nhân viên
        employeeMap.put(101, "Anna");
        employeeMap.put(102, "Peter");
        employeeMap.put(103, "Mary");

        // 3. Lấy tên nhân viên ID 102
        System.out.println("--- Truy xuat du lieu ---");
        String name = employeeMap.get(102);
        System.out.println("Nhan vien ID 102 la: " + name);

        // 4. Kiểm tra ID 105
        System.out.println("\n--- Kiem tra ID 105 ---");
        if (!employeeMap.containsKey(105)) {
            employeeMap.put(105, "Unknown");
            System.out.println("Da them ID 105 voi ten 'Unknown'.");
        }

        // In toàn bộ danh sách để kiểm tra kết quả
        System.out.println("\nDanh sach cuoi cung: " + employeeMap);
    }
}