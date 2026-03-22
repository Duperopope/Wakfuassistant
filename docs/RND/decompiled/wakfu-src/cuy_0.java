/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cuY
 */
public class cuy_0
extends nr_0 {
    private fpv hQH;

    @Override
    public boolean dn(byte[] byArray) {
        this.hQH = fpd_0.gs(ByteBuffer.wrap(byArray));
        return true;
    }

    public fpv dfI() {
        return this.hQH;
    }

    @Override
    public int d() {
        return 12912;
    }
}

