package com.wphmoon.kscs.service;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(MySource.class)
public class MyProducer {
	private MySource mySource;

	public MyProducer(MySource mySource) {
		super();
		this.mySource = mySource;
	}

	public MySource getMysource() {
		return mySource;
	}

	public void setMysource(MySource mysource) {
		mySource = mySource;
	}
}