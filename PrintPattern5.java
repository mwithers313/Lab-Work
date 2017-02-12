package printpattern5;

public class PrintPattern5 {

    public static void main(String[] args) {



        int size=8;
        for(int i=0;i<size * size;i++)
        {
                int row = i / size;
                int col = i % size;


                if(row==0 && col < size-1) { System.out.print('*'); }
                else if(col==0) { System.out.print('#'); }
                else if(col==(size-1))  { System.out.println('-'); }
                else if(row==(size-1))  { System.out.print('='); }
                else { System.out.print(' '); }
        }
}

}

