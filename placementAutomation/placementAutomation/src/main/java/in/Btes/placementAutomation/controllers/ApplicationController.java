package in.Btes.placementAutomation.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import in.Btes.placementAutomation.entities.ApplicationTable;
import in.Btes.placementAutomation.repositories.ApplicationRepository;
@RestController
@CrossOrigin(origins = "http://localhost:4200") // This means that this class is a Controller
@RequestMapping(path="/demo")
public class ApplicationController {
	 @Autowired // This means to get the bean called userRepository
     // Which is auto-generated by Spring, we will use it to handle the data
private ApplicationRepository applicationRepository;

	 @GetMapping(path="/alls")
public @ResponseBody Iterable<ApplicationTable> getAllApplications() {
// This returns a JSON or XML with the users
return applicationRepository.findAll();
}
	 @PostMapping(path="/adds")                                     
	   public String addUser( @RequestBody ApplicationTable application) {        
		 
		 applicationRepository.save(application); 
		   return "saved";
	   }
}
