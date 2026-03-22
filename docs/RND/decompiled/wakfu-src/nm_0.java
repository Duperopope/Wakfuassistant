/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from NM
 */
public class nm_0
extends nn_0 {
    private int aYR;

    @Override
    public boolean dn(byte[] byArray) {
        if (byArray.length == 0) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aYR = byteBuffer.getInt();
        return this.b(byArray, byteBuffer.position());
    }

    public int aWt() {
        return this.aYR;
    }

    @Override
    public int d() {
        return 691;
    }
}

