/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 */
import java.util.Arrays;
import java.util.Comparator;
import org.apache.commons.lang3.ArrayUtils;

/*
 * Renamed from fru
 */
public final class fru_0
extends Enum<fru_0>
implements aoq_1 {
    public static final /* enum */ fru_0 sYi = new fru_0(frv_0.gke().ZD(0).sW("Qualit\u00e9 commune (blanc)").i(fgj.siB).hC((byte)1));
    public static final /* enum */ fru_0 sYj = new fru_0(frv_0.gke().ZD(1).sW("Qualit\u00e9 rare (vert)").i(fgj.siC).hC((byte)2));
    public static final /* enum */ fru_0 sYk = new fru_0(frv_0.gke().ZD(2).sW("Mythique (orange)").i(fgj.siD).hC((byte)3));
    public static final /* enum */ fru_0 sYl = new fru_0(frv_0.gke().ZD(3).sW("L\u00e9gendaire (jaune)").i(fgj.siE).hC((byte)4));
    public static final /* enum */ fru_0 sYm = new fru_0(frv_0.gke().ZD(4).sW("Epique (rose)").i(fgj.siH).hC((byte)5));
    public static final /* enum */ fru_0 sYn = new fru_0(frv_0.gke().ZD(5).sW("Relique (violet)").i(fgj.siF).hC((byte)6));
    public static final /* enum */ fru_0 sYo = new fru_0(frv_0.gke().ZD(6).sW("Souvenir (turquoise)").i(fgj.siG).hC((byte)7));
    public static final /* enum */ fru_0 sYp = new fru_0(frv_0.gke().ZD(10).sW("Administrateur (rouge)").i(fgj.siI).hC((byte)11));
    private final frv_0 sYq;
    private static final Comparator<fru_0> sYr;
    private static final Comparator<fru_0> sYs;
    private static final /* synthetic */ fru_0[] sYt;

    public static fru_0[] values() {
        return (fru_0[])sYt.clone();
    }

    public static fru_0 valueOf(String string) {
        return Enum.valueOf(fru_0.class, string);
    }

    private fru_0(frv_0 frv_02) {
        this.sYq = frv_02;
    }

    public int d() {
        return this.sYq.o;
    }

    @Override
    public String aXA() {
        return String.valueOf(this.sYq.o);
    }

    @Override
    public String aXB() {
        return this.sYq.bdo;
    }

    @Override
    public String aXC() {
        return null;
    }

    public fgj gkb() {
        return this.sYq.sYu;
    }

    public byte fWK() {
        return this.sYq.siS;
    }

    public static Comparator<fru_0> fWS() {
        return sYr;
    }

    public static Comparator<fru_0> fWT() {
        return sYs;
    }

    public fru_0 gkc() {
        Object[] objectArray = fru_0.values();
        Arrays.sort(objectArray, sYr);
        int n = ArrayUtils.indexOf((Object[])objectArray, (Object)this);
        return n == 0 ? null : objectArray[n - 1];
    }

    public static fru_0 fJ(short s) {
        for (fru_0 fru_02 : fru_0.values()) {
            if (fru_02.sYq.o != s) continue;
            return fru_02;
        }
        return sYi;
    }

    private static /* synthetic */ fru_0[] gkd() {
        return new fru_0[]{sYi, sYj, sYk, sYl, sYm, sYn, sYo, sYp};
    }

    static {
        sYt = fru_0.gkd();
        sYr = (fru_02, fru_03) -> {
            if (fru_02 == fru_03) {
                return 0;
            }
            if (fru_02 == null) {
                return 1;
            }
            if (fru_03 == null) {
                return -1;
            }
            return Integer.signum(fru_03.sYq.siS - fru_02.sYq.siS);
        };
        sYs = (fru_02, fru_03) -> {
            if (fru_02 == fru_03) {
                return 0;
            }
            if (fru_02 == null) {
                return -1;
            }
            if (fru_03 == null) {
                return 1;
            }
            return Integer.signum(fru_02.sYq.siS - fru_03.sYq.siS);
        };
    }
}

