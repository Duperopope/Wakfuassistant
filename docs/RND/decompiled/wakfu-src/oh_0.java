/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from Oh
 */
public class oh_0
extends of_0 {
    private boolean aZq;
    private boolean aZr;

    @Override
    public boolean dn(byte[] byArray) {
        if (byArray.length == 0) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aZr = byteBuffer.get() > 0;
        this.aZq = byteBuffer.get() > 0;
        byte[] byArray2 = new byte[byteBuffer.remaining()];
        byteBuffer.get(byArray2);
        return super.dn(byArray2);
    }

    @Override
    public int d() {
        return 725;
    }

    public boolean aWT() {
        return this.aZq;
    }

    public boolean aWU() {
        return this.aZr;
    }
}

