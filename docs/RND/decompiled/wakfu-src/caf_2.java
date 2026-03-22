/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.HashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from caf
 */
public class caf_2
implements fag_0 {
    public static final caf_2 lFq = new caf_2();
    private static final Logger lFr = Logger.getLogger(caf_2.class);
    private cav_2 lFs;
    private cao_1 lFt;
    private byte[] lFu;
    private byte[] lFv;
    private final HashMap<Long, long[]> lFw = new HashMap();
    private faa_0 lFx;
    private static boolean lFy = false;

    private caf_2() {
        caf_2.eqM();
    }

    public void eqL() {
        if (this.lFx == null) {
            return;
        }
        long l = this.lFx.aqZ();
        this.lFs = new cav_2(l);
        this.lFs.eb(this.lFu);
        this.lFs.b(this.lFv, true);
        this.lFt = this.a(this.lFs);
        WX.a(l, this.lFt);
        this.eqN();
    }

    public static void eqM() {
        if (lFy) {
            return;
        }
        try {
            cah_1.lFD.dJ(auc_0.kG("partitionPatchFile"));
            cam_2.lHu.dJ(auc_0.kG("buildingFile"));
        }
        catch (Exception exception) {
            lFr.error((Object)"", (Throwable)exception);
        }
        lFy = true;
    }

    private void bmX() {
        this.lFs = null;
        this.lFx = null;
        this.eqN();
    }

    private void eqN() {
        this.lFu = null;
        this.lFv = null;
    }

    public void eqO() {
        this.bmX();
    }

    public void dZ(byte[] byArray) {
        this.lFu = byArray;
    }

    public void ea(byte[] byArray) {
        this.lFv = byArray;
    }

    public void a(long l, long[] lArray) {
        this.lFw.put(l, lArray);
    }

    public long[] mD(long l) {
        return this.lFw.get(l);
    }

    public faa_0 eqJ() {
        return this.lFx;
    }

    private cao_1 a(cav_2 cav_22) {
        return new cao_1(cav_22);
    }

    public cav_2 eqP() {
        return this.lFs;
    }

    public cao_1 eqQ() {
        return this.lFt;
    }

    public boolean eqR() {
        return this.lFx != null;
    }

    public void a(faa_0 faa_02) {
        this.lFx = faa_02;
    }

    public void eqS() {
        cxb_0 cxb_02 = new cxb_0();
        aue_0.cVJ().etu().d(cxb_02);
    }
}

