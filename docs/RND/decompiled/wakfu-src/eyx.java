/*
 * Decompiled with CFR 0.152.
 */
public final class eyx
extends Enum<eyx>
implements aoq_1 {
    public static final /* enum */ eyx pjm = new eyx(1, "Ecosyst\u00e8me");
    public static final /* enum */ eyx pjn = new eyx(2, "Donjon");
    public static final /* enum */ eyx pjo = new eyx(3, "Sp\u00e9cial");
    public static final /* enum */ eyx pjp = new eyx(4, "Principale");
    public static final /* enum */ eyx pjq = new eyx(5, "Arcade");
    private final byte pjr;
    private final String pjs;
    private static final /* synthetic */ eyx[] pjt;

    public static eyx[] values() {
        return (eyx[])pjt.clone();
    }

    public static eyx valueOf(String string) {
        return Enum.valueOf(eyx.class, string);
    }

    private eyx(byte by, String string2) {
        this.pjr = by;
        this.pjs = string2;
    }

    @Override
    public String aXA() {
        return String.valueOf(this.pjr);
    }

    @Override
    public String aXB() {
        return this.pjs;
    }

    @Override
    public String aXC() {
        return null;
    }

    public static eyx eD(byte by) {
        for (eyx eyx2 : eyx.values()) {
            if (eyx2.pjr != by) continue;
            return eyx2;
        }
        return null;
    }

    private static /* synthetic */ eyx[] fil() {
        return new eyx[]{pjm, pjn, pjo, pjp, pjq};
    }

    static {
        pjt = eyx.fil();
    }
}

