/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cyT
 */
public class cyt_0
extends nr_0 {
    private long aDh;
    private eie_0 mmO;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDh = byteBuffer.getLong();
        this.mmO = eie_0.mL(byteBuffer.get()).orElse(eie_0.qwN);
        return true;
    }

    @Override
    public int d() {
        return 22489;
    }

    public long KU() {
        return this.aDh;
    }

    public eie_0 eFM() {
        return this.mmO;
    }
}

