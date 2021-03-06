package in.Btes.placementAutomation.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import in.Btes.placementAutomation.entities.User;
import in.Btes.placementAutomation.entities.placement_history;
import in.Btes.placementAutomation.repositories.placement_historyRepository;

@RestController // This means that this class is a Controller
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)

public class placement_historyController {
   @Autowired // This means to get the bean called userRepository
          // Which is auto-generated by Spring, we will use it to handle the data
   private placement_historyRepository PlacementRepository;
   @GetMapping(path="/all1")
   public @ResponseBody Iterable<placement_history> getAllhistory() {
     // This returns a JSON or XML with the users
     return PlacementRepository.findAll();
   }
}

