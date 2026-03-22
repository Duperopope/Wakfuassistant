/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from crz
 */
public class crz_0
extends nr_0 {
    private byte[] lFu;
    private byte[] lFv;
    private long[] mgo;
    private faa_0 lFx;

    @Override
    public boolean dn(byte[] byArray) {
        int n;
        short s;
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        short s2 = byteBuffer.getShort();
        if (s2 != 0) {
            this.lFu = new byte[s2];
            byteBuffer.get(this.lFu);
        }
        if ((s = byteBuffer.getShort()) != 0) {
            this.lFv = new byte[s];
            byteBuffer.get(this.lFv);
        }
        if ((n = byteBuffer.getShort()) != 0) {
            this.mgo = new long[n];
            for (int i = 0; i < n; ++i) {
                this.mgo[i] = byteBuffer.getLong();
            }
        }
        this.lFx = faa_0.fO(byteBuffer);
        return true;
    }

    public byte[] eAc() {
        return this.lFu;
    }

    public byte[] eAd() {
        return this.lFv;
    }

    public long[] eAe() {
        return this.mgo;
    }

    public faa_0 eqJ() {
        return this.lFx;
    }

    @Override
    public int d() {
        return 13853;
    }
}

