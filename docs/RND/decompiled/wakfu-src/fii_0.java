/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from fii
 */
public class fii_0
extends fif
implements fig {
    private short rPf;
    private boolean srt;

    public fii_0(short s) {
        this.rPf = s;
    }

    public fii_0() {
    }

    public short fQY() {
        return this.rPf;
    }

    @Override
    public byte fZw() {
        return 2;
    }

    public boolean fZx() {
        return this.srt;
    }

    public void nu(boolean bl) {
        this.srt = bl;
    }

    @Override
    public void al(short s) {
        this.rPf = s;
    }

    @Override
    public void e(azg_1 azg_12) {
        azg_12.aG(this.rPf);
    }

    @Override
    public void eM(ByteBuffer byteBuffer) {
        this.rPf = byteBuffer.getShort();
    }
}

