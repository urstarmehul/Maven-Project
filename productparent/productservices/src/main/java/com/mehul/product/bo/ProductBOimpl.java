package com.mehul.product.bo;

import com.mehul.product.dao.ProductDAO;
import com.mehul.product.dao.ProductDAOimpl;
import com.mehul.product.dto.Product;

public class ProductBOimpl implements ProductBO {

	private static ProductDAO dao = new ProductDAOimpl();

	@Override
	public void create(Product product) {
		dao.create(product);
	}

	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	}
}
