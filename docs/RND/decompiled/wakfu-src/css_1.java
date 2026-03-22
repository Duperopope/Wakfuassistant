/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

/*
 * Renamed from cSs
 */
public class css_1
implements adi_1 {
    private static final css_1 nFz = new css_1();
    private bxu nFA;
    private fpv nFB;
    private alx_2 ikv;

    public static css_1 eOc() {
        return nFz;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 18098: {
                if (aue_0.cVJ().cVO().bfb()) {
                    bYU.epD();
                    return false;
                }
                this.nFA.a(rw_0.bkJ, aue_0.cVJ().cVK());
                fyw_0.gqw().tl("battlegroundEnterDialog");
                return false;
            }
        }
        return true;
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.ikv = new cst_2(this);
            bfi_0 bfi_02 = new bfi_0(this.nFB);
            fse_1.gFu().f("battlegroundView", bfi_02);
            fyw_0.gqw().a(this.ikv);
            ccj_2.g("battlegroundEnterDialog", 256L);
            fyw_0.gqw().d("wakfu.battlegroundEnter", cds_2.class);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fyw_0.gqw().b(this.ikv);
            fyw_0.gqw().tl("battlegroundEnterDialog");
            fyw_0.gqw().tc("wakfu.battlegroundEnter");
        }
    }

    public void a(bxu bxu2) {
        if (bxu2 == null) {
            return;
        }
        Optional<fpv> optional = cux_0.mjE.eDF();
        if (optional.isEmpty()) {
            return;
        }
        this.nFB = optional.get();
        this.nFA = bxu2;
        aue_0.cVJ().a(this);
    }

    public void eOd() {
        bfi_0 bfi_02 = (bfi_0)fse_1.gFu().vY("battlegroundView");
        if (bfi_02 != null) {
            bfi_02.dfN();
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

