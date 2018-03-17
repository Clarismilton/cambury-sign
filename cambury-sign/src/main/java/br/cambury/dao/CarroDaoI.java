package br.cambury.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.cambury.bean.Carro;

public interface CarroDaoI extends JpaRepository<Carro, Long> {
}