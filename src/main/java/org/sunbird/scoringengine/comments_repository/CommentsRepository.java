package org.sunbird.scoringengine.comments_repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.sunbird.scoringengine.comments_model.CommentsModel;

@Repository
public interface CommentsRepository  extends JpaRepository<CommentsModel, Long>{

	
	@Query(value = "SELECT * FROM comments WHERE course_id=?1", nativeQuery = true)
	List<CommentsModel> getCommentsByCourseid(String CourseID);
	
	
}
