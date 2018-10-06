
package dictionary;
import java.io.*;
import java.util.*;

public class DictionaryCommandline {                                
    static DictionaryManagement Dict = new DictionaryManagement();
    
    public static void main(String[] args)throws IOException {      //trung anh code them throws IOException
        //Dict.insertFromCommandline();                             //trung anh code
        Dict.insertFromFile();                                      //trung anh code
        //DictionaryCommandline Dict1 = new DictionaryCommandline(); 
        //Dict1.showAllWords();
        DictionaryManagement dict1 = new DictionaryManagement();
        dict1.dictionaryLookup();
        
     }
    
    public void showAllWords() {                                    //show tất cả cá từ trong file
        int size = Dict.getSize();
        System.out.printf("%-10s%-30s%s\n","STT","English","Viet");
        for(int i = 0 ; i < size ; i++) {          
            System.out.printf("%-10s%-30s%s\n", i + 1, Dictionary.Words.get(i).getWord_target(),
                   Dictionary.Words.get(i).getWord_explain());          
        }
    }
}
