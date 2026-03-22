/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cVp
 */
public class cvp_2
implements adi_1,
cvh_1 {
    private static final Logger nOZ = Logger.getLogger(cvp_2.class);
    private static final cvp_2 nPa = new cvp_2();
    private abi_1 nKI = abi_1.dzm;
    private cvi_2 nKJ;
    final aao_1 nPb = new aao_1();
    private DisplayedScreenElement jUn;
    private bnr_1 nKC;
    private bDh nKD;
    private abi_1 nPc;
    private Runnable nKF;
    private Runnable nKG;
    private Runnable nKH;

    public static cvp_2 eTJ() {
        return nPa;
    }

    private cvp_2() {
    }

    @Override
    public void b(bDh bDh2) {
        this.nKD = bDh2;
        this.nPc = bDh2.bcB();
    }

    @Override
    public abi_1 eRa() {
        return this.nPc;
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
            case 16346: 
            case 16990: {
                dcm_0 dcm_02 = (dcm_0)aam_22;
                DisplayedScreenElement displayedScreenElement = cvp_2.eN(dcm_02.bqM(), dcm_02.bqN());
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
                    nOZ.info((Object)"Bag-action cancelled");
                    this.nKG.run();
                } else if (this.nKC == bnr_1.iKk) {
                    cAY.eHc().nP(600071L);
                    nOZ.info((Object)("Bag-action to " + String.valueOf(this.nKD.dQz().dQG()) + " validated"));
                    this.nPb.fW(cvp_2.af(this.jUn.bcC(), this.jUn.bcD(), this.jUn.bcE()));
                    this.nKI = this.nKD.bcB();
                    this.nKF.run();
                    if (this.Nf(n)) {
                        return false;
                    }
                    this.nKH.run();
                } else {
                    nOZ.info((Object)"Bag-action cancelled");
                    this.nKG.run();
                }
                agx_0.bze().eI("destinationPosition");
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

    private boolean j(DisplayedScreenElement displayedScreenElement) {
        if (displayedScreenElement != null) {
            ScreenElement screenElement = displayedScreenElement.brk();
            int n = screenElement.bsu();
            int n2 = screenElement.bsv();
            short s = wa_0.y(n, n2, screenElement.bst());
            short s2 = aue_0.cVJ().cVK().bcE();
            boolean bl = !this.ae(n, n2, s);
            bnr_1 bnr_12 = this.nKC = bl ? bnr_1.iKm : bnr_1.iKk;
            if (bl && Math.abs(screenElement.bst() - s2) > 6) {
                this.eTK();
                this.jUn = displayedScreenElement;
                return true;
            }
            if (this.nKD != null) {
                this.nKD.dQz().U(n, n2, s);
            }
            agu_0 agu_02 = agx_0.bze().eH("destinationPosition");
            assert (agu_02 != null);
            agu_02.clear();
            agu_02.E(n, n2, s);
            agu_02.setColor(ctp_2.kj(!bl));
        } else {
            this.eTK();
        }
        this.jUn = displayedScreenElement;
        return false;
    }

    private void eTK() {
        this.nKC = bnr_1.iKm;
        this.kr(false);
        agx_0.bze().eI("destinationPosition");
    }

    private void kr(boolean bl) {
        if (this.nKD == null) {
            return;
        }
        for (ng_1 ng_12 : this.nKD.aVG()) {
            ((bcs_0)ng_12).setVisible(bl);
        }
    }

    private boolean ae(int n, int n2, short s) {
        if (s == Short.MIN_VALUE) {
            return false;
        }
        if (bsU.dHk().dA(n, n2)) {
            return false;
        }
        return !this.nPb.gR(cvp_2.af(n, n2, s));
    }

    @Nullable
    private static DisplayedScreenElement eN(int n, int n2) {
        ArrayList<DisplayedScreenElement> arrayList = aie_0.cfn().bmC().a(n, n2, 0.0f, aar.bZl);
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return arrayList.get(0);
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
            if (this.nKD != null) {
                this.nKD.dQz().dQH();
            }
            this.eTL();
            aIs aIs2 = (aIs)aie_0.cfn().bmC();
            aIs2.en(true);
        }
        try {
            agx_0.bze().eF("destinationPosition");
        }
        catch (Exception exception) {
            nOZ.error((Object)("Exception raised while pushing frame " + this.getClass().getName()), (Throwable)exception);
        }
    }

    private void eTL() {
        this.nPb.clear();
        List list = bzj_2.eqi().bld();
        for (bze_2 bze_22 : list) {
            int n = bze_22.getX() * 18;
            int n2 = bze_22.getY() * 18;
            for (int i = n; i < n + bze_22.getWidth(); ++i) {
                for (int j = n2; j < n2 + bze_22.getHeight(); ++j) {
                    bKV bKV2 = bLe.ecw().dQ(i, j);
                    if (bKV2 != null) {
                        this.nPb.fW(cvp_2.af(i, j, bKV2.bcE()));
                        continue;
                    }
                    wy_0 wy_02 = wa_0.aQ(i, j);
                    if (wy_02 == null) continue;
                    for (short s : wa_0.aT(i, j)) {
                        if (s == Short.MIN_VALUE || !wy_02.u(i, j, s) && !wa_0.D(i, j, s)) continue;
                        this.nPb.fW(cvp_2.af(i, j, s));
                    }
                    bze_22.x(new cvq_1(this));
                }
            }
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        this.nPb.clear();
        if (this.nKD != null) {
            nOZ.info((Object)"Bag-action cancelled");
            this.nKG.run();
            this.nKD = null;
        }
        this.jUn = null;
        this.nKC = bnr_1.iKl;
        aIs aIs2 = (aIs)aie_0.cfn().bmC();
        aIs2.en(false);
        try {
            this.nKD = null;
            agx_0.bze().eI("destinationPosition");
            agx_0.bze().eG("destinationPosition");
        }
        catch (Exception exception) {
            nOZ.error((Object)"Exception during onFrameRemove", (Throwable)exception);
        }
    }

    static long af(int n, int n2, short s) {
        return anf_2.L(n, n2, s);
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
        agx_0.bze().eI("destinationPosition");
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

    private boolean Nf(int n) {
        boolean bl = ccy_2.LR(n);
        return bl && this.eRe() == cvi_2.nQn;
    }
}

