package comment;
public class Comentario{
    private String conteudo;
    private String autor;
    private int idAutor;
    private String data;

            public comentario(String conteudo, String autor, int idAutor, String data){
            super();
            this.conteudo = conteudo;
            this.autor = autor;
            this.idAutor = idAutor;
            this.data = data;
            }
            public String getConteudo(){
                return conteudo;
            }
            public void setConteudo(String conteudo){
                this.conteudo = conteudo;
            }
            public String getAutor(){
                return autor;
            }
            public void setAutor(String autor){
                this.autor = autor;
            }
            public Int getIdAutor(){
                return idAutor;
            }
            public void setIdAutor(Int idAutor){
                this.idAutor = idAutor;
            }
            public String getData(){
                return data;
            }
            public void setData(String data){
                this.data = data;
            }


}