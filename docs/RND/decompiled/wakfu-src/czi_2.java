/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import com.ankamagames.wakfu.client.chat.console.command.AwayCommand;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import org.apache.log4j.Logger;

/*
 * Renamed from cZi
 */
public class czi_2
implements adi_1 {
    private static final boolean oar = false;
    private static final int oas = 100;
    private long oat;
    private static final Logger oau = Logger.getLogger(czi_2.class);
    private static final czi_2 oav = new czi_2();
    private final czn_2 oaw = czn_2.oaQ;
    private int oax;
    private int oay;
    private final List<fmi_2> oaz = new ArrayList<fmi_2>();
    private FreeParticleSystem oaA;

    private czi_2() {
    }

    public static czi_2 eYU() {
        return oav;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        aIs aIs2 = (aIs)aie_0.cfn().bmC();
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        switch (aam_22.d()) {
            case 16346: {
                return this.a((dcm_0)aam_22, aIs2);
            }
            case 16990: {
                dcm_0 dcm_02 = (dcm_0)aam_22;
                return this.a(dcm_02, bgt_02);
            }
            case 19373: {
                if (aue_0.cVJ().c(czj_2.eYW())) {
                    return false;
                }
                if (aue_0.cVJ().c(ctp_2.eQZ())) {
                    return false;
                }
                if (aue_0.cVJ().c(cvp_2.eTJ())) {
                    return false;
                }
                if (aue_0.cVJ().c(cxo_1.eXw())) {
                    return false;
                }
                if (aue_0.cVJ().c(cyi_2.eXN())) {
                    return false;
                }
                if (aue_0.cVJ().c(cut_1.eTd()) && cut_1.eTd().eTj() != but_0.jpq) {
                    return false;
                }
                dcm_0 dcm_03 = (dcm_0)aam_22;
                this.oat = 0L;
                this.a(dcm_03, aue_0.cVJ().cVK());
                czi_2.a(bgt_02, dcm_03);
                return false;
            }
            case 16902: {
                dcm_0 dcm_04 = (dcm_0)aam_22;
                return this.a(dcm_04, aIs2, bgt_02);
            }
        }
        return true;
    }

    private boolean a(dcm_0 dcm_02, aIs aIs2, bgt_0 bgt_02) {
        if (bgt_02.dnj()) {
            return false;
        }
        if (aue_0.cVJ().c(bkq_1.isa)) {
            return true;
        }
        dcm_0 dcm_03 = dcm_02;
        int n = dcm_03.bqM();
        int n2 = dcm_03.bqN();
        for (int i = this.oaz.size() - 1; i >= 0; --i) {
            this.oaz.get(i).run(null);
        }
        if (!bgt_02.dnk()) {
            return false;
        }
        if (dcm_03.fch() && crb_1.nmn.bhl()) {
            crb_1.nmn.b(aIs2, n, n2);
            return false;
        }
        crb_1.nmn.bhk();
        if (dcm_03.fch()) {
            ArrayList<ZH> arrayList = aIs2.cY(n, n2);
            ZH zH = null;
            if (!arrayList.isEmpty()) {
                zH = arrayList.get(0);
            }
            if (zH == null) {
                this.a(bgt_02, n, n2, true);
                return false;
            }
            if (zH instanceof bKV) {
                this.a(bgt_02, dcm_03.bqM(), dcm_03.bqN(), true);
                return false;
            }
            if (zH instanceof crd_1 || zH instanceof bdj_2) {
                bon.dAK().a(bor.iPv, null);
            } else {
                bgt_02.c(zH.bqg(), false, true);
                return false;
            }
        }
        if (bgt_02.dnv()) {
            return false;
        }
        if (dcm_03.fcj() || ((bsg_1)aie_0.cfn().bmH()).a(bsn_1.ljj) && dcm_03.fch()) {
            cwd_2.eVe().d(aIs2, n, n2);
        }
        return false;
    }

    private boolean a(dcm_0 dcm_02, bgt_0 bgt_02) {
        if (dcm_0.fck()) {
            if (bgt_02.dnj() || bgt_02.dnv() || !bgt_02.dnk()) {
                return true;
            }
            long l = System.currentTimeMillis();
            if (l - this.oat > 100L) {
                this.a(bgt_02, dcm_02.bqM(), dcm_02.bqN(), false);
                this.oat = l;
            }
        }
        return false;
    }

    private boolean a(dcm_0 dcm_02, aIs aIs2) {
        ArrayList<ZH> arrayList;
        fes_2 fes_22 = fbj_1.getInstance().getMouseOver();
        if (fes_22 != null && fes_22 != fbj_1.getInstance()) {
            return true;
        }
        int n = dcm_02.bqM();
        int n2 = dcm_02.bqN();
        if (crb_1.nmn.bhl()) {
            crb_1.nmn.a(aIs2, n, n2);
        }
        if ((arrayList = aIs2.cY(n, n2)).isEmpty()) {
            fhn_1.gzT().a(fzo_0.tHq, false);
            return true;
        }
        boolean bl = false;
        block0: for (int i = 0; i < arrayList.size() && !bl; ++i) {
            cpm_1[] cpm_1Array;
            rx_0 rx_02;
            Object object;
            ZH zH = arrayList.get(i);
            fzo_0 fzo_02 = fzo_0.tHQ;
            if (zH instanceof bdj_2) {
                object = (cpm_1[])zH;
                rx_02 = ((bdj_2)object).dcP();
                if (rx_02 == null || (cpm_1Array = ((bgy)rx_02).chR()) == null || cpm_1Array.length <= 0) continue;
                for (int j = 0; j < cpm_1Array.length; ++j) {
                    cpm_1 cpm_13 = cpm_1Array[j];
                    if (cpm_13 == null) continue;
                    cpm_13.aH(rx_02);
                    if (cpm_13 == null || !cpm_13.isUsable() || !cpm_13.bxO()) continue;
                    if (fhn_1.gzT().gzU() != fzo_02) {
                        fhn_1.gzT().a(fzo_02, false);
                    }
                    bl = true;
                    continue block0;
                }
                continue;
            }
            if (zH instanceof crd_1) {
                fhn_1.gzT().a(fzo_02, false);
                bl = true;
                continue;
            }
            if (zH instanceof bKV) {
                object = ((bKV)zH).ecf();
                boolean bl2 = Stream.of(object).anyMatch(cpm_12 -> cpm_12 != null && cpm_12.bxO());
                if (bl2) {
                    fhn_1.gzT().a(fzo_02, false);
                } else {
                    fhn_1.gzT().a(fzo_0.tHq);
                }
                bl = true;
                continue;
            }
            if (!(zH instanceof bcs_0)) continue;
            object = (ng_1)((Object)zH);
            rx_02 = object.aVD();
            if (rx_02 instanceof crd_1) {
                cpm_1Array = ((crd_1)((Object)rx_02)).chR();
                if (((RH)((Object)rx_02)).isUsable() && cpm_1Array != null && cpm_1Array.length != 0) {
                    fhn_1.gzT().a(fzo_02, false);
                } else {
                    fhn_1.gzT().a(fzo_0.tHq, false);
                }
            }
            bl = true;
        }
        if (!bl) {
            fhn_1.gzT().a(fzo_0.tHq, false);
        }
        return false;
    }

    private void a(bgt_0 bgt_02, int n, int n2, boolean bl) {
        bkb_0 bkb_02 = bgt_02.dps();
        if (!bgt_02.dnk() || bkb_02 != null && !bkb_02.dsh()) {
            return;
        }
        if (bgt_02.ddI().bvX() && bgt_02.ddI().bvF() != null) {
            return;
        }
        if (bgt_02.dnv()) {
            cyv_2.eXZ().eYc();
            return;
        }
        this.oax = n;
        this.oay = n2;
        this.e(bgt_02, bl);
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
        aIs aIs2 = (aIs)aie_0.cfn().bmC();
        if (!bl) {
            aIs2.el(true);
            aIs2.eo(true);
            cdv_0.euj().d(this);
        }
        ZC zC = czi_2.eYV();
        this.oaw.eZb();
        this.oaw.a(new agm(zC, aIs2.bqL()));
        cvv_2.nPF.kw(true);
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fhn_1.gzT().bYz();
            cdv_0.euj().e(this);
        }
        this.oaw.eZe();
        cvv_2.nPF.kw(false);
    }

    private void e(bgt_0 bgt_02, boolean bl) {
        AwayCommand.cAY();
        ArrayList<DisplayedScreenElement> arrayList = aie_0.cfn().bmC().a(this.oax, this.oay, bgt_02.getAltitude(), aar.bZk, 0.0f, 0.0f);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        boolean bl2 = !bgt_02.i(ezj_0.psu);
        for (int i = 0; i < arrayList.size(); ++i) {
            DisplayedScreenElement displayedScreenElement = arrayList.get(i);
            int n = displayedScreenElement.bcC();
            int n2 = displayedScreenElement.bcD();
            short s = displayedScreenElement.bcE();
            if (bgt_02.eap().L(n, n2, s)) {
                if (bl) {
                    this.ag(n, n2, s);
                }
                return;
            }
            if (!bgt_02.b(n, n2, s, false, bl2)) continue;
            if (bl) {
                this.ag(n, n2, s);
            }
            return;
        }
    }

    private void ag(int n, int n2, short s) {
        if (this.oaA != null && this.oaA.bnq() && this.oaA.bcC() == n && this.oaA.bcD() == n2 && this.oaA.bcE() == s) {
            return;
        }
        FreeParticleSystem freeParticleSystem = agY.bzw().sk(800185);
        freeParticleSystem.r(n, n2, s);
        agZ.bzy().b(freeParticleSystem);
        this.oaA = freeParticleSystem;
    }

    private static ZC eYV() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        assert (bgt_02 != null) : "Local player null !!! WTF ?";
        return bgt_02.ddI();
    }

    public static anp_2 a(bdf_1 bdf_12, ni_1 ni_12) {
        int n;
        List<acd_1> list = ni_12.aVK();
        if (list.isEmpty()) {
            return bdf_12.a(ni_12.bcC(), ni_12.bcD(), ni_12.bcE(), false, true);
        }
        ArrayList<acd_1> arrayList = new ArrayList<acd_1>();
        ArrayList<Byte> arrayList2 = new ArrayList<Byte>();
        ArrayList<anp_2> arrayList3 = new ArrayList<anp_2>();
        for (acd_1 acd_12 : list) {
            acd_1 acd_13 = bdf_12.bqg();
            byte by = (byte)Math.max(Math.abs(acd_13.getX() - acd_12.getX()), Math.abs(acd_13.getY() - acd_12.getY()));
            for (n = 0; n < arrayList2.size() && (Byte)arrayList2.get(n) < by; ++n) {
            }
            arrayList.add(n, acd_12);
            arrayList2.add(n, by);
        }
        Object object = null;
        for (int i = 0; i < arrayList.size(); ++i) {
            arrayList3.add(i, bdf_12.a((acd_1)arrayList.get(i), false, true));
            if (!((anp_2)arrayList3.get(i)).bDV()) continue;
            if ((double)((anp_2)arrayList3.get(i)).bDU() > 1.6 * (double)((Byte)arrayList2.get(i)).byteValue()) {
                if (object != null && ((anp_2)object).bDU() < ((anp_2)arrayList3.get(i)).bDU()) continue;
                object = (anp_2)arrayList3.get(i);
                continue;
            }
            object = (anp_2)arrayList3.get(i);
            break;
        }
        if (object != null && ni_12.aVP() && !ni_12.beq()) {
            anp_2 anp_22 = new anp_2(((anp_2)object).bDU() + 1);
            for (n = 0; n < ((anp_2)object).bDU(); ++n) {
                anp_22.a(n, ((anp_2)object).tj(n));
            }
            anp_22.a(((anp_2)object).bDU(), ni_12.bcC(), ni_12.bcD(), ni_12.bcE());
            object = anp_22;
        }
        return object;
    }

    public void a(fmi_2 fmi_22) {
        this.oaz.add(fmi_22);
    }

    public void b(fmi_2 fmi_22) {
        this.oaz.remove(fmi_22);
    }

    private static void a(bgt_0 bgt_02, dcm_0 dcm_02) {
        if (!dcm_0.fcm()) {
            return;
        }
        if (bgt_02 == null || !evm_2.b(bgt_02.dpL().cWq(), evn_2.ote)) {
            return;
        }
        aIv aIv2 = ((aIs)aie_0.cfn().bmC()).cZ(dcm_02.bqM(), dcm_02.bqN());
        if (!aIv2.cgA()) {
            return;
        }
        new atq_0(0, aIv2.bcC(), aIv2.bcD()).bGy();
    }
}

