/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cvI
 */
public class cvi_0
extends nr_0 {
    private int asJ;
    private byte asf;
    private int mks;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.asJ = byteBuffer.getInt();
        this.asf = byteBuffer.get();
        this.mks = byteBuffer.getInt();
        return true;
    }

    @Override
    public int d() {
        return 12118;
    }

    public int aGD() {
        return this.asJ;
    }

    public byte aFW() {
        return this.asf;
    }

    public int eEm() {
        return this.mks;
    }
}

