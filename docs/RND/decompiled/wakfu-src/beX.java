/*
 * Decompiled with CFR 0.152.
 */
public final class beX
extends Enum<beX>
implements aoq_1 {
    public static final /* enum */ beX hPz = new beX("Texte seul", 1);
    public static final /* enum */ beX hPA = new beX("Image seule", 2);
    public static final /* enum */ beX hPB = new beX("Chapeau Texte+Image puis texte", 3);
    public static final /* enum */ beX hPC = new beX("Texte pui chapeau Texte+Image", 4);
    private final String hPD;
    private final short hPE;
    private static final /* synthetic */ beX[] hPF;

    public static beX[] values() {
        return (beX[])hPF.clone();
    }

    public static beX valueOf(String string) {
        return Enum.valueOf(beX.class, string);
    }

    private beX(String string2, short s) {
        this.hPD = string2;
        this.hPE = s;
    }

    @Override
    public String aXA() {
        return Integer.toString(this.hPE);
    }

    @Override
    public String aXB() {
        return this.hPD;
    }

    @Override
    public String aXC() {
        return null;
    }

    public short aIi() {
        return this.hPE;
    }

    private static /* synthetic */ beX[] dfr() {
        return new beX[]{hPz, hPA, hPB, hPC};
    }

    static {
        hPF = beX.dfr();
    }
}

