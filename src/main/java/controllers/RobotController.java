package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import services.LogicaService;
import utils.test.InfoRecordClass;
import utils.test.InfoRobotDTO;
import utils.test.InfoRobotJsonDTO;

@RestController
@RequestMapping("/saga-transformers")
@CrossOrigin(origins = {"*"})
public class RobotController {
	
	@Autowired
	private LogicaService rs;

	@GetMapping("/all-array")
	public ResponseEntity<InfoRobotDTO> getAllTransformersArray() {
		return new ResponseEntity<>(rs.sendAllTransformsArray(), HttpStatus.OK);
	}
	
	@GetMapping("/all-json")
	public ResponseEntity<InfoRobotJsonDTO> getAllTransformersJson() {
		return new ResponseEntity<>(rs.sendAllTransformsJson(), HttpStatus.OK);
	}
	
	@GetMapping("/all-record")
	public ResponseEntity<InfoRecordClass> sendAllCardsRecord() {
		return new ResponseEntity<>(rs.sendAllCardsRecord(), HttpStatus.OK);
	}
	
}
