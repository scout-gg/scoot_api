package org.gg.scoot.dto;

public enum Age {
    DARK,
    FEUDAL,
    CASTLE,
    IMPERIAL;

    public static Age from(int ageId) {
        return switch (ageId) {
            case 1 -> DARK;
            case 2 -> FEUDAL;
            case 3 -> CASTLE;
            case 4 -> IMPERIAL;
            default -> throw new RuntimeException("Unknown Age id");
        };
    }

    @Override
    public String toString() {
        return switch (this) {
            case DARK -> "Dark Age";
            case FEUDAL -> "Feudal Age";
            case CASTLE -> "Castle Age";
            case IMPERIAL -> "Imperial Age";
        };
    }
}
