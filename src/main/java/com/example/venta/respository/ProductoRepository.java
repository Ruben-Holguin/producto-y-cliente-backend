package com.example.venta.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.venta.entity.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long>{

}
