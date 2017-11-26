package com.kchan.product.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.kchan.product.dto.Product;

public class ProductDAOImplTest {

	@Test
	public void createShouldCreateProduct() {
		
		ProductDAO dao = new ProductDAOImpl();
		Product product = new Product();
		product.setId(1);
		product.setName("Pixel 2");
		product.setDescription("Such an awesome experience");
		product.setPrice(800);
		dao.create(product);
		
		Product result = dao.read(1);
		
		assertNotNull(result);
		assertEquals(1, result.getId());
		assertEquals("Pixel 2", result.getName());
	}

}
