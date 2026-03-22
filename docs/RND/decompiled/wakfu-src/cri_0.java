/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from crI
 */
public class cri_0
extends nr_0 {
    private int eln;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.eln = byteBuffer.getInt();
        return true;
    }

    public int coF() {
        return this.eln;
    }

    @Override
    public int d() {
        return 15740;
    }
}

