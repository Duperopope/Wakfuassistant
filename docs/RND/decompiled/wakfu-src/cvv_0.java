/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cvv
 */
public class cvv_0
extends nr_0 {
    private int asJ;
    private int bfF;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.asJ = byteBuffer.getInt();
        this.bfF = byteBuffer.getInt();
        return true;
    }

    @Override
    public int d() {
        return 12169;
    }

    public int aGD() {
        return this.asJ;
    }

    public int avZ() {
        return this.bfF;
    }
}

