package mx.com.cuamatziinc.ventas.productservice.repository;

import org.springframework.data.repository.CrudRepository;

import mx.com.cuamatziinc.ventas.productservice.entity.Product;

public interface IRepositoryProduct extends CrudRepository<Product, Long>{

}
