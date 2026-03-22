/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cvN
 */
public class cvn_0
extends nr_0 {
    private int asJ;
    private int mfe;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.asJ = byteBuffer.getInt();
        this.mfe = byteBuffer.getInt();
        return true;
    }

    @Override
    public int d() {
        return 12699;
    }

    public int eyx() {
        return this.mfe;
    }

    public int aGD() {
        return this.asJ;
    }
}

