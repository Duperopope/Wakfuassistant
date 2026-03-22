/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TLongHashSet
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import gnu.trove.set.hash.TLongHashSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bdt
 */
public class bdt_2 {
    private static final Logger hLs = Logger.getLogger(bdt_2.class);
    private static final boolean hLt = false;
    final bdj_2 hLu;
    bdk_1 hLv = null;
    private bea_2 hLw;
    private bdx_1 hLx;
    private bec_1 hLy;
    private bee_2 hLz;
    private bdi_2 hLA;
    private bdt_1 hLB;
    private bdp_1 hLC;
    private beq_1 hLD;
    private bew_2 hLE;
    private beo_1 hLF;
    private bdn_1 hLG;
    private aew_0 hLH;
    private bea_1 hLI;
    private bem_1 hLJ;
    private bdf_2 hLK;
    private bey_2 hLL;
    private bek_1 hLM;
    private final TLongHashSet hLN = new TLongHashSet();
    private String hLO;

    public bdt_2(bdj_2 bdj_22) {
        assert (bdj_22 != null);
        this.hLu = bdj_22;
    }

    public bdz_1 ddH() {
        return this.hLx == null ? null : (bdz_1)this.hLx.den();
    }

    public bdj_2 ddI() {
        return this.hLu;
    }

    public void b(ero_0 ero_02, boolean bl) {
        Iterator<Pf> iterator;
        if (ero_02 instanceof erh_0) {
            iterator = ((erh_0)ero_02).fGk().gjA();
        } else {
            if (ero_02.bba() == null) {
                return;
            }
            iterator = ((enk_0)ero_02.bba()).fAz();
        }
        this.a(ero_02, bl, iterator);
    }

    public void a(ero_0 ero_02, boolean bl) {
        enk_0 enk_02 = (enk_0)ero_02.bba();
        if (ero_02.d() == enf_0.qPC.d()) {
            Iterator<Pf> iterator = ((erh_0)ero_02).fGk().gjA();
            this.b(ero_02, bl, iterator);
            return;
        }
        if (enk_02 == null) {
            return;
        }
        if (!this.hLN.contains(ero_02.LV())) {
            return;
        }
        List<Pf> list = enk_02.fAC();
        if (list == null) {
            return;
        }
        int n = list.size();
        for (int i = 0; i < n; ++i) {
            Pf pf = list.get(i);
            if (enk_02.f(pf)) {
                this.a(ero_02, bl, pf);
            }
            if (!enk_02.g(pf)) continue;
            this.b(ero_02, bl, pf);
        }
        this.hLN.remove(ero_02.LV());
    }

    public void c(ero_0 ero_02, boolean bl) {
        if (ero_02 instanceof erh_0) {
            return;
        }
        enk_0 enk_02 = (enk_0)ero_02.bba();
        if (enk_02 == null) {
            return;
        }
        if (this.hLN.contains(ero_02.LV())) {
            return;
        }
        List<Pf> list = enk_02.fAC();
        if (list == null) {
            return;
        }
        int n = list.size();
        for (int i = 0; i < n; ++i) {
            Pf pf = list.get(i);
            if (enk_02.i(pf)) {
                this.a(ero_02, bl, pf);
            }
            if (!enk_02.j(pf)) continue;
            this.b(ero_02, bl, pf);
        }
        this.hLN.add(ero_02.LV());
    }

    private void a(pj_0 pj_02) {
        aba_0 aba_02 = new aba_0();
        aba_02.aF(pj_02.aXK(), pj_02.aXJ());
        aba_02.a(new acb(pj_02.aXG(), pj_02.aXH(), pj_02.aXI()));
        aba_02.eg(pj_02.aXL());
        aam_0 aam_02 = aie_0.cfn().bmC();
        aba_02.b(aam_02.bqL());
        ast_1.bJG().a(aba_02);
    }

    private void a(pe_0 pe_02) {
        cAY.eHc().nQ(pe_02.aYj());
    }

    private void a(enk_0 enk_02, pz_0 pz_02) {
        if (this.hLF == null) {
            this.hLF = new beo_1();
        }
        this.hLF.b(this.hLu, new bep_1(enk_02, pz_02.aPt(), pz_02.aSL(), pz_02.aXw()));
    }

