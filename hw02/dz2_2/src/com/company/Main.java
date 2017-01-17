package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 8. Display numbers from 1 to k as NxN matrix
/*        System.out.println("---------------------------------");
        System.out.println("Enter number k");
        Scanner scan = new Scanner(System.in);
        int k8 = Integer.parseInt(scan.next());
        if (((int)Math.sqrt(k8)*(int)Math.sqrt(k8)) != k8) {System.out.println("Number k is not a square of some other number");}
        else {
            int n = (int)Math.sqrt(k8);
            int x = 1;
            int [][] m = new int [n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    m[i][j] = x++;
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.println(Arrays.toString(m[i]));
            }
        }*/

        // 9. Create matrix NxN filled in with random numbers in range  -N to N
        System.out.println("9. ---------------------------------");
        System.out.println("Enter number n - size of square matrix");
        Scanner scan2 = new Scanner(System.in);
        int n = Integer.parseInt(scan2.next());
        int [][] a = new int [n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = -n + (int)(Math.random() * (2*n + 1));
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(a[i]));
        }

        // 9.1 sort rows of our matrix a[n][n]
        System.out.println("9.1 ---------------------------------");
        int [][] a1 = new int [n][n];
        for (int i = 0; i < n; i++) {
            System.arraycopy(a[i], 0, a1[i], 0, n);
        }
        System.out.println("sort rows of our matrix a[n][n]");

        for (int i = 0; i < n; i++) {
            for (int barrier = a1[i].length - 1; barrier >= 0; barrier--) {
                for (int index1 = 0; index1 < barrier; index1++) {
                    if (a1[i][index1] >a1[i][index1 + 1]) {
                        int tmp = a1[i][index1];
                        a1[i][index1] = a1[i][index1 + 1];
                        a1[i][index1 + 1] = tmp;
                    }
                }
            }

        }
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(a1[i]));
        }

        // 9.2 do cycle shift on k positions
        System.out.println("9.2 ---------------------------------");
        int [][] a2 = new int [n][n];
        for (int i = 0; i < n; i++) {
            System.arraycopy(a[i], 0, a2[i], 0, n);
        }
        int k = 3;
        System.out.println("do cycle shift on "+ k +" positions");
        int [] a2_ = new int[n*n];
        int index2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a2_[index2] = a2[i][j];
                index2++;
            }
        }

        for (int i = 0; i < k; i++) {
            int tmp = a2_[n*n-1];
            System.arraycopy(a2_, 0, a2_, 1, n*n-1);
            a2_[0] = tmp;
        }

        index2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a2[i][j] = a2_[index2];
                index2++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(a2[i]));
        }

        // 9.3 find and display the longest ascending sequence in matrix
        System.out.println("9.3 ---------------------------------");
        System.out.println("find and display the longest ascending sequence in matrix");
        int [] a3 = new int[n*n];
        int index3 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a3[index3] = a[i][j];
                index3++;
            }
        }
        int count1 = 0;
        int count2 = 1;
        int end = 0;
        for (int i = 1; i < n * n; i++) {
            if (a3[i]>a3[i-1]) {count2++;}
            else {
                if (count2>count1) {count1 = count2; count2 = 1; end = i-1;}
                else {count2 = 1;}
            }
        }
        if (count2 > count1) {count1 = count2; end = n-1;}
        System.out.println("The longest ascending sequence in matrix contain " + count1 + " elements");
        for (int i = 0; i < count1; i++) {
            System.out.print(a3[end-count1+i+1] + " ");
        }
        System.out.println();

        // 9.4 find sum of matrix elements which are located between first and second positive number of every row
        System.out.println("9.4 ---------------------------------");
        System.out.println("find sum of matrix elements which are located between first and second positive number of every row");

        int sum4 = 0;
        for (int i = 0; i < n; i++) {
            int index4 =0;
            for (int j = 0; j < n; j++) {
                if (index4 == 2) {break;}
                if (index4 == 1 && a[i][j] <= 0) {sum4+=a[i][j];}
                if (a[i][j]>0) {index4++;}

            }
        }
        System.out.println("Sum = " + sum4);

        // 9.5 Turn matrix on 90/180/270 degrees
        System.out.println("9.5 ---------------------------------");
        int [][] a5 = new int [n][n];
        for (int i = 0; i < n; i++) {
            System.arraycopy(a[i], 0, a5[i], 0, n);
        }

        System.out.println("Turn matrix on 90 degrees");
        int [][] a5_90 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a5_90[j][n-i-1] = a5[i][j];
            }
        }

        System.out.println("Turn matrix on 180 degrees");
        int [][] a5_180 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a5_180[n-i-1][n-j-1] = a5[i][j];
            }
        }

        System.out.println("Turn matrix on 270 degrees");
        int [][] a5_270 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a5_270[n-j-1][i] = a5[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(a5_270[i]));
        }


        // 9.6 Create new matrix by substracting from it row elements avg number of this row
        System.out.println("9.6 ---------------------------------");
        System.out.println("Create new matrix by substracting from it row elements avg number of this row");
        double [][] a6 = new double [n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a6[i][j] = 1.0 * a[i][j];
            }
        }

        double [] a_6 = new double[n];
        for (int i = 0; i < n; i++) {
            double sum6 = 0.0;
            for (int j = 0; j < n; j++) {
                sum6+=a6[i][j];
            }
            a_6[i] = sum6 / n;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a6[i][j] -=a_6[i];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(a6[i]));
        }


        // 9.7 Create new matrix by deleting from old one rows or columns contained only from 0
        System.out.println("9.7 ---------------------------------");
        System.out.println("Create new matrix by deleting from old one rows or columns contained only from 0");
        int [][] a7 = new int [n][n];
        for (int i = 0; i < n; i++) {
            System.arraycopy(a[i], 0, a7[i], 0, n);
        }

        // delete rows with all 0
        int [] a7_ = new int[n*n];
        int index7 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a7_[index7] = a[i][j];
                index7++;
            }
        }

        int [] a7__ = new int [n];
        for (int i = 0; i < n; i++) {
            a7__[i] = 0;
        }

        int count7 = 0;
        for (int i = 0; i < n-count7; i++) {
            boolean flg = false;
            for (int j = 0; j < n; j++) {
                if (a7_[i*n + j] != 0) {flg = true; break;}
            }
            if (flg == false && i<n-1) {count7++; System.arraycopy(a7_, n*i+n, a7_, n*i, n*(n-i-1));}
            if (flg == false && i == n-1) {count7++;}
        }

        //show new matrix with deleted rows
        int rows = n - count7;
        int [][] a72 = new int[rows][n];
        index7 = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < n; j++) {
                a72[i][j] = a7_[index7];
                index7++;
            }
        }


        // delete columns with all 0
        int [] a72_ = new int[n*rows];
        index7 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < rows; j++) {
                a72_[index7] = a72[j][i];
                index7++;
            }
        }

        int count72 = 0;
        for (int i = 0; i < n-count72; i++) {
            boolean flg = false;
            for (int j = 0; j < rows; j++) {
                if (a72_[j+i*rows] != 0) {flg = true; break;}
            }
            if (flg == false && i<n-1) {count72++; System.arraycopy(a72_, rows*i+rows, a72_, rows*i, rows*(n-i-1));}
            if (flg == false && i == n-1) {count72++;}
        }

        int col = n-count72;
        int [][] a73 = new int[rows][col];
        index7 = 0;
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < rows; j++) {
                a73[j][i] = a72_[index7];
                index7++;
            }
        }

        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(a73[i]));
        }

        // 9.8 Create new matrix by deleting from old one rows or columns contained only from 0
        System.out.println("9.8 ---------------------------------");
        System.out.println("Change matrix so that 0 will be in the end of the rows");
        int [][] a8 = new int [n][n];
        for (int i = 0; i < n; i++) {
            System.arraycopy(a[i], 0, a8[i], 0, n);
        }

        for (int i = 0; i < n; i++) {
            int[] a8_ = new int [n];
            int count8 = 0;
            for (int j = 0; j < n; j++) {
                if (a8[i][j] == 0)
                    {
                        a8_[n-1-count8] = 0;
                        count8++;
                    }
                else {a8_[j-count8] = a8[i][j];}
            }
            System.arraycopy(a8_, 0, a8[i], 0, n);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(a8[i]));
        }


    }
}
