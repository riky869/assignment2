package it.unipd.mtss;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class IntegerToRomanTest {

    @Test(expected = IllegalArgumentException.class)
    public void provaNumeroNegative()  {
        IntegerToRoman.convert(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void provaNumeroZero()  {
        IntegerToRoman.convert(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void provaNumeroSuperioreMille()  {
        IntegerToRoman.convert(1001);
    }

    @Test
    public void provaNumeroMille()  {
        assertEquals("M", IntegerToRoman.convert(1000));
    }

    @Test
    public void provaNumero1()  {
        assertEquals("I", IntegerToRoman.convert(1));
    }

    @Test
    public void provaNumero2()  {
        assertEquals("II", IntegerToRoman.convert(2));
    }

    @Test
    public void provaNumero3()  {
        assertEquals("III", IntegerToRoman.convert(3));
    }

    @Test
    public void provaNumero4()  {
        assertEquals("IV", IntegerToRoman.convert(4));
    }

    @Test
    public void provaNumero5()  {
        assertEquals("V", IntegerToRoman.convert(5));
    }

    @Test
    public void provaNumero6()  {
        assertEquals("VI", IntegerToRoman.convert(6));
    }

    @Test
    public void provaNumero7()  {
        assertEquals("VII", IntegerToRoman.convert(7));
    }

    @Test
    public void provaNumero8()  {
        assertEquals("VIII", IntegerToRoman.convert(8));
    }

    @Test
    public void provaNumero9()  {
        assertEquals("IX", IntegerToRoman.convert(9));
    }

    @Test
    public void provaNumero10()  {
        assertEquals("X", IntegerToRoman.convert(10));
    }

    @Test
    public void provaNumero40()  {
        assertEquals("XL", IntegerToRoman.convert(40));
    }

    @Test
    public void provaNumero90()  {
        assertEquals("XC", IntegerToRoman.convert(90));
    }

    @Test
    public void provaNumero400()  {
        assertEquals("CD", IntegerToRoman.convert(400));
    }

    @Test
    public void provaNumero900()  {
        assertEquals("CM", IntegerToRoman.convert(900));
    }

    @Test
    public void provaNumero71()  {
        assertEquals("LXXI", IntegerToRoman.convert(71));
    }

    @Test
    public void provaNumero263()  {
        assertEquals("CCLXIII", IntegerToRoman.convert(263));
    }

    @Test
    public void provaNumero428()  {
        assertEquals("CDXXVIII", IntegerToRoman.convert(428));
    }

    @Test
    public void provaNumero666()  {
        assertEquals("DCLXVI", IntegerToRoman.convert(666));
    }
}