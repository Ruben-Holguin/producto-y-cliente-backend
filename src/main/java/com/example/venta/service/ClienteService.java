package com.example.venta.service;

import java.util.List;
import java.util.Optional;

import com.example.venta.entity.Cliente;

public interface ClienteService {
	Cliente create(Cliente c);
	Cliente update(Cliente c);
	void delete(Long id);
	Optional<Cliente> read(Long id);
	List<Cliente> readAll();
}
