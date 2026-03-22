/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cPz
 */
public final class cpz_2
extends Enum<cpz_2> {
    public static final /* enum */ cpz_2 nhN = new cpz_2("marchand_artefacts", fgz_0.sjJ);
    public static final /* enum */ cpz_2 nhO = new cpz_2("marchand_combattant", fgz_0.sjI);
    public static final /* enum */ cpz_2 nhP = new cpz_2("marchand_crafts", fgz_0.sjH);
    public static final /* enum */ cpz_2 nhQ = new cpz_2("marchand_garde_manger", fgz_0.sjG);
    private final fgz_0 nhR;
    private final String nhS;
    private static final /* synthetic */ cpz_2[] nhT;

    public static cpz_2[] values() {
        return (cpz_2[])nhT.clone();
    }

    public static cpz_2 valueOf(String string) {
        return Enum.valueOf(cpz_2.class, string);
    }

    private cpz_2(String string2, fgz_0 fgz_02) {
        this.nhS = string2;
        this.nhR = fgz_02;
    }

    public fgz_0 eLp() {
        return this.nhR;
    }

    public String aLM() {
        return this.nhS;
    }

    private static /* synthetic */ cpz_2[] eLq() {
        return new cpz_2[]{nhN, nhO, nhP, nhQ};
    }

    static {
        nhT = cpz_2.eLq();
    }
}

