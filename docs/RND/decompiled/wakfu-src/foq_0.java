/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from foq
 */
public final class foq_0
extends Enum<foq_0>
implements aoq_1 {
    public static final /* enum */ foq_0 sLp = new foq_0(1);
    public static final /* enum */ foq_0 sLq = new foq_0(2);
    public static final /* enum */ foq_0 sLr = new foq_0(3);
    public static final /* enum */ foq_0 sLs = new foq_0(4);
    private final byte sLt;
    private static final /* synthetic */ foq_0[] sLu;

    public static foq_0[] values() {
        return (foq_0[])sLu.clone();
    }

    public static foq_0 valueOf(String string) {
        return Enum.valueOf(foq_0.class, string);
    }

    private foq_0(int n2) {
        this.sLt = (byte)n2;
    }

    public byte aJr() {
        return this.sLt;
    }

    public static foq_0 hf(byte by) {
        for (foq_0 foq_02 : foq_0.values()) {
            if (foq_02.sLt != by) continue;
            return foq_02;
        }
        return null;
    }

    @Override
    public String aXA() {
        return Byte.toString(this.aJr());
    }

    @Override
    public String aXB() {
        return this.name();
    }

    @Override
    public String aXC() {
        return this.name();
    }

    private static /* synthetic */ foq_0[] gfx() {
        return new foq_0[]{sLp, sLq, sLr, sLs};
    }

    static {
        sLu = foq_0.gfx();
    }
}

