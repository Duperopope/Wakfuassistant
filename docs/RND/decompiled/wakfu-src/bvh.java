/*
 * Decompiled with CFR 0.152.
 */
public class bvh
implements aeh_2 {
    public static final String jrE = "name";
    public static final String jrF = "blazon";
    public static final String jrG = "rank";
    public static final String jrH = "level";
    public static final String jrI = "guildPoints";
    public static final String jrJ = "conquestPoints";
    public static final String jrK = "description";
    public static final String[] jrL = new String[]{"name", "blazon", "rank", "level", "guildPoints", "conquestPoints", "description"};
    private final buV jrM;
    private final int jrN;

    public bvh(buV buV2, int n) {
        this.jrM = buV2;
        this.jrN = n;
    }

    @Override
    public String[] bxk() {
        return jrL;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(jrE)) {
            return this.jrM.getName();
        }
        if (string.equals(jrF)) {
            ezb ezb2 = new ezb(this.jrM.Yc());
            if (ezb2 == null) {
                return null;
            }
            buJ buJ2 = new buJ(ezb2.fmd(), ezb2.fmf(), buH.dJn().Fz(ezb2.fmg()), buH.dJn().Fz(ezb2.fme()));
            awk_1 awk_12 = buK.dJw().a(buJ2);
            buJ2.bmX();
            return awk_12;
        }
        if (string.equals(jrG)) {
            return this.jrN;
        }
        if (string.equals(jrH)) {
            return this.jrM.cmL();
        }
        if (string.equals(jrI)) {
            return this.jrM.Xk();
        }
        if (string.equals(jrJ)) {
            return this.jrM.dJM();
        }
        if (string.equals(jrK)) {
            String string2 = this.jrM.getDescription();
            return string2.length() == 0 ? null : string2;
        }
        return null;
    }
}

