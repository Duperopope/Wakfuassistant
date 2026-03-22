/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

public class cqn
extends cqf {
    private byte lYb;
    private long[] meA;
    private byte[] meB;
    private long meC;
    private long meD;
    private short jiA;
    private etw_0 meE;
    private final ArrayList<Long> meF = new ArrayList();
    private final ArrayList<azx_1<Short, Short>> meG = new ArrayList();
    private byte[] meH;
    private long meI;
    private boolean meJ;
    private boolean meK;
    private boolean meL;
    private boolean meM;

    @Override
    public boolean dn(byte[] byArray) {
        int n;
        int n2;
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.fg(byteBuffer);
        this.lYb = byteBuffer.get();
        this.meC = byteBuffer.getLong();
        this.meD = byteBuffer.getLong();
        this.jiA = byteBuffer.getShort();
        this.meI = byteBuffer.getLong();
        int n3 = byteBuffer.get();
        for (n2 = 0; n2 < n3; ++n2) {
            this.meF.add(byteBuffer.getLong());
        }
        n2 = byteBuffer.getShort();
        this.meA = new long[n2];
        this.meB = new byte[n2];
        for (n = 0; n < n2; ++n) {
            this.meA[n] = byteBuffer.getLong();
            this.meB[n] = byteBuffer.get();
        }
        n = byteBuffer.get();
        this.meE = etw_0.fk((byte)n);
        this.meJ = byteBuffer.get() == 1;
        this.meK = byteBuffer.get() == 1;
        this.meL = byteBuffer.get() == 1;
        this.meM = byteBuffer.get() == 1;
        for (byte by = (byte)(byteBuffer.get() - 1); by >= 0; by = (byte)(by - 1)) {
            short s = byteBuffer.getShort();
            short s2 = byteBuffer.getShort();
            this.meG.add(new azx_1<Short, Short>(s, s2));
        }
        this.meH = new byte[byteBuffer.remaining()];
        byteBuffer.get(this.meH);
        return true;
    }

    public int exY() {
        return this.meA.length;
    }

    public long Li(int n) {
        return this.meA[n];
    }

    public byte Lj(int n) {
        return this.meB[n];
    }

    @Override
    public int d() {
        return 12670;
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

    public byte[] eyc() {
        return this.meH;
    }

    public etw_0 eyd() {
        return this.meE;
    }

    public ArrayList<Long> eye() {
        return this.meF;
    }

    public ArrayList<azx_1<Short, Short>> eyf() {
        return this.meG;
    }

    public short dGD() {
        return this.jiA;
    }

    public long eyg() {
        return this.meI;
    }

    public boolean eyh() {
        return this.meJ;
    }

    public boolean eyi() {
        return this.meK;
    }

    public boolean eyj() {
        return this.meL;
    }

    public boolean eyk() {
        return this.meM;
    }
}

