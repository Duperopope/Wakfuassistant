/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public final class CZ
extends Enum<CZ> {
    public static final /* enum */ CZ axH = new CZ(es_1.azj, new Da());
    public static final /* enum */ CZ axI = new CZ(es_1.azk, new Dc());
    public static final /* enum */ CZ axJ = new CZ(es_1.azl, new Dd());
    public static final /* enum */ CZ axK = new CZ(es_1.azm, new De());
    public static final /* enum */ CZ axL = new CZ(es_1.azn, new Df());
    public static final /* enum */ CZ axM = new CZ(es_1.azo, new Dg());
    public static final /* enum */ CZ axN = new CZ(es_1.azp, new Dh());
    public static final /* enum */ CZ axO = new CZ(es_1.azq, new Di());
    public static final /* enum */ CZ axP = new CZ(es_1.azr, new Dj());
    public static final /* enum */ CZ axQ = new CZ(es_1.azs, new Db());
    private final es_1 axR;
    private final CY<? extends CX> axS;
    private static final /* synthetic */ CZ[] axT;

    public static CZ[] values() {
        return (CZ[])axT.clone();
    }

    public static CZ valueOf(String string) {
        return Enum.valueOf(CZ.class, string);
    }

    private CZ(es_1 es_12, CY<? extends CX> cY) {
        this.axR = es_12;
        this.axS = cY;
    }

    public es_1 aIv() {
        return this.axR;
    }

    public CY<? extends CX> aIw() {
        return this.axS;
    }

    public static Optional<CZ> a(es_1 es_12) {
        CZ[] cZArray;
        for (CZ cZ : cZArray = CZ.values()) {
            if (cZ.axR != es_12) continue;
            return Optional.of(cZ);
        }
        return Optional.empty();
    }

    private static /* synthetic */ CZ[] aIx() {
        return new CZ[]{axH, axI, axJ, axK, axL, axM, axN, axO, axP, axQ};
    }

    static {
        axT = CZ.aIx();
    }
}

