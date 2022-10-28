package com.ticket.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.mongodb.core.mapping.Document;
@Document 
public class Support {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String adminsummary;
		private String descriptionadmin;
		private int priorityadmin;
		private String assigneeadmin;
		private String createdByadmin;
		@Temporal(TemporalType.DATE)
		private Date createdDateadmin;
		@Temporal(TemporalType.DATE)
		private Date resolveDateadmin;
		private String commentadmin;
		
		public Support() {
			super();
		}
		

		public Support(String adminsummary, String descriptionadmin, int priorityadmin, String assigneeadmin,
				String createdByadmin, Date createdDateadmin, Date resolveDateadmin, String commentadmin) {
			super();
			this.adminsummary = adminsummary;
			this.descriptionadmin = descriptionadmin;
			this.priorityadmin = priorityadmin;
			this.assigneeadmin = assigneeadmin;
			this.createdByadmin = createdByadmin;
			this.createdDateadmin = createdDateadmin;
			this.resolveDateadmin = resolveDateadmin;
			this.commentadmin = commentadmin;
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getAdminsummary() {
			return adminsummary;
		}
		public void setAdminsummary(String adminsummary) {
			this.adminsummary = adminsummary;
		}
		public String getDescriptionadmin() {
			return descriptionadmin;
		}
		public void setDescriptionadmin(String descriptionadmin) {
			this.descriptionadmin = descriptionadmin;
		}
		public int getPriorityadmin() {
			return priorityadmin;
		}
		public void setPriorityadmin(int priorityadmin) {
			this.priorityadmin = priorityadmin;
		}
		public String getAssigneeadmin() {
			return assigneeadmin;
		}
		public void setAssigneeadmin(String assigneeadmin) {
			this.assigneeadmin = assigneeadmin;
		}
		public String getCreatedByadmin() {
			return createdByadmin;
		}
		public void setCreatedByadmin(String createdByadmin) {
			this.createdByadmin = createdByadmin;
		}
		public Date getCreatedDateadmin() {
			return createdDateadmin;
		}
		public void setCreatedDateadmin(Date createdDateadmin) {
			this.createdDateadmin = createdDateadmin;
		}
		public Date getResolveDateadmin() {
			return resolveDateadmin;
		}
		public void setResolveDateadmin(Date resolveDateadmin) {
			this.resolveDateadmin = resolveDateadmin;
		}
		public String getCommentadmin() {
			return commentadmin;
		}
		public void setCommentadmin(String commentadmin) {
			this.commentadmin = commentadmin;
		}
		

		@Override
		public String toString() {
			return "Support [id=" + id + ", adminsummary=" + adminsummary + ", descriptionadmin=" + descriptionadmin
					+ ", priorityadmin=" + priorityadmin + ", assigneeadmin=" + assigneeadmin + ", createdByadmin="
					+ createdByadmin + ", createdDateadmin=" + createdDateadmin + ", resolveDateadmin="
					+ resolveDateadmin + ", commentadmin=" + commentadmin + "]";
		}
		
		

}
