package com.carlos.servicios;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.carlos.producto.Producto;

@Service
public class Servicios {

	public void lacteo(Producto albaran) throws URISyntaxException {
		
		
		URI myURL = new URI("http://localhost:8080/addLacteo");
		RequestEntity<Producto> request = new RequestEntity<Producto>(albaran,HttpMethod.POST, myURL);
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Producto> response;
		restTemplate.exchange(request,Producto.class); 		
	}
	
	public void fresco(Producto albaran) throws URISyntaxException {
		
		
		URI myURL = new URI("http://localhost:8080/addFresco");
		RequestEntity<Producto> request = new RequestEntity<Producto>(albaran,HttpMethod.POST, myURL);
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Producto> response;
		restTemplate.exchange(request,Producto.class); 		
	}
}
