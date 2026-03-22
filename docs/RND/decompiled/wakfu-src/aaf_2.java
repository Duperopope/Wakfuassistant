/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from aAF
 */
public interface aaf_2
extends aag_2 {
    public void eU(ByteBuffer var1);

    @Override
    default public boolean dn(byte[] byArray) {
        this.eU(ByteBuffer.wrap(byArray));
        return true;
    }
}

