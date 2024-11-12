package com.example.venta.service;

import java.util.List;
import java.util.Optional;

import com.example.venta.entity.Venta;

public interface VentaService {
	Venta create(Venta c);
	Venta update(Venta c);
	void delete(Long id);
	Optional<Venta> read(Long id);
	List<Venta> readAll();
}
