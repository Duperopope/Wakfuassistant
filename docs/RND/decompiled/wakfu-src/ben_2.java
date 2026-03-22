/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Contract
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from beN
 */
public final class ben_2 {
    private static final String hNY = "-";
    private static final String hNZ = ":";
    private static final String hOa = "[^0-9:-]";
    private static final int hOb = 200;

    private ben_2() {
    }

    @NotNull
    @Contract(pure=true)
    public static String a(@Nullable ehy_0 ehy_02) {
        if (ehy_02 == null) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        ehy_02.fwb().forEach((n, s) -> {
            if (s > 0) {
                stringBuilder.append(n).append(hNZ).append(s).append(hNY);
            }
        });
        if (stringBuilder.length() > 0) {
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
        return stringBuilder.toString();
    }

    @NotNull
    @Contract(pure=true)
    public static ehy_0 ls(@NotNull String string) {
        String[] stringArray;
        ehy_0 ehy_02 = new ehy_0();
        for (String string2 : stringArray = ben_2.lt(string).split(hNY)) {
            String[] stringArray2 = string2.split(hNZ);
            if (stringArray2.length < 2) continue;
            try {
                int n = Integer.parseInt(stringArray2[0]);
                short s = Short.parseShort(stringArray2[1]);
                if (!eHJ.qsV.Pz(n) || s <= 0) continue;
                ehy_02.p(n, s);
            }
            catch (NumberFormatException numberFormatException) {
                // empty catch block
            }
        }
        return ehy_02;
    }

    @NotNull
    @Contract(pure=true)
    public static String lt(@NotNull String string) {
        String string2 = string.replaceAll(hOa, "");
        if (string2.length() > 200) {
            return string2.substring(0, 200);
        }
        return string2;
    }
}

