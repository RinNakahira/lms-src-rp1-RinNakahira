package jp.co.sss.lms.form;

import java.util.Date;

import lombok.Data;

@Data
public class BulkRegistForm {

	private String placeName;
	
	private Date from;
	
	private Date to;
}
