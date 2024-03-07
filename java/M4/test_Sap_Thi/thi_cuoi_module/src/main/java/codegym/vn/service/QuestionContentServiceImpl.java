package codegym.vn.service;

import codegym.vn.entity.QuestionContent;
import codegym.vn.entity.QuestionType;
import codegym.vn.repo.QuestionContentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionContentServiceImpl implements QuestionContentService{
    @Autowired
    QuestionContentRepo questionContentRepo;
    @Override
    public Page<QuestionContent> findAll(Pageable pageable) {
        return questionContentRepo.findAll(pageable);
    }

    @Override
    public QuestionContent findById(Integer id) {
        return questionContentRepo.findById(id).orElse(null);
    }

    @Override
    public boolean save(QuestionContent questionContent) {
        questionContentRepo.save(questionContent);
        return true;
    }

    @Override
    public boolean delete(Integer id) {
        if(questionContentRepo.existsById(id)){
            questionContentRepo.deleteById(id);
        return  true;
        }
        return false;
    }

    @Override
    public Page<QuestionContent> findbyTitle(String title,Pageable pageable) {
        return questionContentRepo.findByTitleContaining(title,pageable);
    }

    @Override
    public Page<QuestionContent> findByType(QuestionType type, Pageable pageable) {
        return questionContentRepo.findByQuestionType(type,pageable);
    }

    @Override
    public Page<QuestionContent> find(String title, QuestionType type, Pageable pageable) {
        return find(title,type,pageable);
    }
}
