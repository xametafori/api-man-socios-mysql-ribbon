package com.ms.practica2.clientes;

import com.ms.practica2.models.SocioMysql;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;


@FeignClient(name = "api-man-socios-mysql")
public interface SocioFeignCliente {

	@PutMapping("api/socio/{dni}/{estado}")
	SocioMysql update(@PathVariable String dni, @PathVariable String estado);


}
