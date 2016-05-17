package com.test.repository.manytomany;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.model.manytomany.Meeting;

@Repository
public interface MeetingRepository extends CrudRepository<Meeting, Long> {

}
