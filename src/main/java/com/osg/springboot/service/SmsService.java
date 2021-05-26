package com.osg.springboot.service;

import com.osg.springboot.model.SMS;
import com.osg.springboot.response.SmsResponse;

public interface SmsService {
    SMS saveSms(SMS sms);

    SmsResponse getMessageStatus(String messageId);
}
