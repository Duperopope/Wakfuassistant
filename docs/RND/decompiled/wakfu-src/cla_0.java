/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from clA
 */
public class cla_0
extends cll_0 {
    private short lZm;
    private short bol;
    private byte lZF;

    public cla_0() {
        this.bgK = -1L;
        this.lZe = -1L;
        this.lZF = (byte)-1;
        this.lZm = (short)-1;
        this.bol = (short)-1;
    }

    @Override
    public byte[] aVX() {
        int n = 21;
        ByteBuffer byteBuffer = ByteBuffer.allocate(21);
        byteBuffer.putLong(this.bgK);
        byteBuffer.putShort(this.bol);
        byteBuffer.put(this.lZF);
        byteBuffer.putLong(this.lZd);
        byteBuffer.putShort(this.lZm);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 13387;
    }

    public void setDestinationPosition(short s) {
        this.lZm = s;
    }

    public void ak(short s) {
        this.bol = s;
    }

    public void dv(byte by) {
        this.lZF = by;
    }

    @Override
    public void nn(long l) {
        dwV.warn((Object)"On essaie d'indiquer une source pour un message provenant forc\u00e9ment de l'inventaire temporaire");
    }
}

