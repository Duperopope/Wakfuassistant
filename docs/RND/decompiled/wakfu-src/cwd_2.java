/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from cWd
 */
public class cwd_2
implements adi_1,
fta_2 {
    private static final Logger nRC = Logger.getLogger(cwd_2.class);
    private static final cwd_2 nRD = new cwd_2();
    private static final boolean nRE = false;
    private cph_1 nRF = null;

    public static cwd_2 eVe() {
        return nRD;
    }

    private cwd_2() {
    }

    public cph_1 eVf() {
        return this.nRF;
    }

    @Override
    public void eVg() {
        if (this.nRF != null) {
            this.nRF.eLt();
            this.nRF = null;
        }
    }

    public void a(cph_1 cph_12) {
        this.nRF = cph_12;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        return true;
    }

    public static void a(cph_1 cph_12, ZH zH) {
        if (zH instanceof bdj_2) {
            bdj_2 bdj_22 = (bdj_2)zH;
            bgy bgy2 = bdj_22.dcP();
            if (bgy2 != null) {
                cph_12.a(bgy2, zH);
            } else {
                nRC.error((Object)"Le mobile s\u00e9lectionn\u00e9 n'a pas de CharacterInfo associ\u00e9 !");
            }
        } else if (zH instanceof bcs_0) {
            bcs_0 bcs_02 = (bcs_0)zH;
            ni_1 ni_12 = bcs_02.aVD();
            if (ni_12.isUsable()) {
                cph_12.a((bCA)ni_12, zH);
            }
        } else if (zH instanceof bKV) {
            cph_12.a(((bKV)zH).ecf(), zH);
        } else if (zH instanceof crd_1) {
            cph_12.a((crd_1)((Object)zH), zH);
        }
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fyw_0.gqw().a(this);
            cdv_0.euj().d(this);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.nRF = null;
            cdv_0.euj().e(this);
        }
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    public void d(aIs aIs2, int n, int n2) {
        ArrayList<ZH> arrayList = aIs2.cY(n, n2);
        if (arrayList.isEmpty()) {
            return;
        }
        this.nRF = new cph_1();
        int n3 = arrayList.size();
        for (int i = 0; i < n3; ++i) {
            ZH zH = arrayList.get(i);
            cwd_2.a(this.nRF, zH);
        }
        if (this.nRF.eLs()) {
            this.nRF.dET();
            return;
        }
        this.nRF = null;
    }

    public void a(cpm_1 ... cpm_1Array) {
        if (cpm_1Array.length == 0) {
            return;
        }
        this.nRF = new cph_1();
        this.nRF.a(cpm_1Array, null);
        if (!this.nRF.eLs()) {
            this.nRF = null;
            return;
        }
        this.nRF.dET();
    }
}

