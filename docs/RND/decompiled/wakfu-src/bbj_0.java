/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bbJ
 */
class bbj_0
extends czb_2
implements adi_1 {
    public static final bbj_0 hBi = new bbj_0();
    private final aad_0 hBj = new aad_0("emoteSelectTarget", bbe_0.hAG);
    bdj_2 hBk;
    bbf_0 hBl;
    bbg_0 hBm;
    private acd_1 hBn = null;

    bbj_0() {
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        fhn_1.gzT().a(fzo_0.tHz, true);
        String string = this.hBl.byf();
        if (string != null) {
            fib_2.gBU().a(string, null, 30, 0, faa_2.tLN);
        }
        aIs aIs2 = (aIs)aie_0.cfn().bmC();
        this.dh(aIs2.bqM(), aIs2.bqN());
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        fhn_1.gzT().bYz();
        fib_2.gBU().eKH();
        this.hBj.bqC();
        if (this.hBk != null) {
            this.hBk.dcT();
        }
        this.hBn = null;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 16346: {
                dcm_0 dcm_02 = (dcm_0)aam_22;
                return this.dh(dcm_02.bqM(), dcm_02.bqN());
            }
            case 19373: {
                return this.a((dcm_0)aam_22);
            }
            case 16902: {
                return this.b((dcm_0)aam_22);
            }
            case 16990: {
                return false;
            }
        }
        return true;
    }

    private boolean dh(int n, int n2) {
        bgt_0 bgt_02;
        aIs aIs2 = (aIs)aie_0.cfn().bmC();
        ZH zH = aIs2.cgz();
        this.hBj.bqC();
        if (this.hBk != null) {
            this.hBk.dcT();
        }
        this.hBk = null;
        if (!(zH instanceof bdj_2) || !(((bdj_2)zH).dcP() instanceof bhJ)) {
            acd_1 acd_12 = aeO.a(aIs2, n, n2, false);
            if (acd_12 == null) {
                return true;
            }
            this.hBj.q(bbe_0.hAH);
            this.hBj.E(acd_12.getX(), acd_12.getY(), acd_12.bdi());
            return true;
        }
        bdj_2 bdj_22 = (bdj_2)zH;
        bgy bgy2 = bdj_22.dcP();
        if (bgy2 == (bgt_02 = aue_0.cVJ().cVK()) || bgy2.doP() || bgy2.djT()) {
            return true;
        }
        if (bgy2.dpX() != null || bdj_22.bvW()) {
            return true;
        }
        this.hBk = bdj_22;
        this.hBk.dcS();
        this.hBj.q(bbe_0.hAG);
        this.hBj.E(this.hBk.bcC(), this.hBk.bcD(), this.hBk.bcE());
        return false;
    }

    private boolean a(dcm_0 dcm_02) {
        if (!dcm_02.fch()) {
            return false;
        }
        this.hBn = this.d(dcm_02);
        return false;
    }

    private boolean b(dcm_0 dcm_02) {
        if (dcm_02.fch()) {
            if (this.c(dcm_02)) {
                this.dan();
            }
        } else {
            aue_0.cVJ().b(this);
        }
        this.hBn = null;
        return false;
    }

    private boolean c(dcm_0 dcm_02) {
        if (!dcm_02.fch()) {
            return false;
        }
        acd_1 acd_12 = this.d(dcm_02);
        if (this.hBn == null || acd_12 == null || !this.hBn.L(acd_12.getX(), acd_12.getY(), acd_12.bdi())) {
            return false;
        }
        return this.hBk != null;
    }

    private boolean dan() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bbe_0 bbe_02 = bbe_0.hAP;
        if (!bbe_02.a(this.hBl, this.hBm)) {
            aue_0.cVJ().b(this);
            return false;
        }
        int n = bgt_02.aZw().A(this.hBk.dcP().aZw());
        if (!this.hBl.cne() || n == 1) {
            this.hBm.a(this.hBl, this.hBk.Sn());
            aue_0.cVJ().b(this);
            return false;
        }
        bbk_0 bbk_02 = new bbk_0(this, bgt_02);
        bdj_2 bdj_22 = bgt_02.ddI();
        bdj_22.b(bbk_02);
        if (!bgt_02.a(this.hBk.dcP(), true, true)) {
            bdj_22.c(bbk_02);
        }
        aue_0.cVJ().b(this);
        return false;
    }

    private acd_1 d(dcm_0 dcm_02) {
        aIs aIs2 = (aIs)aie_0.cfn().bmC();
        return aeO.a(aIs2, dcm_02.bqM(), dcm_02.bqN(), true);
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    public void b(bbf_0 bbf_02, bbg_0 bbg_02) {
        if (this.hBl == bbf_02 && aue_0.cVJ().c(this)) {
            aue_0.cVJ().b(this);
            return;
        }
        this.hBl = bbf_02;
        this.hBm = bbg_02;
        if (aue_0.cVJ().c(this)) {
            aue_0.cVJ().b(this);
        }
        aue_0.cVJ().a(this);
    }
}

