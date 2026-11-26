package jp.co.sss.lms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.sss.lms.dto.LoginUserDto;
import jp.co.sss.lms.dto.PlaceDto;
import jp.co.sss.lms.entity.MPlace;
import jp.co.sss.lms.mapper.MPlaceMapper;
import jp.co.sss.lms.util.Constants;
import jp.co.sss.lms.util.MessageUtil;

@Service
public class PlaceService {
	
	@Autowired
	MPlaceMapper mPlaceMapper;
	
	//@Autowired
	//TUserPlaceMapper tUserPlaceMapper;
	
	@Autowired
	LoginUserDto loginUserDto;
	
	@Autowired
	MessageUtil messageUtil;

	public PlaceDto getPlaceDto() {
		Integer placeId = loginUserDto.getPlaceId();
		MPlace mPlace = mPlaceMapper.findByPlaceId(placeId, Constants.DB_HIDDEN_FLG_FALSE, Constants.DB_FLG_FALSE);
		
		PlaceDto placeDto = new PlaceDto();
		if (mPlace != null) {
			placeDto.setPlaceId(mPlace.getPlaceId());
			placeDto.setPlaceName(mPlace.getPlaceName());
			placeDto.setPlaceDescription(mPlace.getPlaceDescription());
			placeDto.setSupportAvailable(mPlace.getSupportAvailable());
			placeDto.setSeatingCapacity(mPlace.getSeatingCapacity());
			placeDto.setPlaceNote(mPlace.getPlaceNote());
			placeDto.setHiddenFlg(mPlace.getHiddenFlg());
		}
		return placeDto;
	}
}
