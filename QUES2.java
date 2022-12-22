import java.io.*;

import java.util.*;

public class QUES2 {

           public static void main(String args[]) throws IOException

           {

        	   //path for the text file for reading the paragraph
        	   
        	   
                      String path = "C:\\Users\\aashutosh\\Desktop\\New Text Document.txt";

               FileReader file = new FileReader(path);
               

              

               BufferedReader bufferedReader = new BufferedReader(file);

              

               ArrayList<String> arr = new ArrayList<String>();
               
               

               Map<String, Integer> a = new HashMap<String, Integer>();

               
               
               String line;

               while ((line = bufferedReader.readLine()) != null) {

                      String words[] = line.split(" ");

                      for(int i=0;i<words.length;i++)

                      {

                                 arr.add(words[i]);

                      }

               }

               for (String w : arr) {
            	   
            	   

            int count = Collections.frequency(arr, w);
            
            

            a.put(w, count);

        }

               for (String key : a.keySet()) {

            	   
            	   
            System.out.println(key + " = " + a.get(key));

        }

              

               bufferedReader.close();

           }

}


