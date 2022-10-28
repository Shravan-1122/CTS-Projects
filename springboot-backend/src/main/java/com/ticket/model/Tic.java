package com.ticket.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.mongodb.core.mapping.Document;
@Document 
public class Tic {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String summary;
		private String description;
		private String type;
		private int priority;
		private String assignee;
		private String createdBy;
		@Temporal(TemporalType.DATE)
		private Date createdDate;
		@Temporal(TemporalType.DATE)
		private Date updatedDate;
		@Temporal(TemporalType.DATE)
		private Date resolveDate;
		private String comment;
		
		public Tic() {
			super();
		}
		

		public Tic(String summary, String description, String type, int priority, String assignee, String createdBy,
				Date createdDate, Date updatedDate, Date resolveDate, String comment) {
			super();
			this.summary = summary;
			this.description = description;
			this.type = type;
			this.priority = priority;
			this.assignee = assignee;
			this.createdBy = createdBy;
			this.createdDate = createdDate;
			this.updatedDate = updatedDate;
			this.resolveDate = resolveDate;
			this.comment = comment;
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getSummary() {
			return summary;
		}
		public void setSummary(String summary) {
			this.summary = summary;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public int getPriority() {
			return priority;
		}
		public void setPriority(int priority) {
			this.priority = priority;
		}
		public String getAssignee() {
			return assignee;
		}
		public void setAssignee(String assignee) {
			this.assignee = assignee;
		}
		public String getCreatedBy() {
			return createdBy;
		}
		public void setCreatedBy(String createdBy) {
			this.createdBy = createdBy;
		}
		public Date getCreatedDate() {
			return createdDate;
		}
		public void setCreatedDate(Date createdDate) {
			this.createdDate = createdDate;
		}
		public Date getUpdatedDate() {
			return updatedDate;
		}
		public void setUpdatedDate(Date updatedDate) {
			this.updatedDate = updatedDate;
		}
		public Date getResolveDate() {
			return resolveDate;
		}
		public void setResolveDate(Date resolveDate) {
			this.resolveDate = resolveDate;
		}
		public String getComment() {
			return comment;
		}
		public void setComment(String comment) {
			this.comment = comment;
		}
		

		@Override
		public String toString() {
			return "Tic [id=" + id + ", summary=" + summary + ", description=" + description + ", type=" + type
					+ ", priority=" + priority + ", assignee=" + assignee + ", createdBy=" + createdBy
					+ ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + ", resolveDate=" + resolveDate
					+ ", comment=" + comment + "]";
		}
		

}
