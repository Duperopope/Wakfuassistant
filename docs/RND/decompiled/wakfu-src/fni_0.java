/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteIntHashMap
 *  gnu.trove.procedure.TByteIntProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TByteIntHashMap;
import gnu.trove.procedure.TByteIntProcedure;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from fni
 */
public class fni_0 {
    private static final Logger sIb = Logger.getLogger(fni_0.class);
    public static final float sIc = -0.5f;
    public static final float sId = 0.5f;
    private final fjo_0 sIe;
    private final TByteIntHashMap sIf = new TByteIntHashMap();
    private final fnk_0 sIg = new fnk_0();
    private final ArrayList<fnh_0> sIh = new ArrayList();
    public static final int sIi = 0;
    public static final int sIj = 1;
    public static final int sIk = 2;
    public static final int sIl = 3;

    public fni_0(fjo_0 fjo_02) {
        this.sIe = fjo_02;
    }

    public boolean a(fnh_0 fnh_02) {
        return !this.sIh.contains(fnh_02) && this.sIh.add(fnh_02);
    }

    public boolean a(fjm fjm2, fng_0 fng_02) {
        if (fjm2 == null || fng_02 == null) {
            return false;
        }
        fjn_0 fjn_02 = fjm2.ffF();
        fng_0 fng_03 = fjn_02.gaZ();
        int n = this.l(fjm2);
        if (n != 0) {
            switch (n) {
                case 2: {
                    sIb.error((Object)("[Nation] Impossible de prendre en compte l'opinion du joueur " + String.valueOf(fjm2) + " car il n'a pas vot\u00e9"));
                    break;
                }
                case 1: {
                    sIb.error((Object)("[Nation] Impossible de prendre en compte l'opinion du joueur " + String.valueOf(fjm2) + " car un vote est en cours"));
                    break;
                }
                case 3: {
                    sIb.error((Object)("[Nation] Impossible de prendre en compte l'opinion du joueur " + String.valueOf(fjm2) + " car il n'y a pas de gouverneur"));
                }
            }
            return false;
        }
        this.sIf.adjustValue(fng_03.sHZ, -1);
        this.sIf.adjustOrPutValue(fng_02.sHZ, 1, 1);
        fjn_02.a(fng_02);
        this.gea();
        return true;
    }

    public void gdV() {
        this.sIf.clear();
        this.sIf.put(fng_0.sHX.sHZ, this.sIe.gbA().ekZ());
        this.gea();
    }

    public void clear() {
        this.sIf.clear();
    }

    public int b(fng_0 fng_02) {
        return this.sIf.get(fng_02.sHZ);
    }

    public int gdW() {
        return this.sIg.geb();
    }

    public float gdX() {
        return this.sIg.gdX();
    }

    public boolean gdY() {
        return fni_0.ff(this.sIg.gdX());
    }

    public boolean gdZ() {
        return fni_0.fg(this.sIg.gdX());
    }

    public static boolean ff(float f2) {
        return f2 <= -0.5f;
    }

    public static boolean fg(float f2) {
        return f2 >= 0.5f;
    }

    private void gea() {
        float f2 = this.sIg.gdX();
        this.sIg.clear();
        this.sIf.forEachEntry((TByteIntProcedure)this.sIg);
        float f3 = this.sIg.gdX();
        if (f3 != f2) {
            for (int i = 0; i < this.sIh.size(); ++i) {
                this.sIh.get(i).a(this.sIe, f2, f3);
            }
        }
    }

    public int l(fjm fjm2) {
        uw_0 uw_02;
        fjn_0 fjn_02 = fjm2.ffF();
        fng_0 fng_02 = fjn_02.gaZ();
        if (this.sIe.gbx()) {
            return 1;
        }
        ux_0 ux_02 = fjn_02.gaT();
        if (ux_02.g(uw_02 = this.sIe.gbA().gcq())) {
            return 2;
        }
        if (this.sIf.get(fng_02.sHZ) <= 0) {
            return 2;
        }
        if (fjn_02.ems().gbB().gcw() == null) {
            return 3;
        }
        return 0;
    }

    public void a(wq_1 wq_12) {
        this.sIf.forEachEntry((TByteIntProcedure)new fnj_0(wq_12));
    }

    public void b(wq_1 wq_12) {
        int n = wq_12.ahn.size();
        for (int i = 0; i < n; ++i) {
            wr_2 wr_22 = wq_12.ahn.get(i);
            this.sIf.put(wr_22.aho, wr_22.ahp);
        }
        this.gea();
    }
}

