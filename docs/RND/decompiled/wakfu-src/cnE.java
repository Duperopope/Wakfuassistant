/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TByteFloatProcedure
 */
import gnu.trove.procedure.TByteFloatProcedure;
import java.nio.ByteBuffer;

class cnE
implements TByteFloatProcedure {
    final /* synthetic */ ByteBuffer mbT;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cnE(cnD cnD2, ByteBuffer byteBuffer) {
        this.mbT = byteBuffer;
    }

    public boolean execute(byte by, float f2) {
        this.mbT.put(by);
        this.mbT.putFloat(f2);
        return true;
    }
}

