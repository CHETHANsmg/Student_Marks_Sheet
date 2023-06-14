package students_mark_sheet.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Kseeb_signup_Details {
	@Id
	private String school_id;
	private String school_name;
	private String school_email;
	private String school_pswd;

	public String getSchool_id() {
		return school_id;
	}

	public void setSchool_id(String school_id) {
		this.school_id = school_id;
	}

	public String getSchool_name() {
		return school_name;
	}

	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}

	public String getSchool_email() {
		return school_email;
	}

	public void setSchool_email(String school_email) {
		this.school_email = school_email;
	}

	public String getSchool_pswd() {
		return school_pswd;
	}

	public void setSchool_pswd(String school_pswd) {
		this.school_pswd = school_pswd;
	}

}
