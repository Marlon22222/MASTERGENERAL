package com.unab.desarrollospring.DAO;

import org.springframework.data.repository.CrudRepository;

import com.unab.desarrollospring.Entidades.Persona;

public interface PersonaDAO extends CrudRepository<Persona, Long> {

}

