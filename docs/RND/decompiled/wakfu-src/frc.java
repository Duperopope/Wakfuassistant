/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Joiner
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.base.Joiner;
import java.util.regex.Pattern;
import org.jetbrains.annotations.Nullable;

public final class frc {
    private frc() {
    }

    public static String h(frd frd2) {
        if (frd2 == null) {
            return "";
        }
        Joiner joiner = Joiner.on((String)"-");
        return joiner.join(frd2.gjS());
    }

    @Nullable
    public static frd sV(String string) {
        if (!Pattern.matches("\\d*((-\\d*)*)?", string)) {
            return null;
        }
        String[] stringArray = string.split("-");
        if (stringArray.length != fra.sXp + fra.sXq) {
            return null;
        }
        int[] nArray = new int[fra.sXp];
        for (int i = 0; i < fra.sXp; ++i) {
            nArray[i] = Integer.parseInt(stringArray[i]);
        }
        int[] nArray2 = new int[fra.sXq];
        for (int i = 0; i < fra.sXq; ++i) {
            nArray2[i] = Integer.parseInt(stringArray[i + fra.sXp]);
        }
        return new frd(nArray, nArray2);
    }
}

