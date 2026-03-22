/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from cTP
 */
public class ctp_2
implements cvh_1 {
    private static final Logger nKy = Logger.getLogger(ctp_2.class);
    private static final ctp_2 nKz = new ctp_2();
    public static final String nKA = "destinationPosition";
    final TIntObjectHashMap<bnr_1> nKB = new TIntObjectHashMap();
    private DisplayedScreenElement jUn;
    private bnr_1 nKC;
    private bDh nKD;
    private abi_1 nKE;
    private Runnable nKF;
    private Runnable nKG;
    private Runnable nKH;
    private abi_1 nKI = abi_1.dzm;
    private cvi_2 nKJ;

    public static ctp_2 eQZ() {
        return nKz;
    }

    private ctp_2() {
    }

    @Override
    public void b(bDh bDh2) {
        this.nKD = bDh2;
        this.nKE = bDh2.bcB();
    }

    @Override
    public abi_1 eRa() {
        return this.nKE;
    }

    @Override
    public void x(Runnable runnable) {
        this.nKG = runnable;
    }

    @Override
    public void y(Runnable runnable) {
        this.nKF = runnable;
    }

    @Override
    public void z(Runnable runnable) {
        this.nKH = runnable;
    }

    @Override
    public bnr_1 eRb() {
        return this.nKC;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 16346: {
                DisplayedScreenElement displayedScreenElement;
                dcm_0 dcm_02 = (dcm_0)aam_22;
                ArrayList<DisplayedScreenElement> arrayList = aie_0.cfn().bmC().a(dcm_02.bqM(), dcm_02.bqN(), 0.0f, aar.bZj);
                DisplayedScreenElement displayedScreenElement2 = displayedScreenElement = arrayList != null && !arrayList.isEmpty() ? arrayList.get(0) : null;
                if (displayedScreenElement != this.jUn) {
                    this.j(displayedScreenElement);
                }
                return false;
            }
            case 16902: {
                dcm_0 dcm_03 = (dcm_0)aam_22;
                int n = dcm_03.fcn();
                if (!dcm_03.fch()) {
                    this.nKC = bnr_1.iKl;
                    nKy.info((Object)"Bag-action cancelled");
                    this.nKG.run();
                } else if (this.nKC == bnr_1.iKk) {
                    cAY.eHc().nP(600071L);
                    nKy.info((Object)("Bag-action to " + String.valueOf(this.nKD.dQz().dQG()) + " validated"));
                    this.nKI = this.nKD.bcB();
                    this.nKF.run();
                    if (this.MO(n)) {
                        return false;
                    }
                    this.nKH.run();
                } else {
                    if (this.MO(n)) {
                        return false;
                    }
                    nKy.info((Object)"Bag-action cancelled");
                    this.nKG.run();
                }
                agx_0.bze().eI(nKA);
                this.nKD = null;
                aue_0.cVJ().b(this);
                return false;
            }
            case 17354: {
                return bDr.a(aam_22, this.nKD);
            }
        }
        return true;
    }

    private boolean MO(int n) {
        boolean bl = ccy_2.LR(n);
        return bl && this.eRe() == cvi_2.nQn;
    }

    private boolean j(DisplayedScreenElement displayedScreenElement) {
        if (displayedScreenElement != null) {
            ScreenElement screenElement = displayedScreenElement.brk();
            int n = screenElement.bsu();
            int n2 = screenElement.bsv();
            short s = screenElement.bst();
            this.nKC = (bnr_1)((Object)this.nKB.get(ctp_2.eH(n, n2)));
            this.nKD.dQz().U(n, n2, s);
            agu_0 agu_02 = agx_0.bze().eH(nKA);
            assert (agu_02 != null);
            agu_02.clear();
            agu_02.E(n, n2, s);
            agu_02.setColor(ctp_2.kj(this.nKC == bnr_1.iKk));
        }
        this.jUn = displayedScreenElement;
        return false;
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.nKD.dQz().dQH();
            this.eRc();
        }
        aIs aIs2 = (aIs)aie_0.cfn().bmC();
        aIs2.en(true);
        try {
            agx_0.bze().eF(nKA);
        }
        catch (Exception exception) {
            nKy.error((Object)("Exception raised while pushing frame " + this.getClass().getName()), (Throwable)exception);
        }
    }

    private void eRc() {
        Object object2;
        this.nKB.clear();
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        fno fno2 = bgt_02.dnw().dyU();
        for (Object object2 : fno2) {
            for (int i = ((fnp)object2).gel(); i < ((fnp)object2).gel() + 6; ++i) {
                for (int j = ((fnp)object2).gem(); j < ((fnp)object2).gem() + 6; ++j) {
                    this.a((fnp)object2, i, j);
                }
            }
        }
        List list = bzj_2.eqi().bld();
        object2 = list.iterator();
        while (object2.hasNext()) {
            bze_2 bze_22 = (bze_2)object2.next();
            bze_22.x(new ctq_2(this));
        }
    }

    private void a(fnp fnp2, int n, int n2) {
        if (fnp2 instanceof fnz && !fnp2.e(this.nKD) && ((fnz)fnp2).f(this.nKD)) {
            this.nKB.put(ctp_2.eH(n, n2), (Object)bnr_1.iKo);
            return;
        }
        bKV bKV2 = bLe.ecw().dQ(n, n2);
        if (bKV2 != null) {
            this.nKB.put(ctp_2.eH(n, n2), (Object)bnr_1.iKm);
            return;
        }
        if (!fnp2.b(this.nKD, n, n2)) {
            this.nKB.put(ctp_2.eH(n, n2), (Object)bnr_1.iKn);
            return;
        }
        wy_0 wy_02 = wa_0.aQ(n, n2);
        if (wy_02 == null) {
            return;
        }
        this.nKB.put(ctp_2.eH(n, n2), (Object)(wy_02.aJ(n, n2) ? bnr_1.iKm : bnr_1.iKk));
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        this.nKB.clear();
        if (this.nKD != null) {
            nKy.info((Object)"Bag-action cancelled");
            this.nKG.run();
            this.nKD = null;
        }
        this.jUn = null;
        this.nKC = bnr_1.iKl;
        aIs aIs2 = (aIs)aie_0.cfn().bmC();
        aIs2.en(false);
        this.nKI = abi_1.dzm;
        fhn_1.gzT().a(fzo_0.tHq);
        try {
            this.nKD = null;
            agx_0.bze().eI(nKA);
            agx_0.bze().eG(nKA);
        }
        catch (Exception exception) {
            nKy.error((Object)"Exception during onFrameRemove", (Throwable)exception);
        }
    }

    static int eH(int n, int n2) {
        return GC.t(n, n2);
    }

    @Override
    public abi_1 eRd() {
        return this.nKI;
    }

    @Override
    public void egh() {
        this.nKG.run();
    }

    @Override
    public void reset() {
        this.nKG.run();
        agx_0.bze().eI(nKA);
    }

    @Override
    public void a(cvi_2 cvi_22) {
        this.nKJ = cvi_22;
    }

    @Override
    public cvi_2 eRe() {
        return this.nKJ;
    }

    @Override
    public bDh eRf() {
        return this.nKD;
    }

    public static axb_2 kj(boolean bl) {
        return new fhl_2(bl ? ett_1.oqS : ett_1.oqT);
    }
}

