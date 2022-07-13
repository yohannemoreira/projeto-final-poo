/**
 * Classe Comment.
 *
 * @author Bruna e Gabriela
 * @version 1.0
 * <br>
 * Copyright (C) 2022 Universidade Federal do
Ceará.
 */
package post;
public class Comment{
    // atributos
    private String text;
    private String author;
    private int id;
    private String date;

            public Comment(int id, String author, String text, String date){
            super();
            this.id = id;
            this.author = author;
            this.text = text;
            this.date = date;
            }
            public String getText(){
                return text;
            }
            public void setText(String text){
                this.text = text;
            }
            public String getAuthor(){
                return author;
            }
            public void setAuthor(String author){
                this.author = author;
            }
            public int getId(){
                return id;
            }
            public void setId(int id){
                this.id = id;
            }
            public String getDate(){
                return date;
            }
            public void setDate(String date){
                this.date = date;
            }


}