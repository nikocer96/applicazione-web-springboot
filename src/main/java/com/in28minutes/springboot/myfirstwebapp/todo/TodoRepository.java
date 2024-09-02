package com.in28minutes.springboot.myfirstwebapp.todo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

//PER INTERAGIRE CON IL DB DOBBIAMO CREARE UNA INTERFACCIA ED ESTENDERE JPAREPOSITORY CON ALL'INTERNO, IL PRIMO PUNTO SARA' IL BEAN CHE STIAMO 
	//GESTENDO E IL SECONDO PUNTO IL TIPO DELL'ID CHE SAREBBE INT, MA QUA VA IL TIPO WRAPPER
public interface TodoRepository extends JpaRepository<Todo, Integer> {

	public List<Todo> findTodoByUsername(String username);	
}
