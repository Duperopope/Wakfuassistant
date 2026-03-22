/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cSq
 */
public class csq_1
implements adi_1 {
    private static final csq_1 nFx = new csq_1();
    private alx_2 ikv;
    private bfi_0 nFy;

    public void c(bfi_0 bfi_02) {
        this.nFy = bfi_02;
    }

    public static csq_1 eOb() {
        return nFx;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 18382: {
                dae_0 dae_02 = (dae_0)aam_22;
                bgt_0 bgt_02 = aue_0.cVJ().cVK();
                long l = this.nFy.KU();
                if (!fcL.rUh.ax(bgt_02.Xi(), l)) {
                    return false;
                }
                String string = dae_02.bCt();
                cnq_0 cnq_02 = new cnq_0(string, "", l);
                aue_0.cVJ().etu().d(cnq_02);
                aue_0.cVJ().b(nFx);
                return false;
            }
        }
        return true;
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.ikv = new csr_2(this);
            fyw_0.gqw().a(this.ikv);
            ccj_2.g("battlegroundEndDialog", 256L);
            fyw_0.gqw().d("wakfu.battlegroundEnd", cdr_1.class);
            fse_1.gFu().b("battlegroundView", this.nFy, "battlegroundEndDialog");
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fyw_0.gqw().b(this.ikv);
            fyw_0.gqw().tl("battlegroundEndDialog");
            fyw_0.gqw().tc("wakfu.battlegroundEnd");
        }
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }
}

