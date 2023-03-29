package com.example.demo.persistance;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.demo.entiteien.Organizer;


@Component
public interface IOrganizerRepository extends CrudRepository<Organizer, Long> {

}
