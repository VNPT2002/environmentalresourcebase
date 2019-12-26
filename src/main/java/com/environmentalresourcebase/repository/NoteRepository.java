package com.environmentalresourcebase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.environmentalresourcebase.model.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}