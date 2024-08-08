import java.util.*;
public class Arr{
    public static void main(StringVowels[] args) {
        System.out.println("Hi!my name is renuka");
    }
}













// import java.util.*;

// public class Arr {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int row = sc.nextInt();
//         int col = sc.nextInt();
//         int arr[][] = new int[row][col];
//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < col; j++) {
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         int toprow = 0;
//         int bottomrow = row - 1;
//         int leftcol = 0;
//         int rightcol = col - 1;

//             while (toprow<bottomrow && leftcol<rightcol) {
                
            
//             for(int j=leftcol;j<=rightcol;j++){
//                 System.out.print(arr[toprow][j]+" ");
//             }
//             toprow++;
//             for(int i=toprow;i<=bottomrow;i++){
//             System.out.print(arr[i][rightcol]+" ");
//         }
//         rightcol--;
//         for(int j=rightcol;j>=leftcol;j--){
//             System.out.print(arr[bottomrow][j]+" ");
//         }
//         bottomrow--;
//         for(int i=bottomrow;i>=toprow;i--){
//             System.out.print(arr[i][leftcol]+" ");
//         }
//         leftcol++;

//     }
// }
// }



// public static void main(String[] args) {
// Scanner sc=new Scanner(System.in);
// int size=sc.nextInt();
// int array[]=new int[size];
// for(int i=0;i<size;i++){
// array[i]=sc.nextInt();
// }
// int max=Integer.MIN_VALUE;
// int min=Integer.MAX_VALUE;

// for(int i=0;i<size;i++){
// if(array[i]<min){
// min=array[i];
// }
// if(array[i]>max){
// max=array[i];
// }
// }
// System.out.println(min);
// System.out.println(max);

// }
// }

// public static void main(String[] args) {
// Scanner sc=new Scanner(System.in);
// int size=sc.nextInt();
// int arr[]=new int[size];
// for(int i=0;i<size;i++){
// arr[i]=sc.nextInt();
// }
// for(int i=0;i<arr.length;i++){
// for(int j=i+1;j<arr.length;j++){
// if(arr[i]==arr[j]){
// }

// }
// }
// System.out.println("True");

// int minSoFar=arr[0];
// int maxprofit=0;
// for(int i=0;i<arr.length;i++){
// minSoFar=Math.min(minSoFar,arr[i]);
// int profit=arr[i]-minSoFar;
// maxprofit=Math.max(maxprofit,profit);
// }
// System.out.println("The maximum profit is "+maxprofit);

// public static void main(String[] args) {
// Scanner sc=new Scanner(System.in);
// System.out.println("Enter the rows:");
// int row=sc.nextInt();
// System.out.println("Enter the cols:");
// int col=sc.nextInt();
// int matrix[][]=new int[row][col];

// System.out.println("Enter the elements:");
// for(int i=0;i<row;i++){
// for(int j=0;j<col;j++){
// matrix[i][j]=sc.nextInt();
// }
// }
// System.out.println("The matrix is :");
// for(int i=0;i<row;i++){
// for(int j=0;j<col;j++){
// System.out.print(matrix[j][i]+" ");
// }
// System.out.println();

// }

// to find index of given element...
// System.out.println("Enter the number want to found:");
// int x=sc.nextInt();
// System.out.println("The number found at index:");
// for(int i=0;i<row;i++){
// for(int j=0;j<col;j++){
// if(matrix[i][j]==x){
// System.out.println(i+ " " + j);
// }
// }

// }

// *spiral matrix * //
// public static void main(String[]args){
// Scanner sc=new Scanner(System.in);

// System.out.println("Enter the rows ");
// int n=sc.nextInt();
// System.out.println("Enter the cols ");
// int m=sc.nextInt();
// int matrix[][]=new int[n][m];
// System.out.println("Enter the elements ");
// for(int i=0;i<n;i++){
// for(int j=0;j<m;j++){
// matrix[i][j]=sc.nextInt();
// }
// }
// System.out.println("The spiral matrix is :");
// int topRow=0;
// int bottomRow=n-1;
// int leftCol=0;
// int rightCol=m-1;
// while(topRow<=bottomRow && leftCol<=rightCol){
// //topRow-> leftCol to rightCol
// for(int j=0;j<=rightCol && topRow<=bottomRow && leftCol<=rightCol;j++){
// System.out.print(matrix[topRow][j]+" ");
// }
// topRow++;
// //rightCol-> topRow to bottomRow
// for(int i=topRow;i<=bottomRow && topRow<=bottomRow && leftCol<=rightCol;i++){
// System.out.print(matrix[i][rightCol]+" ");
// }
// rightCol--;
// // bottomRow-> rightCol to leftCol
// for(int j=rightCol;j>=leftCol && topRow<=bottomRow && leftCol<=rightCol
// ;j--){
// System.out.print(matrix[bottomRow][j]+" ");
// }
// bottomRow--;
// //leftCol-> bottomRow to topRow
// for(int i=bottomRow;i>topRow&& topRow<=bottomRow;i--){
// System.out.print(matrix[i][leftCol]+" ");
// }
// leftCol++;

// }

// }// 1 2 3 4 5 6
// // 7 8 9 10 11 12
// // 13 14 15 16 17 18
// // 19 20 21 22 23 24
// } // 25 26 27 28 29 30

// maximum & minimum number...
// public static void main(String[] args) {
// Scanner sc=new Scanner(System.in);
// System.out.println("Enter the size of array ");
// int size=sc.nextInt();
// int number[]=new int[size];
// System.out.println("Enter the numbers ");
// for(int i=0;i<size;i++){
// number[i]=sc.nextInt();
// }
// int max=Integer.MIN_VALUE;
// int min=Integer.MAX_VALUE;
// for(int i=0;i<size;i++){
// if(number[i]>max){
// max=number[i];
// }
// if(number[i]<min){
// min=number[i];
// }
// }
// System.out.println("The maximum number is "+max);
// System.out.println("The minimum number is "+min);
// }

// }
