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

   /**
* Cria um evento de Avaliação a partir do nome da avaliação, da data, da descrição e da Identificação do evento.
* @param nameExame O nome dado a um evento de avaliação.
* @param dateExam Data da realização de um evento de avaliação.
* @param description Descrição do evento de avaliação.
* @param examId Identificação do evento de avaliação.
*/
    public ExamEvents(String nameExam, String dateExam, String description, int examId) {
	this.nameExam = nameExam;
	this.dateExam = dateExam;
	this.description = description;
        this.eventId = examId;
    }
	
	/**
* Recupera a Identificação do evento.
* @return A Id do evento.
*/
    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }
	
	/**
* Recupera o nome da avaliação do evento.
* @return O nome da avaliação do evento.
*/	
    public String getNameExam() {
	return nameExam;
    }

    public void setNameExam(String nameExam) {
	this.nameExam = nameExam;
    }
	
	/**
* Recupera a data da avaliação do evento.
* @return A data da avaliação do evento.
*/
    public String getDateExam() {
	return dateExam;
    }

    public void setDateExam(String dateExam) {
	this. dateExam = dateExam;
    }

	/**
* Recupera a descrição da avaliação do evento.
* @return A descrição da avaliação do evento.
*/
    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

}
