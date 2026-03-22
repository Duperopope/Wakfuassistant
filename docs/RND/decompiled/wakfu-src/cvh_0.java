/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cvH
 */
public class cvh_0
extends nr_0 {
    private int brR;
    private int dvq;
    private long aDh;

    @Override
    public boolean dn(byte[] byArray) {
        if (byArray.length < 16) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDh = byteBuffer.getLong();
        this.brR = byteBuffer.getInt();
        this.dvq = byteBuffer.getInt();
        return true;
    }

    @Override
    public int d() {
        return 13518;
    }

    public long KU() {
        return this.aDh;
    }

    public int avr() {
        return this.brR;
    }

    public int eEl() {
        return this.dvq;
    }
}

