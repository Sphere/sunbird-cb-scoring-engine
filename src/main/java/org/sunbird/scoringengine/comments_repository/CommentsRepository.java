package org.sunbird.scoringengine.comments_repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.sunbird.scoringengine.comments_model.CommentsModel;

@Repository
public interface CommentsRepository  extends JpaRepository<CommentsModel, Long>{

	
	@Query(value = "SELECT * FROM comments WHERE course_id=?1 order by updated_date desc NULLS LAST", nativeQuery = true)
	List<CommentsModel> getCommentsByCourseid(String CourseID);
	
	@Query(value = "SELECT * FROM comments order by updated_date desc NULLS LAST", nativeQuery = true)
	List<CommentsModel> getAllComments();
	
}
