package java_homework_week7;

/**
 * 19. Write a Java program to calculate the average value of array element
 */
public class Program19 {

        public static void main(String[] args) {
            average();
        }
        public  static void average()
        {
            int [] array={10,9,8,7,5,6,2,1};
            double ave;
            int length = array.length;
            int sum=0;
            for(int i=0;i<array.length;i++)
            {
                sum+=array[i];
            }
            ave=sum/length;
            System.out.println("average value of array elements:"+ave);

        }
}

