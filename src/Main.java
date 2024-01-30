public class Main {
    public static void main (String[] args){

        Integer[] numList = {5, 4, 3, 2, 2};

        //Challenge 1 - Find Maximum
        System.out.println("Maximum number is: " + maximum(numList));

        //Challenge 2 - Print number in word
        System.out.println("Number in word is: " + printNumberInWordVA(18));
        System.out.println("Number in word is: " + printNumberInWordVB(43));

        //Challenge 3 - Check Odd/Even
        checkOddEven(5);
        checkOddEven(54);

        //Challenge 4 - Calculate the average
        System.out.println("The average is: " + average(numList));

    }

    public static Integer maximum(Integer[] numList) {

        Integer nb = numList[0];
        for (int i=0; i < numList.length; i++){
            if (numList[i] > nb)
                nb = numList[i];
        }
        return (nb);
    }

    public static String printNumberInWordVA(int num) {
        if (num == 1)
            return "ONE";
        else if (num == 2)
            return "TWO";
        else if (num == 3)
            return "THREE";
        else if (num == 4)
            return "FOUR";
        else if (num == 5)
            return "FIVE";
        else if (num == 6)
            return "SIX";
        else if (num == 7)
            return "SEVEN";
        else if (num == 8)
            return "EIGHT";
        else if (num == 9)
            return "NINE";
        else
            return "OTHER";


    }

    public static String printNumberInWordVB(int num) {
        switch (num) {
            case 1:
                return "ONE";
            case 2:
                return "TWO";
            case 3:
                return "THREE";
            case 4:
                return "FOUR";
            case 5:
                return "FIVE";
            case 6:
                return "SIX";
            case 7:
                return "SEVEN";
            case 8:
                return "EIGHT";
            case 9:
                return "NINE";
            default:
                return "OTHER";
        }
    }

    public static void checkOddEven(int num) {
        if (num % 2 == 0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");
    }

    public static double average(Integer[] numList) {
        double aver = 0;
        for (int i=0; i < numList.length; i++){
            aver = aver + numList[i];
        }
        aver = aver / numList.length;
        return (aver);
    }

}

