/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.procedure.TIntObjectProcedure;

/*
 * Renamed from fow
 */
public class fow_0 {
    private final aah_1<axb_2> sLE = new aah_1();

    void e(int n, axb_2 axb_22) {
        this.sLE.b(n, axb_22);
    }

    public void d(TIntObjectProcedure<axb_2> tIntObjectProcedure) {
        int n = this.sLE.bTR();
        for (int i = 0; i < n; ++i) {
            if (tIntObjectProcedure.execute(this.sLE.wa(i), (Object)this.sLE.vU(i))) continue;
            return;
        }
    }

    public String toString() {
        return "PetDefinitionColor{m_colorParts=" + this.sLE.bTR() + "}";
    }
}

