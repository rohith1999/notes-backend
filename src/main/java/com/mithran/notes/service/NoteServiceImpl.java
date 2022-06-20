package com.mithran.notes.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mithran.notes.model.Note;
import com.mithran.notes.model.ResponseMessage;
import com.mithran.notes.repository.NoteRepository;

/**
 * NoteServiceImpl has the business logic for createNote and getNoteById
 * 
 * @author Rohith S
 *
 */
@Service
@Transactional
public class NoteServiceImpl implements NoteService {

	/**
	 * noteRepository connects DB layer of note database to service layer
	 */
	@Autowired
	NoteRepository noteRepository;

	/**
	 * createNote adds a new note or updates an existing note into the database
	 * 
	 * @param noteId is the Id of a note which is the primary key
	 * @param note   has noteId and noteData
	 * @return Note back as the response
	 */
	@Override
	public Note createNote(String noteId, Note note) {

		note.setNoteId(noteId);
		noteRepository.save(note);

		return note;

	}

	/**
	 * getNoteById retrieves a single note by Id
	 * 
	 * @param noteId is the Id of a note which is the primary key
	 * @return Note back as the response
	 */
	@Override
	public Note getNoteById(String noteId) {
		Optional<Note> optionalNote = noteRepository.findById(noteId);
		if (optionalNote.isEmpty()) {
			return new Note();
		}
		return optionalNote.get();
	}

}
