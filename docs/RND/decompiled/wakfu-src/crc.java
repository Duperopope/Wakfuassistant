/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class crc
extends cqQ {
    private long mfN;
    private long[] mfO;
    private acd_1 htU;

    @Override
    public boolean dn(byte[] byArray) {
        if (!this.h(byArray.length, 29, false)) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.fi(byteBuffer);
        this.mfN = byteBuffer.getLong();
        long l = byteBuffer.getLong();
        this.htU = anf_2.gn(l);
        int n = byteBuffer.get() & 0xFF;
        if (n <= 0) {
            dwV.warn((Object)"Aucun fighter le d\u00e9tecte l'invisibilit\u00e9 ?");
        }
        if (!this.h(byteBuffer.remaining(), 8 * n, true)) {
            return false;
        }
        this.mfO = new long[n];
        for (int n2 = 0; n2 < n; n2 = (int)((byte)(n2 + 1))) {
            this.mfO[n2] = byteBuffer.getLong();
        }
        return true;
    }

    @Override
    public int d() {
        return 13141;
    }

    public long ezr() {
        return this.mfN;
    }

    public long[] ezs() {
        return this.mfO;
    }

    public acd_1 ezt() {
        return this.htU;
    }

    @Override
    public int avZ() {
        return 0;
    }

    @Override
    public eui_1 eza() {
        return eui_1.rsO;
    }
}

