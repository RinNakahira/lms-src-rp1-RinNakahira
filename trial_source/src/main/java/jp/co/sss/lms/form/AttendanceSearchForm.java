package jp.co.sss.lms.form;

import java.util.List;

import lombok.Data;

@Data
public class AttendanceSearchForm {

	private List<String> courseName;
	private String placeName;
	private List<String> companyName;
	private String userName;
}
