package io.veronicacrowe;


import java.util.ArrayList;

/**
 * Created by veronicacrowe on 6/12/16.
 */
public class NumberToWords {

    public static String numberToWordConverter(String number) {
        ArrayList<String> splitSections = numberSplitter(number);
        String convertedWords = "";

        //do this if input is over 999,000
        if (splitSections.size() == 3) {
            convertedWords += millionConverter(splitSections);
        }
        //do this if input is less than 1 million
        else if (splitSections.size() == 2) {
            convertedWords += thousandConverter(splitSections);
        }
        //do this if input is less than 1 thousand
        else {
            convertedWords += tensConverter(splitSections);
        }
    return convertedWords;
    }

    private static String millionConverter(ArrayList<String> section){
        String output = "";
        output= output + sectionConverter(section.get(0)) + "Million";
        output= output + sectionConverter(section.get(1)) + "Thousand";
        output= output + sectionConverter(section.get(2)) + "Dollars";
        return output;
    }

    public static String thousandConverter(ArrayList<String> section){
        String output = "";
        output= output + sectionConverter(section.get(0)) + "Thousand";
        output= output + sectionConverter(section.get(1)) + "Dollars";
        return output;
    }

    public static String tensConverter(ArrayList<String> section){
        return sectionConverter(section.get(0)) + "Dollars";
    }

    public static String sectionConverter(String section){
        String converted = "";

        if(section.length() == 3){
            if (section.substring(0,1).equals("0")) {
            }
            else {
                converted= converted + numberToLookUp(section.substring(0,1)) + "Hundred";
            }
            if(!section.substring(1,2).equals("0") && !section.substring(2).equals("0")) {
                if (section.substring(1,2).equals("1")){
                    converted= converted + numberToLookUp(section.substring(1));

                } else {
                    converted = converted + numberToLookUp(section.substring(1,2) + "0") + numberToLookUp(section.substring(2));
                }
            }

        }

        if (section.length() == 2){
            if (section.substring(0,1).equals("1")){
                converted = converted +numberToLookUp(section.substring(0));
            } else {
                converted = converted + numberToLookUp(section.substring(0,1) + "0") + numberToLookUp(section.substring(1));
            }
        } else {
            converted = converted + numberToLookUp(section.substring(0));
        }
        return converted;
    }

    public static ArrayList<String> numberSplitter(String number){
        int length = number.length();
        ArrayList<String> sections = new ArrayList<>();

        if(length == 9) {
            sections.add(number.substring(0,3));
            sections.add(number.substring(3,6));
            sections.add(number.substring(6));
        } else if (length == 8){
            sections.add(number.substring(0,2));
            sections.add(number.substring(2,5));
            sections.add(number.substring(5));
        } else if (length == 7){
            sections.add(number.substring(0,1));
            sections.add(number.substring(1,4));
            sections.add(number.substring(4));
        } else if (length == 6){
            sections.add(number.substring(0,3));
            sections.add(number.substring(3));
        } else if (length == 5){
            sections.add(number.substring(0,2));
            sections.add(number.substring(2));
        } else if (length == 4){
            sections.add(number.substring(0,1));
            sections.add(number.substring(1));
        } else {
            sections.add(number);
        }
        return sections;
    }

    public static String numberToLookUp (String input){
        String convertedWord = "";

        switch(input){
            case "0":
                convertedWord = "Zero";
                break;
            case "1":
            case "01":
                convertedWord = "One";
                break;
            case "2":
            case "02":
                convertedWord = "Two";
                break;
            case "3":
            case "03":
                convertedWord = "Three";
                break;
            case "4":
            case "04":
                convertedWord = "Four";
                break;
            case "5":
            case "05":
                convertedWord = "Five";
                break;
            case "6":
            case "06":
                convertedWord = "Six";
                break;
            case "7":
            case "07":
                convertedWord = "Seven";
                break;
            case "8":
            case "08":
                convertedWord = "Eight";
                break;
            case "9":
            case "09":
                convertedWord = "Nine";
                break;
            case "10":
                convertedWord = "Ten";
                break;
            case "11":
                convertedWord = "Eleven";
                break;
            case "12":
                convertedWord = "Twelve";
                break;
            case "13":
                convertedWord = "Thirteen";
                break;
            case "14":
                convertedWord = "Fourteen";
                break;
            case "15":
                convertedWord = "Fifteen";
                break;
            case "16":
                convertedWord = "Sixteen";
                break;
            case "17":
                convertedWord = "Seventeen";
                break;
            case "18":
                convertedWord = "Eighteen";
                break;
            case "19":
                convertedWord = "Nineteen";
                break;
            case "20":
                convertedWord = "Twenty";
                break;
            case "30":
                convertedWord = "Thirty";
                break;
            case "40":
                convertedWord = "Forty";
                break;
            case "50":
                convertedWord = "Fifty";
                break;
            case "60":
                convertedWord = "Sixty";
                break;
            case "70":
                convertedWord = "Seventy";
                break;
            case "80":
                convertedWord = "Eighty";
                break;
            case "90":
                convertedWord = "Ninety";
                break;
        }
            return convertedWord;
    }
}
