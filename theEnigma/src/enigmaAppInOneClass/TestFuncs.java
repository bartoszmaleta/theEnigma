package enigmaAppInOneClass;

public class TestFuncs {

    public static StringBuffer blankLines(int numberOfBlankLines) {
        StringBuffer result = new StringBuffer();
       
        for (int i = 1; i < numberOfBlankLines; i++) {
            String blankLine = "\n";
            result.append(blankLine);
        }
        // System.out.println(result);
        return result;
    
    }

    public static void main(String[] args) {
        blankLines(5);

        System.out.println("asdasdas");

        // StringBuffer blanks = blankLines(5);
        // System.out.println(blanks);

        // StringBuffer blanksThree = blankLines(3);
        // System.out.println(blanksThree);

        blankLines2(5);
        
    }

    public static void blankLines2(int numberOfBlankLines) {
        StringBuffer result = new StringBuffer();
       
        for (int i = 1; i < numberOfBlankLines; i++) {
            String blankLine = "\n";
            result.append(blankLine);
        }
        System.out.println(result);
        
        // return result;
    }

}