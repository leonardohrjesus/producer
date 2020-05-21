package com.curso.rabbit.producer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.rabbit.producer.ampq.AmpqProducer;
import com.curso.rabbit.producer.dto.Message;
import com.curso.rabbit.producer.service.AmqpService;


@Service
public class RabbitMQServiceImpl implements AmqpService{

	@Autowired
	private AmpqProducer<Message> amqp;
	
	@Override
	public void sendToConsumer(Message message) {
		amqp.producer(message);
		
	}


}
