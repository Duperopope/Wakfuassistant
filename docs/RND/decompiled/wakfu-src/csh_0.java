/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from csh
 */
public class csh_0
extends nr_0 {
    private int mgU;
    private int mgV;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mgU = byteBuffer.getInt();
        this.mgV = byteBuffer.getInt();
        return true;
    }

    public int eAH() {
        return this.mgU;
    }

    public int eAI() {
        return this.mgV;
    }

    @Override
    public int d() {
        return 12792;
    }
}

