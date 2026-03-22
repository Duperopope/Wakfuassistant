/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.procedure.TIntObjectProcedure;
import java.util.regex.Pattern;

class aSQ
implements TIntObjectProcedure<bmt_0> {
    final /* synthetic */ Pattern ePJ;
    final /* synthetic */ StringBuilder ePK;
    final /* synthetic */ int[] ePL;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    aSQ(asm_0 asm_02, Pattern pattern, StringBuilder stringBuilder, int[] nArray) {
        this.ePJ = pattern;
        this.ePK = stringBuilder;
        this.ePL = nArray;
    }

    public boolean a(int n, bmt_0 bmt_02) {
        try {
            if (this.ePJ.matcher(bmt_02.getName().toLowerCase()).find()) {
                this.ePK.append(n).append(" : ").append(bmt_02.getName()).append("\r\n");
                this.ePL[0] = this.ePL[0] + 1;
            }
        }
        catch (Exception exception) {
            aqh_0.cBI().n("Probl\u00e8me de data pour l'item " + n, 0xFF0000);
        }
        return true;
    }

    public /* synthetic */ boolean execute(int n, Object object) {
        return this.a(n, (bmt_0)object);
    }
}

