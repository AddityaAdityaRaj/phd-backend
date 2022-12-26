package com.example.Notification_handler.response;


public class Responses {
	
	  private String id;

	  private String title;
	  
	  private String docName;
	  
	  private String docType;
	  
	  private byte[] DocData;

	  private String url;
	  
	  private long size;

	  public Responses(String id,String title,String docName, String url, String docType, long size) {
	    this.id=id;
	    this.setTitle(title);
		this.docName = docName;
	    this.url = url;
	    this.docType = docType;
	    this.size = size;
	  }
	public Responses(String id,String title,String docName, String url, String docType, long size, byte[] docData) {
		this.id=id;
		this.setTitle(title);
		this.docName = docName;
		this.url = url;
		this.docType = docType;
		this.size = size;
		this.DocData=docData;
	}

	  public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}
	  public String getName() {
	    return docName;
	  }

	  public void setName(String docName) {
	    this.docName = docName;
	  }

	  public String getUrl() {
	    return url;
	  }

	  public void setUrl(String url) {
	    this.url = url;
	  }

	  public String getType() {
	    return docType;
	  }

	  public void setType(String docType) {
	    this.docType = docType;
	  }

	  public long getSize() {
	    return size;
	  }

	  public void setSize(long size) {
	    this.size = size;
	  }

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public byte[] getDocData() {
		return DocData;
	}

	public void setDocData(byte[] docData) {
		DocData = docData;
	}
	 

}
