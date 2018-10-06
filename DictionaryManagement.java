package dictionary;
import java.io.*;
import java.nio.file.Paths;
import java.util.*;

public class DictionaryManagement {
    Scanner sc = new Scanner(System.in);
     public int getSize(){
        return Dictionary.Words.size();
    }
    public void  insertFromCommandline(){                   //Nhap tất cả các từ = như shit
        String word_explain;
        String word_target;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng từ muốn thêm: ");
        int number = sc.nextInt();
        sc.nextLine() ;
        for (int i = 0; i < number; i++) {
            System.out.print("Nhập từ và nghĩa muốn thêm : ");
            word_target = sc.nextLine();
            word_explain = sc.nextLine();
            Dictionary.Words.add(new Word(word_target, word_explain));
         }    
    }
    public void insertFromFile() throws IOException{        //trung anh code them doc file
        Scanner inputDic = new Scanner(Paths.get("dictionary.txt"));
        while(inputDic.hasNextLine()){
            String[] temp = inputDic.nextLine().split(":");
            Dictionary.Words.add(new Word(temp[0], temp[1]));
        }
    }
    public void dictionaryLookup() {
        String lookWord = sc.nextLine();
        for (int i = 0; i < Dictionary.Words.size(); i++) {
            if (lookWord.equals(Dictionary.Words.get(i).getWord_target()))
                System.out.println(Dictionary.Words.get(i).getWord_explain());
                
        }
    }
    public void addWord() {      
        Word addWord = new Word();
        System.out.println("Nhap tu muon them : ");
        addWord.setWord_target(sc.nextLine());
        sc.nextLine();
        addWord.setWord_explain(sc.nextLine());
        Dictionary.Words.add(addWord);
        
    }
    public void deleteWord() {
        System.out.println("Nhap tu muon xoa :");
        String deleteWord = sc.nextLine();
        for (int i = 0; i < Dictionary.Words.size(); i++) {
            if (deleteWord.equalsIgnoreCase(Dictionary.Words.get(i).getWord_target())) {
                Dictionary.Words.remove(i);
            }
        }
   
    }
    public void repairWord() {
       
        System.out.println("Nhap tu muốn sửa : ");
        String str = sc.nextLine();
        for (int i = 0; i < Dictionary.Words.size(); i++) {
            if (str.equalsIgnoreCase(Dictionary.Words.get(i).getWord_target())) {
                System.out.print("Từ mới : ");
                Dictionary.Words.get(i).setWord_target(sc.nextLine());
                System.out.print("Nghĩa : ");  
                Dictionary.Words.get(i).setWord_explain(sc.nextLine());
            }
        }
    }
}
