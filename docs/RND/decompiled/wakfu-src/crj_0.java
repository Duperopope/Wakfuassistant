/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from crJ
 */
public class crj_0
extends nr_0 {
    private int eln;
    private int mgu;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.eln = byteBuffer.getInt();
        this.mgu = byteBuffer.getInt();
        return true;
    }

    public int coF() {
        return this.eln;
    }

    public int eAl() {
        return this.mgu;
    }

    @Override
    public int d() {
        return 14392;
    }
}

