package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import services.LogicaService;
import utils.test.InfoCardAllMapDTO;

@RestController
@RequestMapping("/moneda")
@CrossOrigin(origins = {"*"})
public class MonedaController {
	
	@Autowired
	private LogicaService rs;

	@GetMapping("/all-monedas")
	public ResponseEntity<InfoCardAllMapDTO> sendAllMonedas() {
		return new ResponseEntity<>(this.rs.sendAllMonedas(), HttpStatus.OK);
	}
	
}
