/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cvx
 */
public class cvx_0
extends nr_0 {
    private int hWI;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.hWI = byteBuffer.getInt();
        return true;
    }

    @Override
    public int d() {
        return 12498;
    }

    public int diy() {
        return this.hWI;
    }
}

