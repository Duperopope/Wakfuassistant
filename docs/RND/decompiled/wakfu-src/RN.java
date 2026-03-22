/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TLongShortProcedure
 */
import gnu.trove.procedure.TLongShortProcedure;

class RN
implements TLongShortProcedure {
    final /* synthetic */ StringBuilder bmM;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    RN(RM rM, StringBuilder stringBuilder) {
        this.bmM = stringBuilder;
    }

    public boolean execute(long l, short s) {
        this.bmM.append(l).append("=>").append(s).append(' ');
        return true;
    }
}

