package com.test.dto.manytomany;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.test.model.manytomany.Meeting;

/**
 * @author ceaca
 *
 */
public class MeetingConverter {

	private MeetingConverter() {
	}

	public static MeetingDTO toDTO(Meeting model) {
		MeetingDTO dto = null;

		if (model != null) {
			Set<StudentDTO> studentDTOs = StudentConverter.toDTO(model.getStudents());
			dto = new MeetingDTO(model.getSubject(), model.getMeetingDate(), studentDTOs);
			dto.setMeetingId(model.getMeetingId());
		}

		return dto;
	}

	public static List<MeetingDTO> toDTO(List<Meeting> models) {
		List<MeetingDTO> dtos = new ArrayList<>();

		if ((models != null) && (!models.isEmpty())) {
			for (Meeting model : models) {
				MeetingDTO dto = toDTO(model);
				dtos.add(dto);
			}
		}

		return dtos;
	}
}
