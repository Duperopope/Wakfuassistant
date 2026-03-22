/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cvt
 */
public class cvt_0
extends nr_0 {
    private long bgK;
    private int brR;
    private short bol;
    private boolean mke;
    private long aDh;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.bgK = byteBuffer.getLong();
        this.brR = byteBuffer.getInt();
        this.bol = byteBuffer.getShort();
        this.mke = byteBuffer.get() != 0;
        this.aDh = byteBuffer.getLong();
        return true;
    }

    @Override
    public int d() {
        return 13043;
    }

    public int avr() {
        return this.brR;
    }

    public long Lx() {
        return this.bgK;
    }

    public short bfd() {
        return this.bol;
    }

    public boolean eDX() {
        return this.mke;
    }

    public long KU() {
        return this.aDh;
    }
}

