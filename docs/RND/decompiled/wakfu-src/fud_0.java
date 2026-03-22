/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import java.util.List;
import lombok.Generated;

/*
 * Renamed from fud
 */
public final class fud_0
extends Enum<fud_0> {
    public static final /* enum */ fud_0 thz = new fud_0(0, fuc_0.values());
    public static final /* enum */ fud_0 thA = new fud_0(1, new fuc_0[0]);
    public static final /* enum */ fud_0 thB = new fud_0(2, fuc_0.tht);
    public static final /* enum */ fud_0 thC = new fud_0(3, fuc_0.tho);
    private final byte thD;
    private final List<fuc_0> thE;
    private static final /* synthetic */ fud_0[] thF;

    public static fud_0[] values() {
        return (fud_0[])thF.clone();
    }

    public static fud_0 valueOf(String string) {
        return Enum.valueOf(fud_0.class, string);
    }

    private fud_0(byte by, fuc_0 ... fuc_0Array) {
        this.thD = by;
        this.thE = List.of(fuc_0Array);
    }

    public static fud_0 hL(byte by) {
        for (fud_0 fud_02 : fud_0.values()) {
            if (fud_02.thD != by) continue;
            return fud_02;
        }
        return thA;
    }

    @Generated
    public byte aJr() {
        return this.thD;
    }

    @Generated
    public List<fuc_0> gne() {
        return this.thE;
    }

    private static /* synthetic */ fud_0[] gnf() {
        return new fud_0[]{thz, thA, thB, thC};
    }

    static {
        thF = fud_0.gnf();
    }
}

