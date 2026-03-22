/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ePf
 */
public final class epf_0
extends eON {
    private static final aox_1 rcM = new enz_0(new eny_0("Valeur + \u00e9l\u00e9ment", new enx_0("Valeur", eNA.qYC), new enx_0("Element", eNA.qYD)));

    @Override
    public aox_1 bEt() {
        return rcM;
    }

    public epf_0() {
        this.bby();
    }

    public epf_0(pt_0 pt_02) {
        super(pt_02);
    }

    public epf_0 fDt() {
        epf_0 epf_02 = new epf_0();
        epf_02.rcf = this.rcf;
        return epf_02;
    }

    @Override
    public void E(QD qD) {
        this.aQL = 0;
        if (this.bgC == null) {
            return;
        }
        this.aQL = ((enk_0)this.bgC).a(0, this.fHf(), ene_0.qPu);
        int n = ((enk_0)this.bgC).a(1, this.fHf(), ene_0.qPu);
        eNd eNd2 = eNd.ff((byte)n);
        if (eNd2 == null) {
            bgA.error((Object)("Mauvais param element inconnu " + n));
            return;
        }
        this.aQL = GC.B((float)this.aQL * (1.0f + (float)this.m(eNd2) / 100.0f));
    }

    private int m(eNd eNd2) {
        exx_2 exx_22 = eNd2.fAU();
        int n = 0;
        if (this.bgE.a(exx_22)) {
            n += this.bgE.c(exx_22);
        }
        if (this.bgE.a(exx_2.rGw)) {
            n += this.bgE.c(exx_2.rGw);
        }
        if (this.rcf == exx_2.rHu) {
            if (this.bgE.a(exx_2.rHy)) {
                n += this.bgE.c(exx_2.rHy);
            }
            if (this.bgE.a(exx_2.rHB)) {
                n += this.bgE.c(exx_2.rHB);
            }
            if (this.bgE.a(exx_2.rHz)) {
                n += this.bgE.c(exx_2.rHz);
            }
        }
        return n;
    }

    @Override
    public void aVH() {
        super.aVH();
    }

    @Override
    public /* synthetic */ eON fCE() {
        return this.fDt();
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fDt();
    }
}

