/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class eIc
extends Enum<eIc>
implements aoq_1 {
    public static final /* enum */ eIc quD = new eIc(0, "Boss ultime");
    public static final /* enum */ eIc quE = new eIc(1, "Donjon 3 joueurs");
    public static final /* enum */ eIc quF = new eIc(2, "Donjon 2 salles");
    public static final /* enum */ eIc quG = new eIc(3, "Donjon 3 salles");
    public static final /* enum */ eIc quH = new eIc(4, "Donjon 4 salles");
    public static final /* enum */ eIc quI = new eIc(5, "Br\u00e8che dimensionnelle");
    public static final /* enum */ eIc quJ = new eIc(6, "Br\u00e8che dimensionnelle ultime");
    private static final Logger quK;
    private final short quL;
    private final String quM;
    private static final /* synthetic */ eIc[] quN;

    public static eIc[] values() {
        return (eIc[])quN.clone();
    }

    public static eIc valueOf(String string) {
        return Enum.valueOf(eIc.class, string);
    }

    private eIc(int n2, String string2) {
        this.quL = (short)n2;
        this.quM = string2;
    }

    public static eIc dA(short s) {
        for (eIc eIc2 : eIc.values()) {
            if (eIc2.quL != s) continue;
            return eIc2;
        }
        quK.warn("Unknown dungeon gameplay type " + s + ", defaulting to " + String.valueOf(quF));
        return quF;
    }

    public short aIi() {
        return this.quL;
    }

    @Override
    public String aXA() {
        return String.valueOf(this.quL);
    }

    @Override
    public String aXB() {
        return this.name();
    }

    @Override
    public String aXC() {
        return this.quM;
    }

    private static /* synthetic */ eIc[] fwk() {
        return new eIc[]{quD, quE, quF, quG, quH, quI, quJ};
    }

    static {
        quN = eIc.fwk();
        quK = LoggerFactory.getLogger(eIc.class);
    }
}