    private void b(enk_0 enk_02, pz_0 pz_02) {
        if (this.hLF == null) {
            return;
        }
        this.hLF.c(this.hLu, new bep_1(enk_02, pz_02.aPt(), pz_02.aSL(), pz_02.aXw()));
        if (this.hLF.dem()) {
            this.hLF = null;
        }
    }

    private void a(String string, enk_0 enk_02) {
        if (this.hLv == null) {
            this.hLv = new bdk_1();
        }
        this.hLv.b(this.hLu, new bdm_1(enk_02, string));
        this.hLu.dcX().u(this.hLu);
        this.hLO = this.hLu.ddu();
        this.hLu.dV("AnimStatique");
        this.hLu.d(new bdu_2(this));
    }

    private void b(String string, enk_0 enk_02) {
        if (this.hLv == null) {
            return;
        }
        bdm_1 bdm_12 = (bdm_1)this.hLv.den();
        bdm_1 bdm_13 = this.hLv.b(new bdm_1(enk_02, string));
        this.hLu.dV(this.hLO);
        if (this.hLu.dZ("AnimTransEffect-Fin")) {
            this.hLu.dT("AnimTransEffect-Fin");
            this.hLu.a(new bdv_2(this, bdm_12, bdm_13));
        } else {
            this.hLu.dT(this.hLO);
            this.hLv.a(bdm_12, bdm_13, this.hLu);
            if (this.hLv.dem()) {
                this.hLv = null;
            }
        }
    }

    public void ddJ() {
        this.hLO = null;
    }

    private void a(float[] fArray, String string, enk_0 enk_02) {
        int n = Anm.fO(string);
        if (this.hLw == null) {
            this.hLw = new bea_2();
        }
        this.hLw.b(this.hLu, new beb_1(enk_02, fArray, n));
    }

    private void b(float[] fArray, String string, enk_0 enk_02) {
        if (this.hLw == null) {
            return;
        }
        int n = Anm.fO(string);
        this.hLw.c(this.hLu, new beb_1(enk_02, fArray, n));
        if (this.hLw.dem()) {
            this.hLw = null;
        }
    }

    private void a(String string, String string2, ero_0 ero_02) {
    }

    private void b(ero_0 ero_02) {
    }

    private void a(int n, int n2, ArrayList<Pw> arrayList, enk_0 enk_02) {
        bee_1 bee_12;
        if (this.hLy == null) {
            this.hLy = new bec_1();
        }
        if (!this.hLy.c(bee_12 = new bee_1(enk_02, arrayList, n, n2))) {
            this.hLy.b(this.hLu, bee_12);
        }
    }

    private void b(int n, int n2, ArrayList<Pw> arrayList, enk_0 enk_02) {
        if (this.hLy == null) {
            return;
        }
        this.hLy.c(this.hLu, new bee_1(enk_02, arrayList, n, n2));
        if (this.hLy.dem()) {
            this.hLy = null;
        }
    }

    private void a(String string, int n, String[] stringArray, enk_0 enk_02) {
        bdz_1 bdz_12;
        if (this.hLx == null) {
            this.hLx = new bdx_1();
        }
        if (!this.hLx.c(bdz_12 = new bdz_1(enk_02, string, n, stringArray))) {
            this.hLx.b(this.hLu, bdz_12);
        }
    }

    private void b(String string, int n, String[] stringArray, enk_0 enk_02) {
        if (this.hLx == null) {
            return;
        }
        this.hLx.c(this.hLu, new bdz_1(enk_02, string, n, stringArray));
        if (this.hLx.dem()) {
            this.hLx = null;
        }
    }

    private void a(boolean bl, String[] stringArray, enk_0 enk_02) {
        if (this.hLz == null) {
            this.hLz = new bee_2();
        }
        this.hLz.b(this.hLu, new bef_2(enk_02, bl, stringArray));
    }

