/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fkc
 */
public final class fkc_0
extends Enum<fkc_0>
implements aoq_1 {
    public static final /* enum */ fkc_0 sAo = new fkc_0(-1, "Nation ennemie");
    public static final /* enum */ fkc_0 sAp = new fkc_0(1, "Nation alli\u00e9e");
    private final byte sAq;
    private final String sAr;
    private static final /* synthetic */ fkc_0[] sAs;

    public static fkc_0[] values() {
        return (fkc_0[])sAs.clone();
    }

    public static fkc_0 valueOf(String string) {
        return Enum.valueOf(fkc_0.class, string);
    }

    private fkc_0(int n2, String string2) {
        this.sAq = (byte)n2;
        this.sAr = string2;
    }

    public byte aJr() {
        return this.sAq;
    }

    @Override
    public String aXA() {
        return String.valueOf(this.sAq);
    }

    @Override
    public String aXB() {
        return this.sAr;
    }

    @Override
    public String aXC() {
        return null;
    }

    @Nullable
    public static fkc_0 gT(byte by) {
        for (fkc_0 fkc_02 : fkc_0.values()) {
            if (fkc_02.sAq != by) continue;
            return fkc_02;
        }
        return null;
    }

    private static /* synthetic */ fkc_0[] gcb() {
        return new fkc_0[]{sAo, sAp};
    }

    static {
        sAs = fkc_0.gcb();
    }
}

