package com.hungpham.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hungpham.entity.NhanVien;

@Controller
public class TrangChuController {
	
	@Autowired
	SessionFactory sessionFactory;

	@RequestMapping("/trangchu")
	@Transactional
	public String trangChu() {
		Session session = sessionFactory.getCurrentSession();
		
		List<NhanVien> list = session.createQuery("from NhanVien").list();
		
		for (NhanVien nhanVien : list) {
			System.out.println("\n" + nhanVien.getTenNhanVien());
		}
		
		return "trangchu";
	} 
}
