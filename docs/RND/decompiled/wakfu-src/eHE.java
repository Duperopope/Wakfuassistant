/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongByteHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TLongByteHashMap;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class eHE
implements Runnable {
    protected static final Logger qsE = Logger.getLogger(eHE.class);
    public static final eHE qsF = new eHE();
    private static final int qsG = 30000;
    final TLongByteHashMap qsH = new TLongByteHashMap();
    private final azy_2<eHF> qsI = new azy_2();
    private boolean bTz;
    private final ArrayList<eHD> qsJ = new ArrayList();

    private eHE() {
        eHC eHC2 = null;
        for (eHC eHC3 : eHC.values()) {
            if (eHC2 != null) {
                this.qsI.a(eHC2.aJr(), new eHF(this, eHC2, eHC3));
            }
            eHC2 = eHC3;
        }
        int n = this.qsI.bTO();
        for (int i = 0; i < n - 1; ++i) {
            eHF eHF2 = this.qsI.vW(i);
            eHF2.a(this.qsI.vW(i + 1));
        }
    }

    public void start() {
        if (this.bTz) {
            return;
        }
        abg_2.bUP().a((Runnable)this, 30000L);
        this.bTz = true;
    }

    @Override
    public void run() {
        int n = this.qsI.bTO();
        for (int i = 0; i < n; ++i) {
            eHF eHF2 = this.qsI.vW(i);
            eHF2.fvR();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(eHD eHD2) {
        ArrayList<eHD> arrayList = this.qsJ;
        synchronized (arrayList) {
            this.qsJ.add(eHD2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b(eHD eHD2) {
        ArrayList<eHD> arrayList = this.qsJ;
        synchronized (arrayList) {
            this.qsJ.remove(eHD2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(long l, ux_0 ux_02, ua_0 ua_02) {
        Object object;
        uw_0 uw_02;
        ua_0 ua_03;
        if (!this.bTz) {
            this.start();
        }
        uw_0 uw_03 = (ua_03 = eHE.b(ux_02, ua_02, uw_02 = ue_0.bjV().bjm())).aYI() ? uw_02.b(ua_03) : uw_02;
        byte by = this.qsH.get(l);
        eHC eHC2 = eHC.eM(by);
        if (eHC2 != null) {
            qsE.warn((Object)"Le compte est d\u00e9j\u00e0 enregistr\u00e9 !");
            object = this.qsI.aL(by);
            ((eHF)object).pB(l);
        }
        object = eHC.Pw(GC.cw(ua_03.bjS()));
        azy_2<eHF> azy_22 = this.qsI;
        synchronized (azy_22) {
            eHF eHF2 = this.qsI.aL(((eHC)((Object)object)).aJr());
            eHF2.a(new eHG(l, uw_03));
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void pA(long l) {
        azy_2<eHF> azy_22 = this.qsI;
        synchronized (azy_22) {
            byte by = this.qsH.remove(l);
            eHF eHF2 = this.qsI.aL(by);
            if (eHF2 != null) {
                eHF2.pB(l);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void a(long l, eHC eHC2) {
        ArrayList<eHD> arrayList = this.qsJ;
        synchronized (arrayList) {
            for (int i = 0; i < this.qsJ.size(); ++i) {
                eHD eHD2 = this.qsJ.get(i);
                eHD2.a(l, eHC2);
            }
        }
    }

    private static ua_0 b(ux_0 ux_02, ua_0 ua_02, ux_0 ux_03) {
        uz_0 uz_02 = ux_02.l(ux_03);
        uz_0 uz_03 = new uz_0(ua_02);
        uz_03.h(uz_02);
        return uz_03;
    }
}

