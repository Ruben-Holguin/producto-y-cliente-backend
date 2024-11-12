package com.example.venta.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.venta.entity.Venta;

@Repository
public interface VentaRepository extends JpaRepository<Venta, Long>{

}
