### Question:

Write a Java program to simulate a simple ATM system using methods. The program should start with a predefined balance (e.g., Rs 100,000) and a fixed 4-digit PIN (e.g., 1234). The user must enter the correct PIN to access the system, with a maximum of 3 attempts allowed. If the correct PIN is entered, display a menu as per following, otherwise show a message "Card has been blocked" and exit the program:

Sample Run:



ABC ATM System

Enter your PIN: 1234

Welcome to ATM System

Press 1: Check Balance

Press 2: Deposit money

Press 0: Exit the system

Enter your Choice: 2

Enter amount to Deposit: 5000

Your new Balance: 105000

Do you want to perform another transaction: 1

Your Balance is: 105000

Do you want to perform another transaction: 0

Thank you for using ATM System



To develop ATM System, you are required to implement the following methods:

public static boolean pinVerification(int pin) - Verifies if the entered PIN is correct

public static void checkBalance(int balance) - Displays the current balance

public static int depositMoney(int balance) - Handles deposit transaction and returns new balance



### Answer:

see "Task3.java"

