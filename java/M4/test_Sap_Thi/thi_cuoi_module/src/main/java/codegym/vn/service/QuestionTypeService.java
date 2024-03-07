package codegym.vn.service;

import codegym.vn.entity.QuestionContent;
import codegym.vn.entity.QuestionType;
import org.springframework.data.domain.Page;

import java.util.List;

public interface QuestionTypeService {
    List<QuestionType> findAll();
}
