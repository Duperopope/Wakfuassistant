/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;

/*
 * Renamed from frZ
 */
public final class frz_0
extends Enum<frz_0>
implements aoq_1 {
    public static final /* enum */ frz_0 taJ = new frz_0(0, 1, false, "monstre neutre");
    public static final /* enum */ frz_0 taK = new frz_0(100, 3, true, "monstre wakfu");
    public static final /* enum */ frz_0 taL = new frz_0(200, 3, false, "monstre stasis");
    private static final TIntObjectHashMap<frz_0> taM;
    private final int taN;
    private final int taO;
    private final boolean taP;
    private final String taQ;
    private static final /* synthetic */ frz_0[] taR;

    public static frz_0[] values() {
        return (frz_0[])taR.clone();
    }

    public static frz_0 valueOf(String string) {
        return Enum.valueOf(frz_0.class, string);
    }

    private frz_0(int n2, int n3, boolean bl, String string2) {
        this.taN = n2;
        this.taO = n3;
        this.taP = bl;
        this.taQ = string2;
    }

    public int d() {
        return this.taN;
    }

    public int gkG() {
        return this.taO;
    }

    public String getDescription() {
        return this.taQ;
    }

    @Override
    public String aXA() {
        return String.valueOf(this.taN);
    }

    @Override
    public String aXB() {
        return this.taQ;
    }

    @Override
    public String aXC() {
        return "multiplicateur x" + this.taO;
    }

    public boolean gkH() {
        return this.taP;
    }

    public static frz_0 ZJ(int n) {
        return (frz_0)taM.get(n);
    }

    private static /* synthetic */ frz_0[] gkI() {
        return new frz_0[]{taJ, taK, taL};
    }

    static {
        taR = frz_0.gkI();
        taM = new TIntObjectHashMap();
        for (frz_0 frz_02 : frz_0.values()) {
            taM.put(frz_02.d(), (Object)frz_02);
        }
    }
}

