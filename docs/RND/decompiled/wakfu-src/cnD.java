/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteFloatHashMap
 *  gnu.trove.procedure.TByteFloatProcedure
 */
import gnu.trove.map.hash.TByteFloatHashMap;
import gnu.trove.procedure.TByteFloatProcedure;
import java.nio.ByteBuffer;

public class cnD
extends nv_0 {
    private int epK;
    private final TByteFloatHashMap mbS = new TByteFloatHashMap();

    public void Ck(int n) {
        this.epK = n;
    }

    public void d(frj frj2) {
        this.mbS.put(frj2.gjW().sXI, frj2.getValue());
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(6 + 5 * this.mbS.size());
        byteBuffer.putInt(this.epK);
        byteBuffer.putShort((short)this.mbS.size());
        this.mbS.forEachEntry((TByteFloatProcedure)new cnE(this, byteBuffer));
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12180;
    }
}

