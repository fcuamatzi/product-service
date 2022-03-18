package mx.com.cuamatziinc.ventas.productservice.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import mx.com.cuamatziinc.ventas.commonscategory.entity.ProductCategory;
import mx.com.cuamatziinc.ventas.commonsservice.controller.ControllerCommon;
import mx.com.cuamatziinc.ventas.productservice.entity.Product;
import mx.com.cuamatziinc.ventas.productservice.services.IServiceProduct;

@RestController
public class ControllerProduct extends ControllerCommon<Product, IServiceProduct> {
	
	@Value("${config.balanceador.test}")
	private String balanceadorTest;

	@PutMapping("/{productId}")
	public ResponseEntity<?> modify(@RequestBody Product product, @PathVariable Long productId) {
		
		Optional<Product> productDb = serviceCommon.findById(productId);

		if (productDb.isEmpty()) {
			return ResponseEntity.notFound().build();
		} 
		
		Product productFind = productDb.get();
		
		productFind.setDescription(product.getDescription());
		productFind.setImgUrl(product.getImgUrl());
		productFind.setName(product.getName());
		productFind.setSku(product.getSku());
		productFind.setUnitPrice(product.getUnitPrice());
		productFind.setUnitsInStock(product.getUnitsInStock());
		productFind.setActive(product.getActive());
		
		productFind.setCategoryId(product.getCategoryId());
		
		return ResponseEntity.status(HttpStatus.CREATED).body(serviceCommon.save(productFind));
		
	}
	
//	@GetMapping("/cat/{id}")
//	public ResponseEntity<?> getCAtegoryById(@PathVariable Long id) {
//		
//		Map<String, Object> response = new HashMap<String, Object>();
//		response.put("balanceador", balanceadorTest);
//		
//		
//		Optional<ProductCategory> categoryOp = serviceCommon.findCategoryById(id);
//		
//		System.out.println("---------------------------------------------------------" + balanceadorTest + "--------------------------------------------------------------");
//		
//		if(categoryOp.isEmpty())
//			return ResponseEntity.notFound().build();
//		
//		response.put("objeto", categoryOp.get());
//		
//		return ResponseEntity.ok().body(response);
//	}
}
