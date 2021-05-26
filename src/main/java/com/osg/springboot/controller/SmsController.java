package com.osg.springboot.controller;

import com.osg.springboot.model.SMS;
import com.osg.springboot.response.SmsResponse;
import com.osg.springboot.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sms")
public class SmsController {

    @Autowired
    SmsService smsService;

    @PostMapping("/save")
    public SMS saveSms(@RequestBody SMS sms) {
        return smsService.saveSms(sms);
    }

    @PostMapping("/status")
    public SmsResponse smsStatus(@RequestParam("id") String messageId) {
        return smsService.getMessageStatus(messageId);
    }
}
