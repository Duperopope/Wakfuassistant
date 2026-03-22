/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ctC
 */
public class ctc_0
extends nr_0 {
    private long aDh;
    private exm_0 miu;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDh = byteBuffer.getLong();
        this.miu = exm_0.OB(byteBuffer.getInt());
        return true;
    }

    @Override
    public int d() {
        return 12584;
    }

    public long KU() {
        return this.aDh;
    }

    public exm_0 eCq() {
        return this.miu;
    }
}

