package com.carlos.producto;

import java.net.URISyntaxException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.carlos.servicios.Servicios;

@Controller
public class ProductoRutas {

	@Autowired
	private ProductoDAO albaranDAO;

	@Autowired
	private Servicios servicios;

	@GetMapping("/producto")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("nuevoAlbaran");
		mav.addObject("albaran", new Producto());

		return mav;
	}

	@PostMapping("/nuevoProducto")
	public ModelAndView nuevoAlbaran(@Valid @ModelAttribute Producto albaran, BindingResult bindingResult) throws URISyntaxException {

		ModelAndView mav = new ModelAndView();

		System.out.println("bindingResult.hasErrors() " + bindingResult.hasErrors());

		if (bindingResult.hasErrors()) {
			mav.setViewName("nuevoAlbaran");
		} else if (albaran.getTipo().equals("Especia")) {
			albaranDAO.save(albaran);
			mav.setViewName("redirect:/albaran");
		} else if (albaran.getTipo().equals("Fresco")) {
			servicios.fresco(albaran);
			mav.setViewName("redirect:/albaran");
		} else if (albaran.getTipo().equals("Lacteo")) {
			servicios.lacteo(albaran);
			mav.setViewName("redirect:/albaran");
		}

		return mav;
	}
}
