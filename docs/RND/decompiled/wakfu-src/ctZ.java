/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class ctZ
extends ctY {
    protected static final Logger mje = Logger.getLogger(ctZ.class);
    private byte mjf = 0;
    private long iqc = 0L;
    private byte mjg = 0;
    private int bfF = 0;
    private byte iqt = 0;
    private int bap;
    private int baq;
    private double mjh;
    private int epc;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mbb = byteBuffer.get();
        this.huL = byteBuffer.getShort();
        this.huJ = byteBuffer.getLong();
        this.iqc = byteBuffer.getLong();
        this.mjf = byteBuffer.get();
        this.bap = byteBuffer.getInt();
        this.baq = byteBuffer.getInt();
        this.mjg = byteBuffer.get();
        this.bfF = byteBuffer.getInt();
        this.iqt = byteBuffer.get();
        this.mjh = byteBuffer.getDouble();
        this.epc = byteBuffer.getInt();
        return true;
    }

    @Override
    public int d() {
        return 12862;
    }

    public byte eCV() {
        return this.mjf;
    }

    public long eCW() {
        return this.iqc;
    }

    public byte eCX() {
        return this.mjg;
    }

    public byte eCY() {
        return this.iqt;
    }

    public int getX() {
        return this.bap;
    }

    public int getY() {
        return this.baq;
    }

    public int avZ() {
        return this.bfF;
    }

    public double eCZ() {
        return this.mjh;
    }

    public int AK() {
        return this.epc;
    }
}

