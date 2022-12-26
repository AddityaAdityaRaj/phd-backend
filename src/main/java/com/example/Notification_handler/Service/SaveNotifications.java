package com.example.Notification_handler.Service;

import java.io.IOException;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.example.Notification_handler.models.Notification;
import com.example.Notification_handler.models.NotificationRepo;

@Service
public class SaveNotifications {

	@Autowired
	NotificationRepo Nrepo;
	
	
   public Notification storeNotif(String id, String title,MultipartFile file) throws IOException {
		    String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		    Notification notification =new Notification(id,title,fileName,file.getContentType(),file.getBytes());

		    return Nrepo.save(notification);
		  }
   
   public Notification getNotif(String id) {
	    return Nrepo.findById(id).get();
	  }
	  
  public Stream<Notification> getAllNotif() {
	    return Nrepo.findAll().stream();
	  }
  
  public String deleteNotif(String id) {
	  if (Nrepo.existsById(id)) {
		  Nrepo.deleteById(id);
			return "File has been successfully deleted";
		}
		return "File doesn't exist";
	}
   
}  
