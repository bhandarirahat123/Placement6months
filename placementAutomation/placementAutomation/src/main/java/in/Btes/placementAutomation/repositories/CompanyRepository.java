package in.Btes.placementAutomation.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.Btes.placementAutomation.entities.Company;
@Repository
public interface CompanyRepository extends CrudRepository <Company ,Long>{

}
