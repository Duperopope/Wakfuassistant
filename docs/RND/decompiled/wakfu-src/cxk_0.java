/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cxk
 */
public class cxk_0
extends nv_0 {
    private long aXv;
    private String p;

    public void setName(String string) {
        this.p = string;
    }

    public void dC(long l) {
        this.aXv = l;
    }

    @Override
    public byte[] aVX() {
        byte[] byArray = BH.aP(this.p);
        int n = byArray.length;
        ByteBuffer byteBuffer = ByteBuffer.allocate(12 + n);
        byteBuffer.putLong(this.aXv);
        byteBuffer.putInt(n);
        byteBuffer.put(byArray);
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int d() {
        return 14567;
    }
}

