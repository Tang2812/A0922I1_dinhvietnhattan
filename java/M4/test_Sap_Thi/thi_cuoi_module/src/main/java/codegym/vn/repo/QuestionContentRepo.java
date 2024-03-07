package codegym.vn.repo;

import codegym.vn.entity.QuestionContent;
import codegym.vn.entity.QuestionType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionContentRepo extends JpaRepository<QuestionContent,Integer> {
    Page<QuestionContent> findByTitleContaining(String title, Pageable pageable);
    Page<QuestionContent> findByQuestionType(QuestionType questionType,Pageable pageable);
    Page<QuestionContent> findByTitleContainingAndQuestionType(String title,QuestionType questionType,Pageable pageable);
}
