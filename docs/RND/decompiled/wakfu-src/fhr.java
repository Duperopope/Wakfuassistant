/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class fhr
implements evv_2 {
    private long iJl;

    @Override
    public byte[] fej() {
        azg_1 azg_12 = new azg_1();
        azg_12.gK(this.iJl);
        return azg_12.bTe();
    }

    @Override
    public void a(long l, ByteBuffer byteBuffer) {
        this.iJl = byteBuffer.getLong();
    }

    @Override
    public eva_1 fek() {
        return eva_1.oww;
    }

    public long dzt() {
        return this.iJl;
    }

    public void lQ(long l) {
        this.iJl = l;
    }
}

