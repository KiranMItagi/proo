package com.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

import com.jsp.dto.PersonDto;

@Component
public class PersonDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void insert(PersonDto personDto) {

		entityTransaction.begin();
		entityManager.persist(personDto);
		entityTransaction.commit();
	}

	public PersonDto fetch(String email) {
		PersonDto personDto = entityManager.find(PersonDto.class, email);
		return personDto;
	}

}
