/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cwa
 */
public final class cwa_0
extends nr_0 {
    private long aDh;
    private int cDu;
    private int eNR;
    private boolean eNS;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDh = byteBuffer.getLong();
        this.cDu = byteBuffer.getInt();
        this.eNR = byteBuffer.getInt();
        this.eNS = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public int d() {
        return 13462;
    }

    public long KU() {
        return this.aDh;
    }

    public int bBE() {
        return this.cDu;
    }

    public int eEB() {
        return this.eNR;
    }

    public boolean eEC() {
        return this.eNS;
    }
}

