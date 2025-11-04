### Question:

Suppose you want to develop a program that changes a given amount of money into smaller monetary

units. The program lets the user enter an amount as a double value representing a total in dollars and

cents, and outputs a report listing the monetary equivalent in the maximum number of dollars, quarters,

dimes, nickels, and pennies, in this order, to result in the minimum number of coins

Here are the steps in developing the program:

1\. Prompt the user to enter the amount as a decimal number, such as 11.56.

2\. Convert the amount (e.g., 11.56) into cents (1156).

3\. Divide the cents by 100 to find the number of dollars. Obtain the remaining cents using the cents

remainder 100.

4\. Divide the remaining cents by 25 to find the number of quarters. Obtain the remaining cents

using the remaining cents remainder 25.

5\. Divide the remaining cents by 10 to find the number of dimes. Obtain the remaining cents using

the remaining cents remainder 10.

6\. Divide the remaining cents by 5 to find the number of nickels. Obtain the remaining cents using

the remaining cents remainder 5.

7\. The remaining cents are the pennies.

8\. Display the result.

You are required to implement the above steps 1-8 in JAVA language

### Answer

See "Task1.java"
