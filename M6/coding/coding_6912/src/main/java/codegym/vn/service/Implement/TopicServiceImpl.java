package codegym.vn.service.Implement;

import codegym.vn.repo.TopicRepository;
import codegym.vn.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class TopicServiceImpl implements TopicService {
    @Autowired
    TopicRepository topicRepository;
    @Override
    public void saveTopic(String name, String introduce, String image, String content, Integer facultyId) {
        topicRepository.saveTopic(name, introduce, image, content, facultyId);
    }
}
