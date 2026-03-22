/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cty
 */
public class cty_0
extends nr_0 {
    private long mip;
    private long miq;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.miq = byteBuffer.getLong();
        this.mip = byteBuffer.getLong();
        return true;
    }

    @Override
    public int d() {
        return 13974;
    }

    public long eCl() {
        return this.mip;
    }

    public long eCm() {
        return this.miq;
    }
}