    private void b(boolean bl, String[] stringArray, enk_0 enk_02) {
        if (this.hLz == null) {
            return;
        }
        this.hLz.c(this.hLu, new bef_2(enk_02, bl, stringArray));
        if (this.hLz.dem()) {
            this.hLz = null;
        }
    }

    private void c(String string, enk_0 enk_02) {
        if (this.hLA == null) {
            this.hLA = new bdi_2();
        }
        this.hLA.b(this.hLu, new bdj_1(enk_02, string));
    }

    private void d(String string, enk_0 enk_02) {
        if (this.hLA == null) {
            return;
        }
        this.hLA.c(this.hLu, new bdj_1(enk_02, string));
        if (this.hLA.dem()) {
            this.hLA = null;
        }
    }

    private void e(String string, enk_0 enk_02) {
        if (this.hLB == null) {
            this.hLB = new bdt_1();
        }
        this.hLB.b(this.hLu, new bdv_1(enk_02, string));
    }

    private void f(String string, enk_0 enk_02) {
        if (this.hLB == null) {
            return;
        }
        this.hLB.c(this.hLu, new bdv_1(enk_02, string));
        if (this.hLB.dem()) {
            this.hLB = null;
        }
    }

    private void g(String string, enk_0 enk_02) {
        if (this.hLC == null) {
            this.hLC = new bdp_1();
        }
        this.hLC.b(this.hLu, new bdr_1(enk_02, string));
    }

    private void h(String string, enk_0 enk_02) {
        if (this.hLC == null) {
            return;
        }
        this.hLC.c(this.hLu, new bdr_1(enk_02, string));
        if (this.hLC.dem()) {
            this.hLC = null;
        }
    }

    private void i(String string, enk_0 enk_02) {
        if (this.hLG == null) {
            this.hLG = new bdn_1();
        }
        this.hLG.b(this.hLu, new bdo_1(enk_02, string));
    }

    private void j(String string, enk_0 enk_02) {
        if (this.hLG == null) {
            return;
        }
        this.hLG.c(this.hLu, new bdo_1(enk_02, string));
        if (this.hLG.dem()) {
            this.hLG = null;
        }
    }

    public void a(int n, boolean bl, pg_0 pg_02, boolean bl2, acd_1 acd_12, ero_0 ero_02) {
        this.a(n, bl, pg_02, bl2, acd_12, (enk_0)ero_02.bba());
    }

    public void a(int n, boolean bl, pg_0 pg_02, boolean bl2, acd_1 acd_12, enk_0 enk_02) {
        if (this.hLE == null) {
            this.hLE = new bew_2();
        }
        this.hLE.a(this.hLu, enk_02, n, pg_02, acd_12, bl, bl2);
    }

    private void b(int n, boolean bl, pg_0 pg_02, boolean bl2, acd_1 acd_12, ero_0 ero_02) {
        if (this.hLE == null) {
            return;
        }
        this.hLE.b(this.hLu, (enk_0)ero_02.bba(), n, pg_02, acd_12, bl, bl2);
        if (this.hLE.dem()) {
            this.hLE = null;
        }
    }

    private void fv(boolean bl) {
        if (this.hLE == null) {
            return;
        }
        this.hLE.fv(bl);
    }

    public void ddK() {
        this.fv(true);
    }

    public void ddL() {
        this.fv(false);
    }

    public bew_2 ddM() {
        if (this.hLE == null) {
            this.hLE = new bew_2();
        }
        return this.hLE;
    }

    private void a(ero_0 ero_02, String string, String string2, String string3) {
        bec_2.b(ero_02, string, string2, string3);
    }

    private void e(String string, String string2, String string3) {
        bec_2.f(string, string2, string3);
    }

    private void es(float f2) {
        this.hLu.eq(f2);
    }

    private void et(float f2) {
        this.hLu.er(f2);
    }

    private void a(String string, String string2, enk_0 enk_02) {
        if (this.hLD == null) {
            this.hLD = new beq_1();
        }
        this.hLD.b(this.hLu, new ber_1(enk_02, string, string2));
    }

    private void b(String string, String string2, enk_0 enk_02) {
        if (this.hLD == null) {
            return;
        }
        this.hLD.c(this.hLu, new ber_1(enk_02, string, string2));
        if (this.hLD.dem()) {
            this.hLD = null;
        }
    }

