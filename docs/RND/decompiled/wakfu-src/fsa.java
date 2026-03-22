/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.EnumSet;

public final class fsa
extends Enum<fsa> {
    public static final /* enum */ fsa taS = new fsa(fqa_0.sRE);
    public static final /* enum */ fsa taT = new fsa(fqa_0.sRF);
    public static final /* enum */ fsa taU = new fsa(fqa_0.sRG);
    public static final /* enum */ fsa taV = new fsa(fqa_0.sRH);
    private final EnumSet<fqa_0> taW = EnumSet.noneOf(fqa_0.class);
    private static final /* synthetic */ fsa[] taX;

    public static fsa[] values() {
        return (fsa[])taX.clone();
    }

    public static fsa valueOf(String string) {
        return Enum.valueOf(fsa.class, string);
    }

    private fsa(fqa_0 ... fqa_0Array) {
        if (fqa_0Array.length > 0) {
            this.taW.addAll(Arrays.asList(fqa_0Array));
        }
    }

    public static fsa a(fqa_0 fqa_02) {
        fsa[] fsaArray;
        for (fsa fsa2 : fsaArray = fsa.values()) {
            if (!fsa2.taW.contains(fqa_02)) continue;
            return fsa2;
        }
        throw new IllegalArgumentException("Not found " + String.valueOf(fqa_02));
    }

    public static fsa c(wg_0 wg_02) {
        fsa[] fsaArray;
        for (fsa fsa2 : fsaArray = fsa.values()) {
            for (fqa_0 fqa_02 : fsa2.taW) {
                if (!fqa_02.ghI().contains((Object)wg_02)) continue;
                return fsa2;
            }
        }
        throw new IllegalArgumentException("Not found " + String.valueOf((Object)wg_02));
    }

    private static /* synthetic */ fsa[] gkJ() {
        return new fsa[]{taS, taT, taU, taV};
    }

    static {
        taX = fsa.gkJ();
    }
}

