package in.Btes.placementAutomation.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Company {
    @Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
    private Long comp_id;
 	private String comp_name;
    private String  comp_email;
    private String  branch_name;
    private String  company_package;
    private String  dateofdrive;
    private String  jobprofile;
    private String  totalvacancies;
    private String  batchpassout;
   // private String uploadresume;
	public String getDateofdrive() {
		return dateofdrive;
	}
	public void setDateofdrive(String dateofdrive) {
		this.dateofdrive = dateofdrive;
	}
	public Long getComp_id() {
		return comp_id;
	}
	public void setComp_id(Long comp_id) {
		this.comp_id = comp_id;
	}
	public String getComp_name() {
		return comp_name;
	}
	public void setComp_name(String comp_name) {
		this.comp_name = comp_name;
	}
	public String getJobprofile() {
		return jobprofile;
	}
	public void setJobprofile(String jobprofile) {
		this.jobprofile = jobprofile;
	}
	public String getTotalvacancies() {
		return totalvacancies;
	}
	public void setTotalvacancies(String totalvacancies) {
		this.totalvacancies = totalvacancies;
	}
	public String getBatchpassout() {
		return batchpassout;
	}
	public void setBatchpassout(String batchpassout) {
		this.batchpassout = batchpassout;
	}
//	public String getUploadresume() {
//		return uploadresume;
//	}
//	public void setUploadresume(String uploadresume) {
//		this.uploadresume = uploadresume;
//	}
	public String getComp_email() {
		return comp_email;
	}
	public void setComp_email(String comp_email) {
		this.comp_email = comp_email;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public String getCompany_package() {
		return company_package;
	}
	public void setCompany_package(String company_package) {
		this.company_package = company_package;
	}
	@Override
	public String toString() {
		return "Company [comp_id=" + comp_id + ", comp_name=" + comp_name + ", comp_email=" + comp_email
				+ ", branch_name=" + branch_name + ", company_package=" + company_package + ", dateofdrive="
				+ dateofdrive + ", jobprofile=" + jobprofile + ", totalvacancies=" + totalvacancies + ", batchpassout="
				+ batchpassout + "]";
   }
 
}