    private void a(aea_0 aea_02, aea_0 aea_03) {
        if (this.hLH != null) {
            this.hLH.j(this.hLu);
        }
        this.hLH = new aew_0(this.hLu.bvD(), aeb_0.bwg().a(aea_02), aeb_0.bwg().a(aea_03));
        this.hLu.a(this.hLH);
    }

    private void ab(String string, String string2) {
        if (this.hLH != null && this.hLu.bvD() == this.hLH) {
            this.hLH.j(this.hLu);
        }
        this.hLH = null;
    }

    private void e(enk_0 enk_02) {
        if (this.hLJ == null) {
            this.hLJ = new bem_1();
        }
        this.hLJ.b(this.hLu, new ben_1(enk_02));
    }

    private void f(enk_0 enk_02) {
        if (this.hLJ == null) {
            return;
        }
        this.hLJ.c(this.hLu, new ben_1(enk_02));
        if (this.hLJ.dem()) {
            this.hLJ = null;
        }
    }

    private void a(enk_0 enk_02, String string, boolean bl) {
        if (this.hLI == null) {
            this.hLI = new bea_1();
        }
        this.hLI.b(this.hLu, new beb_2(enk_02, string, bl));
    }

    private void b(enk_0 enk_02, String string, boolean bl) {
        if (this.hLI == null) {
            return;
        }
        this.hLI.c(this.hLu, new beb_2(enk_02, string, bl));
        if (this.hLI.dem()) {
            this.hLI = null;
        }
    }

    private void a(ero_0 ero_02, boolean bl, Iterator<Pf> iterator) {
        if (!iterator.hasNext() || this.hLN.contains(ero_02.LV())) {
            return;
        }
        while (iterator.hasNext()) {
            Pf pf = iterator.next();
            this.a(ero_02, bl, pf);
        }
        this.hLN.add(ero_02.LV());
    }

    private void a(ero_0 ero_02, boolean bl, Pf pf) {
        if (!bdt_2.a(ero_02, pf)) {
            return;
        }
        switch (pf.aXu()) {
            case bcS: {
                pb_0 pb_02 = (pb_0)pf;
                acd_1 acd_12 = bl ? ero_02.bbe() : null;
                this.a(pb_02.aYb(), pb_02.aYc(), pb_02.aYd(), pb_02.aXw(), acd_12, ero_02);
                break;
            }
            case bdb: {
                pd_0 pd_02 = (pd_0)pf;
                this.a(ero_02, pd_02.aYg(), pd_02.aYh(), pd_02.aYi());
            }
            default: {
                this.a((enk_0)ero_02.bba(), pf);
            }
        }
    }

