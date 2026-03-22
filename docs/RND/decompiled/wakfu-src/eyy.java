/*
 * Decompiled with CFR 0.152.
 */
public final class eyy
extends Enum<eyy>
implements aoq_1 {
    public static final /* enum */ eyy pju = new eyy(0, "Aucun");
    public static final /* enum */ eyy pjv = new eyy(1, "Mob juv\u00e9nile");
    public static final /* enum */ eyy pjw = new eyy(2, "Mob adulte (type1)");
    public static final /* enum */ eyy pjx = new eyy(3, "Mob adulte (type2)");
    public static final /* enum */ eyy pjy = new eyy(4, "Mob chef de groupe");
    public static final /* enum */ eyy pjz = new eyy(5, "Mob chef de famille");
    public static final /* enum */ eyy pjA = new eyy(6, "Extra mob");
    public static final /* enum */ eyy pjB = new eyy(7, "Mob corrompu");
    public static final /* enum */ eyy pjC = new eyy(8, "Mob petit dieu");
    public static final /* enum */ eyy pjD = new eyy(9, "Mob mort-vivant");
    public static final /* enum */ eyy pjE = new eyy(10, "Mob de challenge");
    private final byte pjF;
    private final String pjG;
    private static final /* synthetic */ eyy[] pjH;

    public static eyy[] values() {
        return (eyy[])pjH.clone();
    }

    public static eyy valueOf(String string) {
        return Enum.valueOf(eyy.class, string);
    }

    private eyy(int n2, String string2) {
        this.pjF = (byte)n2;
        this.pjG = string2;
    }

    @Override
    public String aXA() {
        return String.valueOf(this.pjF);
    }

    @Override
    public String aXB() {
        return this.pjG;
    }

    public byte aJr() {
        return this.pjF;
    }

    public static eyy eE(byte by) {
        for (eyy eyy2 : eyy.values()) {
            if (eyy2.aJr() != by) continue;
            return eyy2;
        }
        return null;
    }

    @Override
    public String aXC() {
        return null;
    }

    private static /* synthetic */ eyy[] fim() {
        return new eyy[]{pju, pjv, pjw, pjx, pjy, pjz, pjA, pjB, pjC, pjD, pjE};
    }

    static {
        pjH = eyy.fim();
    }
}

