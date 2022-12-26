package com.example.Notification_handler.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.Notification_handler.response.ResponseMessage;
import com.example.Notification_handler.response.Responses;
import com.example.Notification_handler.Service.SaveNotifications;
import com.example.Notification_handler.models.Notification;

@RestController
public class NotificationsAPIs {

	@Autowired
	SaveNotifications saveNotif;
//	@Autowired
//	Notification notif;
	
	@PostMapping("/publish")
	  public ResponseEntity<ResponseMessage> uploadFile(@RequestParam MultipartFile file,@RequestParam String id,@RequestParam String title) {
	    String message = "";
	    try {
	    	saveNotif.storeNotif(id,title,file);

	      message = "Uploaded the file successfully: " + file.getOriginalFilename();
	      return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
	    } catch (Exception e) {
	      message = "Could not upload the file: " + file.getOriginalFilename() + "!";
	      return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
	    }
	  }
	
	@GetMapping("/getNotifications")
	  public ResponseEntity<List<Responses>> getListFiles() {
	    List<Responses> notifications = saveNotif.getAllNotif().map(notif -> {
	      String fileDownloadUri = ServletUriComponentsBuilder
	          .fromCurrentContextPath()
	          .path("/files/")
	          .path(notif.getId())
	          .toUriString();

	      return new Responses(
	    		  notif.getId(),
	    		  notif.getTitle(),
	    		  notif.getDocName(),
	          fileDownloadUri,
	          notif.getDocType(),
	          notif.getDocData().length,
		      notif.getDocData());
	    }).collect(Collectors.toList());

	    return ResponseEntity.status(HttpStatus.OK).body(notifications);
	  }

	@DeleteMapping("/removeNotification/{id}")
	public ResponseEntity<ResponseMessage> deletFileById(@PathVariable String id) {
		String message = "";
		message = saveNotif.deleteNotif(id);
		return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
		
	}
	
	
}
