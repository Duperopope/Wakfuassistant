/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.nio.ByteBuffer;

public class csR
extends nr_0 {
    private long aDh;
    private hQ mhI;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDh = byteBuffer.getLong();
        int n = byteBuffer.getInt();
        boolean bl = byteBuffer.get() == 1;
        byte[] byArray2 = new byte[n];
        byteBuffer.get(byArray2);
        if (bl) {
            try {
                byArray2 = fum_0.eY(byArray2);
                this.mhI = fhj.eP(byArray2);
            }
            catch (IOException iOException) {
                dwV.error((Object)("Unable to uncompress equipment inventory data for character " + this.aDh), (Throwable)iOException);
                this.mhI = hQ.KH().KN();
            }
        } else {
            this.mhI = fhj.eP(byArray2);
        }
        return true;
    }

    @Override
    public int d() {
        return 12602;
    }

    public long KU() {
        return this.aDh;
    }

    public hQ eBF() {
        return this.mhI;
    }
}

