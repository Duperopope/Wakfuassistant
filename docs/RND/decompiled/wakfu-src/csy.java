/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class csy
extends nr_0 {
    protected static final Logger mhr = Logger.getLogger(csy.class);
    private long mhs = -1L;
    private short euw = (short)-1;
    private long mht = 0L;
    private byte mhu = (byte)-1;
    private byte lZc = (byte)-1;

    @Override
    public boolean dn(byte[] byArray) {
        if (byArray.length == 13 || byArray.length == 21) {
            ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
            this.mhs = byteBuffer.getLong();
            this.euw = byteBuffer.getShort();
            this.mhu = byteBuffer.get();
            this.lZc = byteBuffer.get();
            byte by = byteBuffer.get();
            this.mht = by == 1 ? byteBuffer.getLong() : 0L;
        }
        return false;
    }

    @Override
    public int d() {
        return 12587;
    }

    public long eBd() {
        return this.mhs;
    }

    public short cyg() {
        return this.euw;
    }

    public long eBe() {
        return this.mht;
    }

    public byte eBf() {
        return this.mhu;
    }

    public byte eBg() {
        return this.lZc;
    }
}

