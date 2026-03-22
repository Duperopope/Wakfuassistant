/*
 * Decompiled with CFR 0.152.
 */
public abstract class dgh {
    public static final String oki = "text";
    protected int okj;
    private final boolean okk;
    protected final String okl;
    protected final dgx okm;
    private final aao_2 okn = new dgi(this);

    protected dgh(dgx dgx2, boolean bl, String string) {
        this.okk = bl;
        this.okl = string;
        this.okm = dgx2;
    }

    public void a(dgv dgv2) {
        fhs_2 fhs_22;
        abb_2.bUA().b(dgw.fcT());
        abb_2.bUA().b(this.okn);
        this.okj = dgv2.fcS();
        boolean bl = fyw_0.gqw().to(this.okl);
        if (!bl) {
            ccj_2.g(this.okl, 8212L);
        }
        if (dgv2.getDuration() != Integer.MAX_VALUE) {
            abb_2.bUA().a(dgw.fcT(), dgv2.getDuration(), 0, 1L);
        }
        if ((fhs_22 = fyw_0.gqw().gqC().uR(this.okl)) == null) {
            return;
        }
        this.a(true, this.okl);
        fdz_1 fdz_12 = (fdz_1)fhs_22.uH(oki);
        if (fdz_12 != null) {
            fdz_12.setText(dgv2.getMessage());
        }
    }

    public void bG(boolean bl) {
        if (fyw_0.gqw().to(this.okl)) {
            abb_2.bUA().b(this.okn);
            if (bl) {
                this.a(false, this.okl);
            }
            if (bl) {
                abb_2.bUA().a(this.okn, this.okj, 0, 1L);
            } else {
                this.rs(this.okl);
            }
        }
    }

    protected abstract void a(boolean var1, String var2);

    protected abstract void rs(String var1);

    protected void a(fes_2 fes_22, String string) {
        if (fes_22 == null) {
            return;
        }
        fka_1 fka_12 = new fka_1();
        fka_12.aVI();
        fka_12.setFile(string);
        fka_12.setAlignment(faa_2.tLO);
        fes_22.getAppearance().d(fka_12);
    }

    protected void j(fes_2 fes_22) {
        if (fes_22 == null) {
            return;
        }
        fes_22.getAppearance().grc();
    }

    protected void d(fes_2 fes_22, boolean bl) {
        if (fes_22 == null) {
            return;
        }
        fys_0 fys_02 = fes_22.getAppearance();
        fys_02.x(fsa_2.class);
        awx_2 awx_22 = new awx_2(new float[0]);
        awx_2 awx_23 = new awx_2(new float[0]);
        if (!bl) {
            awx_22.op(awx_2.dnF.aTn());
            awx_23.op(awx_2.dnC.aTn());
        } else {
            awx_22.op(awx_2.dnC.aTn());
            awx_23.op(awx_2.dnF.aTn());
        }
        fys_02.a(new fsa_2(awx_22, awx_23, fys_02, 0, this.okj, 1, false, abn.cdr));
    }

    public boolean cuz() {
        return this.okk;
    }

    public dgx fcO() {
        return this.okm;
    }

    protected static void c(fax_1 fax_12) {
        if (fax_12 == null) {
            return;
        }
        fax_12.getAnimatedElement().bpC();
        aro_1 aro_12 = fax_12.getAnimatedElement().bqd();
        if (aro_12 != null) {
            aro_12.btE();
        }
        fax_12.x(fsa_2.class);
    }
}

