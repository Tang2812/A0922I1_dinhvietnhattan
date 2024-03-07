package codegym.vn.service;

import codegym.vn.entity.QuestionContent;
import codegym.vn.entity.QuestionType;
import codegym.vn.repo.QuestionTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuestionTypeServiceImpl implements QuestionTypeService{
    @Autowired
    QuestionTypeRepo questionTypeRepo;
    @Override
    public List<QuestionType> findAll() {
        return questionTypeRepo.findAll();
    }
}
