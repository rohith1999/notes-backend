package com.mithran.notes.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mithran.notes.model.Note;

/**
 * NoteRepository extends Jpa repository that allows to perform
 * CRUD operations on note table
 * @author Rohith S
 *
 */
@Repository
public interface NoteRepository  extends JpaRepository<Note,String>{

}
