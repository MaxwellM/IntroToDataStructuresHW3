/**
 * Created with IntelliJ IDEA.
 * User: Maxwell
 * Date: 11/4/13
 * Time: 5:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class Question9Algorithms {

     /**
      * Linear maximum contiguous subsequence sum algorithm.
      * seqStart and seqEnd represent the actual best sequence.
      */
      public static int maximumSubsequenceSum( int [ ] a )
      {
         int maxSum = 0;
         int thisSum = 0;
         long startTime = System.nanoTime();
          for( int i = 0, j = 0; j < a.length; j++ )
             {
             thisSum += a[ j ];

             if( thisSum > maxSum )
                 {
                 maxSum = thisSum;
                 //seqStart = i;
                 //seqEnd = j;
                 }
             else if( thisSum < 0 )
                 {
                 i = j + 1;
                 thisSum = 0;
                 }
             }
         long estimatedTime = System.nanoTime() - startTime;
         System.out.print("Time in milliseconds :");
         System.out.println(estimatedTime);
         System.out.print("Maxsum :");
         System.out.println(maxSum);
         return maxSum;
         }

    /**
     * Quadratic maximum contiguous subsequence sum algorithm.
     * seqStart and seqEnd represent the actual best sequence.
     */
     public static int maxSubsequenceSum2( int [ ] a )
     {
         int maxSum = 0;
         long startTime = System.nanoTime();
         for( int i = 0; i < a.length; i++ )
             {
             int thisSum = 0;

             for( int j = i; j < a.length; j++ )
                 {
                 thisSum += a[ j ];

                 if( thisSum > maxSum )
                     {
                     maxSum = thisSum;
                     //seqStart = i;
                     //seqEnd = j;
                     }
                 }
             }
         long estimatedTime = System.nanoTime() - startTime;
         System.out.print("Time in milliseconds :");
         System.out.println(estimatedTime);
         System.out.print("Maxsum :");
         System.out.println(maxSum);
         return maxSum;
         }



     /**
      * Cubic maximum contiguous subsequence sum algorithm.
      * seqStart and seqEnd represent the actual best sequence.
      */
      public static int maxSubsequenceSum3( int [ ] a )
     {

         int maxSum = 0;
         long startTime = System.nanoTime();
         for( int i = 0; i < a.length; i++ )
             for( int j = i; j < a.length; j++ )
             {
             int thisSum = 0;

             for( int k = i; k <= j; k++ )
                 thisSum += a[ k ];

             if( thisSum > maxSum )
                 {
                 maxSum = thisSum;
                 //seqStart = i;
                 //seqEnd = j;
                 }
             }
         long estimatedTime = System.nanoTime() - startTime;
         System.out.print("Time in milliseconds :");
         System.out.println(estimatedTime);
         System.out.print("Maxsum :");
         System.out.println(maxSum);
         return maxSum;
         }

}
