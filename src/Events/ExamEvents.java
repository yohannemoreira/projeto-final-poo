/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Events;

import account.Account;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Yohanne
 */
public class ExamEvents {
    private String nameExam;
    private String dateExam;
    private String description;
    private String eventId;

   

    public ExamEvents(String nameExam, String dateExam, String description) {
	this.nameExam = nameExam;
	this.dateExam = dateExam;
	this.description = description;
    }

    public String getNameExam() {
	return nameExam;
    }

    public void setNameExam(String nameExam) {
	this.nameExam = nameExam;
    }

    public String getDateExam() {
	return dateExam;
    }

    public void setDateExam(String dateExam) {
	this. dateExam = dateExam;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public String getEventId() {
        return eventId;
	    
    }
    public void setEventId(String eventId) {
        this.eventId = eventId;
    }
   
}
