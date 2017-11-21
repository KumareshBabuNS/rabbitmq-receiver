package com.gpch.receiver.service;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public interface ReceiverService {
	
	public void openChannel(String exchange, String routingKey) throws IOException, TimeoutException, InterruptedException;

}
