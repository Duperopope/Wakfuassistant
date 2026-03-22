/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cqc
 */
public class cqc_0
extends nr_0 {
    private long lXG;
    private long aZj;
    private ett_0 mer;
    private long meu;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.lXG = byteBuffer.getLong();
        this.aZj = byteBuffer.getLong();
        this.mer = ett_0.fj(byteBuffer.get());
        this.meu = byteBuffer.getLong();
        return true;
    }

    public long exN() {
        return this.lXG;
    }

    public long fD() {
        return this.aZj;
    }

    public ett_0 exQ() {
        return this.mer;
    }

    public long exS() {
        return this.meu;
    }

    @Override
    public int d() {
        return 12247;
    }
}

