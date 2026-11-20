package jp.co.sss.lms.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import jp.co.sss.lms.dto.UserAttendanceDto;
import jp.co.sss.lms.entity.MPlace;

@Mapper
public interface MPlaceMapper {
	
	MPlace findByPlaceId(@Param("placeId") Integer placeId,
			@Param("hiddenFlg") Integer hiddenFlg, @Param("deleteFlg") Integer deleteFlg);

	List<UserAttendanceDto> getUserAttendanceDto(@Param("placeId") Integer placeId, @Param("from") Date from,
			@Param("to") Date to, @Param("deleteFlg") Integer deleteFlg);
}
