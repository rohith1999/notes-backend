package com.mithran.notes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * NotesApplication class helps in running the application
 * @author Rohith S
 *
 */
@SpringBootApplication
public class NotesApplication {

	/**
	 * This main method is the starting point of the application
	 * 
	 * @param args Accepts command line input in the form of array
	 */
	public static void main(String[] args) {
		SpringApplication.run(NotesApplication.class, args);
	}

}
