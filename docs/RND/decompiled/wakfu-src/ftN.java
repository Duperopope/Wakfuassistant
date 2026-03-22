/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class ftN {
    private final int tgx;
    private final ftO tgy;
    static final int tgz = 14;

    ftN(int n, ftO ftO2) {
        this.tgx = n;
        this.tgy = ftO2;
    }

    public int acs() {
        return this.tgx;
    }

    public ftO gmv() {
        return this.tgy;
    }

    void gD(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.tgx);
        ftJ.a(this.tgy, byteBuffer);
    }

    static ftN gJ(ByteBuffer byteBuffer) {
        int n = byteBuffer.getInt();
        ftO ftO2 = ftJ.gI(byteBuffer);
        return new ftN(n, ftO2);
    }
}

