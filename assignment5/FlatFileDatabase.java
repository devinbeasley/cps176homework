import java.io.*;
public class FlatFileDatabase{
  
   public boolean createTable(String name){
      //creating a file here. if it exists, an exception is thrown.
      File f= new File("F:\\");
      if(f.exists()){
         System.out.println("This file already exists!");
      
      }
   }
   
   public boolean writeColumns(String columns,String table){
      //allows users to specify what meta-information is in each column.
      //check for hashtags.
      if(!columns.startsWith("#")){
         return false;
      }
      //check for the minimum amount of columns using String split.
      if(columns.split("::").length < 2){
         return false;
      }
      //write columns
      PrintWriter pw= new PrintWriter();
      writer.println(columns);
      
      //try-catch-finally errors and exit 
      throws java.io.Exception{
      
      }
         
   }     
   
   
   public void destroyTable(String name){
   //todo
   }
   
   public boolean create(String record){
   
   }
   
   public String findOne(String value){
   
   }
   
   public boolean update(String key, String value){
   
   }
   
   public boolean destroy(String key){
   
   }  
  
   public static void main(String[]args){
   
   
   
 }  
}
      