/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ctK
 */
public class ctk_0
extends nr_0 {
    private boolean asG;

    public boolean aGv() {
        return this.asG;
    }

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.asG = byteBuffer.get() != 0;
        return true;
    }

    @Override
    public int d() {
        return 13385;
    }
}

