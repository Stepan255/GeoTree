package FamilyTree.src.Mathematics;

public class IsNumeric {
    public boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }
}
