/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bcP
 */
public class bcp_1
extends bcv_1 {
    public bcp_1(int n) {
        super(n);
    }

    @Override
    protected boolean daI() {
        return bud.joo.SV(this.hEP) == ewx_1.rCU;
    }

    @Override
    protected boolean daJ() {
        return bud.joo.SV(this.hEP) == ewx_1.rCT;
    }

    @Override
    public String daK() {
        String string;
        int n;
        bud bud2 = bud.joo;
        fqU fqU2 = fqX.gjM().Zr(2428);
        fqU fqU3 = fqX.gjM().Zr(2214);
        eMk eMk2 = new eMk(fqU2, eLN.qJn, (short)bud2.SW(this.hEP));
        ArrayList<String> arrayList = eMk2.fzQ();
        eMk eMk3 = new eMk(fqU3, eLN.qJn, (short)bud2.SX(this.hEP));
        ArrayList<String> arrayList2 = eMk3.fzQ();
        ahv_2 ahv_22 = new ahv_2();
        int n2 = arrayList.size();
        for (n = 0; n < n2; ++n) {
            string = arrayList.get(n);
            if (ahv_22.bXe() != 0) {
                ahv_22.ceH();
            }
            ahv_22.c(string);
        }
        n2 = arrayList2.size();
        for (n = 0; n < n2; ++n) {
            string = arrayList2.get(n);
            if (ahv_22.bXe() != 0) {
                ahv_22.ceH();
            }
            ahv_22.c(string);
        }
        return ahv_22.ceL();
    }

    public bch_1 dcy() {
        return new bch_1(this.hEP, bud.joo.SV(this.hEP), this.daK());
    }
}

