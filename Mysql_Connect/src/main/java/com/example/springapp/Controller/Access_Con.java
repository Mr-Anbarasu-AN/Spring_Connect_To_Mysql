package com.example.springapp.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.Entity.Access;
import com.example.springapp.Service.Access_Ser;

@RestController
public class Access_Con {

	@Autowired
	Access_Ser stuService;
	@PostMapping("/addDetails")
	public Access addinfo(@RequestBody Access st) {
		return stuService.saveDetails(st);
	}
	
	@GetMapping("/showDetails")
	public List<Access> fetchDetails(){
		return stuService.getDetails();
	}
	
	@PutMapping("/updateDetails")
	public Access updateInfo(@RequestBody Access st1) {
		return stuService.updateDetails(st1);
	}
	
	@DeleteMapping("/deleteDetails/{sid}")
	public String deleteInfo(@PathVariable("sid") int sid) {
		stuService.deleteDetails(sid);

		return "Details is Deleted Successfully";
		//return stuService.getDetails();
		
	}
	
	
	
}