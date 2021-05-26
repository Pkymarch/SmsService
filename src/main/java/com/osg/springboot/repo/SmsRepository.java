package com.osg.springboot.repo;

import com.osg.springboot.model.SMS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmsRepository extends JpaRepository<SMS, Integer> {
    SMS findBySmsId(Integer smsId);
}
