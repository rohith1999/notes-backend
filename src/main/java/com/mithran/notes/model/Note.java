package com.mithran.notes.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Note is a model class which has noteId and noteData
 * @author Rohith S
 *
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Note {
	
	/**
	 * noteId is the primary key for uniquely identifying a Note
	 */
	@Id
	String noteId;
	/**
	 * noteData has the original contents of a Note
	 */
	String noteData;
	

}
