package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import services.LogicaService;
import utils.test.InfoCardDTO;

@RestController
@RequestMapping("/cards")
@CrossOrigin(origins = {"*"})
public class CardController {
	
	@Autowired
	private LogicaService response;

	@GetMapping("/all")
	public ResponseEntity<InfoCardDTO> sendAllCards() {
		return new ResponseEntity<>(response.sendAllCards(), HttpStatus.OK);
	}
	
}
