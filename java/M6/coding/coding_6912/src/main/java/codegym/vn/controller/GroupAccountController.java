package codegym.vn.controller;

import codegym.vn.entity.GroupAccount;
import codegym.vn.service.GroupAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/Group")
public class GroupAccountController {
    @Autowired
    GroupAccountService groupAccountService;

    @GetMapping("/createGroup")
    public ResponseEntity<?> createGroup() {
        //gui danh sach list student
        //gui doi tuong tao moi
        return new ResponseEntity<>(new GroupAccount(), HttpStatus.OK);
    }

    @PostMapping("/createGroup")
    public ResponseEntity<?> doCreateGroup(@RequestParam("newGroup") GroupAccount groupAccount) {
        String nameGroup = groupAccount.getName();
        groupAccountService.saveGroup(nameGroup);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/joinGroup")
    public ResponseEntity<?> joinGroup(@RequestParam("studentID") Integer studentId, @RequestParam("groupId") Integer groupId) {
        groupAccountService.acceptJoinGroup(groupId, studentId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
