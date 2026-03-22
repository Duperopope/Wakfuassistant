/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cuW
 */
public class cuw_0
extends nr_0 {
    private boolean hQG;
    private int mjD;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.hQG = byteBuffer.get() == 1;
        this.mjD = byteBuffer.getInt();
        return true;
    }

    @Override
    public int d() {
        return 13920;
    }

    public boolean eDC() {
        return this.hQG;
    }

    public int auH() {
        return this.mjD;
    }
}

