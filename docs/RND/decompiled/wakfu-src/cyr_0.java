/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cyR
 */
public class cyr_0
extends nr_0 {
    private byte kIf;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.kIf = byteBuffer.get();
        return true;
    }

    @Override
    public int d() {
        return 22830;
    }

    public byte evi() {
        return this.kIf;
    }
}

