/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 */
import java.util.Arrays;
import java.util.Comparator;
import org.apache.commons.lang3.ArrayUtils;

public final class fgj
extends Enum<fgj>
implements aoq_1 {
    public static final /* enum */ fgj siA = new fgj(fgk_0.fWW().gl((byte)0).sK("Qualit\u00e9 commune (gris)").gm((byte)1).Va(1).Vb(16).sL("old"));
    public static final /* enum */ fgj siB = new fgj(fgk_0.fWW().gl((byte)1).sK("Inhabituel (blanc)").gm((byte)2).Va(1).Vb(32).sL("common"));
    public static final /* enum */ fgj siC = new fgj(fgk_0.fWW().gl((byte)2).sK("Qualit\u00e9 rare (vert)").gm((byte)3).Va(8).Vb(53).sL("rare"));
    public static final /* enum */ fgj siD = new fgj(fgk_0.fWW().gl((byte)3).sK("Mythique (orange)").gm((byte)4).Va(32).Vb(80).sL("mythic"));
    public static final /* enum */ fgj siE = new fgj(fgk_0.fWW().gl((byte)4).sK("L\u00e9gendaire (jaune)").gm((byte)5).Va(128).Vb(200).sL("legendary"));
    public static final /* enum */ fgj siF = new fgj(fgk_0.fWW().gl((byte)5).sK("Relique (violet)").gm((byte)8).Va(1024).Vb(1500).sL("relic"));
    public static final /* enum */ fgj siG = new fgj(fgk_0.fWW().gl((byte)6).sK("Souvenir (turquoise)").gm((byte)6).Va(128).Vb(80).sL("souvenir"));
    public static final /* enum */ fgj siH = new fgj(fgk_0.fWW().gl((byte)7).sK("Epique (rose)").gm((byte)7).Va(1024).Vb(400).sL("epic"));
    public static final /* enum */ fgj siI = new fgj(fgk_0.fWW().gl((byte)10).sK("Administrateur (rouge)").gm((byte)10).Va(1).sL("admin"));
    private static final String siJ = "RarityBorder";
    private static final String siK = "RarityHoverBorder";
    private static final String siL = "RarityPressedBorder";
    private static final String siM = "RarityDisabledBorder";
    private static final String siN = "RarityColor";
    private final fgk_0 siO;
    private static final Comparator<fgj> siP;
    private static final Comparator<fgj> siQ;
    private static final /* synthetic */ fgj[] siR;

    public static fgj[] values() {
        return (fgj[])siR.clone();
    }

    public static fgj valueOf(String string) {
        return Enum.valueOf(fgj.class, string);
    }

    private fgj(fgk_0 fgk_02) {
        this.siO = fgk_02;
    }

    public byte aJr() {
        return this.siO.azt;
    }

    @Override
    public String aXA() {
        return String.valueOf(this.siO.azt);
    }

    @Override
    public String aXB() {
        return this.siO.bdo;
    }

    @Override
    public String aXC() {
        return null;
    }

    public byte fWK() {
        return this.siO.siS;
    }

    public int fWL() {
        return this.siO.siT;
    }

    public int fWM() {
        return this.siO.siU;
    }

    public String aKJ() {
        return this.siO.p + siJ;
    }

    public String fWN() {
        return this.siO.p + siJ;
    }

    public String fWO() {
        return this.siO.p + siK;
    }

    public String fWP() {
        return this.siO.p + siL;
    }

    public String fWQ() {
        return this.siO.p + siM;
    }

    public String fWR() {
        return this.siO.p + siN;
    }

    public static Comparator<fgj> fWS() {
        return siP;
    }

    public static Comparator<fgj> fWT() {
        return siQ;
    }

    public fgj fWU() {
        Object[] objectArray = fgj.values();
        Arrays.sort(objectArray, siP);
        int n = ArrayUtils.indexOf((Object[])objectArray, (Object)this);
        return n == 0 ? null : objectArray[n - 1];
    }

    public static fgj eV(short s) {
        for (fgj fgj2 : fgj.values()) {
            if (fgj2.siO.azt != s) continue;
            return fgj2;
        }
        return siA;
    }

    private static /* synthetic */ fgj[] fWV() {
        return new fgj[]{siA, siB, siC, siD, siE, siF, siG, siH, siI};
    }

    static {
        siR = fgj.fWV();
        siP = (fgj2, fgj3) -> {
            if (fgj2 == fgj3) {
                return 0;
            }
            if (fgj2 == null) {
                return 1;
            }
            if (fgj3 == null) {
                return -1;
            }
            return Integer.signum(fgj3.siO.siS - fgj2.siO.siS);
        };
        siQ = (fgj2, fgj3) -> {
            if (fgj2 == fgj3) {
                return 0;
            }
            if (fgj2 == null) {
                return -1;
            }
            if (fgj3 == null) {
                return 1;
            }
            return Integer.signum(fgj2.siO.siS - fgj3.siO.siS);
        };
    }
}

