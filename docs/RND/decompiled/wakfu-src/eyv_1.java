/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eYv
 */
public final class eyv_1 {
    private final eyt_1 rJN;

    public eyv_1(eyt_1 eyt_12) {
        this.rJN = eyt_12;
    }

    public void eK(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.rJN.ps(byteBuffer.getLong());
    }

    public byte[] apI() {
        azg_1 azg_12 = new azg_1();
        azg_12.gK(this.rJN.fmo());
        return azg_12.bTe();
    }
}

