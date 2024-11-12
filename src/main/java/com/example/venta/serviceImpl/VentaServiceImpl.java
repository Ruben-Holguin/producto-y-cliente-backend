package com.example.venta.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.venta.entity.Venta;
import com.example.venta.respository.VentaRepository;
import com.example.venta.service.VentaService;

@Service
public class VentaServiceImpl implements VentaService{

	@Autowired
	private VentaRepository ventaRepository;
	
	@Override
	public Venta create(Venta c) {
		// TODO Auto-generated method stub
		return ventaRepository.save(c);
	}

	@Override
	public Venta update(Venta c) {
		// TODO Auto-generated method stub
		return ventaRepository.save(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		ventaRepository.deleteById(id);
	}

	@Override
	public Optional<Venta> read(Long id) {
		// TODO Auto-generated method stub
		return ventaRepository.findById(id);
	}

	@Override
	public List<Venta> readAll() {
		// TODO Auto-generated method stub
		return ventaRepository.findAll();
	}

}
