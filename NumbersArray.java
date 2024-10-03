public class NumbersArray{
  public static void main(String...args){
     
     int [] numbers = {3, 1, 4, 2, 5, 8, 7, 6, 9};  
    int sumsquare = numbers.length;
     int square = 0;
       for( int count = 0; count < sumsquare; count++){
          numbers[count] = numbers[count] * numbers[count];
          
           System.out.print(numbers[count] + " ");

     }
}


}