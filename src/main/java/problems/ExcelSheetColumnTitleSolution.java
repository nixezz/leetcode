package problems;

public class ExcelSheetColumnTitleSolution {
    public String convertToTitle(int columnNumber) {
        StringBuilder answerBuilder = new StringBuilder();
        while(columnNumber > 0) {
            columnNumber --;
            answerBuilder.append((char)(columnNumber % 26 + 'A'));
            columnNumber /= 26;
        }
        return answerBuilder.reverse().toString();
    }
}
