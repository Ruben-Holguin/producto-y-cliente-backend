package com.example.venta.service;

import java.util.List;
import java.util.Optional;

import com.example.venta.entity.Categoria;

public interface CategoriaService {
	Categoria create(Categoria c);
	Categoria update(Categoria c);
	void delete(Long id);
	Optional<Categoria> read(Long id);
	List<Categoria> readAll();
}
