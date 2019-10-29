package com.wphmoon.kscs.service;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;

@EnableBinding(Source.class)
public class Producer {
	private Source mySource;

	public Producer(Source mySource) {
		super();
		this.mySource = mySource;
	}

	public Source getMysource() {
		return mySource;
	}

	public void setMysource(Source mysource) {
		mySource = mySource;
	}
}