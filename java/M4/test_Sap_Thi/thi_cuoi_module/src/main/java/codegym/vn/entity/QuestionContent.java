package codegym.vn.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class QuestionContent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank(message = "Tieu de khong duoc de trong")
    @Size(min = 5, max = 100, message = "Nhap tu 5 den 100 ki tu")
    private String title;
    @NotBlank(message = "Noi dung khong duoc de trong")
    @Size(min = 10, max = 500, message = "Nhap tu 10 den 500 ki tu")
    private String content;
    @NotBlank(message = "Noi dung khong duoc de trong")
    private String answer;
    @ManyToOne
    @JoinColumn(name = "idQT", referencedColumnName = "idQT")
    private QuestionType questionType;
    @NotBlank(message = "Ngay tao khong duoc de trong")
    private String dateCreate;
    @NotBlank(message = "status khong duoc de trong")
    private String status;

    public QuestionContent() {
    }

    public QuestionContent(String title, String content, String answer, QuestionType questionType, String dateCreate, String status) {
        this.title = title;
        this.content = content;
        this.answer = answer;
        this.questionType = questionType;
        this.dateCreate = dateCreate;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
