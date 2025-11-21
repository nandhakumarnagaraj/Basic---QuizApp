package com.nirmaan.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "tbl_options")
public class Option {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int optionId;

	private String optionText;

	private boolean correct;

	// An Option belongs to one Question.
	@ManyToOne
	@JoinColumn(name = "question_id") // Foreign key column
	@JsonBackReference
	private Question question;
}