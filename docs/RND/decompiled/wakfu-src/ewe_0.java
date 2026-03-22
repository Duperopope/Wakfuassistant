/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ewE
 */
public final class ewe_0
extends Enum<ewe_0>
implements aoq_1 {
    public static final /* enum */ ewe_0 oIp = new ewe_0(0, "Challenge de base");
    public static final /* enum */ ewe_0 oIq = new ewe_0(1, "Challenge \u00e0 acheter");
    public static final /* enum */ ewe_0 oIr = new ewe_0(2, "Challenge de Chaos");
    public static final /* enum */ ewe_0 oIs = new ewe_0(3, "Challenge d'ecosysteme");
    private final byte oIt;
    private final String oIu;
    private static final /* synthetic */ ewe_0[] oIv;

    public static ewe_0[] values() {
        return (ewe_0[])oIv.clone();
    }

    public static ewe_0 valueOf(String string) {
        return Enum.valueOf(ewe_0.class, string);
    }

    private ewe_0(byte by, String string2) {
        this.oIt = by;
        this.oIu = string2;
    }

    public static ewe_0 ew(byte by) {
        for (ewe_0 ewe_02 : ewe_0.values()) {
            if (ewe_02.oIt != by) continue;
            return ewe_02;
        }
        return null;
    }

    public byte aJr() {
        return this.oIt;
    }

    @Override
    public String aXA() {
        return String.valueOf(this.oIt);
    }

    @Override
    public String aXB() {
        return this.oIu;
    }

    @Override
    public String aXC() {
        return null;
    }

    private static /* synthetic */ ewe_0[] ffa() {
        return new ewe_0[]{oIp, oIq, oIr, oIs};
    }

    static {
        oIv = ewe_0.ffa();
    }
}

