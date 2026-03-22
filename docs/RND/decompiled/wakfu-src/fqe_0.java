/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TShortObjectProcedure
 */
import gnu.trove.procedure.TShortObjectProcedure;
import java.util.ArrayList;

/*
 * Renamed from fqe
 */
class fqe_0
implements TShortObjectProcedure<ArrayList<fqf_0>> {
    final /* synthetic */ azg_1 sRY;
    final /* synthetic */ fqd_0 sRZ;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    fqe_0(fqd_0 fqd_02, azg_1 azg_12) {
        this.sRZ = fqd_02;
        this.sRY = azg_12;
    }

    public boolean a(short s, ArrayList<fqf_0> arrayList) {
        azg_1 azg_12 = new azg_1(4 * arrayList.size());
        short s2 = 0;
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            fqf_0 fqf_02 = arrayList.get(i);
            try {
                int n2 = fqf_02.af(this.sRZ.sRU, this.sRZ.sRV);
                azg_12.vC(n2);
                s2 = (short)(s2 + 1);
                continue;
            }
            catch (Exception exception) {
                fqd_0.sRT.error((Object)"Exception raised", (Throwable)exception);
            }
        }
        this.sRY.aG(s);
        this.sRY.aG(s2);
        if (s2 > 0) {
            this.sRY.dH(azg_12.bTe());
        }
        return true;
    }

    public /* synthetic */ boolean execute(short s, Object object) {
        return this.a(s, (ArrayList)object);
    }
}

