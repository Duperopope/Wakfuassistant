/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from bZJ
 */
public class bzj_2
extends afm<bze_2, ads_0> {
    private static final bzj_2 lDT = new bzj_2();

    public static bzj_2 eqi() {
        return lDT;
    }

    protected bzj_2() {
    }

    private static int ee(int n, int n2) {
        assert (n >= -2 && n <= 2);
        assert (n2 >= -2 && n2 <= 2);
        if (n > 0) {
            if (n2 > 0) {
                return 8;
            }
            if (n2 == 0) {
                return 5;
            }
            return 2;
        }
        if (n == 0) {
            if (n2 > 0) {
                return 7;
            }
            if (n2 == 0) {
                return 4;
            }
            return 1;
        }
        if (n2 > 0) {
            return 6;
        }
        if (n2 == 0) {
            return 3;
        }
        return 0;
    }

    protected bze_2 c(int n, int n2, int n3, int n4, boolean bl) {
        bze_2 bze_22 = new bze_2(n, n2, n3, n4, bl);
        bze_22.aPg();
        return bze_22;
    }

    protected bdj_2 eqj() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            return null;
        }
        return bgt_02.ddI();
    }

    public boolean l(bsi_0 bsi_02) {
        assert (this.bLr != null);
        boolean bl = false;
        for (azx_1<Short, Short> azx_12 : bsi_02.dGA()) {
            bze_2 bze_22 = (bze_2)this.aE(azx_12.getFirst().shortValue(), azx_12.aHI().shortValue());
            if (bze_22 == null) continue;
            bze_22.k(bsi_02);
            bl |= true;
        }
        return bl;
    }

    public void a(bKV bKV2) {
        assert (this.bLr != null);
        bze_2[] bze_2Array = (bze_2[])((bze_2)this.bLr).blg();
        for (int i = 0; i < bze_2Array.length; ++i) {
            bze_2 bze_22 = bze_2Array[i];
            if (bze_22 == null || !bze_22.aG(bKV2.bcC(), bKV2.bcD())) continue;
            bze_22.a(bKV2);
            return;
        }
        bLq.error((Object)("Impossible d'ajouter une resource hors du champ de vision : resource=[" + bKV2.bcC() + ":" + bKV2.bcD() + "] lpmOrigin=[" + this.eqm() + ":" + this.eqn() + "]"));
    }

    public void k(bCA bCA2) {
        bze_2[] bze_2Array = (bze_2[])((bze_2)this.bLr).blg();
        for (int i = 0; i < bze_2Array.length; ++i) {
            bze_2 bze_22 = bze_2Array[i];
            if (bze_22 == null || !bze_22.aG(bCA2.bcC(), bCA2.bcD())) continue;
            bze_22.d(bCA2);
            return;
        }
        bLq.error((Object)("Impossible d'ajouter un \u00e9l\u00e9ment interactif hors du champ de vision (cache disabled): ID=" + bCA2.Sn()));
    }

    public ni_1 my(long l) {
        bze_2[] bze_2Array = (bze_2[])((bze_2)this.bLr).blg();
        for (int i = 0; i < bze_2Array.length; ++i) {
            ni_1 ni_12;
            bze_2 bze_22 = bze_2Array[i];
            if (bze_22 == null || (ni_12 = bze_22.my(l)) == null) continue;
            return ni_12;
        }
        return null;
    }

    public ArrayList<ni_1> eqk() {
        ArrayList<ni_1> arrayList = new ArrayList<ni_1>();
        bze_2[] bze_2Array = (bze_2[])((bze_2)this.bLr).blg();
        for (int i = 0; i < bze_2Array.length; ++i) {
            bze_2 bze_22 = bze_2Array[i];
            if (bze_22 == null) continue;
            bze_22.x(new bzk_2(this, arrayList));
        }
        return arrayList;
    }

    public void a(ads_0 ads_02, int n, int n2, short s) {
        bdj_2 bdj_22 = this.eqj();
        if (bdj_22 != null && ads_02 == bdj_22) {
            bze_2[] bze_2Array = (bze_2[])((bze_2)this.bLr).blg();
            for (int i = 0; i < bze_2Array.length; ++i) {
                bze_2 bze_22 = bze_2Array[i];
                if (bze_22 == null) continue;
                bze_22.W(n, n2, s);
            }
            bzl_2.eqr().eh(n, n2);
        }
    }

    @Override
    public void clear() {
        super.clear();
        this.eql();
        this.eqo();
    }

    public void o(int n, int n2, boolean bl) {
        this.eql();
        super.aD(n, n2);
    }

    private void eql() {
        if (this.bLr != null) {
            bze_2[] bze_2Array = (bze_2[])((bze_2)this.bLr).blg();
            for (int i = 0; i < bze_2Array.length; ++i) {
                bze_2 bze_22 = bze_2Array[i];
                if (bze_22 == null) continue;
                bze_22.bxJ();
            }
        }
    }

    public void m(bsi_0 bsi_02) {
        bze_2[] bze_2Array = (bze_2[])((bze_2)this.bLr).blg();
        for (int i = 0; i < bze_2Array.length; ++i) {
            bze_2 bze_22 = bze_2Array[i];
            if (bze_22 == null || !bze_22.j(bsi_02)) continue;
            bze_22.i(bsi_02);
        }
    }

    public void b(bKV bKV2) {
        bze_2[] bze_2Array = (bze_2[])((bze_2)this.bLr).blg();
        for (int i = 0; i < bze_2Array.length; ++i) {
            bze_2 bze_22 = bze_2Array[i];
            if (bze_22 == null || !bze_22.q(bKV2)) continue;
            bze_22.p(bKV2);
        }
    }

    public void e(ni_1 ni_12) {
        bze_2[] bze_2Array = (bze_2[])((bze_2)this.bLr).blg();
        for (int i = 0; i < bze_2Array.length; ++i) {
            bze_2 bze_22 = bze_2Array[i];
            if (bze_22 == null || !bze_22.mx(ni_12.Sn())) continue;
            bze_22.c(ni_12);
            return;
        }
    }

    public void mz(long l) {
        bze_2[] bze_2Array = (bze_2[])((bze_2)this.bLr).blg();
        for (int i = 0; i < bze_2Array.length; ++i) {
            bze_2 bze_22 = bze_2Array[i];
            if (bze_22 == null || !bze_22.mx(l)) continue;
            bze_22.mw(l);
            return;
        }
    }

    public void ef(int n, int n2) {
        int n3;
        int n4;
        bze_2 bze_22 = (bze_2)((bze_2)this.bLr).qc(4);
        int n5 = vz_0.qd(n);
        int n6 = vz_0.qe(n2);
        int n7 = n5 - bze_22.getX();
        int n8 = n6 - bze_22.getY();
        int n9 = Math.abs(n7);
        int n10 = n4 = n9 > (n3 = Math.abs(n8)) ? n9 : n3;
        if (n4 != 0) {
            if (n4 == 1) {
                ((bze_2)this.bLr).JJ(bzj_2.ee(n7, n8));
            } else if (n4 == 2) {
                ((bze_2)this.bLr).JJ(bzj_2.ee(n7, n8));
                n7 = n5 - ((bze_2)((bze_2)this.bLr).qc(4)).getX();
                n8 = n6 - ((bze_2)((bze_2)this.bLr).qc(4)).getY();
                ((bze_2)this.bLr).JJ(bzj_2.ee(n7, n8));
            } else {
                this.o(n, n2, false);
            }
        }
        bze_2 bze_23 = (bze_2)((bze_2)this.bLr).qc(4);
        this.a(this.eqj(), bze_22, bze_23);
    }

    public int eqm() {
        assert (this.bLr != null);
        return ((bze_2)((bze_2)this.bLr).qc(4)).getX() * 18;
    }

    public int eqn() {
        assert (this.bLr != null);
        return ((bze_2)((bze_2)this.bLr).qc(4)).getY() * 18;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void eqo() {
        List list = this.cqb;
        synchronized (list) {
            this.cqb.clear();
        }
    }

    @Override
    protected /* synthetic */ afW bxH() {
        return this.eqj();
    }

    @Override
    public /* synthetic */ void cellPositionChanged(afW afW2, int n, int n2, short s) {
        this.a((ads_0)afW2, n, n2, s);
    }

    @Override
    protected /* synthetic */ vx_0 a(int n, int n2, int n3, int n4, boolean bl) {
        return this.c(n, n2, n3, n4, bl);
    }
}

