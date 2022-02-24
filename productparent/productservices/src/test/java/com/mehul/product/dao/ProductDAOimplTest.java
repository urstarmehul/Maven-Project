package com.mehul.product.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.mehul.product.dto.Product;

public class ProductDAOimplTest {

	@Test
	public void createShouldCreateProduct() {
		
		ProductDAO dao = new ProductDAOimpl();
		Product product = new Product();
		product.setId(1);
		product.setName("Samsung");
		product.setDescription("It's Awesome");
		product.setPrice(70000);
		dao.create(product);
		Product result = dao.read(1);
		
		assertNotNull(result);
		assertEquals("Samsung", result.getName());
		
	}

}
