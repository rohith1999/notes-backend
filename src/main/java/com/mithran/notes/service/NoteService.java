package com.mithran.notes.service;

import org.springframework.stereotype.Service;

import com.mithran.notes.model.Note;
import com.mithran.notes.model.ResponseMessage;

public interface NoteService {

	/**
	 * createNote adds a new note or updates an existing note into the database
	 * @param noteId is the Id of a note which is the primary key
	 * @param note  has noteId and noteData
	 * @return Note back as the response
	 */
   public Note createNote(String noteId,Note note);
   
   /**
    * getNoteById retrieves a single note by Id
    * @param noteId is the Id of a note which is the primary key
    * @return Note back as the response
    */
   public Note getNoteById(String noteId);
   
}
