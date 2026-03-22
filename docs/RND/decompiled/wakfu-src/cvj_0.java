/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cvJ
 */
public class cvj_0
extends nr_0 {
    private boolean mkt;
    private int asK;
    private int asJ;
    private long[] mku;

    @Override
    public boolean dn(byte[] byArray) {
        if (byArray.length < 10) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mkt = byteBuffer.get() == 1;
        this.asK = byteBuffer.getInt();
        this.asJ = byteBuffer.getInt();
        this.mku = new long[byteBuffer.get()];
        for (int i = 0; i < this.mku.length; ++i) {
            this.mku[i] = byteBuffer.getLong();
        }
        return true;
    }

    @Override
    public int d() {
        return 13690;
    }

    public int aGz() {
        return this.asK;
    }

    public int aGD() {
        return this.asJ;
    }

    public long[] eEn() {
        return this.mku;
    }

    public boolean eEo() {
        return this.mkt;
    }
}

