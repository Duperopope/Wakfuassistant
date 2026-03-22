/*
 * Decompiled with CFR 0.152.
 */
public class eNV
extends ero_0 {
    private static final aox_1 qZZ = new enz_0(new eny_0("Ordre \u00e0 une cr\u00e9ature li\u00e9 \u00e0 une cellule (cf PriorityGoalType)", new enx_0("Id", eNA.qYB)), new eny_0("Sur une cellule d\u00e9finie (le Z \u00e9tant d\u00e9fini par l'altitude valide la plus proche de la cible", new enx_0("Id", eNA.qYB), new enx_0("X", eNA.qYB), new enx_0("Y", eNA.qYB)));
    private acd_1 raa;

    @Override
    protected void b(io_1 io_12) {
        io_12.a(ii_1.MR().a(ii_2.Qc().eH(this.raa.getX()).eI(this.raa.getY()).eJ(this.raa.bdi())));
    }

    @Override
    protected void f(im_1 im_12) {
        if (im_12.Qz()) {
            ii_2 ii_22 = im_12.QA().LX();
            this.raa = new acd_1(ii_22.getX(), ii_22.getY(), GC.cu(ii_22.NN()));
        }
    }

    @Override
    public aox_1 bEt() {
        return qZZ;
    }

    public eNV() {
        this.bby();
    }

    public eNV fBO() {
        eNV eNV2 = new eNV();
        eNV2.raa = this.raa;
        return eNV2;
    }

    @Override
    protected void c(QD qD, boolean bl) {
        qu_0 qu_02 = this.bgF;
        if (qu_02 != null && qu_02 instanceof exP && this.aQL >= 0) {
            ((exP)qu_02).d(this.aQL, this.raa);
        }
    }

    @Override
    public void bbS() {
        super.bbS();
        qu_0 qu_02 = this.bgF;
        if (qu_02 != null && qu_02 instanceof exP && this.aQL >= 0) {
            ((exP)qu_02).e(this.aQL, this.raa);
        }
    }

    @Override
    public void E(QD qD) {
        short s = this.fHf();
        this.aQL = -1;
        this.raa = new acd_1(this.bgG);
        if (this.bgC == null) {
            return;
        }
        if (((enk_0)this.bgC).fAn() >= 1) {
            this.aQL = ((enk_0)this.bgC).a(0, s, ene_0.qPu);
        }
        if (((enk_0)this.bgC).fAn() >= 3) {
            int n = ((enk_0)this.bgC).a(1, s, ene_0.qPu);
            int n2 = ((enk_0)this.bgC).a(2, s, ene_0.qPu);
            short s2 = 0;
            if (this.bgF instanceof exP) {
                exP exP2 = (exP)this.bgF;
                s2 = wa_0.a(exP2.aqZ(), n, n2, exP2.aZw().bdi(), (short)0);
            }
            this.raa = new acd_1(n, n2, s2);
        }
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
    public void aVH() {
        super.aVH();
        this.raa = null;
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fBO();
    }
}

