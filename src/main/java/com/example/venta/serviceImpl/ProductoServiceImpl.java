package com.example.venta.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.venta.entity.Producto;
import com.example.venta.respository.ProductoRepository;
import com.example.venta.service.ProductoService;

@Repository
public class ProductoServiceImpl implements ProductoService{

	@Autowired
	private ProductoRepository productoRepository;
	
	@Override
	public Producto create(Producto c) {
		// TODO Auto-generated method stub
		return productoRepository.save(c);
	}

	@Override
	public Producto update(Producto c) {
		// TODO Auto-generated method stub
		return productoRepository.save(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		productoRepository.deleteById(id);
	}

	@Override
	public Optional<Producto> read(Long id) {
		// TODO Auto-generated method stub
		return productoRepository.findById(id);
	}

	@Override
	public List<Producto> readAll() {
		// TODO Auto-generated method stub
		return productoRepository.findAll();
	}

}
