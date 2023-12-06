package com.shopme.admin.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopme.common.entity.Category;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CategoryService {
	
	@Autowired
	private CategoryRepository repo;
	
	public List<Category> listAll() {
		return repo.findAll();
	}
}
