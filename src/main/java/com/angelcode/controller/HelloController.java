package com.angelcode.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello/")
public class HelloController {

	@GetMapping("saludo/{nombre}")
	public ResponseEntity<String> getSaludo(@PathVariable("nombre") String nombre){
		return new ResponseEntity<String>("Hola y saludos: "+nombre,HttpStatus.OK);
	}
}
