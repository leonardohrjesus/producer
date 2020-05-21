package com.curso.rabbit.producer.service;

import com.curso.rabbit.producer.dto.Message;

public interface AmqpService {

	public void sendToConsumer(Message message	); 
}

