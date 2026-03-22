/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cxs
 */
public class cxs_0
extends nv_0 {
    private int mlJ;
    private int mlK;
    private int jSn;

    public void Ls(int n) {
        this.mlJ = n;
    }

    public void Lt(int n) {
        this.mlK = n;
    }

    public void Lu(int n) {
        this.jSn = n;
    }

    @Override
    public byte[] aVX() {
        byte[] byArray = new byte[12];
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        byteBuffer.putInt(this.mlJ);
        byteBuffer.putInt(this.mlK);
        byteBuffer.putInt(this.jSn);
        return this.a((byte)6, byArray);
    }

    @Override
    public int d() {
        return 15826;
    }
}

