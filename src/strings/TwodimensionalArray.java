package strings;

public class TwodimensionalArray {
    public static void main(String[] args) {
        //declary array
        //appproach1
        int a[][] = new int[3][2];
        a[0][0] = 100;
        a[0][1] = 200;
        a[1][0] = 300;
        a[1][1] = 400;
        a[2][0] = 500;
        a[2][1] = 600;
        //approach 2
        int b[][] = {
                {1, 2},
                {3, 4},
                {5, 6}
        };
        // find size of an arry
        System.out.println("length of row:" + b.length);//3
        System.out.println("length of column:" + b[0].length);
        //read single value from an array
        System.out.println(b[1][0]);//3
        //normal for loop
        //
        for (int r = 0; r <=b.length-1; r++) {
            for(int c=0;c<=b[r].length-1;c++){
                System.out.print(b[r][c]+"  ");
            }
            System.out.println();

        }
        //enhanced for loop
        for(int arr[]:b){
            for(int x:arr){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
    }