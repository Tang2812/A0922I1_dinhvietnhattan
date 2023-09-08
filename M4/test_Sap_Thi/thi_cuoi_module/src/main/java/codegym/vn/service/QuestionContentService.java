package codegym.vn.service;

import codegym.vn.entity.QuestionContent;
import codegym.vn.entity.QuestionType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface QuestionContentService {
    Page<QuestionContent> findAll(Pageable pageable);
    QuestionContent findById(Integer id);
    boolean save(QuestionContent questionContent);
    boolean delete(Integer id);
    Page<QuestionContent> findbyTitle(String title,Pageable pageable);
    Page<QuestionContent> findByType(QuestionType type, Pageable pageable);
    Page<QuestionContent> find(String title,QuestionType type, Pageable pageable);
}
