/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cju
 */
public class cju_0
extends nv_0 {
    private int lWs;
    private int lWt;
    private float lWw;
    private float lWx;

    public void bE(int n, int n2) {
        this.lWs = n;
        this.lWt = n2;
    }

    public void bz(float f2, float f3) {
        this.lWw = f2;
        this.lWx = f3;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(16);
        byteBuffer.putInt(this.lWs);
        byteBuffer.putInt(this.lWt);
        byteBuffer.putFloat(this.lWw);
        byteBuffer.putFloat(this.lWx);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12528;
    }
}

