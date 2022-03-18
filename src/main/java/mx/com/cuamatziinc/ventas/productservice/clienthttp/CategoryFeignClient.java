package mx.com.cuamatziinc.ventas.productservice.clienthttp;

import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//import mx.com.cuamatziinc.ventas.commonscategory.entity.ProductCategory;

@FeignClient(name = "category-service")
public interface CategoryFeignClient {

//	@GetMapping("/{id}")
//	Optional<ProductCategory> findCategoryById(@PathVariable Long id);
}
