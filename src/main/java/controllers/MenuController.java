package controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dto.UserMenuDTO;
import services.MapeoMenuService;

@RestController
@RequestMapping("/menu")
@CrossOrigin(origins = {"*"})
public class MenuController {
	
	@Autowired
	private MapeoMenuService getMenu;

	@GetMapping("/all-map")
	public ResponseEntity<Map<String, List<UserMenuDTO.Menu>>> sendAllMenuMap() {
		return new ResponseEntity<>(this.getMenu.sendMenuCompled(), HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public ResponseEntity<UserMenuDTO> sendAllMenuDto() {
		return new ResponseEntity<>(this.getMenu.sendMenuCompledDto(), HttpStatus.OK);
	}
	
}
