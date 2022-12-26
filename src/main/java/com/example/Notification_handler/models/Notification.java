package com.example.Notification_handler.models;

import org.hibernate.annotations.GenericGenerator;


import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name = "Notifications")
public class Notification {

	  @Id
	  private String id;

	  private String title;
	  
	  private String docName;
	  
	  private String docType;

	  @Lob
	  private byte[] DocData;

	  public Notification() {
	  }

	public Notification(String id,String title,String docName,String docType, byte[] docData) {
		this.id=id;
		this.title = title;
		this.setDocName(docName);
		this.docType = docType;
		DocData = docData;
	}
	
	  public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDocType() {
		return docType;
	}

	public void setDocType(String docType) {
		this.docType = docType;
	}

	public byte[] getDocData() {
		return DocData;
	}

	public void setDocData(byte[] docData) {
		DocData = docData;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}
	  
	
}
