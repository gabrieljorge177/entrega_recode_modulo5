package br.org.com.recode.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.com.recode.model.PassagemModel;

public interface PassagemRepository extends JpaRepository <PassagemModel, Long>{ 

}
