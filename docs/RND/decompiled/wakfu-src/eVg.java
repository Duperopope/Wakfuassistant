/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class eVg {
    private final eVh rzo;
    private final long rzp;
    private final byte rzq;

    public eVg(eVh eVh2, long l, byte by) {
        this.rzo = eVh2;
        this.rzp = l;
        this.rzq = by;
    }

    public int DN() {
        return 10;
    }

    public void as(ByteBuffer byteBuffer) {
        byteBuffer.put(this.rzo.aJr());
        byteBuffer.putLong(this.rzp);
        byteBuffer.put(this.rzq);
    }

    public static eVg fH(ByteBuffer byteBuffer) {
        eVh eVh2 = eVh.fF(byteBuffer.get());
        long l = byteBuffer.getLong();
        byte by = byteBuffer.get();
        return new eVg(eVh2, l, by);
    }

    public boolean bfb() {
        return this.rzo != eVh.rzr;
    }

    public boolean fMV() {
        return this.rzo == eVh.rzt;
    }

    public long fMW() {
        return this.rzp;
    }

    public byte bcP() {
        return this.rzq;
    }
}

