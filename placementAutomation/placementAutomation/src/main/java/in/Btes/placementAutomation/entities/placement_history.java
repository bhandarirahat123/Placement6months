package in.Btes.placementAutomation.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class placement_history {
     @Id
     @GeneratedValue(strategy=GenerationType.AUTO)
     private Long s_no;

     private String candidate_name;

     private String company_placed;
     
     private String month_of_placement;
     
     private Long year_of_placement;
     
     private Long salary_package;
     
     public Long getS_no() {
         return s_no;
     }

     public void sets_no(Long s_no) {
         this.s_no = s_no;
     }

     public String getCandidate_Name() {
         return candidate_name;
     }

     public void setCandidate_Name(String candidate_name) {
         this.candidate_name = candidate_name;
     }

     public String getCompany_Placed() {
         return company_placed;
     }

     public void setCompany_Placed(String company_placed) {
         this.company_placed = company_placed;
     }
     public String getMonth_of_Placement() {
         return month_of_placement;
     }

     public void setMonth_of_Placement(String month_of_placement) {
         this.month_of_placement = month_of_placement;
     }
     public Long getYear_of_Placement() {
         return year_of_placement;
     }

     public void setYear_of_Placement(Long year_of_placement) {
         this.year_of_placement = year_of_placement;
     }
     public Long getSalary_Package() {
         return salary_package;
     }

     public void setSalary_Package(Long salary_package) {
         this.salary_package = salary_package;
     }

}

