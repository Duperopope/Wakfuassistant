/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cqJ
 */
public class cqj_0
extends nr_0 {
    private ftJ mfr;
    private boolean mfs;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mfs = byteBuffer.get() != 0;
        this.mfr = ftJ.gG(byteBuffer);
        if (byteBuffer.hasRemaining()) {
            dwV.error((Object)("Il reste " + byteBuffer.remaining() + " bytes inutilis\u00e9s"));
            return false;
        }
        return true;
    }

    @Override
    public int d() {
        return 12913;
    }

    public int aVo() {
        return this.mfr.aVo();
    }

    public ftJ eyQ() {
        return this.mfr;
    }

    public boolean eyR() {
        return this.mfs;
    }
}

