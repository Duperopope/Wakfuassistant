/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from cWH
 */
class cwh_2
implements aeh_2 {
    public static final String nTx = "name";
    public static final String nTy = "containers";
    private final cBq nTz;
    private final aah_1<cwg_2> nTA = new aah_1();

    cwh_2(cwz_2 cwz_22, cBq cBq2) {
        this.nTz = cBq2;
        this.eWe();
    }

    public void clear() {
        if (this.nTA != null) {
            int n = this.nTA.bTR();
            for (int i = 0; i < n; ++i) {
                this.nTA.vU(i).clear();
            }
        }
    }

    @Override
    public String[] bxk() {
        return null;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(nTx)) {
            return this.nTz.getName();
        }
        if (string.equals(nTy)) {
            return this.nTA;
        }
        return null;
    }

    public void eWe() {
        Object object;
        aah_1<cwg_2> aah_12 = new aah_1<cwg_2>();
        int n = this.nTA.bTR();
        for (int i = 0; i < n; ++i) {
            aah_12.b(this.nTA.wa(i), this.nTA.vU(i));
        }
        ArrayList<cba_0> arrayList = this.nTz.eIj();
        int n2 = arrayList.size();
        for (n = 0; n < n2; ++n) {
            object = arrayList.get(n);
            int n3 = ((cBt)object).d();
            if (this.nTA.vZ(n3)) {
                aah_12.wp(n3);
                continue;
            }
            this.nTA.b(n3, new cwg_2((cba_0)object));
        }
        n2 = aah_12.bTR();
        for (n = 0; n < n2; ++n) {
            object = this.nTA.wp(aah_12.wa(n));
            ((cwg_2)object).clear();
        }
        fse_1.gFu().a((aef_2)this, nTy);
    }
}

