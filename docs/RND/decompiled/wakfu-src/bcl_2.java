/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bcL
 */
public class bcl_2
extends bcu_2 {
    private static final String hII = "achievements";

    public bcl_2(long l, bcd_2 bcd_22) {
        super(l, bcd_22);
        ArrayList<bcc_1> arrayList = bcb_1.hDb.daC();
        for (bcc_1 bcc_12 : arrayList) {
            int n = bcc_12.d();
            if (n == 4) continue;
            bch_2 bch_22 = bcm_1.hIK.a(l, bcc_12, null);
            this.hEG.put(n, bch_22);
            this.hEH.add(bch_22);
        }
        this.hEK = bcm_1.hIK.jj(l);
        this.hEG.put(this.hEK.d(), this.hEK);
        if (!this.hEH.isEmpty()) {
            this.hEI = (bcy_1)this.hEH.get(0);
        }
    }

    @Override
    public boolean dbh() {
        return false;
    }

    @Override
    public String dbi() {
        return hII;
    }
}

