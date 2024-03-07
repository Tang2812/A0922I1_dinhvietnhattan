package codegym.vn.service;

public interface TopicService {
    void saveTopic(String name, String introduce, String image, String content, Integer facultyId);
}
