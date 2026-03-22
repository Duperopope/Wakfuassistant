/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class ftH
implements Iterable<ftN> {
    private final long tgo;
    private final ftO tgp;
    private final List<ftN> tgq = new ArrayList<ftN>();

    public static ftH uP(long l) {
        return new ftI(l, ftO.tgA.get());
    }

    public ftH(long l, ftO ftO2) {
        this.tgo = l;
        this.tgp = ftO2;
    }

    public long aXb() {
        return this.tgo;
    }

    public ftO gmt() {
        return this.tgp;
    }

    public int aVo() {
        return this.tgq.size();
    }

    @Override
    @NotNull
    public Iterator<ftN> iterator() {
        return this.tgq.iterator();
    }

    int DN() {
        return 19 + this.tgq.size() * 14;
    }

    void gD(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.tgo);
        ftJ.a(this.tgp, byteBuffer);
        byteBuffer.put((byte)this.tgq.size());
        for (int i = 0; i < this.tgq.size(); ++i) {
            ftN ftN2 = this.tgq.get(i);
            ftN2.gD(byteBuffer);
        }
    }

    static ftH gE(ByteBuffer byteBuffer) {
        long l = byteBuffer.getLong();
        ftO ftO2 = ftJ.gI(byteBuffer);
        return new ftH(l, ftO2).gF(byteBuffer);
    }

    private ftH gF(ByteBuffer byteBuffer) {
        int n = byteBuffer.get();
        for (int i = 0; i < n; ++i) {
            this.tgq.add(ftN.gJ(byteBuffer));
        }
        return this;
    }

    public void a(int n, ftO ftO2) {
        this.tgq.add(new ftN(n, ftO2));
    }
}

