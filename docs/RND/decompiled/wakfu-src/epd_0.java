/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ePD
 */
public class epd_0
extends ero_0 {
    private boolean rdQ = false;
    private static final aox_1 rdR = new enz_0(new eny_0("id de script", new enx_0("valeur", eNA.qYC)), new eny_0("id de script + feedback", new enx_0("valeur", eNA.qYC), new enx_0("Afficher dans le chat", eNA.qYD)));

    public static epd_0 a(qm_0<enk_0> qm_02, eNd eNd2) {
        epd_0 epd_02 = new epd_0();
        epd_02.o = enf_0.qVC.d();
        epd_02.bgM = ((ero_0)enf_0.qVC.bkx()).baZ();
        epd_02.bgJ = qm_02;
        return epd_02;
    }

    public epd_0 fEC() {
        epd_0 epd_02 = new epd_0();
        return epd_02;
    }

    @Override
    public aox_1 bEt() {
        return rdR;
    }

    @Override
    public boolean bbA() {
        return true;
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
    public void E(QD qD) {
        if (this.bgC != null) {
            this.aQL = ((enk_0)this.bgC).a(0, (short)0, ene_0.qPu);
            this.rdQ = ((enk_0)this.bgC).fAn() == 2 ? ((enk_0)this.bgC).Rz(1) == 0.0f : false;
        }
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (this.bgE != null && this.bgE instanceof exP) {
            ((exP)this.bgE).W(this.aQL, this.rdQ);
        }
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fEC();
    }
}

