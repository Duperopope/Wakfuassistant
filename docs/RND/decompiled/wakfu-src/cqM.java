/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.THashSet
 */
import gnu.trove.set.hash.THashSet;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public final class cqM
extends cqf {
    private byte meN;
    private int mft;
    private long mfu;
    private byte[] meO;
    private final THashSet<eVZ> mfv = new THashSet();
    private final List<byte[]> mfw = new ArrayList<byte[]>();
    private byte[] mfi;
    private byte[] mfx;

    @Override
    public boolean dn(byte[] byArray) {
        int n;
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.fg(byteBuffer);
        this.meN = byteBuffer.get();
        this.mft = byteBuffer.getInt();
        this.mfu = byteBuffer.getLong();
        this.meO = new byte[byteBuffer.getInt()];
        byteBuffer.get(this.meO);
        int n2 = byteBuffer.get();
        for (n = 0; n < n2; ++n) {
            this.mfv.add((Object)new eVZ(byteBuffer.getLong(), byteBuffer.getLong(), byteBuffer.getInt()));
        }
        n = byteBuffer.getInt();
        this.mfi = new byte[n];
        byteBuffer.get(this.mfi);
        int n3 = byteBuffer.getInt();
        this.mfx = new byte[n3];
        byteBuffer.get(this.mfx);
        return false;
    }

    public byte[] eym() {
        return this.meO;
    }

    public byte eyl() {
        return this.meN;
    }

    public int eyU() {
        return this.mft;
    }

    public long eyV() {
        return this.mfu;
    }

    public THashSet<eVZ> eyW() {
        return this.mfv;
    }

    public List<byte[]> eyu() {
        return this.mfw;
    }

    public byte[] eyG() {
        return this.mfi;
    }

    public byte[] eyX() {
        return this.mfx;
    }

    @Override
    public int d() {
        return 13976;
    }
}

