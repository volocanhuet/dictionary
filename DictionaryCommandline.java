
package dictionary;
import java.io.*;
import java.util.*;

public class DictionaryCommandline {                                
    static DictionaryManagement Dict = new DictionaryManagement();
    
    
    public void showAllWords() {                                    //show tất cả cá từ trong file
        int size = Dict.getSize();
        System.out.printf("%-10s%-30s%s\n","STT","English","Viet");
        for(int i = 0 ; i < size ; i++) {          
            System.out.printf("%-10s%-30s%s\n", i + 1, Dictionary.Words.get(i).getWord_target(),
                   Dictionary.Words.get(i).getWord_explain());          
        }
    }
     public void dictionaryBasic() {                                  //them ham dictionaryBasic
         Dict.insertFromCommandline();                                                
         showAllWords();                                              
         
     }
    public void  dictionaryAdvanced() throws IOException {   //them ham dictionaryAdvanced
         Dict.insertFromFile();                               
         showAllWords();    
         Dict.dictionaryLookup();

     }
    
    public static void main(String[] args)throws IOException {     // ham main goi ham dictionaryAdvanced va ham dictionaryBasic
        DictionaryCommandline dictCom = new DictionaryCommandline();
        dictCom.dictionaryAdvanced();
//      dictCom.DictionarySearcher();
      }
}
