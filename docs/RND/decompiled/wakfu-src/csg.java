/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class csg
extends nr_0 {
    private long mgQ;
    private byte mgR;
    private long mgS;
    private byte mgT;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mgQ = byteBuffer.getLong();
        this.mgR = byteBuffer.get();
        if (byteBuffer.get() == 1) {
            this.mgS = byteBuffer.getLong();
            this.mgT = byteBuffer.get();
        } else {
            this.mgS = -1L;
            this.mgT = (byte)-1;
        }
        return true;
    }

    public long eAC() {
        return this.mgQ;
    }

    public byte eAD() {
        return this.mgR;
    }

    public boolean eAE() {
        return this.mgS != -1L && this.mgT != -1;
    }

    public long eAF() {
        return this.mgS;
    }

    public byte eAG() {
        return this.mgT;
    }

    @Override
    public int d() {
        return 13874;
    }
}