    private void a(enk_0 enk_02, Pf pf) {
        switch (pf.aXu()) {
            case bcS: {
                pb_0 pb_02 = (pb_0)pf;
                this.a(pb_02.aYb(), pb_02.aYc(), pb_02.aYd(), pb_02.aXw(), null, enk_02);
                break;
            }
            case bcT: {
                pz_0 pz_02 = (pz_0)pf;
                this.a(enk_02, pz_02);
                break;
            }
            case bcU: {
                po_0 po_02 = (po_0)pf;
                this.a(po_02.aXP(), enk_02);
                break;
            }
            case bcV: {
                pj_0 pj_02 = (pj_0)pf;
                this.a(pj_02);
                break;
            }
            case bcR: {
                pe_0 pe_02 = (pe_0)pf;
                this.a(pe_02);
                break;
            }
            case bcX: {
                Ps ps = (Ps)pf;
                this.a(ps.aXT(), ps.aXU(), enk_02);
                break;
            }
            case bcW: {
                Pu pu = (Pu)pf;
                this.a(pu.aXP(), pu.aXY(), pu.aXX(), enk_02);
                break;
            }
            case bdi: {
                Pv pv = (Pv)pf;
                this.a(pv.aXY(), pv.aJe(), pv.aXZ(), enk_02);
                break;
            }
            case bcY: {
                pn_0 pn_02 = (pn_0)pf;
                this.c(pn_02.aXO(), enk_02);
                break;
            }
            case bcZ: {
                pm_0 pm_02 = (pm_0)pf;
                this.e(pm_02.aXN(), enk_02);
                break;
            }
            case bdj: {
                pl_0 pl_02 = (pl_0)pf;
                this.g(pl_02.aXM(), enk_02);
                break;
            }
            case bdd: {
                pk_0 pk_02 = (pk_0)pf;
                this.i(pk_02.getAnimName(), enk_02);
                break;
            }
            case bda: {
                pf_0 pf_02 = (pf_0)pf;
                this.a(pf_02.aYk(), pf_02.aYl(), enk_02);
                break;
            }
            case bdc: {
                pa_0 pa_02 = (pa_0)pf;
                this.a(pa_02.aXE(), pa_02.aXF(), enk_02);
                break;
            }
            case bde: {
                py_0 py_02 = (py_0)pf;
                this.es(py_02.aYa());
                break;
            }
            case bdf: {
                pq_0 pq_02 = (pq_0)pf;
                this.a(aea_0.valueOf(pq_02.aXR()), aea_0.valueOf(pq_02.aXS()));
                break;
            }
            case bdg: {
                pc_0 pc_02 = (pc_0)pf;
                this.a(enk_02, pc_02.aYf(), pc_02.aYe());
                break;
            }
            case bdh: {
                this.e(enk_02);
                break;
            }
            case bdl: {
                pi_0 pi_02 = (pi_0)pf;
                this.a(enk_02, pi_02);
                break;
            }
            case bdk: {
                Pr pr = (Pr)pf;
                this.a(enk_02, pr.getScale());
                break;
            }
            case bdm: {
                pp_0 pp_02 = (pp_0)pf;
                this.a(enk_02, pp_02.aXQ());
            }
        }
    }

    private void b(ero_0 ero_02, boolean bl, Iterator<Pf> iterator) {
        if (!iterator.hasNext() || !this.hLN.contains(ero_02.LV())) {
            return;
        }
        while (iterator.hasNext()) {
            Pf pf = iterator.next();
            this.b(ero_02, bl, pf);
        }
        this.hLN.remove(ero_02.LV());
    }

    private void b(ero_0 ero_02, boolean bl, Pf pf) {
        if (!bdt_2.a(ero_02, pf)) {
            return;
        }
        switch (pf.aXu()) {
            case bcS: {
                pb_0 pb_02 = (pb_0)pf;
                acd_1 acd_12 = bl ? ero_02.bbe() : null;
                this.b(pb_02.aYb(), pb_02.aYc(), pb_02.aYd(), pb_02.aXw(), acd_12, ero_02);
                break;
            }
            default: {
                this.b((enk_0)ero_02.bba(), pf);
            }
        }
    }

