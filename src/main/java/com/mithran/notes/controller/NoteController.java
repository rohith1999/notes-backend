package com.mithran.notes.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mithran.notes.model.Note;
import com.mithran.notes.model.ResponseMessage;
import com.mithran.notes.service.NoteService;

/**
 * NoteController is is used to create and get a Note
 * @author Rohith S
 *
 */
@RestController
@RequestMapping("/note")
@CrossOrigin
public class NoteController {
	
	/**
	 * noteService is an interface that has all the necessary functions to be implemented
	 */
	@Autowired
	NoteService noteService;
	
	/**
	 * createNote adds a new note or updates an existing note into the database
	 * 
	 * @param noteId is the Id of a note which is the primary key
	 * @param note   has noteId and noteData
	 * @return Note back as the response
	 */
	@PostMapping("/{noteId}")
	public ResponseEntity<Note> createNote(@PathVariable String noteId, @RequestBody Note note) {
		
		Note noteResponse = noteService.createNote(noteId, note);
		
		return new ResponseEntity<Note>(noteResponse, HttpStatus.OK);

		
	}
	
	/**
	 * getNoteById retrieves a single note by Id
	 * 
	 * @param noteId is the Id of a note which is the primary key
	 * @return Note back as the response
	 */
	@GetMapping("/{noteId}")
	public ResponseEntity<Note> getNoteById(@PathVariable String noteId){

		Note noteResponse = noteService.getNoteById(noteId);

		return new ResponseEntity<Note>(noteResponse, HttpStatus.OK);

	}

}
