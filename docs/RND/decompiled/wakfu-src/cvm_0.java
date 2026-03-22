/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cvm
 */
public class cvm_0
extends nr_0 {
    private short iiM;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.iiM = byteBuffer.getShort();
        return true;
    }

    public short dpx() {
        return this.iiM;
    }

    @Override
    public int d() {
        return 13441;
    }
}

