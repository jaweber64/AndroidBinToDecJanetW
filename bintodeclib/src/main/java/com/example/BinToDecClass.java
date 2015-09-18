package com.example;

// Janet Weber   9/18/2015
// Binary to Decimal Critical Thinking Exercise (Week 5)
// Write a program that reads a series of 1's and 0's and
//   converts them to our numbering system.

public class BinToDecClass {
    public static void main(String[] args) {

        String binNumArray[] = {"0110010", "100000000001", "1010101010", "111111111",
                "10", "1", "101", "1011"};          // input array of binary numbers
        String binNumber;                           // holds one element of above array
        int numOfBinInputs = binNumArray.length;    // holds number of elements in input array
        int length;                                 // holds length of element string
        char tempChar;                              // holds current char (digit)

        // Print program introduction to console
        System.out.println("This program converts binary numbers to decimal. (inputs pre-defined)\n");

        for (int k = 0; k < numOfBinInputs; k++) {  // use k to process through input array of binary number strings
            int sum = 0;                            // initialize sum to zero for each binary number
            binNumber = binNumArray[k];             // extract binary number string from input array
            System.out.print(binNumber + " => ");   // print binary number string to console (append later)
            length = binNumber.length();            // set variable length to length of binary number string

            int j = length - 1;                 // use j to maintain right to left position (exponent)
            for (int i = 0; i < length; i++) {  // use i to get each digit left to right
                tempChar = binNumber.charAt(i); // grab the char digit
                if (tempChar == '1') {          // if char digit is 1, then add to sum
                    sum += Math.pow(2, j);      //      2 to the power of exponent
                }
                j--;                            // decrease exponent as we move to next digit position
            } // end of i for-loop

            System.out.println(sum);            // Append output line with value of final sum
        } // end of k for-loop
    }  // end of main()
}
