/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cvK
 */
public class cvk_0
extends nr_0 {
    private int eiB;
    private int bMn;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.bMn = byteBuffer.getInt();
        this.eiB = byteBuffer.getInt();
        return true;
    }

    public int clS() {
        return this.eiB;
    }

    public int getDuration() {
        return this.bMn;
    }

    @Override
    public int d() {
        return 12869;
    }
}

