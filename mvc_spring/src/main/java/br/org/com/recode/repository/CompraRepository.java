package br.org.com.recode.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.com.recode.model.CompraModel;

public interface CompraRepository  extends JpaRepository <CompraModel, Long>{ 

}
