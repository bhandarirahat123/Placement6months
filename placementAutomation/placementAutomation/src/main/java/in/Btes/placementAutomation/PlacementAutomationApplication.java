package in.Btes.placementAutomation;

import java.util.stream.Stream;
import in.Btes.placementAutomation.entities.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import in.Btes.placementAutomation.repositories.UserRepository;

@SpringBootApplication
public class PlacementAutomationApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlacementAutomationApplication.class, args);
 }

}