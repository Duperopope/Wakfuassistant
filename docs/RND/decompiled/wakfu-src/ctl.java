/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class ctl
extends nr_0 {
    private final wa_2 mia = new wa_2();

    public wa_2 eBY() {
        return this.mia;
    }

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mia.aG(byteBuffer);
        return true;
    }

    @Override
    public int d() {
        return 12542;
    }
}

