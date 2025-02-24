public class Practical9First {

      public static long getFactorialRecursion( long  n ){


        if( n == 0 )return 1 ; 

        else if( n == 1 )return 1 ; 

        return n * getFactorialRecursion( n - 1 ); 


    }

    public static  long getFactorialIterative( long n ){


        int num = 1 ; 

        for( int i = 1 ; i <= n ; i++ ){

            num = num * i ; 

        }

        return num ; 

    }

    public static void main( String [] args){

        int size = 0  ;
        long  loopTime = 0 ; 
        long  recursionTime = 0 ; 

        if( args.length > 0){

            size = Integer.parseInt( args[0]) ; 

        }

        int[] arr  = new int[size];

        for( int i = 0 ; i < size ; i++ ){

            arr[i] = (int)(System.nanoTime() % 50);



        }
      

        for( int i = 0 ; i < arr.length ; i++ ){
            long start = System.nanoTime() ; 

            getFactorialIterative( arr[i]) ; 

            long end = System.nanoTime() ; 

             loopTime  +=  (end - start) ; 


        }

        for( int i = 0 ; i < arr.length ; i++ ){

            long start = System.nanoTime() ; 

            getFactorialRecursion( arr[i]) ; 

            long end = System.nanoTime() ; 

            recursionTime += (end - start) ; 
        }

        double avgLoopTime = loopTime/(double) size ; 
        double avgRecursionTime = recursionTime/(double) size  ; 

        System.out.println( "Time taken by Looping " + avgLoopTime) ; 
        System.out.println( "Time taken by Recursion " + avgRecursionTime) ; 
        
       
        if( avgLoopTime < avgRecursionTime ){

            System.out.println("Iterative method perfroms better ") ; 
        
            
        }
        else{
            System.out.println("Recursive method performs better ") ; 
        }


    }


    
}
