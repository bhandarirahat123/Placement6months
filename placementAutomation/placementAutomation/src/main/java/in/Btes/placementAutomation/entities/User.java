package in.Btes.placementAutomation.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
   @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
	 	private String name;
	    private String email;
	   
	    public User() {
	       // this.name = "";
	        //sthis.email = "";
	    }
	    
	    public User(String name, String email) {
	        this.name = name;
	        this.email = email;
	    }

	    public Long getId() {
	        return id;
	    }
	    public void setId(Long id) {
			this.id = id;
		}

	    public String getName() {
	        return name;
	    }

	    public String getEmail() {
	        return email;
	    }
	    public void setName(String name) {
			this.name = name;
		}

		public void setEmail(String email) {
			this.email = email;
		}
	    @Override
	    public String toString() {
	        return "User{" + "id=" + id + ", name=" + name + ", email=" + email + '}';
	    }
	}



