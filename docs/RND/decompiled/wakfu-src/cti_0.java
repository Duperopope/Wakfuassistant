/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ctI
 */
public class cti_0
extends nr_0 {
    private int epQ;

    public int Xt() {
        return this.epQ;
    }

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.epQ = byteBuffer.getInt();
        return true;
    }

    @Override
    public int d() {
        return 12136;
    }
}

