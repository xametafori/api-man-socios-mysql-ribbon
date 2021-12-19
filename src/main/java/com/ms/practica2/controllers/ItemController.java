package com.ms.practica2.controllers;

import com.ms.practica2.models.Item;
import com.ms.practica2.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
	
	@Autowired
	@Qualifier("serviceFeign")
	private ItemService itemService;

	@PutMapping("/socio/{dni}/{estado}")
	public Item ActualizarSocio(@PathVariable String dni, @PathVariable String estado)	{
		return itemService.update(dni,estado);
	}
}
