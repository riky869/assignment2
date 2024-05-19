////////////////////////////////////////////////////////////////////
// [SAMUELE] [CORRADIN] [2068235]
// [RICCARDO] [PIVA] [2079241]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class RomanPrinter {
    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }
    private static String printAsciiArt(String romanNumber) {
        String[] m = """
                 __  __    \s
                |  \\/  |  \s
                | \\  / |  \s
                | |\\/| |  \s
                | |  | |   \s
                |_|  |_|   \s""".split("\n");
        String[] d = """
                 _____   \s
                |  __ \\  \s 
                | |  | | \s
                | |  | | \s
                | |__| | \s
                |_____/  \s""".split("\n");
        String[] c = """
                  _____  \s
                 / ____| \s
                | |      \s
                | |      \s
                | |____  \s
                 \\_____| \s
                """.split("\n");
        String[] l = """
                 _       \s
                | |      \s
                | |      \s
                | |      \s
                | |____  \s
                |______| \s""".split("\n");
        String[] x = """
                __   __  \s
                \\ \\ / /  \s
                 \\ V /   \s
                  > <    \s
                 / . \\   \s
                /_/ \\_\\  \s""".split("\n");
        String[] v = """
                __      __   \s
                \\ \\    / /   \s
                 \\ \\  / /    \s
                  \\ \\/ /     \s
                   \\  /      \s
                    \\/       \s""".split("\n");
        String[] i = """
                 _____  \s
                |_   _| \s
                  | |   \s
                  | |   \s
                 _| |_  \s
                |_____| \s""".split("\n");
        String daStampare = "";
        for(int k = 0; k < i.length; k++){
            for(int j = 0; j < romanNumber.length(); j++){
                switch (romanNumber.charAt(j)){
                    case 'M':
                        daStampare += m[k];
                        break;
                    case 'D':
                        daStampare += d[k];
                        break;
                    case 'C':
                        daStampare += c[k];
                        break;
                    case 'L':
                        daStampare += l[k];
                        break;
                    case 'X':
                        daStampare += x[k];
                        break;
                    case 'V':
                        daStampare += v[k];
                        break;
                    case 'I':
                        daStampare += i[k];
                        break;
                    default:
                        break;
                }
            }
            daStampare += '\n';
        }
        return daStampare;
    }
}
