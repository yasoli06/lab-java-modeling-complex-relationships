package com.nurseAssociation.nurseAssociation.service;

import com.nurseAssociation.nurseAssociation.model.Chapter;
import com.nurseAssociation.nurseAssociation.repository.ChapterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChapterService {

    @Autowired
    private ChapterRepository chapterRepository;

    public List<Chapter> getAllChapters(){
        return chapterRepository.findAll();
    }

    public Optional<Chapter> getChapterById(Long id) {
        return chapterRepository.findById(id);
    }
    public void deleteChapter(Long id) {
        chapterRepository.deleteById(id);
    }
}
