/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cjt
 */
public class cjt_0
extends nv_0 {
    private int lWs;
    private int lWt;
    private short lWu;
    private short lWv;

    public void bE(int n, int n2) {
        this.lWs = n;
        this.lWt = n2;
    }

    public void R(short s, short s2) {
        this.lWu = s;
        this.lWv = s2;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(12);
        byteBuffer.putInt(this.lWs);
        byteBuffer.putInt(this.lWt);
        byteBuffer.putShort(this.lWu);
        byteBuffer.putShort(this.lWv);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12770;
    }
}

