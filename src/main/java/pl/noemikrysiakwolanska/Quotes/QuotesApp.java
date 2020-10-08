package pl.noemikrysiakwolanska.Quotes;

public class QuotesApp {
    private static String frameBorder = "*";
    private static String quoteEng = QuoteGenerator.getQuoteEng();
    private static String quotePl = QuoteTranslation.translate(quoteEng);
    private static String author = QuoteGenerator.getAuthor();

    public static void printFrameBorder(int length){ {
        for (int i = 0; i < length; i++) {
            System.out.print(frameBorder);
        }
        System.out.println();
    }

    }
    public static void printEmptyFrameLine(int length){
        for (int i = 0; i < length; i++) {
            if (i == 0 || i == length - 1) {
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
        }
        System.out.println();

    }

    public static void printFrameQuoteEngLine(String quote){
        System.out.println(frameBorder + "  " + quote + "  " + frameBorder);

    }
    public static void printFrameQuotePlLine(String quote){
        System.out.println(frameBorder + "  " + quote + "  " + frameBorder);

    }
    public static void printFrameAuthorLine(String author, int length) {
        System.out.print(frameBorder + "  ");
        int linePadding = length - (2 * 3) - 4 - author.length();
        for (int i = 0; i < linePadding; i++) {
            System.out.print(" ");
        }
        System.out.print("--- " + author);
        System.out.println("  " + frameBorder);
    }


    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~ Cytat na dzisiaj: ~~~~~~~~~~");
        int frameLengthEng = quoteEng.length() + 6 ;
        printFrameBorder(frameLengthEng);
        printEmptyFrameLine(frameLengthEng);
        printFrameQuoteEngLine(quoteEng);
        printFrameAuthorLine(author, frameLengthEng);
        printEmptyFrameLine(frameLengthEng);
        printFrameBorder(frameLengthEng);


        System.out.println();
        System.out.println("Tłumaczenie: ");
        int frameLengthPl = quotePl.length() + 6;
        printFrameBorder(frameLengthPl);
        printEmptyFrameLine(frameLengthPl);
        printFrameQuotePlLine(quotePl);
        printFrameAuthorLine(author, frameLengthPl);
        printEmptyFrameLine(frameLengthPl);
        printFrameBorder(frameLengthPl);

    }

}
