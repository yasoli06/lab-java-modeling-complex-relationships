package com.nurseAssociation.nurseAssociation.controller;


import com.nurseAssociation.nurseAssociation.model.Chapter;
import com.nurseAssociation.nurseAssociation.service.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/chapters")
public class ChapterController {

    @Autowired
    private ChapterService chapterService;

    @GetMapping
    public List<Chapter> getAllChapters(){
        return chapterService.getAllChapters();
    }

    @GetMapping("{id}")
    public Optional <Chapter> getChapterById(@PathVariable Long id) {
        return chapterService.getChapterById(id);
    }

    @PostMapping
    public Chapter createChapter(@RequestBody Chapter chapter) {
        return chapterService.createChapter(chapter);
    }

    @PutMapping("/{id}")
    public Chapter updateChapter(@PathVariable Long id, @RequestBody Chapter chapter) {
        chapter.setId(id); // Para asegurarse de que estamos actualizando
        return chapterService.updateChapter(id, chapter);
    }
    @DeleteMapping("/{id}")
    public void deleteChapter(@PathVariable Long id) {
        chapterService.deleteChapter(id);
    }

}