package com.example.demo.persistance;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entiteien.Person;

public interface IPersonRepository  extends CrudRepository<Person , Long >{

}
