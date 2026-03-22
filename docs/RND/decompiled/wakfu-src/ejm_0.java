/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eJm
 */
public final class ejm_0
extends Enum<ejm_0> {
    public static final /* enum */ ejm_0 qyS = new ejm_0(0, "item", true, 141);
    public static final /* enum */ ejm_0 qyT = new ejm_0(1, "bag", true, 142);
    public static final /* enum */ ejm_0 qyU = new ejm_0(2, "quest", true, 143);
    public static final /* enum */ ejm_0 qyV = new ejm_0(3, "cosmetic", true, 144);
    public static final /* enum */ ejm_0 qyW = new ejm_0(4, "endfight", false);
    public static final /* enum */ ejm_0 qyX = new ejm_0(5, "monsterbreed", false);
    public static final /* enum */ ejm_0 qyY = new ejm_0(6, "refitem", true);
    public static final /* enum */ ejm_0 qyZ = new ejm_0(7, "dungeon", false);
    public static final String qza = ";";
    public static final String qzb = "o";
    private final int qzc;
    private final String qzd;
    private final boolean qze;
    private final short qzf;
    private static final /* synthetic */ ejm_0[] qzg;

    public static ejm_0[] values() {
        return (ejm_0[])qzg.clone();
    }

    public static ejm_0 valueOf(String string) {
        return Enum.valueOf(ejm_0.class, string);
    }

    private ejm_0(int n2, String string2, boolean bl) {
        this(n2, string2, bl, -1);
    }

    private ejm_0(int n2, String string2, boolean bl, short s) {
        this.qzc = n2;
        this.qzd = string2;
        this.qze = bl;
        this.qzf = s;
    }

    public int d() {
        return this.qzc;
    }

    public String getTag() {
        return this.qzd;
    }

    public short fxg() {
        return this.qzf;
    }

    public boolean fxh() {
        return this.qze;
    }

    @Nullable
    public static ejm_0 Qa(int n) {
        for (ejm_0 ejm_02 : ejm_0.values()) {
            if (ejm_02.qzc != n) continue;
            return ejm_02;
        }
        return null;
    }

    @Nullable
    public static ejm_0 si(String string) {
        for (ejm_0 ejm_02 : ejm_0.values()) {
            if (!ejm_02.qzd.equals(string)) continue;
            return ejm_02;
        }
        return null;
    }

    public static String a(ejm_0 ejm_02, Object object) {
        return ejm_02.qzc + qza + String.valueOf(object);
    }

    private static /* synthetic */ ejm_0[] fxi() {
        return new ejm_0[]{qyS, qyT, qyU, qyV, qyW, qyX, qyY, qyZ};
    }

    static {
        qzg = ejm_0.fxi();
    }
}

