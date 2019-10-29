package com.wphmoon.kscs.service;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;  
public interface MySource {
    String INPUT = "my-in";
    String OUTPUT = "my-out";
    @Input(INPUT)
    SubscribableChannel myInput();
    @Output(OUTPUT)
    MessageChannel myOutput();
}
