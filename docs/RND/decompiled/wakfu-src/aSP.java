/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.procedure.TIntObjectProcedure;
import java.util.regex.Pattern;

class aSP
implements TIntObjectProcedure<bbu_2> {
    final /* synthetic */ Pattern ePG;
    final /* synthetic */ StringBuilder ePH;
    final /* synthetic */ int[] ePI;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    aSP(asm_0 asm_02, Pattern pattern, StringBuilder stringBuilder, int[] nArray) {
        this.ePG = pattern;
        this.ePH = stringBuilder;
        this.ePI = nArray;
    }

    public boolean a(int n, bbu_2 bbu_22) {
        String string = aum_0.cWf().a(62, (long)bbu_22.d(), new Object[0]);
        if (string == null) {
            return true;
        }
        if (this.ePG.matcher(string.toLowerCase()).find()) {
            this.ePH.append(n).append(" : ").append(string).append("\r\n");
            this.ePI[0] = this.ePI[0] + 1;
        }
        return true;
    }

    public /* synthetic */ boolean execute(int n, Object object) {
        return this.a(n, (bbu_2)object);
    }
}

