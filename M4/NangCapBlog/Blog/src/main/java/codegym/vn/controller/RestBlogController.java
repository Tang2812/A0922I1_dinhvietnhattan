package codegym.vn.controller;

import codegym.vn.entity.Blog;
import codegym.vn.entity.Category;
import codegym.vn.service.BlogService;
import codegym.vn.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/blogs")
public class RestBlogController {
    @Autowired
    BlogService blogService;
    @Autowired
    CategoryService categoryService;

    @GetMapping("")
    public ResponseEntity<List<Blog>> getList() {
        List<Blog> blogList = blogService.findAll();
        if (blogList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(blogList,HttpStatus.OK);
        }
    }
    @GetMapping("/categories")
    public ResponseEntity<List<Category>> getCategoryList(){
        List<Category> categoryList=categoryService.findAll();
        if(categoryList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else{
            return new ResponseEntity<>(categoryList, HttpStatus.OK);
        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> detail(@PathVariable Integer id){
        Blog blog=blogService.findById(id);
        if(blog==null){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else{
            return new ResponseEntity<>(blog, HttpStatus.OK);
        }
    }
}
