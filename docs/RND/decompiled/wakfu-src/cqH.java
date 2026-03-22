/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cqH
extends cqf {
    private eVg mfp;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.fg(byteBuffer);
        this.mfp = eVg.fH(byteBuffer);
        return true;
    }

    @Override
    public int d() {
        return 13842;
    }

    public eVg eyO() {
        return this.mfp;
    }
}

