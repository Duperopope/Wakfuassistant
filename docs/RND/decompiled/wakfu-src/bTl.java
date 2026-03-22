/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;

public final class bTl
extends bTj {
    public static final bTl lnl = new bTl();
    private int epK = -1;
    private final TIntObjectHashMap<abm_1> lnm = new TIntObjectHashMap();

    private bTl() {
    }

    public void Ck(int n) {
        if (n == this.epK) {
            return;
        }
        this.clean();
        if (n == -1) {
            fse_1.gFu().f("protector", (Object)null);
            return;
        }
        this.epK = n;
        this.aPg();
        fse_1.gFu().f("protector", lnl);
    }

    @Override
    public void clean() {
        super.clean();
        this.epK = -1;
        this.lnm.clear();
        fpm.sNJ.b(this);
    }

    @Override
    public void a(bjw_0 bjw_02) {
    }

    @Override
    public Object eu(String string) {
        if (string.equals("animation")) {
            return this.a(this.epK, bkr_0.kny);
        }
        if (string.equals("name")) {
            return aum_0.cWf().c(String.format("staticProtector.%d", this.epK), new Object[0]);
        }
        if (string.equals("description")) {
            ahs_2 ahs_22 = new ahs_2();
            return ahs_22.ceC().ih(bJN.kmA.bQk()).ceD();
        }
        return super.eu(string);
    }

    @Override
    public int ctn() {
        return this.epK;
    }

    @Override
    public boolean enj() {
        return true;
    }

    public void b(int n, abm_1 abm_12) {
        this.lnm.put(n, (Object)abm_12);
    }

    public abm_1 Jx(int n) {
        return (abm_1)this.lnm.get(n);
    }

    @Override
    public bJK eaX() {
        return null;
    }
}

