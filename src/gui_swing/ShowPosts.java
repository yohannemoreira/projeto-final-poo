package gui_swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

import javax.swing.JTabbedPane;
import java.awt.GridBagConstraints;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import account.exceptions.NotFoundException;
import account.facade.FacadeAccount;
import post.PostCollection;
 
public class ShowPosts extends JFrame{
 //variaveis para uso da JTable 
    private JTable table;
 private static String email;
 private  static String name;
 private  static String course;
 private  static String semester;
 private  static String password;
 private  static String followers;
    private final String columns[]={"id:","Legenda:"};
    private final ArrayList<ArrayList<String>> dateTable = new ArrayList<>();
    private String [][] v;
    
     
        /*Construtor da classe ,
          antes de executar o metodo main(),
          irá construir o JFrame e a JTable*/
    public ShowPosts(String email, String name, String course, String semester, String password, String followers) {
  this.email = email;
  this.name = name;
  this.course = course;
  this.semester = semester;
  this.password = password;
  this.followers = followers;
  
  try {   
    int sizePosts = FacadeAccount.getInstance().getAccounts().findAccount(email).getPosts().sizeArray();
    String [][] v = new String[2][sizePosts];
    for(int i = 0; i<sizePosts; i++) {
     v[0][i] = Integer.toString(FacadeAccount.getInstance().getAccounts().findAccount(email).getPosts().searchPost(i).getId());
     v[1][i] = FacadeAccount.getInstance().getAccounts().findAccount(email).getPosts().searchPost(i).getSubtitle();
    }

  } catch (NotFoundException e) {
   e.printStackTrace();
  }
  
  
     
        setLayout(new FlowLayout());//tipo de layout
        setSize(new Dimension(600, 200));//tamanho do Formulario
        setLocationRelativeTo(null);//centralizado
        setTitle("Exemplo JTable");//titulo
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//setando a ação padrão de fechamento do Formulário,
                                                               // neste caso  irá fechar o programa
         
                //instanciando a JTable
       
        table=new JTable(v,columns);
        table.setPreferredScrollableViewportSize(new Dimension(500,100));//barra de rolagem
        table.setFillsViewportHeight(true);
         
                //adicionando a tabela em uma barra de rolagem, ficará envolta , pela mesma 
        JScrollPane scrollPane=new JScrollPane(table);
                 
                //adicionando ao JFrame "Formulário" a JTable "Tabela" 
        add(scrollPane);
    }
     
        //este é o método onde é executado nosso programa
    public static void main(String[] args) {
        new ShowPosts(email, name, course, semester, password, followers).setVisible(true);
    }
}