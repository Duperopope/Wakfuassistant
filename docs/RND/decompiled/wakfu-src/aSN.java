/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.procedure.TIntObjectProcedure;
import java.util.regex.Pattern;

class aSN
implements TIntObjectProcedure<fqU> {
    final /* synthetic */ Pattern ePA;
    final /* synthetic */ StringBuilder ePB;
    final /* synthetic */ int[] ePC;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    aSN(asm_0 asm_02, Pattern pattern, StringBuilder stringBuilder, int[] nArray) {
        this.ePA = pattern;
        this.ePB = stringBuilder;
        this.ePC = nArray;
    }

    public boolean a(int n, fqU fqU2) {
        try {
            bmq_0 bmq_02 = (bmq_0)fqU2;
            String string = bmq_02.efd().toLowerCase();
            System.out.println(string);
            if (this.ePA.matcher(string).find()) {
                this.ePB.append(n).append(" : ").append(fqU2.getName()).append("\r\n");
                this.ePC[0] = this.ePC[0] + 1;
            }
        }
        catch (Exception exception) {
            aqh_0.cBI().n("Probl\u00e8me de data pour l'\u00e9tat " + n, 0xFF0000);
        }
        return true;
    }

    public /* synthetic */ boolean execute(int n, Object object) {
        return this.a(n, (fqU)object);
    }
}

