/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from cTg
 */
public class ctg_2
implements adi_1 {
    private static final ctg_2 nIk = new ctg_2();
    private cti_2 nIl;
    private ArrayList<btx> nIm;
    private alx_2 ikv;

    public static ctg_2 ePq() {
        return nIk;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        aam_22.d();
        return true;
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.ikv = new cth_1(this);
            fyw_0.gqw().a(this.ikv);
            this.nIl = new cti_2();
            if (this.nIm != null) {
                for (btx btx2 : this.nIm) {
                    this.nIl.b(btx2);
                }
                this.nIm.clear();
            }
            cti_2[] cti_2Array = new cti_2[]{this.nIl};
            fse_1.gFu().f("chestLoot", cti_2Array);
            ccj_2.g("chestLootDialog", 256L);
            cAY.eHc().nP(600068L);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.nIl = null;
            this.nIm = null;
            fyw_0.gqw().tl("chestLootDialog");
            fyw_0.gqw().b(this.ikv);
            fse_1.gFu().vX("chestLoot");
        }
    }

    public void k(int n, short s) {
        if (this.nIl == null) {
            if (this.nIm == null) {
                this.nIm = new ArrayList();
            }
            this.nIm.add(new btx(n, s));
            return;
        }
        this.nIl.k(n, s);
        fse_1.gFu().a((aef_2)this.nIl, "loots");
    }
}

