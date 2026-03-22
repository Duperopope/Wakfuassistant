/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

public final class bof {
    private static final String iME = "DungeonLadderCrown";
    public static final String iMF = "DungeonLadderNoCrown";
    public static final String iMG = "DungeonGameplay";
    private static final String iMH = "StasisDifficulty";

    private bof() {
    }

    public static String EK(int n) {
        int n2 = switch (n) {
            case 1, 2 -> 1;
            case 3, 4 -> 2;
            case 5, 6 -> 3;
            case 7, 8 -> 4;
            case 9 -> 5;
            case 10 -> 6;
            default -> 0;
        };
        return iMH + n2;
    }

    public static String EL(int n) {
        eMU eMU2 = eMU.RH(n);
        int n2 = Math.min(eMU.qOn.fAO(), eMU2.fAO() + 1);
        return iME + n2;
    }

    public static String b(@NotNull eIc eIc2) {
        return iMG + eIc2.aIi();
    }
}

