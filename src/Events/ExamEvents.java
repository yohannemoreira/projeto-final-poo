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
    private String localization;
    private String description;

    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String date = formatter.format(now);

    public ExamEvents( String nameExam, String dateExam, String localization, String description) {
	this.nameExam = nameExam;
	this.dateExam = dateExam;
	this.localization = localization;
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

    public String getLocalization() {
	return localization;
    }

    public void setLocalization(String localization) {
	this.localization = localization;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public LocalDateTime getNow() {
	return now;
    }

    public void setNow(LocalDateTime now) {
	this.now = now;
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

   
}
