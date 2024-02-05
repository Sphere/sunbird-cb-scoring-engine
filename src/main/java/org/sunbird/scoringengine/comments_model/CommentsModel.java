package org.sunbird.scoringengine.comments_model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "comments")
public class CommentsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "commentsId")
    private Long commentsId;
    public Long getCommentsId() {
		return commentsId;
	}
	public void setCommentsId(Long commentsId) {
		this.commentsId = commentsId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getCurrentStatus() {
		return currentStatus;
	}
	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}
	public String getNextStatus() {
		return nextStatus;
	}
	public void setNextStatus(String nextStatus) {
		this.nextStatus = nextStatus;
	}
	public boolean getReadComments() {
		return readComments;
	}
	public void setReadComments(boolean readComments) {
		this.readComments = readComments;
	}
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}
	public CommentsModel() {
    }
    public CommentsModel(Long commentsId, String userId, String courseId, String role, String comments,
			String currentStatus, String nextStatus, boolean readComments, LocalDateTime createdDate, LocalDateTime updatedDate,String username) {
		this.commentsId = commentsId;
		this.userId = userId;
		this.courseId = courseId;
		this.role = role;
		this.comments = comments;
		this.currentStatus = currentStatus;
		this.nextStatus = nextStatus;
		this.readComments = readComments;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.username=username;
	}

	@Column(name = "userId")
    private String userId;

    @Column(name = "courseId")
    private String courseId;

    @Column(name = "role")
    private String role;

    @Column(name = "comments")
    private String comments;

    @Column(name = "currentStatus")
    private String currentStatus;

    @Column(name = "nextStatus")
    private String nextStatus;

    @Column(name = "readComments")
    private boolean readComments;

    @Column(name = "createdDate")
    private LocalDateTime createdDate;

    @Column(name = "updatedDate")
    private LocalDateTime updatedDate;
    
    @Column(name = "username")
    private String username;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
}
