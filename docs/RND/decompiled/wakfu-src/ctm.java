/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class ctm
extends nr_0 {
    private long mib;
    private float iHH;
    private float iHI;
    private final wa_2 mic = new wa_2();

    public long eBZ() {
        return this.mib;
    }

    public wa_2 eBY() {
        return this.mic;
    }

    public float dyC() {
        return this.iHH;
    }

    public float dyB() {
        return this.iHI;
    }

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mib = byteBuffer.getLong();
        this.iHH = byteBuffer.getFloat();
        this.iHI = byteBuffer.getFloat();
        this.mic.aG(byteBuffer);
        return true;
    }

    @Override
    public int d() {
        return 13356;
    }
}

