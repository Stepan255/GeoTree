package FamilyTree.src.Mathematics;

public class IsNumeric {
    public boolean isNumeric(String str) {
        Boolean aBoolean = str.matches("-?\\d+(\\.\\d+)?");
        return aBoolean;  //match a number with optional '-' and decimal.
    }
}
