/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cvk
extends nr_0 {
    private boolean mjV;
    private long jEK = -1L;
    private int mjT = -1;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        boolean bl = this.mjV = byteBuffer.get() == 1;
        if (this.mjV) {
            this.jEK = byteBuffer.getLong();
            this.mjT = byteBuffer.getInt();
        }
        return false;
    }

    public boolean eDR() {
        return this.mjV;
    }

    public long ZC() {
        return this.jEK;
    }

    public int eDP() {
        return this.mjT;
    }

    @Override
    public int d() {
        return 13431;
    }
}

