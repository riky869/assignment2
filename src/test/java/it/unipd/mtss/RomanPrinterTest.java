package it.unipd.mtss;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanPrinterTest {
    @Test
    public void testNumero13()  {
        assertEquals("""
                __   __    _____    _____    _____  \s
                \\ \\ / /   |_   _|  |_   _|  |_   _| \s
                 \\ V /      | |      | |      | |   \s
                  > <       | |      | |      | |   \s
                 / . \\     _| |_    _| |_    _| |_  \s
                /_/ \\_\\   |_____|  |_____|  |_____| \s
                """, RomanPrinter.print(13));
    }
    @Test
    public void testNumero25()  {
        assertEquals("""
                __   __   __   __   __      __   \s
                \\ \\ / /   \\ \\ / /   \\ \\    / /   \s
                 \\ V /     \\ V /     \\ \\  / /    \s
                  > <       > <       \\ \\/ /     \s
                 / . \\     / . \\       \\  /      \s
                /_/ \\_\\   /_/ \\_\\       \\/       \s
                """, RomanPrinter.print(25));
    }
    @Test
    public void testNumero47()  {
        assertEquals("""
                __   __    _        __      __     _____    _____  \s
                \\ \\ / /   | |       \\ \\    / /    |_   _|  |_   _| \s
                 \\ V /    | |        \\ \\  / /       | |      | |   \s
                  > <     | |         \\ \\/ /        | |      | |   \s
                 / . \\    | |____      \\  /        _| |_    _| |_  \s
                /_/ \\_\\   |______|      \\/        |_____|  |_____| \s
                """, RomanPrinter.print(47));
    }
    @Test
    public void testNumero89()  {
        assertEquals("""
                 _        __   __   __   __   __   __    _____   __   __  \s
                | |       \\ \\ / /   \\ \\ / /   \\ \\ / /   |_   _|  \\ \\ / /  \s
                | |        \\ V /     \\ V /     \\ V /      | |     \\ V /   \s
                | |         > <       > <       > <       | |      > <    \s
                | |____    / . \\     / . \\     / . \\     _| |_    / . \\   \s
                |______|  /_/ \\_\\   /_/ \\_\\   /_/ \\_\\   |_____|  /_/ \\_\\  \s
                """, RomanPrinter.print(89));
    }
}
