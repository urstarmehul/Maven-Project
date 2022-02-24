package com.mehul.product.bo;

import com.mehul.product.dto.Product;

public interface ProductBO {
	
	void create(Product product);
	
	Product findProduct(int id);

}
