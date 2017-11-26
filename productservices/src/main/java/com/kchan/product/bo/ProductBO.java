package com.kchan.product.bo;

import com.kchan.product.dto.Product;

public interface ProductBO {

	public void create(Product product);
	public Product findProduct(int id);
}
