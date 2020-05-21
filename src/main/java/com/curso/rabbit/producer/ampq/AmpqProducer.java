package com.curso.rabbit.producer.ampq;

public interface AmpqProducer<T> {

	public void producer(T t);
}
