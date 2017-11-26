package com.kchan.product.bo;

import com.kchan.product.dao.ProductDAOImpl;
import com.kchan.product.dto.Product;

public class ProductBOImpl implements ProductBO {

	private ProductDAOImpl dao;
	
	@Override
	public void create(Product product) {
		dao.create(product);

	}

	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	}

	public ProductDAOImpl getDao() {
		return dao;
	}

	public void setDao(ProductDAOImpl dao) {
		this.dao = dao;
	}

}
