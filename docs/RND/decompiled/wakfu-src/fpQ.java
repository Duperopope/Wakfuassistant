/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class fpQ
implements evv_2 {
    private fpu_0 lbW = fpu_0.sRd;
    private long sQQ = 0L;
    private fpu_0 sQR;

    @Override
    public byte[] fej() {
        azg_1 azg_12 = new azg_1();
        azg_12.aF(this.lbW.aJr());
        azg_12.gK(this.sQQ);
        return azg_12.bTe();
    }

    @Override
    public void a(long l, ByteBuffer byteBuffer) {
        this.lbW = fpu_0.YK(byteBuffer.get());
        this.sQQ = byteBuffer.getLong();
    }

    @Override
    public eva_1 fek() {
        return eva_1.owx;
    }

    public fpu_0 dkC() {
        return this.lbW;
    }

    public void c(fpu_0 fpu_02) {
        this.lbW = fpu_02;
    }

    public fpu_0 ghp() {
        return this.sQR;
    }

    public void d(fpu_0 fpu_02) {
        this.sQR = fpu_02;
    }

    public void uy(long l) {
        this.sQQ += l;
    }

    public long ghq() {
        return this.sQQ;
    }

    public void uz(long l) {
        this.sQQ = l;
    }
}

