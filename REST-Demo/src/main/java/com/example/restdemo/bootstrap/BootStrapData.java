package com.example.restdemo.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.restdemo.domain.Note;
import com.example.restdemo.reppsitories.NoteRepository;

//class for testing. Preloading data to DB. 
@Component
public class BootStrapData implements CommandLineRunner {

	private final NoteRepository noteRepository; 
	public BootStrapData(NoteRepository noteRepository) {
		this.noteRepository = noteRepository;
	}
	
	@Override
	public void run(String... args) throws Exception {

		System.out.println("Preloading Notes Data...");
		
		Note n1 = new Note();
		n1.setTitle("First");
		n1.setMessage("First message");
		noteRepository.save(n1);
		
		Note n2 = new Note();
		n2.setTitle("Second");
		n2.setMessage("Second message");
		noteRepository.save(n2);
		
		Note n3 = new Note();
		n3.setTitle("Thrid");
		n3.setMessage("Thrid message");
		noteRepository.save(n3);
		
		System.out.println("Preloading Complete \n Notes loaded: " + noteRepository.count());
		
	}

}
