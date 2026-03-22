/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.EnumSet;
import java.util.Optional;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from boJ
 */
public final class boj_0
extends Enum<boj_0> {
    public static final /* enum */ boj_0 iRp = new boj_0(1, exx_2.rGw, exx_2.rHz, exx_2.rHA, exx_2.rHD, exx_2.rGR, exx_2.rGt, exx_2.rGv);
    public static final /* enum */ boj_0 iRq = new boj_0(2, exx_2.rGC, exx_2.rGD, exx_2.rGE, exx_2.rGF, exx_2.rGi);
    public static final /* enum */ boj_0 iRr = new boj_0(3, exx_2.rGm, exx_2.rGn, exx_2.rGI);
    private final int iRs;
    private final Set<exx_2> iRt;
    private static final /* synthetic */ boj_0[] iRu;

    public static boj_0[] values() {
        return (boj_0[])iRu.clone();
    }

    public static boj_0 valueOf(String string) {
        return Enum.valueOf(boj_0.class, string);
    }

    private boj_0(int n2, exx_2 ... exx_2Array) {
        this.iRs = n2;
        this.iRt = EnumSet.of(exx_2Array[0], exx_2Array);
    }

    public int d() {
        return this.iRs;
    }

    public boolean i(@Nullable exx_2 exx_22) {
        if (exx_22 == null) {
            return false;
        }
        return this.iRt.contains(exx_22);
    }

    public static Optional<boj_0> dh(@NotNull String string) {
        for (boj_0 boj_02 : boj_0.values()) {
            if (!boj_02.name().equalsIgnoreCase(string)) continue;
            return Optional.of(boj_02);
        }
        return Optional.empty();
    }

    private static /* synthetic */ boj_0[] dBj() {
        return new boj_0[]{iRp, iRq, iRr};
    }

    static {
        iRu = boj_0.dBj();
    }
}

