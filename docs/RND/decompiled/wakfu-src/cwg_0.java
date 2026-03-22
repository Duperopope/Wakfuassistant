/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cwg
 */
public class cwg_0
extends nr_0 {
    private boolean mkM;
    private boolean mkN;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mkM = byteBuffer.get(0) == 1;
        this.mkN = byteBuffer.get(1) == 1;
        return true;
    }

    @Override
    public int d() {
        return 13434;
    }

    public boolean bfb() {
        return this.mkM;
    }

    public boolean eEG() {
        return this.mkN;
    }
}

