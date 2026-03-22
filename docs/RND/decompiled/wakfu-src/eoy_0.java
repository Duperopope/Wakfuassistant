/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongIntHashMap
 */
import gnu.trove.map.hash.TLongIntHashMap;

/*
 * Renamed from eOy
 */
public class eoy_0
extends ero_0 {
    private static final aox_1 rbu = new enz_0(new eny_0("Porte la cible", new enx_0[0]));
    public static final TLongIntHashMap rbv = new TLongIntHashMap();

    @Override
    public aox_1 bEt() {
        return rbu;
    }

    @Override
    public void bby() {
        super.bby();
        this.oC(2224);
    }

    public eoy_0 fCK() {
        eoy_0 eoy_02 = new eoy_0();
        return eoy_02;
    }

    @Override
    protected void c(QD qD, boolean bl) {
        short s;
        int n;
        int n2;
        boolean bl2 = false;
        if (!(this.bgF instanceof eza_0) || !(this.bgE instanceof ezz)) {
            this.mk(true);
            return;
        }
        if (this.bgF.a(exe_1.rEr)) {
            this.mk(true);
            return;
        }
        if (!this.a(eNi.qWX)) {
            if (this.bgF.a(exe_1.rDm)) {
                this.mk(true);
                return;
            }
            if (this.bgE instanceof eyo_0 && this.bgF instanceof eyo_0) {
                boolean bl3;
                n2 = this.bgE.a(exe_1.rFe) || this.bgF.a(exe_1.rFe) ? 1 : 0;
                n = this.bgE.a(exe_1.rFf) || this.bgF.a(exe_1.rFf) ? 1 : 0;
                s = !this.bgF.a(exe_1.rEr) ? (short)1 : 0;
                boolean bl4 = bl3 = ((eyo_0)((Object)this.bgE)).bcP() == ((eyo_0)((Object)this.bgF)).bcP();
                if (!(bl3 || n2 == 0 && s != 0)) {
                    this.mk(true);
                    return;
                }
                if (bl3 && (n != 0 || s == 0)) {
                    this.mk(true);
                    return;
                }
            }
        }
        n2 = this.bgF.bcC();
        n = this.bgF.bcD();
        s = this.bgF.bcE();
        ezz ezz2 = (ezz)((Object)this.bgE);
        eza_0 eza_02 = (eza_0)((Object)this.bgF);
        if (ezz2.a(eza_02)) {
            exP exP2;
            ety_0 ety_02;
            bl2 = true;
            rbv.put(this.bgE.Sn(), this.aZH());
            this.d(qD, bl);
            if (this.bgJ.bai() != null) {
                this.bgJ.bai().a(n2, n, s, this.bgF.bcC(), this.bgF.bcD(), this.bgF.bcE(), this.bgF);
            }
            if (this.bgF instanceof exP && (ety_02 = (exP2 = (exP)this.bgF).dlK()) != null) {
                ety_02.aF(exP2);
            }
        }
        if (!bl2) {
            this.mk(true);
        }
    }

    @Override
    public void E(QD qD) {
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
    public /* synthetic */ QD bbo() {
        return this.fCK();
    }
}

