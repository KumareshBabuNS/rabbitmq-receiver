package com.gpch.receiver;

import java.util.concurrent.TimeoutException;

import com.gpch.receiver.service.ReceiverService;
import com.gpch.receiver.service.ReceiverServiceImpl;

public class Receiver {

	private static final String EXCHANGE = "com.gpch";
	private static final String ROUTING_KEY = "blue";

	public static void main(String[] args)
			throws java.io.IOException, TimeoutException, InterruptedException {
		ReceiverService receiverService = new ReceiverServiceImpl();
		receiverService.openChannel(EXCHANGE, ROUTING_KEY);
		
	}

}
