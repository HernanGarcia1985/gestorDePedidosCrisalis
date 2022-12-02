package com.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.entity.User;

@RestController
public class UserController {
	
	
	@PostMapping("/register")
	public ResponseEntity<User> saveUser(@RequestBody User user) {
		//validar datos del body
		//encriptar la contraseña
		//conectar a la base
		//hacer el INSERT y ejecutarlo
	}
	
	
	@PostMapping("/login")
	public User login(@RequestBody User user) {
		//conectar a la base
		//verificar usuario y contraseña con la bd
		//devolver en funcion si coincide o no
	}
}
