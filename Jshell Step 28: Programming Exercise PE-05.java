/*
1.Repeat the entire process at arriving at the Multiplication Table Print problem, now for the number 7 . Start
with a fresh JShell session, if you're still using an existing one for quite some time (Rinse, and repeat!).

jshell> for (i=1;i<=10;i++){
   ...> System.out.printf("%d * %d = %d",7,i,7*i).println();
   ...> }
7 * 1 = 7
7 * 2 = 14
7 * 3 = 21
7 * 4 = 28
7 * 5 = 35
7 * 6 = 42
7 * 7 = 49
7 * 8 = 56
7 * 9 = 63
7 * 10 = 70


2. Use the final solution to print Multiplication Tables for 6 and 10 .

Table 6

jshell> for (i=1;i<=10;i++){
   ...> System.out.printf("%d * %d = %d",6,i,6*i).println();
   ...> }
6 * 1 = 6
6 * 2 = 12
6 * 3 = 18
6 * 4 = 24
6 * 5 = 30
6 * 6 = 36
6 * 7 = 42
6 * 8 = 48
6 * 9 = 54
6 * 10 = 60

Table 10 

jshell> for (i=1;i<=10;i++){
   ...> System.out.printf("%d * %d = %d",10,i,10*i).println();
   ...> }
10 * 1 = 10
10 * 2 = 20
10 * 3 = 30
10 * 4 = 40
10 * 5 = 50
10 * 6 = 60
10 * 7 = 70
10 * 8 = 80
10 * 9 = 90
10 * 10 = 100

3. Print the integers from 1 to 10 .

jshell> for (i=1;i<=10;i++){
   ...> System.out.printf("%d",i).println();
   ...> }
1
2
3
4
5
6
7
8
9
10

4. Print the integers from 10 to 1 .

jshell> for (i=10;i>=1;i--){
   ...> System.out.printf("%d",i).println();
   ...> }
10
9
8
7
6
5
4
3
2
1

5. Print the squares of the integers from 1 to 10 .
jshell> for (i=1;i<=10;i++){
   ...> System.out.printf("The Square of %d is %d ",i, i*i).println();
   ...> }
The Square of 1 is 1
The Square of 2 is 4
The Square of 3 is 9
The Square of 4 is 16
The Square of 5 is 25
The Square of 6 is 36
The Square of 7 is 49
The Square of 8 is 64
The Square of 9 is 81
The Square of 10 is 100

6. Print the squares of the first 10 even integers.

jshell> for (i=2;i<=20;i+=2){
   ...> System.out.printf("The Square of %d is %d ",i, i*i).println();
   ...> }
The Square of 2 is 4
The Square of 4 is 16
The Square of 6 is 36
The Square of 8 is 64
The Square of 10 is 100
The Square of 12 is 144
The Square of 14 is 196
The Square of 16 is 256
The Square of 18 is 324
The Square of 20 is 400

My soulution using if statement,

jshell> for ( i =1;i<=20;i++){
   ...> if ( i % 2 == 0){
   ...> System.out.printf("The square root of %d is %d.",i,i*i).println();
   ...> }}
The square root of 2 is 4.
The square root of 4 is 16.
The square root of 6 is 36.
The square root of 8 is 64.
The square root of 10 is 100.
The square root of 12 is 144.
The square root of 14 is 196.
The square root of 16 is 256.
The square root of 18 is 324.
The square root of 20 is 400.


7. Print the squares of the first 10 odd integers.


jshell> for (i=1;i<=20;i+=2){
   ...> System.out.printf("The Square of %d is %d ",i, i*i).println();
   ...> }
The Square of 1 is 1
The Square of 3 is 9
The Square of 5 is 25
The Square of 7 is 49
The Square of 9 is 81
The Square of 11 is 121
The Square of 13 is 169
The Square of 15 is 225
The Square of 17 is 289
The Square of 19 is 361.

My soulution using if statement,

jshell> for ( i =1;i<=20;i++){
   ...> if ( i % 2 == 1){
   ...> System.out.printf("The square root of %d is %d.",i,i*i).println();
   ...> }}
The square root of 1 is 1.
The square root of 3 is 9.
The square root of 5 is 25.
The square root of 7 is 49.
The square root of 9 is 81.
The square root of 11 is 121.
The square root of 13 is 169.
The square root of 15 is 225.
The square root of 17 is 289.
The square root of 19 is 361.


*/
