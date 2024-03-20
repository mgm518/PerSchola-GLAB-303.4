package com.perscholas.controlflow;

import java.util.Arrays;
import java.util.Optional;
import java.util.Random;
import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
        new ControlFlow().PA_303_4_1();
    }

    private Scanner scanner;
    /**
     * When you are developing console applications using Java, you must
     * read input from users through the console. To read a string from the
     * console as input in Java applications, you can use the Scanner class
     * along with System.in.
     */
    private void PA_303_4_1() {
        System.out.println("""
                **************************************************
                PA 303.4.1 - Core Java - Scanner Class
                **************************************************""");
        scanner = new Scanner(System.in);
        boolean usingScanner // comment either one below if you wish to use Scanner
                = false;
//                = true;
        problem1(usingScanner); System.out.println();
        problem2(usingScanner); System.out.println();
        problem3(usingScanner); System.out.println();
        problem4(usingScanner); System.out.println();
        problem5(usingScanner); System.out.println();
        problem6(usingScanner); System.out.println();
        problem7(usingScanner); System.out.println();
        scanner.close();
    }

    /**
     * 1. Write a program that declares 1 integer variable x, and then
     * assigns 7 to it. Write an if statement to print out “Less than 10” if x is
     * less than 10. Change x to equal 15, and notice the result (console
     * should not display anything).
     */
    private void problem1(boolean usingScanner) {
        System.out.print("1. ");
        int x;
        for (int i = 0; i < 2; i++) {
            if(usingScanner) {
                x = Integer.parseInt(scanner.next());
            }
            else {
                if(i == 0) {
                    x = 7;
                }
                else {
                    x = 15;
                }
            }
            System.out.print("\t{x = " + x + "}: ");
            if (x < 10) {
                System.out.println("Less than 10");
            }
        }
    }

    /**
     * 2. Write a program that declares 1 integer variable x, and then
     * assigns 7 to it. Write an if-else statement that prints out “Less than 10”
     * if x is less than 10, and “Greater than 10” if x is greater than 10.
     * Change x to 15 and notice the result.
     */
    private void problem2(boolean usingScanner) {
        System.out.print("2. ");
        int x;
        for (int i = 0; i < 2; i++) {
            if(usingScanner) { x = Integer.parseInt(scanner.next()); }
            else {
                if(i == 0) {
                    x = 7;
                }
                else {
                    x = 15;
                }
            }
            System.out.print("\t{x = " + x + "}: ");
            if (x < 10) {
                System.out.println("Less than 10");
            }
            else {
                System.out.println("Greater than or equal to 10");
            }
        }
    }

    /**
     * 3. Write a program that declares 1 integer variable x, and then
     * assigns 15 to it. Write an if-else-if statement that prints out “Less than
     * 10” if x is less than 10; “Between 10 and 20” if x is greater than 10 but
     * less than 20, and “Greater than or equal to 20” if x is greater than or
     * equal to 20. Change x to 50 and notice the result.
     */
    private void problem3(boolean usingScanner) {
        System.out.print("3. ");
        int x;
        for (int i = 0; i < 2; i++) {
            if (usingScanner) {
                x = Integer.parseInt(scanner.next());
            } else {
                if (i == 0) {
                    x = 15;
                }
                else {
                    x = 50;
                }
            }
            System.out.print("\t{x = " + x + "}: ");
            if (x < 10) {
                System.out.println("Less than 10");
            }
            else if (x >= 10 && x < 20) {
                System.out.println("Between 10 and 20");
            }
            else if (x >= 20) {
                System.out.println("Greater than or equal to 20");
            }
        }
    }

    /**
     * 4. Write a program that declares 1 integer variable x, and then
     * assigns 15 to it. Write an if-else statement that prints “Out of range” if
     * the number is less than 10 or greater than 20 and prints “In range” if
     * the number is between 10 and 20 (including equal to 10 or 20).
     * Change x to 5 and notice the result.
     */
    private void problem4(boolean usingScanner) {
        System.out.print("4. ");
        int x;
        for(int i = 0; i < 2; i++) {
            if (usingScanner) {
                x = Integer.parseInt(scanner.next());
            } else {
                if (i == 0) {
                    x = 15;
                }
                else {
                    x = 5;
                }
            }
            System.out.print("\t{x = " + x + "}: ");
            if (x < 10 || x > 20) {
                System.out.println("Out of range");
            } else {
                System.out.println("In range");
            }
        }
    }

    /**
     * 5. Write a program that uses if-else-if statements to print out grades
     * A, B, C, D, F, according to the following criteria:
     *      A: 90-100
     *      B: 80-89
     *      C: 70-79
     *      D: 60-69
     *      F: <60
     * Use the Scanner class to accept a number score from the user to
     * determine the letter grade. Print out “Score out of range” if the score
     * is less than 0 or greater than 100.
     */
    private void problem5(boolean usingScanner) {
        System.out.print("5. ");
        int x;
        if (usingScanner) {
            x = Integer.parseInt(scanner.next());
        } else {
            x = new Random().nextInt(-50,150);
        }
        System.out.print("\t{x = " + x + "}: ");
        if (x <= 100 && x >= 90) {
            System.out.println("A");
        } else if (x < 90 && x >= 80) {
            System.out.println("B");
        } else if (x < 80 && x >= 70) {
            System.out.println("C");
        } else if (x < 70 && x >= 60) {
            System.out.println("D");
        } else if (x < 60 && x >= 0) {
            System.out.println("F");
        } else {
            System.out.println("Score out of range");
        }
    }

    /**
     * 6. Write a program that accepts an integer between 1 and 7 from
     * the user. Use a switch statement to print out the corresponding
     * weekday. Print “Out of range” if the number is less than 1 or greater
     * than 7. Do not forget to include “break” statements in each of your
     * cases.
     */
    private void problem6(boolean usingScanner) {
        System.out.print("6. ");
        int x;
        if (usingScanner) {
            x = Integer.parseInt(scanner.next());
        } else {
            x = new Random().nextInt(-1,10);
        }
        System.out.print("\t{x = " + x + "}: ");
        switch (x) {
            case 1:
                System.out.println("Monday"); break;
            case 2:
                System.out.println("Tuesday"); break;
            case 3:
                System.out.println("Wednesday"); break;
            case 4:
                System.out.println("Thursday"); break;
            case 5:
                System.out.println("Friday"); break;
            case 6:
                System.out.println("Saturday"); break;
            case 7:
                System.out.println("Sunday"); break;
            default:
                System.out.println("Out of range");
        }
    }

    /**
     * 7. Create a program that lets the users input their filing status and
     * income. Display how much tax the user would have to pay
     * according to status and income.
     *      * The U.S. federal personal income tax is calculated based
     *          on the filing status and taxable income.
     *      * There are four filing statuses: Single, Married Filing Jointly,
     *          Married Filing Separately, and Head of Household.
     *      * The tax rates for 2009 are shown below.
     */
    private void problem7(boolean usingScanner) {
        System.out.print("7. ");
        int income, statusInput;

        if (usingScanner) {
            System.out.println("Type an integer for martial status.");
            for (MaritalStatus maritalStatus : MaritalStatus.values()) {
                System.out.printf("(%d)%s ",maritalStatus.ordinal(), maritalStatus);
            }
            System.out.print(": ");
            statusInput = Integer.parseInt(scanner.next());
            System.out.print("Type in income as integer: ");
            income = Integer.parseInt(scanner.next());
        } else {
            statusInput = new Random().nextInt(-1,5);
            income = new Random().nextInt(-1,400000);
        }
        MaritalStatus status = Arrays.stream(MaritalStatus.values())
                .filter(s -> s.ordinal() == statusInput)
                .findFirst()
                .orElse(MaritalStatus.NOTVALID);
        if (income <= 0) {
            status = MaritalStatus.NOTVALID;
        }
        System.out.print("\t{statusInput = " + statusInput + ", income = "+ income + "}: ");
        // Rather than use the switch-case and if-else statements, I elected to try solving with enums.
        float taxRate = status.getTaxRate(income);
        System.out.println("Tax Rate: " + taxRate + "; Total Tax Owed: " + ((taxRate<0)?"INVALID":income*taxRate));
    }

    private enum MaritalStatus {
        NOTVALID(null),
        SINGLE(new int[] {8350,33950,82250,171550,372950}),
        JOINTLY(new int[] {8350,33950,82250,171550,372950}),
        SEPERATELY(new int[] {8350,33950,82250,171550,372950}),
        HOUSEHOLDHEAD(new int[] {8350,33950,82250,171550,372950});

        private final int[] incomeBracket;
        private static final float[] taxRate = {0.10f, 0.15f, 0.25f, 0.28f, 0.33f, 0.35f};

        MaritalStatus(int[] incomeBracket) {
            this.incomeBracket = incomeBracket;
        }

        float getTaxRate(int income) {
            if (this.equals(NOTVALID) || income < 0) {
                return -1.0f;
            }
            for (int i = 0; i < this.incomeBracket.length; i++) {
                if (income <= this.incomeBracket[i]) {
                    return taxRate[i];
                }
            }
            return taxRate[taxRate.length-1];
        }
    }
}
