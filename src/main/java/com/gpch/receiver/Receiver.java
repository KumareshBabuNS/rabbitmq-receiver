package com.gpch.receiver;

import java.util.concurrent.TimeoutException;

import com.gpch.receiver.service.ReceiverService;
import com.gpch.receiver.service.ReceiverServiceImpl;

public class Receiver {

	private static final String QUEUE = "hello";
	private static final String HOST = "localhost";

	public static void main(String[] args)
			throws java.io.IOException, TimeoutException, InterruptedException {
		ReceiverService receiverService = new ReceiverServiceImpl();
		receiverService.openChannel(HOST, QUEUE);
		
	}

}
