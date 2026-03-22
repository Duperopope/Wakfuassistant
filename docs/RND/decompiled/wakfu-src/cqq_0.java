/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TByteHashSet
 */
import gnu.trove.set.hash.TByteHashSet;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from cqq
 */
public class cqq_0
extends cqf {
    private byte lYb;
    private long brw;
    private long[] meA;
    private byte[] meP;
    private byte[] meB;
    private byte[] meQ;
    private byte[] meR;
    private byte[][] meS;
    private byte[][] meT;
    private byte[] meU;
    private long meC;
    private long meD;
    private cqr_0[] meV;
    private long meW;
    private long meX;
    private final List<byte[]> meY = new ArrayList<byte[]>();
    private boolean meZ;
    private final TByteHashSet mfa = new TByteHashSet();
    private final TByteHashSet mfb = new TByteHashSet();

    protected void fh(ByteBuffer byteBuffer) {
        int n;
        int n2;
        int n3;
        int n4;
        this.fg(byteBuffer);
        this.lYb = byteBuffer.get();
        this.brw = byteBuffer.getLong();
        this.meC = byteBuffer.getLong();
        this.meD = byteBuffer.getLong();
        int n5 = byteBuffer.getInt();
        this.meR = new byte[n5];
        byteBuffer.get(this.meR);
        this.meU = new byte[byteBuffer.getShort()];
        byteBuffer.get(this.meU);
        this.meW = byteBuffer.getLong();
        this.meX = byteBuffer.getLong();
        this.meZ = byteBuffer.get() == 1;
        int n6 = byteBuffer.get();
        this.meA = new long[n6];
        this.meP = new byte[n6];
        this.meB = new byte[n6];
        this.meQ = new byte[n6];
        this.meS = new byte[n6][];
        this.meT = new byte[n6][];
        for (n4 = 0; n4 < n6; ++n4) {
            this.meA[n4] = byteBuffer.getLong();
            this.meP[n4] = byteBuffer.get();
            this.meB[n4] = byteBuffer.get();
            this.meQ[n4] = byteBuffer.get();
            if (this.meZ) continue;
            this.meS[n4] = new byte[byteBuffer.getShort()];
            byteBuffer.get(this.meS[n4]);
            this.meT[n4] = new byte[byteBuffer.getShort()];
            byteBuffer.get(this.meT[n4]);
        }
        n4 = byteBuffer.get();
        this.meV = new cqr_0[n4];
        for (n3 = 0; n3 < n4; ++n3) {
            n2 = byteBuffer.get();
            long l = byteBuffer.getLong();
            this.meV[n3] = new cqr_0((byte)n2, l);
        }
        n3 = byteBuffer.get();
        for (n2 = 0; n2 < n3; ++n2) {
            this.mfa.add(byteBuffer.get());
        }
        n2 = byteBuffer.get();
        for (n = 0; n < n2; ++n) {
            this.mfb.add(byteBuffer.get());
        }
        n = byteBuffer.getInt();
        for (int i = 0; i < n; ++i) {
            byte[] byArray = new byte[byteBuffer.getInt()];
            byteBuffer.get(byArray);
            this.meY.add(byArray);
        }
    }

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.fh(byteBuffer);
        return true;
    }

    public int exY() {
        return this.meA.length;
    }

    public long Li(int n) {
        return this.meA[n];
    }

    public long[] eyn() {
        return this.meA;
    }

    public byte Lk(int n) {
        return this.meP[n];
    }

    public byte Lj(int n) {
        return this.meB[n];
    }

    public byte Ll(int n) {
        return this.meQ[n];
    }

    public byte[] Lm(int n) {
        return this.meS[n];
    }

    public byte[] Ln(int n) {
        return this.meT[n];
    }

    public byte[] eyo() {
        return this.meU;
    }

    @Override
    public int d() {
        return 13083;
    }

    public byte[] eyp() {
        return this.meR;
    }

    public byte exZ() {
        return this.lYb;
    }

    public long eya() {
        return this.meC;
    }

    public long eyb() {
        return this.meD;
    }

    public long eyq() {
        return this.meW;
    }

    public long eyr() {
        return this.meX;
    }

    public cqr_0[] eys() {
        return this.meV;
    }

    public TByteHashSet dGW() {
        return this.mfa;
    }

    public TByteHashSet eyt() {
        return this.mfb;
    }

    public List<byte[]> eyu() {
        return this.meY;
    }

    public boolean eyv() {
        return this.meZ;
    }
}

