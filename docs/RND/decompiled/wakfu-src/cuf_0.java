/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cuf
 */
public class cuf_0
extends nr_0 {
    private int iIn;
    private int iIo;
    private short iIp;
    private byte[] mjl;

    public int aqT() {
        return this.iIn;
    }

    public int aqV() {
        return this.iIo;
    }

    public short bsy() {
        return this.iIp;
    }

    public byte[] eDa() {
        return this.mjl;
    }

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.iIn = byteBuffer.getInt();
        this.iIo = byteBuffer.getInt();
        this.iIp = byteBuffer.getShort();
        this.mjl = new byte[byteBuffer.getShort() & 0xFFFF];
        byteBuffer.get(this.mjl);
        return true;
    }

    @Override
    public int d() {
        return 12090;
    }
}

