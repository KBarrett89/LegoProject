package com.bae.Lego;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bae.Lego.data.Lego;
import com.bae.Lego.service.LegoKitService;

@RestController
public class LegoTestController {

	private LegoKitService service;

	public LegoTestController(LegoKitService service) {
		super();
		this.service = service;
	}

	@GetMapping("/")
	public String hello() {
		return "Hello, World!";
	}

	@PostMapping("/CreateLegoKit")
	public void createLegoKit(@RequestBody Lego LegoKit) {
		this.service.createLegoKit(LegoKit);
	}

	@GetMapping("/getAllLegoKits")
	public List<Lego> getAllLegoKits() {
		return this.service.getAllLegoKits();
	}

	@GetMapping("/getLegoKit/{id)")
	public Lego getLegoKit(@PathVariable int id) {
		return this.service.getLegoKit(id);
	}

	@PutMapping("/replaceLegoKit/{id}")
	public Lego replaceLegoKit(@PathVariable int id, @RequestBody Lego newLegoKit) {
		return this.service.replaceLegoKit(id, newLegoKit); // replaces the kitten at index id
	}

	@DeleteMapping("/deleteLegoKit/{id}")
	public String deleteLegoKit(@PathVariable int id) {
		return this.service.deleteLegoKit(id);

	}
}