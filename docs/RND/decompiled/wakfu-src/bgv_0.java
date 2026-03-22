/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bgv
 */
public final class bgv_0
extends Enum<bgv_0>
implements aeh_2 {
    public static final /* enum */ bgv_0 iav = new bgv_0(0);
    public static final /* enum */ bgv_0 iaw = new bgv_0(1);
    public static final /* enum */ bgv_0 iax = new bgv_0(2);
    private static final String iay = "name";
    private static final String iaz = "description";
    private final int iaA;
    private static final /* synthetic */ bgv_0[] iaB;

    public static bgv_0[] values() {
        return (bgv_0[])iaB.clone();
    }

    public static bgv_0 valueOf(String string) {
        return Enum.valueOf(bgv_0.class, string);
    }

    private bgv_0(int n2) {
        this.iaA = n2;
    }

    public static bgv_0 CE(int n) {
        for (bgv_0 bgv_02 : bgv_0.values()) {
            if (bgv_02.iaA != n) continue;
            return bgv_02;
        }
        return iav;
    }

    @Override
    public String[] bxk() {
        return new String[0];
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string == null) {
            return null;
        }
        switch (string) {
            case "name": {
                return aum_0.cWf().c("autorun.mode." + this.iaA, new Object[0]);
            }
            case "description": {
                return aum_0.cWf().c("autorun.mode.desc." + this.iaA, new Object[0]);
            }
        }
        return null;
    }

    public int aPm() {
        return this.iaA;
    }

    private static /* synthetic */ bgv_0[] djn() {
        return new bgv_0[]{iav, iaw, iax};
    }

    static {
        iaB = bgv_0.djn();
    }
}

