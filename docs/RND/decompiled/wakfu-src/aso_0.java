/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.procedure.TIntObjectProcedure;
import java.util.regex.Pattern;

/*
 * Renamed from aSO
 */
class aso_0
implements TIntObjectProcedure<bEq> {
    final /* synthetic */ Pattern ePD;
    final /* synthetic */ StringBuilder ePE;
    final /* synthetic */ int[] ePF;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    aso_0(asm_0 asm_02, Pattern pattern, StringBuilder stringBuilder, int[] nArray) {
        this.ePD = pattern;
        this.ePE = stringBuilder;
        this.ePF = nArray;
    }

    public boolean a(int n, bEq bEq2) {
        try {
            if (this.ePD.matcher(bEq2.getName().toLowerCase()).find()) {
                this.ePE.append(n).append(" : ").append(bEq2.getName()).append("\r\n");
                this.ePF[0] = this.ePF[0] + 1;
            }
        }
        catch (Exception exception) {
            aqh_0.cBI().n("Probl\u00e8me de data pour le set " + n, 0xFF0000);
        }
        return true;
    }

    public /* synthetic */ boolean execute(int n, Object object) {
        return this.a(n, (bEq)object);
    }
}

