package com.wphmoon.kscs.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wphmoon.kscs.service.ChatMessage;
import com.wphmoon.kscs.service.MyProducer;
import com.wphmoon.kscs.service.Producer;

@RestController
public class MyController {
	@Autowired
	private Producer producer;
	@Autowired
	private MyProducer myProducer;

	

// get the message as a complex type via HTTP, publish it to broker using spring cloud stream
	@RequestMapping(value = "/sendMessage/complexType", method = RequestMethod.POST)
	public String publishMessageComplextType(@RequestBody ChatMessage payload) {
		payload.setTime(System.currentTimeMillis());
		producer.getMysource().output().send(MessageBuilder.withPayload(payload).setHeader("type", "chat").build());
		return "success";
	}

// get the String message via HTTP, publish it to broker using spring cloud stream
	@RequestMapping(value = "/sendMessage/string", method = RequestMethod.POST)
	public String publishMessageString(@RequestBody String payload) {
// send message to channel
		producer.getMysource().output().send(MessageBuilder.withPayload(payload).setHeader("type", "string").build());
		return "success";
	}
	@RequestMapping(value = "/sendMyMessage/string", method = RequestMethod.POST)
	public String publishMyMessageString(@RequestBody String payload) {
// send message to channel
		myProducer.getMysource().myOutput().send(MessageBuilder.withPayload(payload).setHeader("type", "string").build());
		return "success";
	}
}