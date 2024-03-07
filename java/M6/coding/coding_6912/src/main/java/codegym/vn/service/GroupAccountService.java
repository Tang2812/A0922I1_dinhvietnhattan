package codegym.vn.service;

public interface GroupAccountService {
void saveGroup(String name);
void acceptJoinGroup(Integer groupId, Integer studentId);
}
