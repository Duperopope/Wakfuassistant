/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Comparator;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bpa
 */
public final class bpa_0
extends Enum<bpa_0> {
    public static final /* enum */ bpa_0 iTC = new bpa_0(Comparator.comparing(bpe_0::getName));
    public static final /* enum */ bpa_0 iTD = new bpa_0(bpa_0.iTC.iTJ.reversed());
    public static final /* enum */ bpa_0 iTE = new bpa_0(Comparator.comparingInt(bpe_0::dCE));
    public static final /* enum */ bpa_0 iTF = new bpa_0(bpa_0.iTE.iTJ.reversed());
    public static final /* enum */ bpa_0 iTG = new bpa_0(Comparator.comparingInt(bpe_0::dCD));
    public static final /* enum */ bpa_0 iTH = new bpa_0(bpa_0.iTG.iTJ.reversed());
    public static final bpa_0 iTI;
    private final Comparator<bpe_0> iTJ;
    private static final /* synthetic */ bpa_0[] iTK;

    public static bpa_0[] values() {
        return (bpa_0[])iTK.clone();
    }

    public static bpa_0 valueOf(String string) {
        return Enum.valueOf(bpa_0.class, string);
    }

    private bpa_0(Comparator<bpe_0> comparator) {
        this.iTJ = comparator;
    }

    public Comparator<bpe_0> dcC() {
        return this.iTJ;
    }

    public static Optional<bpa_0> dh(@NotNull String string) {
        for (bpa_0 bpa_02 : bpa_0.values()) {
            if (!bpa_02.name().equalsIgnoreCase(string)) continue;
            return Optional.of(bpa_02);
        }
        return Optional.empty();
    }

    private static /* synthetic */ bpa_0[] dCn() {
        return new bpa_0[]{iTC, iTD, iTE, iTF, iTG, iTH};
    }

    static {
        iTK = bpa_0.dCn();
        iTI = iTC;
    }
}

