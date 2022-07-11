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

    private int eventId;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String date = formatter.format(now);

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

    public DateTimeFormatter getFormatter() {
	return formatter;
    }

    public void setFormatter(DateTimeFormatter formatter) {
	this.formatter = formatter;
    }

    public String getDate() {
	return date;
    }

    public void setDate(String date) {
	this.date = date;
    }

    public String getEventId() {
        return eventId;
    }
    public void setEventId(int eventId) {
        this.eventId = eventId;
    }
   
}
