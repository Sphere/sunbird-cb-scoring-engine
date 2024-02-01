package org.sunbird.scoringengine.comments_controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.sunbird.scoringengine.comments_model.CommentsModel;
import org.sunbird.scoringengine.comments_repository.CommentsRepository;


@RestController
@RequestMapping("/api/comments")
public class CommentsController {

	@Autowired
    CommentsRepository commentsRepository;
    
   
	@PostMapping(value = "/create")
    public ResponseEntity <?> create(@RequestBody CommentsModel comments) {
    	System.out.println(comments);
    	CommentsModel commentsSaved = commentsRepository.save(comments);
        return new ResponseEntity<>(commentsSaved, HttpStatus.OK);
    }
  
	@GetMapping("/getall")
    public ResponseEntity<?> getcomments() {
        
        List<CommentsModel> allComments = commentsRepository.findAll();

        return new ResponseEntity<Object>(allComments, HttpStatus.OK);
    }
	@GetMapping("/course")
    public ResponseEntity<?> getcommentsByCourseid(@RequestParam(name = "courseId") String Courseid) {
        System.out.println(Courseid);
        List<CommentsModel> allComments = commentsRepository.getCommentsByCourseid(Courseid);

        return new ResponseEntity<Object>(allComments, HttpStatus.OK);
    }
	
	   @PutMapping("/update")
	    public ResponseEntity<CommentsModel> updateComment(@RequestParam(name = "commentsId") Long commentId,@RequestParam(name = "courseId") Optional<String> Courseid,@RequestParam(name = "userID") Optional<String>userID, @RequestBody CommentsModel updatedComments) {
	        Optional<CommentsModel> existingComments = commentsRepository.findById(commentId);
	       
	        if (existingComments.isPresent()) {
	        	updatedComments.setCommentsId(commentId);
	            CommentsModel savedComments = commentsRepository.save(updatedComments);
	            
	            return new ResponseEntity<>(savedComments, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	   }
}
