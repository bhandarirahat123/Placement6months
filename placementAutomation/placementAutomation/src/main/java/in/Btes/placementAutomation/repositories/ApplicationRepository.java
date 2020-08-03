package in.Btes.placementAutomation.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.Btes.placementAutomation.entities.ApplicationTable;

@Repository
public interface ApplicationRepository extends CrudRepository<ApplicationTable, Long>{ 
	
}

