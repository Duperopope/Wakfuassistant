/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from aHC
 */
public class ahc_1 {
    private boolean bXs;
    private byte[] dRo;
    private ahe_1 dRp;

    public ahc_1(ahe_1 ahe_12) {
        this.dRp = ahe_12;
        this.bXs = false;
    }

    public boolean cdX() {
        int n;
        long l = this.dRp.ceh();
        if (l > Integer.MAX_VALUE) {
            throw new UnsupportedOperationException("Impossible de charger un son de plus de 2147483647 octets");
        }
        this.dRo = new byte[(int)l];
        ByteBuffer byteBuffer = ByteBuffer.wrap(this.dRo);
        int n2 = 0;
        do {
            n = this.dRp.f(byteBuffer, n2);
            n2 += n;
        } while (n > 0);
        this.dRp.close();
        this.bXs = true;
        return true;
    }

    public void close() {
        this.dRp.close();
        this.dRo = null;
        this.dRp = null;
        this.bXs = false;
    }

    public ahe_1 cdY() {
        return this.dRp;
    }

    public byte[] cdZ() {
        return this.dRo;
    }

    public int cea() {
        return this.dRo.length;
    }

    public boolean isInitialized() {
        return this.bXs;
    }

    public String toString() {
        return String.valueOf(this.dRp) + "\ninitialized=" + this.bXs;
    }
}

