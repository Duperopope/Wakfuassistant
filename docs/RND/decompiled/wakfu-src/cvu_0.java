/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cvU
 */
public class cvu_0
extends nr_0 {
    private zu_2 mkF;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mkF = zu_2.el(byteBuffer);
        return true;
    }

    @Override
    public int d() {
        return 13046;
    }

    public zu_2 eEw() {
        return this.mkF;
    }
}

