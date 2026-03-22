/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
import com.google.common.collect.ImmutableSet;

/*
 * Renamed from eJj
 */
public final class ejj_0
extends Enum<ejj_0> {
    public static final /* enum */ ejj_0 qyF = new ejj_0(1, 1);
    public static final /* enum */ ejj_0 qyG = new ejj_0(2, 7, 23);
    public static final /* enum */ ejj_0 qyH = new ejj_0(3, 10);
    public static final /* enum */ ejj_0 qyI = new ejj_0(4, 2);
    public static final /* enum */ ejj_0 qyJ = new ejj_0(5, 16);
    public static final /* enum */ ejj_0 qyK = new ejj_0(6, 20, 22);
    public static final /* enum */ ejj_0 qyL = new ejj_0(7, 24);
    public static final /* enum */ ejj_0 qyM = new ejj_0(8, 25);
    public static final ImmutableSet<ejj_0> qyN;
    private final byte qyO;
    private final short qyP;
    private final short qyQ;
    private static final /* synthetic */ ejj_0[] qyR;

    public static ejj_0[] values() {
        return (ejj_0[])qyR.clone();
    }

    public static ejj_0 valueOf(String string) {
        return Enum.valueOf(ejj_0.class, string);
    }

    public static ua_0 fwZ() {
        return uz_0.fo(ewo_0.oBF.i(ewr_0.oDQ));
    }

    public static ua_0 fxa() {
        return uz_0.fo(ewo_0.oBF.i(ewr_0.oED));
    }

    private ejj_0(byte by, short s) {
        this.qyO = by;
        this.qyP = s;
        this.qyQ = (short)-1;
    }

    private ejj_0(byte by, short s, short s2) {
        this.qyO = by;
        this.qyP = s;
        this.qyQ = s2;
    }

    public byte aJr() {
        return this.qyO;
    }

    public short fxb() {
        return this.qyP;
    }

    public static ejj_0 dG(short s) {
        ejj_0[] ejj_0Array = ejj_0.values();
        for (int i = 0; i < ejj_0Array.length; ++i) {
            ejj_0 ejj_02 = ejj_0Array[i];
            if (ejj_02.qyP != s && ejj_02.qyQ != s) continue;
            return ejj_02;
        }
        return null;
    }

    public static ejj_0 dH(short s) {
        ejj_0[] ejj_0Array = ejj_0.values();
        for (int i = 0; i < ejj_0Array.length; ++i) {
            ejj_0 ejj_02 = ejj_0Array[i];
            if (ejj_02.qyO != s) continue;
            return ejj_02;
        }
        return null;
    }

    public boolean fxc() {
        switch (this.ordinal()) {
            case 0: 
            case 2: 
            case 3: {
                return true;
            }
        }
        return false;
    }

    private static /* synthetic */ ejj_0[] fxd() {
        return new ejj_0[]{qyF, qyG, qyH, qyI, qyJ, qyK, qyL, qyM};
    }

    static {
        qyR = ejj_0.fxd();
        qyN = ImmutableSet.builder().add((Object)qyF).add((Object)qyH).add((Object)qyI).add((Object)qyJ).add((Object)qyM).build();
    }
}

