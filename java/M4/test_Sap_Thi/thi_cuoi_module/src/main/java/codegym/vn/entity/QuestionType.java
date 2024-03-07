package codegym.vn.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class QuestionType {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idQT;
private String nameQT;
@OneToMany(mappedBy = "questionType")
    List<QuestionContent> questionContents;

    public QuestionType() {
    }

    public QuestionType(Integer idQT, String nameQT, List<QuestionContent> questionContents) {
        this.idQT = idQT;
        this.nameQT = nameQT;
        this.questionContents = questionContents;
    }

    public Integer getIdQT() {
        return idQT;
    }

    public void setIdQT(Integer idQT) {
        this.idQT = idQT;
    }

    public String getNameQT() {
        return nameQT;
    }

    public void setNameQT(String nameQT) {
        this.nameQT = nameQT;
    }

    public List<QuestionContent> getQuestionContents() {
        return questionContents;
    }

    public void setQuestionContents(List<QuestionContent> questionContents) {
        this.questionContents = questionContents;
    }
}
