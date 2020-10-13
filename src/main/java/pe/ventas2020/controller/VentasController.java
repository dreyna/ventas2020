package pe.ventas2020.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.ventas2020.entity.Ventas;
import pe.ventas2020.service.VentaService;

@RestController
@RequestMapping("/ventas")
public class VentasController {
	@Autowired
	private VentaService vetService;
	
	@GetMapping("/mensaje")
	public String mensaje() {
		return "ventas";
	}
	@PutMapping("/edit/{id}")
	public int editar(@RequestBody Ventas v, @PathVariable int id) {
		Ventas venta = vetService.read(id);
		venta.setFecha(v.getFecha());
		venta.setTipodoc(v.getTipodoc());
		venta.setNumdoc(v.getNumdoc());
		return vetService.update(venta);
	}
	@PostMapping("/venta")
	public int guardar(@RequestBody Ventas v) {
		return vetService.create(v);
	}

}
