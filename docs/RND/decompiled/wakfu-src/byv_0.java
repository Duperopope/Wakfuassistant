/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from byV
 */
public class byv_0
extends bCA
implements ZJ {
    public static final short jDg = 1;
    public static final short jDh = 2;
    protected static final Logger jDi = Logger.getLogger(byv_0.class);
    public static final short jDj = 0;
    public static final short jDk = 1;
    public static final short jDl = 2;
    bnv_2 jDm;
    boolean bmT;
    boolean jDn;
    private final fi_1 jDo = new byw_0(this);

    public void bl(boolean bl) {
        this.bmT = bl;
    }

    public void hr(boolean bl) {
        this.jDn = bl;
    }

    public boolean dOw() {
        return this.jDn;
    }

    protected byv_0() {
    }

    public bnv_2 dOx() {
        return this.jDm;
    }

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        return false;
    }

    void dOy() {
        abi_1 abi_12;
        int n = this.bmd.getX();
        int n2 = this.bmd.getY();
        short s = this.bmd.bdi();
        abi_1 abi_13 = abi_1.dzk;
        ajo_0 ajo_02 = (ajo_0)adk.buy().bv(n, n2);
        if (ajo_02 != null && (abi_12 = ajo_02.S(n, n2, s)) != null && abi_12 != abi_1.dzt) {
            abi_13 = abi_12;
        }
        this.a(abi_13);
    }

    @Override
    protected fi_1 bey() {
        return this.jDo;
    }

    @Override
    public void c(ng_1 ng_12) {
    }

    @Override
    public rw_0 dNn() {
        return rw_0.bkU;
    }

    @Override
    public rw_0[] dNf() {
        return new rw_0[]{rw_0.bkU};
    }

    @Override
    public cpm_1[] dNh() {
        return new cpm_1[]{cps_1.niG.eLI()};
    }

    @Override
    public String getName() {
        return aum_0.cWf().c("bag.of", this.jDm.dyT());
    }

    @Override
    public boolean dOz() {
        if (this.jJl == 0 && this.bmf == 1) {
            this.jJl = 0;
            return true;
        }
        if (this.bmf == 2) {
            this.jJl = 1;
            return true;
        }
        return false;
    }

    void dOA() {
        bgy bgy2 = bgg_0.dlO().ju(this.jDm.Xi());
        if (bgy2 != null) {
            bdj_2 bdj_22 = bgy2.ddI();
            ((adj_0)bdj_22).a(abi_1.dzk);
            bdj_22.a(this);
        }
    }

    private void dOB() {
        if (this.jDm != null) {
            long l = this.jDm.Xi();
            bgy bgy2 = bgg_0.dlO().ju(l);
            if (bgy2 != null) {
                bdj_2 bdj_22 = bgy2.ddI();
                bdj_22.fq(false);
                bdj_22.b(this);
            }
        }
    }

    @Override
    public void animationEnded(ZC zC) {
        this.dOB();
    }

    @Override
    public void dOC() {
        this.bmf = 1;
        this.aVQ();
        bgy bgy2 = bgg_0.dlO().ju(this.jDm.Xi());
        if (bgy2 != null) {
            bdj_2 bdj_22 = bgy2.ddI();
            bdj_22.a(abi_1.dzk);
            bdj_22.dT(bdj_22.ddu());
        }
    }

    @Override
    public boolean isVisible() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            return false;
        }
        bsj_0 bsj_02 = bgt_02.dmV();
        acd_1 acd_12 = this.aZw();
        return super.isVisible() && (bsj_02 == null || !bsj_02.bag().T(acd_12.getX(), acd_12.getY()));
    }

    public boolean bfb() {
        return this.bmT;
    }

    @Override
    public void aVH() {
        this.dOB();
        this.jDm = null;
        super.aVH();
    }

    @Override
    public void aVI() {
        super.aVI();
        this.jHu = true;
        this.jJl = 0;
        this.bmT = false;
        this.bmf = 0;
        this.jJm = true;
        this.jJo = true;
        this.jJr = true;
        assert (this.jDm == null);
    }

    static /* synthetic */ long a(byv_0 byv_02, long l) {
        byv_02.bme = l;
        return byv_02.bme;
    }

    static /* synthetic */ acd_1 a(byv_0 byv_02) {
        return byv_02.bmd;
    }

    static /* synthetic */ short b(byv_0 byv_02) {
        return byv_02.bmf;
    }

    static /* synthetic */ short c(byv_0 byv_02) {
        return byv_02.bmf;
    }

    static /* synthetic */ short d(byv_0 byv_02) {
        return byv_02.bmf;
    }

    static /* synthetic */ void a(byv_0 byv_02, ayv_2 ayv_22) {
        byv_02.a(ayv_22);
    }
}

