/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cor
 */
public class cor_0
extends nr_0 {
    private long aZQ;
    private int mcT;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aZQ = byteBuffer.getLong();
        this.mcT = byteBuffer.getInt();
        return true;
    }

    public long aXb() {
        return this.aZQ;
    }

    public int ewh() {
        return this.mcT;
    }

    @Override
    public int d() {
        return 13703;
    }
}

