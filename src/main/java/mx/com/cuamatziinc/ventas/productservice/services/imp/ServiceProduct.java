package mx.com.cuamatziinc.ventas.productservice.services.imp;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import mx.com.cuamatziinc.ventas.commonscategory.entity.ProductCategory;
import mx.com.cuamatziinc.ventas.commonsservice.service.imp.ServiceCommon;
import mx.com.cuamatziinc.ventas.productservice.clienthttp.CategoryFeignClient;
import mx.com.cuamatziinc.ventas.productservice.entity.Product;
import mx.com.cuamatziinc.ventas.productservice.repository.IRepositoryProduct;
import mx.com.cuamatziinc.ventas.productservice.services.IServiceProduct;

@Service
public class ServiceProduct extends ServiceCommon<Product, IRepositoryProduct> implements IServiceProduct{
	
	@Autowired
	private CategoryFeignClient categoryFeignClient;

//	@Override
//	public Optional<ProductCategory> findCategoryById(Long id) {
//		
//		Optional<ProductCategory> category = categoryFeignClient.findCategoryById(id);
//		
//		return category;
//	}
	
}
