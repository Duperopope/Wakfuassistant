/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from cXT
 */
public class cxt_2
extends crx_2 {
    private static final Logger nXm = Logger.getLogger(cxt_2.class);
    private static final cxt_2 nXn = new cxt_2();
    protected final ArrayList<FreeParticleSystem> nXo = new ArrayList();

    public static cxt_2 eXB() {
        return nXn;
    }

    @Override
    protected void ae(acd_1 acd_12) {
        this.nEp.E(acd_12.getX(), acd_12.getY(), acd_12.bdi());
    }

    @Override
    protected void eNv() {
        if (!this.nXo.isEmpty()) {
            return;
        }
        for (int n : this.eXD()) {
            FreeParticleSystem freeParticleSystem = agY.bzw().sk(n);
            if (freeParticleSystem == null) continue;
            this.nXo.add(freeParticleSystem);
            freeParticleSystem.a(this.nEm);
            agZ.bzy().b(freeParticleSystem);
        }
    }

    @Override
    public void eNy() {
        bfp_1 bfp_12 = (bfp_1)this.iWZ.dOg().fUZ();
        int n = bfp_12.dDR();
        bKT bKT2 = (bKT)bKU.eca().YN(n);
        bqm_0.jbp.b(new brf_1(n, bKT2.ghz()));
        baj_2.hzf.cZr().QE(bfp_12.cms());
        acd_1 acd_12 = this.nEs.eLV();
        if (this.Mm(1)) {
            this.c(this.nEn, true);
        }
        if (this.ah(acd_12)) {
            this.ak(acd_12);
            this.ai(acd_12);
        }
    }

    @Override
    protected void eE(int n, int n2) {
        ((bfp_1)this.iWZ.dOg().fUZ()).a(this.iWZ, n, n2);
    }

    private boolean eXC() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        return evg_1.osQ.a(new eve_2[]{bgt_02});
    }

    @Override
    protected String eNA() {
        if (this.eNw()) {
            return "";
        }
        if (this.nEn == null) {
            return "";
        }
        if (!this.eXC()) {
            ahv_2 ahv_22 = new ahv_2();
            ahv_22.ceC().ih(awx_2.dnJ.bQk());
            ahv_22.c(aum_0.cWf().c("error.playerNotSubscribed", new Object[0]));
            ahv_22.ceD();
            return ahv_22.ceL();
        }
        int n = this.al(this.nEn);
        String string = this.euT();
        return n == -1 ? "X" : n + " %" + (string == null ? "" : string);
    }

    private String euT() {
        List<flv_0> list;
        fkc_0 fkc_02 = cpl_1.eLw();
        if (fkc_02 == null) {
            return null;
        }
        ahv_2 ahv_22 = new ahv_2();
        boolean bl = this.euU();
        if (bl) {
            ahv_22.ceC().ih(awx_2.dnJ.bQk());
            ahv_22.c("\n").c(aum_0.cWf().c("desc.mru.illegalAction", new Object[0]));
            ahv_22.ceD();
        }
        List<flv_0> list2 = this.euV();
        if (fkc_02 == fkc_0.sAp && !list2.isEmpty()) {
            ahv_22.ceH().ceC().ih(awx_2.dnL.bQk());
            ahv_22.ceu().c(aum_0.cWf().c("nation.law.mru.good", new Object[0])).cev();
            ahv_22.ceD();
            cpl_1.a(ahv_22, list2, awx_2.dnL.bQk(), bl);
        }
        if (!(list = this.euX()).isEmpty()) {
            ahv_22.ceH().ceC().ih(awx_2.dnJ.bQk());
            ahv_22.ceu().c(aum_0.cWf().c("nation.law.mru.bad", new Object[0])).cev();
            ahv_22.ceD();
            cpl_1.a(ahv_22, list, awx_2.dnJ.bQk(), bl);
        }
        return ahv_22.bXe() > 0 ? ahv_22.ceL() : null;
    }

    private boolean euU() {
        if (cpl_1.eLw() != fkc_0.sAo) {
            return false;
        }
        List<flv_0> list = this.euX();
        return !list.isEmpty();
    }

    private List<flv_0> euV() {
        return flv_0.bl(this.euZ());
    }

    private List<flv_0> euX() {
        return flv_0.bm(this.euZ());
    }

    private List<flv_0> euZ() {
        bfp_1 bfp_12 = (bfp_1)this.iWZ.dOg().fUZ();
        int n = bfp_12.dDR();
        bKT bKT2 = (bKT)bKU.eca().YN(n);
        if (bKT2 == null) {
            return Collections.emptyList();
        }
        bJr bJr2 = bTj.eno().doD();
        if (bJr2 == null) {
            return Collections.emptyList();
        }
        fjo_0 fjo_02 = bJr2.gfR();
        if (fjo_02 == fjo_0.sys) {
            return Collections.emptyList();
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        ArrayList<boz_2> arrayList = new ArrayList<boz_2>();
        if (bKT2 instanceof bKQ) {
            for (int n2 : ((bKQ)bKT2).cuE()) {
                arrayList.add(boc_2.eht().IE(n2));
            }
        } else {
            arrayList.add(bod_1.ehw().IF(bKT2.ghz()));
        }
        Object object = new ArrayList();
        for (boz_2 boz_22 : arrayList) {
            if (boz_22 == null || !boz_22.ehc() || boz_22.ehd()) continue;
            fmt_0 fmt_02 = new fmt_0(bgt_02);
            int n3 = boz_22.ehe();
            if (n3 == 0) continue;
            fmU fmU2 = n3 < 0 ? fmU.sHz : fmU.sHy;
            fmt_02.a(fmU2);
            ((ArrayList)object).addAll(fmt_02.gdj());
        }
        return object;
    }

    private List<Integer> eXD() {
        if (this.euU()) {
            return Collections.singletonList(800127);
        }
        List<flv_0> list = this.euZ();
        if (!list.isEmpty()) {
            int n = list.get(0).csT() > 0 ? 800191 : 800192;
            return Collections.singletonList(n);
        }
        return Collections.emptyList();
    }

    @Override
    protected int al(acd_1 acd_12) {
        exx_1 exx_12;
        if (this.iWZ == null) {
            return -1;
        }
        bKV bKV2 = bLe.ecw().dQ(acd_12.getX(), acd_12.getY());
        if (bKV2 != null) {
            return -1;
        }
        ajo_0 ajo_02 = (ajo_0)adk.buy().bv(acd_12.getX(), acd_12.getY());
        if (ajo_02 == null) {
            return -1;
        }
        short s = ajo_02.U(acd_12.getX(), acd_12.getY(), acd_12.bdi());
        if (s == 0) {
            return -1;
        }
        if (wa_0.B(acd_12.getX(), acd_12.getY(), acd_12.bdi())) {
            return -1;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (!this.eXC()) {
            return -1;
        }
        bnv_2 bnv_22 = bgt_02.dnw();
        if (bnv_22 != null && !bnv_22.a(bgt_02, acd_12.getX(), acd_12.getY())) {
            return -1;
        }
        bfp_1 bfp_12 = (bfp_1)this.iWZ.dOg().fUZ();
        int n = bfp_12.dDR();
        bKT bKT2 = (bKT)bKU.eca().YN(n);
        if (bKT2 == null) {
            return -1;
        }
        if (bKT2 instanceof bKQ) {
            if (wa_0.A(acd_12.getX(), acd_12.getY(), acd_12.bdi())) {
                return -1;
            }
            if (!this.a((bKQ)bKT2)) {
                return -1;
            }
        }
        if ((exx_12 = exw_1.fPh().Ti(s)) == null) {
            return -1;
        }
        bof_1 bof_12 = boh_1.ehH().ehM().ehG();
        double d2 = fqh_0.b(bgt_02, bKT2, exx_12, bof_12 == null ? wg_0.bMG : bof_12.blE(), bfp_12.cms());
        return (int)(d2 <= 0.0 ? -1L : Math.round(d2 * 100.0));
    }

    private boolean a(bKQ bKQ2) {
        if (caf_2.lFq.eqR()) {
            return true;
        }
        for (int n : bKQ2.cuE()) {
            if (boc_2.eht().IE(n) != null) continue;
            return false;
        }
        return true;
    }

    @Override
    protected void diW() {
        for (FreeParticleSystem freeParticleSystem : this.nXo) {
            freeParticleSystem.bLI();
        }
        this.nXo.clear();
    }
}

