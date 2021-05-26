package com.osg.springboot.service.Impl;

import com.osg.springboot.model.SMS;
import com.osg.springboot.repo.SmsRepository;
import com.osg.springboot.response.SmsResponse;
import com.osg.springboot.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SmsServiceImpl implements SmsService {
    @Autowired
    SmsRepository repository;

    @Override
    public SMS saveSms(SMS sms) {
        sms.setStatus("Message Sent");
        sms = repository.save(sms);
        if (sms != null) {
            sms.setStatus(null);
            return sms;
        }
        return null;
    }

    @Override
    public SmsResponse getMessageStatus(String messageId) {
        SmsResponse smsResponse = new SmsResponse();
        SMS sms = repository.findBySmsId(Integer.parseInt(messageId));
        if (sms != null) {
            if (sms.getStatus().equalsIgnoreCase("Message Sent")) {
                smsResponse.setStatus("ok");
            } else {
                smsResponse.setStatus("error");
            }
            smsResponse.setMessage(sms.getMessage());
        }
        return smsResponse;
    }
}
