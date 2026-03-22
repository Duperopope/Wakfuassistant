/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cto
extends nr_0 {
    private int epc;
    private short bol;
    private long mid;

    public int AK() {
        return this.epc;
    }

    public short bfd() {
        return this.bol;
    }

    public long eCa() {
        return this.mid;
    }

    @Override
    public boolean dn(byte[] byArray) {
        if (byArray.length == 14) {
            ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
            this.epc = byteBuffer.getInt();
            this.bol = byteBuffer.getShort();
            this.mid = byteBuffer.getLong();
            return true;
        }
        return false;
    }

    @Override
    public int d() {
        return 13806;
    }
}

