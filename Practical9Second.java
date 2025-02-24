public class Practical9Second {

    
  
        public static void main(String[] args){


            int size = 0;

            if(args.length > 0){
                size = Integer.parseInt(args[0]);
            }
    
            String [] s = new String[size];

    
            for(Integer i=0; i<size; i++){

                Integer temp = (int) (System.nanoTime() % 50); 
                
                s[i] = temp.toString();
            }
    
            long StringTime = 0;

            long StringBuilderTime = 0;

            long StringBufferTime = 0;
            
            String string1 = "govindaj" ; 
            StringBuffer string2 = new StringBuffer("govindraj") ; 
            StringBuilder string3 = new StringBuilder ("govindraj") ; 
    
            for(int i=0; i< s.length; i++){
    
                 long startTime = System.nanoTime();


                String newString = string1 + s[i] ; 


                 long endTime = System.nanoTime();


                 StringTime += (endTime - startTime);

    
                 
            }

            for(int i = 0 ; i < s.length ; i++ ){


                 long startTime = System.nanoTime();


                  

                  string2.append(s[i]);


                  long endTime = System.nanoTime();


                 StringBufferTime += (endTime - startTime);

    

            }

            for(int i = 0 ; i < s.length ; i++ ){


                long startTime = System.nanoTime();


               
                 string3.append(s[i]);

                 long endTime = System.nanoTime();

                StringBuilderTime += (endTime - startTime);
   

           }
    
            double StringAvgTime = StringTime / (double) size;


            double StringBuilderAvgTime = StringBuilderTime / (double) size;


            double StringBufferAvgTime = StringBufferTime / (double) size;
    
            
            
            System.out.println(" Average time  by String: " + StringAvgTime );
            System.out.println(" Average time  by StringBuilder: " +StringBuilderAvgTime );
            System.out.println(" Average time  by StringBuffer: " +StringBufferAvgTime );
    
            
             if(StringBufferAvgTime < StringAvgTime && StringBufferAvgTime < StringBuilderAvgTime){
                System.out.println("StringBuffer is better than String and StringBuilder");
            }

           else if(StringAvgTime < StringBuilderAvgTime && StringAvgTime < StringBufferAvgTime ){
                System.out.println("String is better than  StringBuffer and StringBuilder");
            }

            else if(StringBuilderAvgTime < StringAvgTime && StringBuilderAvgTime < StringBufferAvgTime){
                System.out.println("StringBuilder is Better than String and StringBuffer");
            }

    
        }
    }
    
