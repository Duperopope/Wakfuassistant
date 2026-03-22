/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cpH
 */
public abstract class cph_0
extends nr_0 {
    private ekq_0 meb;

    abstract void ff(ByteBuffer var1);

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.meb = ekq_0.Qq(byteBuffer.getInt());
        if (this.meb == ekq_0.qBM) {
            this.ff(byteBuffer);
        }
        return false;
    }

    public ekq_0 exv() {
        return this.meb;
    }
}

