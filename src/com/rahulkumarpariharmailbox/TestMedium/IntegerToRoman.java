package com.rahulkumarpariharmailbox.TestMedium;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class IntegerToRoman {
    com.rahulkumarpariharmailbox.IntefaceMedium.IntegerToRoman integerToRoman;
    public IntegerToRoman() {
        integerToRoman = new com.rahulkumarpariharmailbox.Medium.IntegerToRoman();
    }

    @Test
    public void TestFor3999(){
        String result = integerToRoman.intToRoman(3999);
        assertThat(result,is("MMMCMXCIX"));
    }

    @Test
    public void TestFor1994(){
        String result = integerToRoman.intToRoman(1994);
        assertThat(result,is("MCMXCIV"));
    }

    @Test
    public void TestFor444(){
        String result = integerToRoman.intToRoman(444);
        assertThat(result,is("CDXLIV"));
    }

    @Test
    public void TestFor40(){
        String result = integerToRoman.intToRoman(40);
        assertThat(result,is("XL"));
    }

    @Test
    public void TestFor400(){
        String result = integerToRoman.intToRoman(400);
        assertThat(result,is("CD"));
    }

    @Test
    public void TestFor900(){
        String result = integerToRoman.intToRoman(900);
        assertThat(result,is("CM"));
    }

    @Test
    public void TestFor9(){
        String result = integerToRoman.intToRoman(9);
        assertThat(result,is("IX"));
    }

    @Test
    public void TestFor4(){
        String result = integerToRoman.intToRoman(4);
        assertThat(result,is("IV"));
    }

    @Test
    public void TestFor19(){
        String result = integerToRoman.intToRoman(19);
        assertThat(result,is("XIX"));
    }

}
