/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from crG
 */
public class crg_0
extends nr_0 {
    private int dII;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.dII = byteBuffer.getInt();
        return true;
    }

    @Override
    public int d() {
        return 12033;
    }

    public int cax() {
        return this.dII;
    }
}

