import io.veronicacrowe.NumberToWords;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by veronicacrowe on 6/12/16.
 */
public class numberToWordsSpec {
    @Test
    public void oneDigitEntryTest(){
        String expectedWords = "SevenDollars";
        String actualWords = NumberToWords.numberToWordConverter("7");
        assertEquals("The converted value should be SevenDollars",expectedWords,actualWords);
    }

    @Test
    public void twoDigitEntryTest(){
        String expectedWords = "ElevenDollars";
        String actualWords = NumberToWords.numberToWordConverter("11");
        assertEquals("The converted value should be ElevenDollars",expectedWords,actualWords);
    }

    @Test
    public void threeDigitEntryTest(){
        String expectedWords = "OneHundredNinetyFiveDollars";
        String actualWords = NumberToWords.numberToWordConverter("195");
        assertEquals("The converted value should be OneHundredNinetyFiveDollars",expectedWords,actualWords);
    }

    @Test
    public void fourDigitEntryTest(){
        String expectedWords = "OneThousandFiveHundredTwentyOneDollars";
        String actualWords = NumberToWords.numberToWordConverter("1521");
        assertEquals("The converted value should be OneThousandFiveHundredTwentyOneDollars",expectedWords,actualWords);
    }

    @Test
    public void fiveDigitEntryTest(){
        String expectedWords = "TwelveThousandFourHundredDollars";
        String actualWords = NumberToWords.numberToWordConverter("12400");
        assertEquals("The converted value should be TwelveThousandFourHundredTwentyDollars",expectedWords,actualWords);
    }

    @Test
    public void sixDigitEntryTest(){
        String expectedWords = "TwoHundredThousandFourHundredTwelveDollars";
        String actualWords = NumberToWords.numberToWordConverter("200412");
        assertEquals("The converted value should be TwoHundredThousandFourHundredTwelveDollars",expectedWords,actualWords);
    }

    @Test
    public void sevenDigitEntryTest(){
        String expectedWords = "OneMillionTwoHundredThousandFourHundredTwelveDollars";
        String actualWords = NumberToWords.numberToWordConverter("1200412");
        assertEquals("The converted value should be OneMillionTwoHundredThousandFourHundredTwelveDollars",expectedWords,actualWords);
    }

    @Test
    public void eightDigitEntryTest(){
        String expectedWords = "TenMillionTwentyEightThousandFourHundredElevenDollars";
        String actualWords = NumberToWords.numberToWordConverter("10028411");
        assertEquals("The converted value should be TenMillionTwentyEightThousandFourHundredElevenDollars",expectedWords,actualWords);
    }

    @Test
    public void nineDigitEntryTest(){
        String expectedWords = "OneHundredTwelveMillionTwentyFourThousandFiveHundredEightDollars";
        String actualWords = NumberToWords.numberToWordConverter("112024508");
        assertEquals("The converted value should be OneHundredTwelveMillionTwentyFourThousandFiveHundredEightDollars",expectedWords,actualWords);
    }
}
