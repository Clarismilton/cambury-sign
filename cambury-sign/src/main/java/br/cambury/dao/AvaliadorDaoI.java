package br.cambury.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.cambury.bean.Avaliador;

public interface AvaliadorDaoI extends JpaRepository<Avaliador, Long> {}