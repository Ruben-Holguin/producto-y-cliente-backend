package com.example.venta.service;

import java.util.List;
import java.util.Optional;

import com.example.venta.entity.Producto;

public interface ProductoService {
	Producto create(Producto c);
	Producto update(Producto c);
	void delete(Long id);
	Optional<Producto> read(Long id);
	List<Producto> readAll();
}
