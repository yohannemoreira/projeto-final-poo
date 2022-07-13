/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * Classe ExamEvents.
 *
 * @author Bruna e Gabriela.
 * @version 2.0
 * <br>
 * Copyright (C) 2022 Universidade Federal do
Ceará.
 */
package Events;

import account.Account;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExamEvents {
    // atributos
    private String nameExam;
    private String dateExam;
    private String description;
    private int eventId;

   

    public ExamEvents(String nameExam, String dateExam, String description, int examId) {
	this.nameExam = nameExam;
	this.dateExam = dateExam;
	this.description = description;
    this.eventId = examId;
    }
    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
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

}
