package com.carlos.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.carlos.producto.Producto;

@RestController
public class RutaRest {

    @PostMapping("/addLacteo")
    public void lacteo(@RequestBody Producto albaran) {
			
    	System.out.println("Servidor REST --- "+albaran);
    }
    
    @PostMapping("/addFresco")
    public void fresco(@RequestBody Producto albaran) {
			
    	System.out.println("Servidor REST --- "+albaran);
    }
}
