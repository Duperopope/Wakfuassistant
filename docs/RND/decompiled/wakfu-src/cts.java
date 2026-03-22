/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cts
extends nr_0 {
    private long kYd;
    private short bol;
    private int lrC;
    private fnm jPp;

    public long LV() {
        return this.kYd;
    }

    public short bfd() {
        return this.bol;
    }

    public int eCe() {
        return this.lrC;
    }

    public fnm dSx() {
        return this.jPp;
    }

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.kYd = byteBuffer.getLong();
        this.bol = byteBuffer.getShort();
        this.lrC = byteBuffer.getInt();
        this.jPp = fnm.fo(byteBuffer.getShort());
        return true;
    }

    @Override
    public int d() {
        return 13677;
    }
}

