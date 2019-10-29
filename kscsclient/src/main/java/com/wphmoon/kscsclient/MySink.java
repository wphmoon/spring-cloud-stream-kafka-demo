package com.wphmoon.kscsclient;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface MySink {
	String INPUT = "my-in";
    @Input(INPUT)
    SubscribableChannel myInput();
}
