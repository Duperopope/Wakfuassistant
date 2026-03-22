/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.procedure.TIntObjectProcedure;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/*
 * Renamed from apZ
 */
class apz_1
implements TIntObjectProcedure<ArrayList<aqc_2>> {
    final /* synthetic */ DataOutputStream cQh;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    apz_1(apy_1 apy_12, DataOutputStream dataOutputStream) {
        this.cQh = dataOutputStream;
    }

    public boolean b(int n, ArrayList<aqc_2> arrayList) {
        for (int i = 0; i < arrayList.size(); ++i) {
            aqc_2 aqc_22 = arrayList.get(i);
            try {
                this.cQh.writeInt(n);
                this.cQh.writeInt(aqc_22.cQj);
                this.cQh.writeInt(aqc_22.Yh);
                this.cQh.writeInt(aqc_22.cQk);
                continue;
            }
            catch (IOException iOException) {
                aps_1.cPe.error(iOException.getMessage(), (Throwable)iOException);
            }
        }
        return true;
    }

    public /* synthetic */ boolean execute(int n, Object object) {
        return this.b(n, (ArrayList)object);
    }
}

