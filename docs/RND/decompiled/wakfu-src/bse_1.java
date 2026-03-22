/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bSE
 */
public final class bse_1
extends Enum<bse_1>
implements aeh_2 {
    public static final /* enum */ bse_1 lhH = new bse_1(0, "options.desc.title.color.all");
    public static final /* enum */ bse_1 lhI = new bse_1(1, "options.desc.title.color.mine");
    public static final /* enum */ bse_1 lhJ = new bse_1(2, "options.desc.title.color.none");
    public static final String lhK = "id";
    public static final String lhL = "description";
    private final int lhM;
    private final String lhN;
    private static final /* synthetic */ bse_1[] lhO;

    public static bse_1[] values() {
        return (bse_1[])lhO.clone();
    }

    public static bse_1 valueOf(String string) {
        return Enum.valueOf(bse_1.class, string);
    }

    private bse_1(int n2, String string2) {
        this.lhM = n2;
        this.lhN = string2;
    }

    public int d() {
        return this.lhM;
    }

    public String clY() {
        return this.lhN;
    }

    @Override
    public String[] bxk() {
        return new String[]{lhK, lhL};
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (lhL.equals(string)) {
            return aum_0.cWf().c(this.lhN, new Object[0]);
        }
        if (lhK.equals(string)) {
            return this.lhM;
        }
        return null;
    }

    public static Optional<bse_1> Jv(int n) {
        for (bse_1 bse_12 : bse_1.values()) {
            if (n != bse_12.lhM) continue;
            return Optional.of(bse_12);
        }
        return Optional.empty();
    }

    private static /* synthetic */ bse_1[] emY() {
        return new bse_1[]{lhH, lhI, lhJ};
    }

    static {
        lhO = bse_1.emY();
    }
}

