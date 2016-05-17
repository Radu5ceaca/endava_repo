package com.test.service.business.manytomany;


import java.util.List;

import com.test.dto.manytomany.MeetingDTO;



/**
 * @author ceaca
 *
 */
public interface MeetingService {

	public MeetingDTO create (MeetingDTO meeting);

	public MeetingDTO read(Long id);

	public List<MeetingDTO> readAll();

	public MeetingDTO update(MeetingDTO meeting);

	public void delete(Long id);

}
