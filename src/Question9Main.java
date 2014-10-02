/**
 * Created with IntelliJ IDEA.
 * User: Maxwell
 * Date: 11/4/13
 * Time: 5:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class Question9Main {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //TestAlgorithms.maximumSubsequenceSum(new int[]{500,400,300});

        System.out.println("String = 500,-400,300,500,400,-300,500,400,300,500,400,-300,500,400,-300,-500,400,300,500,-400,300,\n" +
                "         500,-400,300,500,400,-300,500,400,300,500,400,-300,500,400,-300,-500,400,300,500,-400,300,\n" +
                "         500,400,300,500,-400,300,500,400,300,500,400,-300,500,400,300,-500,400,300,500,-400,300,\n" +
                "         -10000,-50000,-20000,-4000,-50000,-7000,-9000,-600,-50,-30,-50,-70,-20,-70,-5,-5");
        System.out.println();

        System.out.println("Linear maximum contiguous subsequence sum algorithm :");
        Question9Algorithms.maximumSubsequenceSum(new int[]{500,-400,300,500,400,-300,500,400,300,500,400,-300,500,400,-300,-500,400,300,500,-400,300,
                                                       500,-400,300,500,400,-300,500,400,300,500,400,-300,500,400,-300,-500,400,300,500,-400,300,
                                                       500,400,300,500,-400,300,500,400,300,500,400,-300,500,400,300,-500,400,300,500,-400,300,
                                                       -10000,-50000,-20000,-4000,-50000,-7000,-9000,-600,-50,-30,-50,-70,-20,-70,-5,-5});
        System.out.println();

        System.out.println("Quadratic maximum contiguous subsequence sum algorithm :");
        Question9Algorithms.maxSubsequenceSum2(new int[]{500,-400,300,500,400,-300,500,400,300,500,400,-300,500,400,-300,-500,400,300,500,-400,300,
                                                    500,-400,300,500,400,-300,500,400,300,500,400,-300,500,400,-300,-500,400,300,500,-400,300,
                                                    500,400,300,500,-400,300,500,400,300,500,400,-300,500,400,300,-500,400,300,500,-400,300,
                                                    -10000,-50000,-20000,-4000,-50000,-7000,-9000,-600,-50,-30,-50,-70,-20,-70,-5,-5});
        System.out.println();

        System.out.println("Cubic maximum contiguous subsequence sum algorithm :");
        Question9Algorithms.maxSubsequenceSum3(new int[]{500,-400,300,500,400,-300,500,400,300,500,400,-300,500,400,-300,-500,400,300,500,-400,300,
                                                    500,-400,300,500,400,-300,500,400,300,500,400,-300,500,400,-300,-500,400,300,500,-400,300,
                                                    500,400,300,500,-400,300,500,400,300,500,400,-300,500,400,300,-500,400,300,500,-400,300,
                                                    -10000,-50000,-20000,-4000,-50000,-7000,-9000,-600,-50,-30,-50,-70,-20,-70,-5,-5});

		

	}

}
