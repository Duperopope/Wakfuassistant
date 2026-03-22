/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eRf
 */
public class erf_0
extends ero_0 {
    private static final aox_1 rha = new enz_0(new eny_0("Decurse d'etat", new enx_0("id de l'\u00e9tat \u00e0 retirer", eNA.qYB)), new eny_0("Decurse d'etat", new enx_0("id de l'\u00e9tat \u00e0 retirer", eNA.qYB), new enx_0("Niveau de l'etat a retirer", eNA.qYD)));
    protected int rhb = 0;
    private boolean rhc = false;

    @Override
    public aox_1 bEt() {
        return rha;
    }

    public erf_0() {
        this.bby();
    }

    public static erf_0 a(qm_0<enk_0> qm_02, int n, qu_0 qu_02) {
        assert (qu_02 != null) : "No target defined for StateDecurse effect";
        erf_0 erf_02 = new erf_0();
        erf_02.o = enf_0.qUT.d();
        erf_02.bgM = ((ero_0)enf_0.qUT.bkx()).baZ();
        erf_02.bby();
        erf_02.bgF = qu_02;
        erf_02.aQL = n;
        erf_02.bgO = -1;
        erf_02.bgJ = qm_02;
        return erf_02;
    }

    public erf_0 fGg() {
        return new erf_0();
    }

    @Override
    public void bby() {
        super.bby();
        this.oC(2225);
    }

    @Override
    protected void c(QD qD, boolean bl) {
        ArrayList<erh_0> arrayList = new ArrayList<erh_0>();
        if (this.bgF == null) {
            bgA.warn((Object)"[Effect] Impossible d'appliquer un desenvoutement car la cible est null");
            this.mk(true);
            return;
        }
        QE qE = this.bgF.baz();
        if (qE == null) {
            return;
        }
        int n = 0;
        n = this.a(arrayList, qE, n);
        if (arrayList.isEmpty()) {
            this.fHg();
            return;
        }
        int n2 = 0;
        int n3 = 0;
        for (erh_0 erh_02 : arrayList) {
            if (erh_02.fGu()) {
                ++n2;
            } else {
                ++n3;
            }
            ((ers_0)qE).e(erh_02, true);
        }
        this.d(qD, bl);
        if (this.bbt() && this.rhc && n > 0) {
            this.a(n, qD, n2 > n3);
        }
    }

    protected int a(List<erh_0> list, QE qE, int n) {
        for (QD qD : qE) {
            erh_0 erh_02;
            fqU fqU2;
            if (!(qD instanceof erh_0) || (fqU2 = (erh_02 = (erh_0)qD).fGk()).gjy() != this.aQL || fqU2.gjC() && !eor_0.rbd.contains((int)fqU2.gjy())) continue;
            list.add(erh_02);
            n = fqU2.cmL() - this.rhb;
        }
        return n;
    }

    private void a(int n, QD qD, boolean bl) {
        int n2 = fqU.ag((short)this.aQL, (short)n);
        erh_0 erh_02 = erh_0.a(this.bgJ, this.bgE, (eNl)this.bgD, n2);
        if (erh_02 == null) {
            bgA.error((Object)("Etat inconnu id " + this.aQL + ", level " + n + ", effet correspondant : " + String.valueOf(this.bgC != null ? Integer.valueOf(((enk_0)this.bgC).aZH()) : "null")));
            return;
        }
        enq_0 enq_02 = enq_0.a(true, false, null);
        erh_02.a(enq_02);
        erh_02.a((eNl)this.bgD);
        erh_02.b(this.fCr());
        erh_02.c(this.aZL());
        erh_02.g(qD);
        erh_02.mg(bl);
        erh_02.g(this.bgF);
        erh_02.aZp();
    }

    private enk_0 fCr() {
        if (this.bba() == null) {
            return eng_0.fBz();
        }
        if (((enk_0)this.bba()).fAu()) {
            if (((enk_0)this.bba()).beB()) {
                return enr_0.fBK();
            }
            return ens_0.fBL();
        }
        if (((enk_0)this.bba()).beB()) {
            return eNQ.fBJ();
        }
        return eng_0.fBz();
    }

    @Override
    public void E(QD qD) {
        short s = this.fHf();
        if (this.bgC == null) {
            return;
        }
        this.aQL = ((enk_0)this.bgC).a(0, s, ene_0.qPu);
        if (((enk_0)this.bgC).fAn() > 1) {
            this.rhb = ((enk_0)this.bgC).a(1, s, ene_0.qPu);
            this.rhc = true;
        }
    }

    @Override
    public void bbS() {
        super.bbS();
    }

    @Override
    public boolean bbA() {
        return false;
    }

    @Override
    public boolean bbB() {
        return true;
    }

    @Override
    public boolean bbC() {
        return false;
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fGg();
    }
}

