/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eIO
 */
public final class eio_0
extends Enum<eio_0>
implements aoq_1,
aoy_1 {
    public static final /* enum */ eio_0 qxG = new eio_0(1, eip_0.qxQ, "Ne fait rien, permet juste le lancement d'un Script");
    public static final /* enum */ eio_0 qxH = new eio_0(2, eip_0.qxR, "Permet de forcer le comportement d'un monstre");
    public static final /* enum */ eio_0 qxI = new eio_0(3, eip_0.qxT, "Detrui le monstre");
    public static final /* enum */ eio_0 qxJ = new eio_0(4, eip_0.qxS, "D\u00e9marre un dialogue", true);
    public static final /* enum */ eio_0 qxK = new eio_0(5, eip_0.qxU, "Ouvre l'\u00e9diteur de Havre-monde");
    private final byte qxL;
    private final String qxM;
    private final aox_1 qxN;
    private final boolean qxO;
    private static final /* synthetic */ eio_0[] qxP;

    public static eio_0[] values() {
        return (eio_0[])qxP.clone();
    }

    public static eio_0 valueOf(String string) {
        return Enum.valueOf(eio_0.class, string);
    }

    private eio_0(int n2, aox_1 aox_12, String string2) {
        this(n2, aox_12, string2, false);
    }

    private eio_0(int n2, aox_1 aox_12, String string2, boolean bl) {
        this.qxL = (byte)n2;
        this.qxM = string2;
        this.qxN = aox_12;
        this.qxO = bl;
    }

    @Override
    public String aXA() {
        return String.valueOf(this.qxL);
    }

    @Override
    public String aXB() {
        return this.qxM;
    }

    public static eio_0 PW(int n) {
        for (eio_0 eio_02 : eio_0.values()) {
            if (eio_02.qxL != n) continue;
            return eio_02;
        }
        return null;
    }

    @Override
    public aox_1 bEt() {
        return this.qxN;
    }

    @Override
    public String aXC() {
        return null;
    }

    public byte aJr() {
        return this.qxL;
    }

    public boolean fwO() {
        return this.qxO;
    }

    private static /* synthetic */ eio_0[] fwP() {
        return new eio_0[]{qxG, qxH, qxI, qxJ, qxK};
    }

    static {
        qxP = eio_0.fwP();
    }
}

