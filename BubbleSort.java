import java.util.Arrays;
public class BubbleSort{
    public static void main(String args[]){
      int[] array={5,4,3,2,1};
      bubble(array);
      System.out.println(Arrays.toString(array));
    }
    static void bubble(int[] array)
    {   boolean swap;
        for(int i=0;i<array.length;i++)
        {
            swap=false;
            for(int j=1;j<array.length-i;j++)
            {
              if(array[j]<array[j-1])
              {
                int temp=array[j];
                array[j]=array[j-1];
                array[j-1]=temp;
                swap=true;
              }
            }
            if(swap==false)
            {
                break;
            }
        }
    }
}