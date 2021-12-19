package com.ms.practica2.service;

import com.ms.practica2.clientes.SocioFeignCliente;
import com.ms.practica2.models.Item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("serviceFeign")
public class ItemServiceFeign implements ItemService {
	
	@Autowired
	private SocioFeignCliente clienteFeign;

	@Override
	public Item update(String dni, String estado) {
		return new Item(clienteFeign.update(dni,estado));
	}

}