    private void b(enk_0 enk_02, Pf pf) {
        switch (pf.aXu()) {
            case bcT: {
                pz_0 pz_02 = (pz_0)pf;
                this.b(enk_02, pz_02);
                break;
            }
            case bcV: {
                break;
            }
            case bcR: {
                break;
            }
            case bcU: {
                po_0 po_02 = (po_0)pf;
                this.b(po_02.aXP(), enk_02);
                break;
            }
            case bcX: {
                Ps ps = (Ps)pf;
                this.b(ps.aXT(), ps.aXU(), enk_02);
                break;
            }
            case bcW: {
                Pu pu = (Pu)pf;
                this.b(pu.aXP(), pu.aXY(), pu.aXX(), enk_02);
                break;
            }
            case bdi: {
                Pv pv = (Pv)pf;
                this.b(pv.aXY(), pv.aJe(), pv.aXZ(), enk_02);
                break;
            }
            case bcY: {
                pn_0 pn_02 = (pn_0)pf;
                this.d(pn_02.aXO(), enk_02);
                break;
            }
            case bcZ: {
                pm_0 pm_02 = (pm_0)pf;
                this.f(pm_02.aXN(), enk_02);
                break;
            }
            case bdj: {
                pl_0 pl_02 = (pl_0)pf;
                this.h(pl_02.aXM(), enk_02);
                break;
            }
            case bdd: {
                pk_0 pk_02 = (pk_0)pf;
                this.j(pk_02.getAnimName(), enk_02);
                break;
            }
            case bda: {
                pf_0 pf_02 = (pf_0)pf;
                this.b(pf_02.aYk(), pf_02.aYl(), enk_02);
                break;
            }
            case bdb: {
                pd_0 pd_02 = (pd_0)pf;
                this.e(pd_02.aYg(), pd_02.aYh(), pd_02.aYi());
                break;
            }
            case bdc: {
                pa_0 pa_02 = (pa_0)pf;
                this.b(pa_02.aXE(), pa_02.aXF(), enk_02);
                break;
            }
            case bde: {
                py_0 py_02 = (py_0)pf;
                this.et(py_02.aYa());
                break;
            }
            case bdf: {
                pq_0 pq_02 = (pq_0)pf;
                this.ab(pq_02.aXR(), pq_02.aXS());
                break;
            }
            case bdg: {
                pc_0 pc_02 = (pc_0)pf;
                this.b(enk_02, pc_02.aYf(), pc_02.aYe());
                break;
            }
            case bdh: {
                this.f(enk_02);
                break;
            }
            case bdl: {
                pi_0 pi_02 = (pi_0)pf;
                this.b(enk_02, pi_02);
                break;
            }
            case bdk: {
                Pr pr = (Pr)pf;
                this.b(enk_02, pr.getScale());
                break;
            }
            case bdm: {
                pp_0 pp_02 = (pp_0)pf;
                this.b(enk_02, pp_02.aXQ());
                break;
            }
        }
    }

    public void e(bgv_2 bgv_22) {
        azl_2<enk_0> azl_22 = bgv_22.bcx();
        for (enk_0 enk_02 : azl_22) {
            if (enk_02.avZ() != enf_0.qUR.d() || !this.c(enk_02.fAx())) continue;
            int n = enk_02.a(0, (short)0, ene_0.qPu);
            fqU fqU2 = fqX.gjM().Zr(n);
            if (fqU2 == null) continue;
            ArrayList<enk_0> arrayList = fqU2.fB((short)0);
            for (enk_0 enk_03 : arrayList) {
                List<Pf> list;
                if (!this.c(enk_03.fAx()) || (list = enk_03.fAC()) == null) continue;
                for (Pf pf : list) {
                    this.a(enk_03, pf);
                }
            }
        }
    }

    public boolean c(ang_2 ang_22) {
        byte by = this.hLu.dcP().aWO();
        if (ang_22 != null && !ang_22.b(this.hLu.dcP(), this.hLu.dcP(), this.hLu.dcP(), null)) {
            return false;
        }
        ang_2 ang_23 = bdt_2.d(ang_22);
        return ang_23 == null || ((egu_0)ang_23).aWO() == by;
    }

