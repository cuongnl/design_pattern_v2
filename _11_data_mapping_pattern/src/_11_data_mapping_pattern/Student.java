package _11_data_mapping_pattern;

import java.io.Serializable;

/**
 * POJO
 * 
 * @author nguyenliencuong
 *
 */
public class Student implements Serializable {

	private static final long serialVersionUID = 1L;

	private int studentId;
	private String name;
	private char grade;

	public Student(final int studentId, final String name, final char grade) {
		this.studentId = studentId;
		this.name = name;
		this.grade = grade;
	}

	public Student() {
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	@Override
	public boolean equals(Object inputObject) {
		boolean isEqual = false;

		/* Check if both objects are same */
		if (this == inputObject) {

			isEqual = true;
		} else if (inputObject != null && getClass() == inputObject.getClass()) {

			final Student inputStudent = (Student) inputObject;

			/* If student id matched */
			if (this.getStudentId() == inputStudent.getStudentId()) {

				isEqual = true;
			}
		}

		return isEqual;
	}
	
	@Override
	public int hashCode() {
		return this.getStudentId();
	}
}
