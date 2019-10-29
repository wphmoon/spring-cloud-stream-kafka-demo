package com.wphmoon.kscsclient;
public class ChatMessage {

	private String contents;
	private long time;

	public ChatMessage() {

	}

	public ChatMessage(String contents, long time) {

		this.contents = contents;
		this.time = time;
	}

	public String getContents() {

		return contents;
	}

	public long getTime() {

		return time;
	}

	public void setTime(long time) {

		this.time = time;
	}

	@Override
	public String toString() {

		return "ChatMessage [contents=" + contents + ", time=" + time + "]";
	}

}