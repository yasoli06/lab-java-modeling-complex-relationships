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

    public Chapter createChapter(Chapter chapter) {
        return chapterRepository.save(chapter);
    }

    public Chapter updateChapter(Long id, Chapter chapterDetails) {
        // Buscar el capítulo por su ID
        Optional<Chapter> existingChapterOptional = chapterRepository.findById(id);

        if (existingChapterOptional.isPresent()) {
            Chapter existingChapter = existingChapterOptional.get();

            // Actualizar los campos necesarios del capítulo
            existingChapter.setName(chapterDetails.getName());
            existingChapter.setDistrict(chapterDetails.getDistrict());
            existingChapter.setPresident(chapterDetails.getPresident());
            existingChapter.setMembers(chapterDetails.getMembers());

            // Guardar los cambios en la base de datos
            return chapterRepository.save(existingChapter);
        } else {
            // Si el capítulo no existe, podrías lanzar una excepción o manejar el error
            // Aquí podríamos lanzar una excepción o devolver null.
            return null;
        }
    }
}
