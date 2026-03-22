/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cvz
 */
public class cvz_0
extends nr_0 {
    private int asJ;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.asJ = byteBuffer.getInt();
        return true;
    }

    @Override
    public int d() {
        return 13455;
    }

    public int aGD() {
        return this.asJ;
    }
}

