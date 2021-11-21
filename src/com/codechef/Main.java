package com.codechef;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*
	Alice and Bob are meeting after a long time. As usual they love to play some math games.
	This times Alice takes the call and decides the game. The game is very simple, Alice says
	out an integer and Bob has to say whether the number is prime or not. Bob as usual knows the
	logic but since Alice doesn't give Bob much time to think, so Bob decides to write a computer program.

    Help Bob accomplish this task by writing a computer program which will calculate whether the number is prime or not .

    Input
    The first line of the input contains an integer T, the number of testcases. T lines follow.

    Each of the next T lines contains an integer N which has to be tested for primality.

    Output
    For each test case output in a separate line, "yes" if the number is prime else "no."

    Constraints
    1 ≤ T ≤ 20
    1 ≤ N ≤ 100000
    Sample Input 1
    5
    23
    13
    20
    1000
    99991
    Sample Output 1
    yes
    yes
    no
    no
    yes
                */
        Scanner sc = new Scanner(System.in);
        int t, n, count = 0;
        t = sc.nextInt();
        for (int i = 0; i < t; i++){
            n = sc.nextInt();
            if(n==1){
                System.out.println("no");
            }
            for (int j = 2; j < n; j++) {
                if (n % j != 0) {
                    System.out.println("yes");
                    break;
                } else {
                    System.out.println("no");
                    break;
                }
            }
        }
    }
}