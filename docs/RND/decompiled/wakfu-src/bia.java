/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TIntArrayList;
import java.util.ArrayList;

final class bia
extends eyj_0 {
    private final qi_2 ijP;
    private final TIntArrayList ijQ = new TIntArrayList();
    final /* synthetic */ bhJ ijR;

    bia(bhJ bhJ2, qi_2 qi_22) {
        this.ijR = bhJ2;
        this.ijP = qi_22;
        this.ijP.DM().a(this);
    }

    @Override
    public void zl() {
        throw new UnsupportedOperationException("[NATION] La Part NationEnemy ne devrait pas \u00e9tre s\u00e9rialis\u00e9e par le client.");
    }

    @Override
    public void zm() {
        int n;
        int n2;
        bri_2 bri_22 = (bri_2)this.ijR.ffF();
        ArrayList<ql_2> arrayList = this.ijP.Vn;
        this.ijQ.add(bri_22.gdg());
        for (ql_2 ql_22 : arrayList) {
            n2 = ql_22.Vu;
            n = ql_22.Vv;
            int n3 = bri_22.fY(n2, n);
            aeb_2.a(this.ijQ, n2);
            if (n3 == n) continue;
            bri_22.dW(n2, n3);
            this.Y(n2, n3, n);
        }
        int n4 = this.ijQ.size();
        for (int i = 0; i < n4; ++i) {
            n2 = this.ijQ.get(i);
            n = bri_22.fY(n2, 0);
            bri_22.dW(n2, n);
        }
        this.ijQ.clear();
        bri_22.elr();
    }

    private void Y(int n, int n2, int n3) {
        fkd_0 fkd_02;
        if (this.ijR.bvY()) {
            return;
        }
        int n4 = aue_0.cVJ().cVK().Xt();
        if (n4 == 0) {
            return;
        }
        if (n4 != this.ijR.ffM()) {
            return;
        }
        if (n4 != n) {
            return;
        }
        fkd_0 fkd_03 = fkf_0.gcc().WJ(n2);
        if (fkd_03 == (fkd_02 = fkf_0.gcc().WJ(n3))) {
            return;
        }
        if (!fkd_03.b(fkj_0.sAM) && fkd_02.b(fkj_0.sAM)) {
            String string = aum_0.cWf().c(fkd_02.clY(), new Object[0]);
            String string2 = aum_0.cWf().c("nation.remoteCriminal", this.ijR.getName(), string);
            aPh.czg().jb(string2);
        }
    }
}

