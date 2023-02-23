package com.example.springapp.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.Entity.Access;
import com.example.springapp.Repository.Access_Rep;

@Service
public class Access_Ser {
	@Autowired
	Access_Rep stRepo;
	
	public Access saveDetails(Access e)
	{
		return stRepo.save(e);
	}
	
	public List<Access> getDetails(){
		return stRepo.findAll();
	}
	
	public Access updateDetails(Access e1)
	{
		return stRepo.saveAndFlush(e1);
	}
	
	public void deleteDetails(int Id)
	{
		stRepo.deleteById(Id);
	}

	
}