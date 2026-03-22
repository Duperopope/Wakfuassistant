/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cpT
extends nr_0 {
    private int kMc;
    private byte[] men;
    private byte[] meo;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.kMc = byteBuffer.getInt();
        int n = byteBuffer.getInt();
        this.men = new byte[n];
        byteBuffer.get(this.men);
        int n2 = byteBuffer.getInt();
        this.meo = new byte[n2];
        byteBuffer.get(this.meo);
        return true;
    }

    @Override
    public int d() {
        return 13885;
    }

    public byte[] exJ() {
        return this.men;
    }

    public byte[] exK() {
        return this.meo;
    }

    public int exL() {
        return this.kMc;
    }
}

