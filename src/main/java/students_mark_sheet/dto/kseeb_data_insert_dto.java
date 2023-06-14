package students_mark_sheet.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class kseeb_data_insert_dto {
	@Id
	private String University_Seat_Number;
	private String name;
	private String dob;
	private String f_name;
	private String m_name;
	private int kannada;
	private int in_kannada;
	private int ex_kannada;
	private int english;
	private int in_english;
	private int ex_english;
	private int hindi;
	private int in_hindi;
	private int ex_hindi;
	private int maths;
	private int in_maths;
	private int ex_maths;
	private int science;
	private int in_science;
	private int ex_science;
	private int social_science;
	private int in_social_science;
	private int ex_social_science;

	public int getIn_kannada() {
		return in_kannada;
	}

	public void setIn_kannada(int in_kannada) {
		this.in_kannada = in_kannada;
	}

	public int getEx_kannada() {
		return ex_kannada;
	}

	public void setEx_kannada(int ex_kannada) {
		this.ex_kannada = ex_kannada;
	}

	public int getIn_english() {
		return in_english;
	}

	public void setIn_english(int in_english) {
		this.in_english = in_english;
	}

	public int getEx_english() {
		return ex_english;
	}

	public void setEx_english(int ex_english) {
		this.ex_english = ex_english;
	}

	public int getIn_hindi() {
		return in_hindi;
	}

	public void setIn_hindi(int in_hindi) {
		this.in_hindi = in_hindi;
	}

	public int getEx_hindi() {
		return ex_hindi;
	}

	public void setEx_hindi(int ex_hindi) {
		this.ex_hindi = ex_hindi;
	}

	public int getIn_maths() {
		return in_maths;
	}

	public void setIn_maths(int in_maths) {
		this.in_maths = in_maths;
	}

	public int getEx_maths() {
		return ex_maths;
	}

	public void setEx_maths(int ex_maths) {
		this.ex_maths = ex_maths;
	}

	public int getIn_science() {
		return in_science;
	}

	public void setIn_science(int in_science) {
		this.in_science = in_science;
	}

	public int getEx_science() {
		return ex_science;
	}

	public void setEx_science(int ex_science) {
		this.ex_science = ex_science;
	}

	public int getIn_social_science() {
		return in_social_science;
	}

	public void setIn_social_science(int in_social_science) {
		this.in_social_science = in_social_science;
	}

	public int getEx_social_science() {
		return ex_social_science;
	}

	public void setEx_social_science(int ex_social_science) {
		this.ex_social_science = ex_social_science;
	}

	private int total_marks;
	private int percentage;

	public String getUniversity_Seat_Number() {
		return University_Seat_Number;
	}

	public void setUniversity_Seat_Number(String university_Seat_Number) {
		University_Seat_Number = university_Seat_Number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public int getKannada() {
		return kannada;
	}

	public void setKannada(int kannada) {
		this.kannada = kannada;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getHindi() {
		return hindi;
	}

	public void setHindi(int hindi) {
		this.hindi = hindi;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}

	public int getSocial_science() {
		return social_science;
	}

	public void setSocial_science(int social_science) {
		this.social_science = social_science;
	}

	public int getTotal_marks() {
		return total_marks;
	}

	public void setTotal_marks(int total_marks) {
		this.total_marks = total_marks;
	}

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

}
