package com.projet.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class myMainClass {
	
	private static final Logger LOG = LogManager.getLogger(myMainClass.class);

	public static void main(String[] args) {
		
		
		LOG.debug("Hello {}", "World");
		
		
	}
}