    private static ang_2 d(ang_2 ang_22) {
        ang_2 ang_23;
        amx_2 amx_22;
        if (ang_22 == null) {
            return null;
        }
        if (ang_22 instanceof egu_0) {
            return ang_22;
        }
        if (ang_22 instanceof amw_1) {
            amx_22 = (amw_1)ang_22;
            ang_23 = bdt_2.d(((amw_1)amx_22).bDt());
            if (ang_23 != null) {
                return ang_23;
            }
            ang_23 = bdt_2.d(((amw_1)amx_22).bDu());
            if (ang_23 != null) {
                return ang_23;
            }
        }
        if (ang_22 instanceof amv_1) {
            amx_22 = (amv_1)ang_22;
            ang_23 = bdt_2.d(((amv_1)amx_22).bDt());
            if (ang_23 != null) {
                return ang_23;
            }
            ang_23 = bdt_2.d(((amv_1)amx_22).bDu());
            if (ang_23 != null) {
                return ang_23;
            }
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean a(ero_0 ero_02, Pf pf) {
        if (!pf.aXv()) return true;
        long l = ero_02.bbd().Sn();
        aie_0.cfn();
        if (l != aie_0.cfo().cVK().Sn()) return false;
        return true;
    }

    public void e(bdj_2 bdj_22) {
        this.hLN.clear();
        if (this.hLv != null) {
            this.hLv.e(bdj_22);
            this.hLv = null;
        }
        if (this.hLw != null) {
            this.hLw.e(bdj_22);
            this.hLw = null;
        }
        if (this.hLx != null) {
            this.hLx.e(bdj_22);
            this.hLx = null;
        }
        if (this.hLz != null) {
            this.hLz.e(bdj_22);
            this.hLz = null;
        }
        if (this.hLy != null) {
            this.hLy.e(bdj_22);
            this.hLy = null;
        }
        if (this.hLA != null) {
            this.hLA.e(bdj_22);
            this.hLA = null;
        }
        if (this.hLB != null) {
            this.hLB.e(bdj_22);
            this.hLB = null;
        }
        if (this.hLG != null) {
            this.hLG.e(bdj_22);
            this.hLG = null;
        }
        if (this.hLD != null) {
            this.hLD.e(bdj_22);
            this.hLD = null;
        }
        if (this.hLE != null) {
            this.hLE.e(bdj_22);
            this.hLE = null;
        }
        if (this.hLF != null) {
            this.hLF.e(bdj_22);
            this.hLF = null;
        }
        if (this.hLL != null) {
            this.hLL.e(bdj_22);
            this.hLL = null;
        }
        if (this.hLC != null) {
            this.hLC.e(bdj_22);
            this.hLC = null;
        }
    }

    public void f(bdj_2 bdj_22) {
        if (this.hLv != null && !this.hLv.dem()) {
            bdz_1[] bdz_1Array = (bdz_1[])this.hLv.den();
            bdz_1Array.a(bdj_22, false);
        }
        if (this.hLx != null && !this.hLx.dem()) {
            for (bdz_1 bdz_12 : this.hLx.deh()) {
                bdz_12.a(bdj_22, false);
            }
        }
        if (this.hLz != null && !this.hLz.dem()) {
            for (bef_2 bef_22 : this.hLz) {
                bef_22.p(bdj_22);
            }
        }
        if (this.hLy != null && !this.hLy.dem()) {
            this.hLy.dek().a((ZH)bdj_22, false);
        }
    }

    public void g(bdj_2 bdj_22) {
        if (this.hLw != null && !this.hLw.dem()) {
            for (beb_1 beb_12 : this.hLw) {
                beb_12.a(bdj_22, false);
            }
        }
    }

    private void a(enk_0 enk_02, float f2) {
        if (this.hLL == null) {
            this.hLL = new bey_2();
        }
        this.hLL.b(this.hLu, new bez_2(enk_02, f2));
    }

    private void b(enk_0 enk_02, float f2) {
        if (this.hLL == null) {
            return;
        }
        this.hLL.c(this.hLu, new bez_2(enk_02, f2));
        if (this.hLL.dem()) {
            this.hLL = null;
        }
    }

    private void a(enk_0 enk_02, short s) {
        if (this.hLM == null) {
            this.hLM = new bek_1();
        }
        this.hLM.b(this.hLu, new bel_1(enk_02, s));
    }

    private void b(enk_0 enk_02, short s) {
        if (this.hLM == null) {
            return;
        }
        this.hLM.c(this.hLu, new bel_1(enk_02, s));
        if (this.hLM.dem()) {
            this.hLM = null;
        }
    }

    public void aUI() {
        this.a(this.hLE);
        this.a(this.hLF);
        this.a(this.hLL);
        this.a(this.hLM);
    }

    public void ddN() {
        this.a(this.hLB);
    }

    private <T extends beh_2> void a(beg_2<T> beg_22) {
        if (beg_22 == null) {
            return;
        }
        int n = beg_22.aVo();
        while (n-- > 0) {
            T t = beg_22.deo();
            beg_22.a(t, t, this.hLu);
            beg_22.b(this.hLu, t);
        }
    }

    public void h(bdj_2 bdj_22) {
        if (bdj_22 == null) {
            return;
        }
        this.o(bdj_22);
        this.m(bdj_22);
        this.n(bdj_22);
        this.l(bdj_22);
        this.k(bdj_22);
        this.j(bdj_22);
        this.i(bdj_22);
    }

    private void i(bdj_2 bdj_22) {
        bdt_2 bdt_22 = bdj_22.ddm();
        if (bdt_22 == null) {
            return;
        }
        if (this.hLL != null) {
            if (bdt_22.hLL == null) {
                bdt_22.hLL = new bey_2();
            }
            this.hLL.a(bdj_22, bdt_22.hLL);
        }
    }

    public void j(@NotNull bdj_2 bdj_22) {
        bdt_2 bdt_22 = bdj_22.ddm();
        if (bdt_22 == null) {
            return;
        }
        if (this.hLz != null) {
            if (bdt_22.hLz == null) {
                bdt_22.hLz = new bee_2();
            }
            this.hLz.a(bdj_22, bdt_22.hLz);
        }
    }

    public void k(bdj_2 bdj_22) {
        bdt_2 bdt_22 = bdj_22.ddm();
        if (bdt_22 == null) {
            return;
        }
        if (this.hLw != null) {
            if (bdt_22.hLw == null) {
                bdt_22.hLw = new bea_2();
            }
            this.hLw.a(bdj_22, bdt_22.hLw);
        }
    }

    public void l(bdj_2 bdj_22) {
        bdt_2 bdt_22 = bdj_22.ddm();
        if (bdt_22 == null) {
            return;
        }
        if (this.hLF != null) {
            if (bdt_22.hLF == null) {
                bdt_22.hLF = new beo_1();
            }
            this.hLF.a(bdj_22, bdt_22.hLF);
        }
    }

    public void m(bdj_2 bdj_22) {
        bdt_2 bdt_22 = bdj_22.ddm();
        if (bdt_22 == null) {
            return;
        }
        if (this.hLx != null) {
            if (bdt_22.hLx == null) {
                bdt_22.hLx = new bdx_1();
            }
            this.hLx.a(bdj_22, bdt_22.hLx);
        }
    }

    public void n(bdj_2 bdj_22) {
        bdt_2 bdt_22 = bdj_22.ddm();
        if (bdt_22 == null) {
            return;
        }
        if (this.hLy != null) {
            if (bdt_22.hLy == null) {
                bdt_22.hLy = new bec_1();
            }
            this.hLy.a(bdj_22, bdt_22.hLy);
        }
    }

    public void o(bdj_2 bdj_22) {
        bdt_2 bdt_22 = bdj_22.ddm();
        if (bdt_22 == null) {
            return;
        }
        if (this.hLE != null) {
            if (bdt_22.hLE == null) {
                bdt_22.hLE = new bew_2();
            }
            this.hLE.a(bdj_22, bdt_22.hLE, new bdw_2(this));
        }
    }

    private void a(enk_0 enk_02, pi_0 pi_02) {
        if (this.hLK == null) {
            this.hLK = new bdf_2();
        }
        this.hLK.b(this.hLu, new bdg_2(enk_02, pi_02.aXE(), pi_02.aXF()));
    }

    private void b(enk_0 enk_02, pi_0 pi_02) {
        if (this.hLK == null) {
            return;
        }
        this.hLK.c(this.hLu, new bdg_2(enk_02, pi_02.aXE(), pi_02.aXF()));
        if (this.hLK.dem()) {
            this.hLK = null;
        }
    }

    public void ddO() {
        if (this.hLK == null) {
            return;
        }
        this.hLK.e(this.hLu);
        for (bdg_2 bdg_22 : this.hLK) {
            bdg_22.p(this.hLu);
        }
    }

    public void ddP() {
        if (this.hLK == null) {
            return;
        }
        this.hLK.e(this.hLu);
    }

    public boolean ddQ() {
        return this.hLB != null && !this.hLB.dem();
    }

    public boolean ddR() {
        return this.hLG != null && !this.hLG.dem();
    }

    public boolean ddS() {
        return this.hLI != null && !this.hLI.dem();
    }

    public boolean ddT() {
        return this.hLv != null && !this.hLv.dem();
    }

    public boolean ddU() {
        return this.hLL != null && !this.hLL.dem();
    }
}

