package br.com.previlato.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.previlato.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {}