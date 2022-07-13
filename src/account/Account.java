/**
 * Classe Account.
 *
 * @author Bruna, Gabriela e Yohanne
 * @version 3.0
 * <br>
 * Copyright (C) 2022 Universidade Federal do
Ceará.
 */
package account;
import Events.ExamEvents;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import post.Post;
import post.PostCollection;

public class Account {

    // atributos
    private String name;
    private String user;
    private String password;
    private String email;
    private String course;
    private String semester;
    private List<Follower> followers;
    private List<Post> posts;
    private List<ExamEvents> exams;

//  Construtor Padrão
/**
* Cria uma Conta usando o nome da pessoa, o nome do usuario, a senha, o email, o curso e o semestre.
* @param name Nome da pessoa da conta.
* @param user Nome de usuario da pessoa da conta.
* @param passwoerd Senha da conta.
* @param email Email da conta.
* @param course Curso de graduação da conta.
* @param semester Semestre cursado pela pessoa da conta.
*/
    public Account(String name, String user, String password, String email, String course, String semester) {
	super();
	this.name = name;
	this.user = user;
	this.password = password;
	this.email = email;
	this.course = course;
	this.semester = semester;
	this.followers = new ArrayList();
	this.posts = new PostCollection();
	this.exams = new ArrayList();
    }

// Métodos Getters e Setters
	
/**
* Recupera o usuário da conta.
* @return O usuário da conta.
*/
    public String getUser() {
	return user;
    }

    public void setUser(String user) {
	this.user = user;
    }
	/**
* Recupera o nome da conta.
* @return O nome da conta.
*/
    public String getName() {
	return name;
    }
    public void setName(String name){
        this.name = name;    
    }
   	/**
* Recupera a senha da conta.
* @return A senha da conta.
*/
    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }
	/**
* Recupera o email da conta.
* @return O email da conta.
*/
    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }
/**
* Recupera o curso da conta.
* @return O curso da conta.
*/
    public String getCourse() {
	return course;
    }

    public void setCourse(String course) {
	this.course = course;
    }
/**
* Recupera o semestre da conta.
* @return O semestre da conta.
*/
    public String getSemester() {
	return semester;
    }

    public void setSemester(String semester) {
	this.semester = semester;
    }
/**
* Recupera os seguidores da conta.
* @return Os seguidores da conta.
*/
    public List<Follower> getFollowers() {
	return followers;
    }

    public void setFollowers(List<Follower> followers) {
	this.followers = followers;
    }
/**
* Recupera o post da conta.
* @return O post da conta.
*/
    public List<Post> getPosts() {
	return posts;
    }

    public void setPosts(List<Post> posts) {
	this.posts = posts;
    }
	/**
* Recupera a avaliação do evento.
* @return A avaliação do evento.
*/
    public List<ExamEvents> getExams() {
        return exams;
    }
    public void setExams(List<ExamEvents> exams) {
        this.exams = exams;
    }
    
	// descobrir numero de exames
	/**
* Recupera o numero de avaliações.
* @return O numero de avaliações.
*/
    public int getExamNumber(){
	  return  this.exams.length;
    }
    public void addExamEvents(String nameExam, String dateExam, String description, int examId) {
        exams.add(new ExamEvents(nameExam, dateExam, description, examId));
    }
    public void editExamEventsName(int eventId, String nameExame) {
        for (int i = 0; i < exams.size(); i++) {
            if (exams.get(i).getEventId() == eventId) {
                exams.get(i).setNameExam(nameExame);
            }
        }
    }

    public void editExamEventsDate(int eventId, String date) {
        for (int i = 0; i < exams.size(); i++) {
            if (exams.get(i).getEventId() == eventId) {
                exams.get(i).setDateExam(date);
            }
        }
    }
    public void removeExamEvent(int eventId) {
        for (int i = 0; i < exams.size(); i++) {
            if (exams.get(i).getEventId() == eventId) {
                exams.remove(i);
            }
        }
        // Alert_FX.info("{EVENT DELETED}");
    }
    //Mostra posts:
	public void showPosts(){
		for (int i = 0; i < posts.sizeArray(); i++) {
			System.out.println(" Comment " + this.getPosts().getPostCollection().get(i).getId() + "\n" + this.getPosts().getPostCollection().get(i).getSubtitle() + "\nAutor: " + this.name);
		}
	}

}
