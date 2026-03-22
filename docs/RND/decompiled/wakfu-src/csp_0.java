/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from csp
 */
public class csp_0
extends nr_0 {
    private long lZd;
    private short lZm;
    private byte[] mhe;
    private boolean mgP;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.lZd = byteBuffer.getLong();
        this.lZm = byteBuffer.getShort();
        this.mhe = new byte[byteBuffer.getInt()];
        byteBuffer.get(this.mhe);
        this.mgP = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public int d() {
        return 12918;
    }

    public long eAP() {
        return this.lZd;
    }

    public short getDestinationPosition() {
        return this.lZm;
    }

    public byte[] eAQ() {
        return this.mhe;
    }

    public boolean eAB() {
        return this.mgP;
    }
}

