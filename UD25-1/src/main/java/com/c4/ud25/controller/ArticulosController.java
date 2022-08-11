package com.c4.ud25.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.c4.ud25.dto.Articulo;
import com.c4.ud25.service.ArticulosServicesImpl;
@RestController
@RequestMapping("/api")
public class ArticulosController {

	@Autowired
	ArticulosServicesImpl articulosServiceImpl;
	
	@GetMapping("/articulos")
	public List<Articulo> listarArticulos(){
		return articulosServiceImpl.listarArticulos();
	}
	
	@PostMapping("/articulos")
	public Articulo guardarArticulo(@RequestBody Articulo Articulo) {
		return articulosServiceImpl.guardarArticulo(Articulo);
	}
	
	public Articulo ArticuloXId(@PathVariable(name="id") Long id) {
		
		Articulo Articulo = new Articulo();
		
		Articulo=articulosServiceImpl.articuloXID(id);
		
		return Articulo;
	}
	
	@PutMapping("/articulos/{id}")
	public Articulo actualizarArticulo(@PathVariable(name="id") Long id, @RequestBody Articulo Articulo) {
		
		Articulo Articulosel = new Articulo();
		Articulo ArticuloAct = new Articulo();
		
		Articulosel=articulosServiceImpl.articuloXID(id);
		
		Articulosel.setNombre(Articulo.getNombre());
		
		ArticuloAct= articulosServiceImpl.actualizarArticulo(Articulosel);
		
		return ArticuloAct;
		
	}
	
	@DeleteMapping("/articulos/{id}")
	public void eliminarArticulo(@PathVariable(name="id")Long id) {
		articulosServiceImpl.eliminarArticulo(id);
	}
}
