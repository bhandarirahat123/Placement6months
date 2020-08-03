package in.Btes.placementAutomation.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.Btes.placementAutomation.entities.placement_history;
@Repository
public interface placement_historyRepository extends CrudRepository<placement_history, Long>{

}
