/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cXO
 */
public class cxo_1
implements adi_1 {
    private static final Logger nWZ = Logger.getLogger(cxo_1.class);
    private static final String nXa = "ranchAdditionalHighlightLayer";
    private static final cxo_1 nXb = new cxo_1();
    private boolean nXc = false;
    @NotNull
    private bke_0 nXd = bke_0.kps;
    private final Set<VN> nXe = new HashSet<VN>();
    @NotNull
    private VN nXf = VN.bKq;
    @NotNull
    private VN nXg = VN.bKq;
    private abi_1 bmk = abi_1.dzm;
    private boolean nXh;
    @Nullable
    private cxr_2 nXi;
    @Nullable
    private cxq_2 nXj;

    public static cxo_1 eXw() {
        return nXb;
    }

    private cxo_1() {
    }

    public boolean eXx() {
        return this.nXc;
    }

    public void a(@NotNull bke_0 bke_02) {
        this.nXd = bke_02;
    }

    public void a(@NotNull cav_1 cav_12, @NotNull abi_1 abi_12) {
        this.nXe.clear();
        aci_1 aci_12 = ((cal_2)cav_12.fRg()).gz(0, 0);
        this.nXf = new VN((int)aci_12.bWL(), (int)aci_12.bWM());
        for (int i = 0; i < aci_12.bWJ(); ++i) {
            for (int j = 0; j < aci_12.bWK(); ++j) {
                this.nXe.add(new VN(i, j));
            }
        }
        this.bmk = abi_12;
    }

    public static void b(@NotNull cav_1 cav_12) {
        aci_1 aci_12 = ((cal_2)cav_12.fRg()).gz(cav_12.fRc(), cav_12.fRd());
        agu_0 agu_02 = agx_0.bze().eF(nXa);
        aci_12.a(agu_02::ap);
        agu_02.setColor(new fhl_2(ett_1.oqU));
    }

    public void a(@Nullable cxr_2 cxr_22) {
        this.nXi = cxr_22;
    }

    public void eQ(int n, int n2) {
        if (this.nXi != null) {
            this.nXi.run(n, n2);
        }
    }

    public void a(@Nullable cxq_2 cxq_22) {
        this.nXj = cxq_22;
    }

    public void kR(boolean bl) {
        this.q(false, bl);
    }

    public void q(boolean bl, boolean bl2) {
        if (this.nXj != null) {
            this.nXj.run(bl);
        }
        agx_0.bze().eI("destinationPosition");
        this.nXe.clear();
        if (bl2) {
            aue_0.cVJ().b(this);
        }
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 16346: {
                dcm_0 dcm_02 = (dcm_0)aam_22;
                this.eR(dcm_02.bqM(), dcm_02.bqN());
                return false;
            }
            case 16902: {
                dcm_0 dcm_03 = (dcm_0)aam_22;
                int n = dcm_03.fcn();
                if (dcm_03.fcj()) {
                    this.nXh = false;
                    this.kR(true);
                } else if (dcm_03.fch() && this.nXh) {
                    cAY.eHc().nP(600071L);
                    this.eQ(this.nXg.bkP(), this.nXg.bkQ());
                    if (!this.MO(n)) {
                        this.q(true, true);
                    }
                }
                return false;
            }
            case 17354: {
                if ((this.nXd == bke_0.kps || this.nXd == bke_0.kpv) && bDr.i(aam_22)) {
                    abi_1 abi_12 = cap_1.erG().b(this.bmk, 1);
                    if (abi_12 == this.bmk) {
                        return false;
                    }
                    cav_1 cav_12 = cap_1.erG().l(abi_12);
                    if (cav_12 == null) {
                        return false;
                    }
                    this.a(cav_12, abi_12);
                    this.e(this.nXg);
                    cap_1.erG().p(this.nXg.bkP(), this.nXg.bkQ(), this.nXh);
                    return false;
                }
                return true;
            }
        }
        return true;
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        aIs aIs2 = (aIs)aie_0.cfn().bmC();
        aIs2.en(true);
        agx_0.bze().eF("destinationPosition");
        this.eR(aIs2.bqM(), aIs2.bqN());
        this.nXc = true;
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        this.nXc = false;
        this.nXe.clear();
        this.nXg = VN.bKq;
        this.nXf = VN.bKq;
        this.nXh = false;
        this.bmk = abi_1.dzm;
        this.eXy();
        aIs aIs2 = (aIs)aie_0.cfn().bmC();
        aIs2.en(false);
        fhn_1.gzT().a(fzo_0.tHq);
        agx_0.bze().eI("destinationPosition");
        agx_0.bze().eG("destinationPosition");
        agx_0.bze().eI(nXa);
        agx_0.bze().eG(nXa);
    }

    public void eXy() {
        this.nXi = null;
        this.nXj = null;
    }

    private boolean MO(int n) {
        return switch (this.nXd) {
            default -> throw new MatchException(null, null);
            case bke_0.kps -> ccy_2.LR(n);
            case bke_0.kpt -> true;
            case bke_0.kpu, bke_0.kpv -> false;
        };
    }

    public boolean b(@NotNull bke_0 bke_02) {
        return this.nXc && this.nXd == bke_02;
    }

    private void eR(int n, int n2) {
        ArrayList<DisplayedScreenElement> arrayList = aie_0.cfn().bmC().a(n, n2, 0.0f, aar.bZj);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        DisplayedScreenElement displayedScreenElement = arrayList.get(0);
        VN vN = new VN(displayedScreenElement.bcC() - this.nXf.bkP(), displayedScreenElement.bcD() - this.nXf.bkQ());
        if (!this.nXg.equals(vN)) {
            this.d(vN);
            this.nXg = vN;
        }
    }

    private void d(VN vN) {
        switch (this.nXd) {
            case kps: 
            case kpv: {
                this.e(vN);
                cap_1.erG().p(vN.bkP(), vN.bkQ(), this.nXh);
                break;
            }
            case kpt: 
            case kpu: {
                Optional<ftv_0> optional = cap_1.erG().en(vN.bkP(), vN.bkQ());
                if (optional.isPresent() && cap_1.erG().b(optional.get())) {
                    axb_2 axb_22 = ctp_2.kj(this.nXd == bke_0.kpu);
                    cxo_1.a(optional.get(), axb_22);
                    cap_1.erG().c(optional.get());
                    this.nXh = true;
                    break;
                }
                cxo_1.eXA();
                cap_1.erG().erL();
                this.nXh = false;
            }
        }
    }

    public void eXz() {
        this.d(this.nXg);
    }

    private void e(@NotNull VN vN) {
        agu_0 agu_02 = cxo_1.eXA();
        this.nXh = !cap_1.erG().em(vN.bkP(), vN.bkQ());
        for (VN vN2 : this.nXe) {
            int n = vN.bkP() + vN2.bkP();
            int n2 = vN.bkQ() + vN2.bkQ();
            this.nXh = this.nXh && cxo_1.eS(n, n2);
            agu_02.ap(n, n2);
        }
        agu_02.setColor(ctp_2.kj(this.nXh));
    }

    private static boolean eS(int n, int n2) {
        int n3 = vz_0.qd(n);
        int n4 = vz_0.qe(n2);
        return cap_1.erG().el(n3, n4);
    }

    private static void a(@NotNull ftv_0 ftv_02, @NotNull axb_2 axb_22) {
        agu_0 agu_02 = cxo_1.eXA();
        ftr_0.gmc().a(cam_2.lHu, ftv_02).ifPresent(cal_22 -> cal_22.gz(ftv_02.bkP(), ftv_02.bkQ()).a(agu_02::ap));
        agu_02.setColor(axb_22);
    }

    @NotNull
    private static agu_0 eXA() {
        agu_0 agu_02 = agx_0.bze().eH("destinationPosition");
        agu_02.clear();
        return agu_02;
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }
}

