package post;
public class Comment{
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
      /**
* Recupera o autor do comentário.
* @return O autor do comentário.
*/
            public String getAuthor(){
                return author;
            }
            public void setAuthor(String author){
                this.author = author;
            }
    /**
* Recupera a identificação do comentário.
* @return A identificação do comentário.
*/
            public int getId(){
                return id;
            }
            public void setId(int id){
                this.id = id;
            }
        /**
* Recupera a data do comentário.
* @return A data do comentário.
*/
            public String getDate(){
                return date;
            }
            public void setDate(String date){
                this.date = date;
            }


}