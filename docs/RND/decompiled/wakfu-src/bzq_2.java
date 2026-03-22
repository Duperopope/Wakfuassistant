/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import java.nio.ByteBuffer;

/*
 * Renamed from bZQ
 */
public class bzq_2
implements fse_0 {
    public final long lEo;
    public mo_1[] lEp;
    public final long lEq;
    public final int lEr;
    public final awx_2 lEs = new awx_2(new float[0]);
    public final byte lEt;
    public final boolean lEu;
    public final boolean lEv;
    public final boolean lEw;
    public final boolean lEx;
    public final boolean lEy;
    public final boolean lEz;
    public final boolean lEA;
    public final boolean lEB;
    public final boolean lEC;
    public final fsj_0 lED;
    public final awx_2 lEE = new awx_2(new float[0]);
    public final awx_2 lEF = new awx_2(new float[0]);
    public final short lEG;
    public final boolean lEH;
    public final boolean lEI;
    public final boolean lEJ;
    public final TLongObjectHashMap<bJK> lEK = new TLongObjectHashMap();
    public final TIntObjectHashMap<bzr_2> lEL = new TIntObjectHashMap();

    public void a(fnr fnr2) {
        this.lEp = new mo_1[]{new mo_1(fnr2.geq(), true, fnr2.coi(), fnr2.getZoom(), fnr2.coh())};
    }

    public bzq_2(long l, short s, int n, axb_2 axb_22, axb_2 axb_23, byte by, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, mo_1[] mo_1Array, boolean bl6, boolean bl7, short s2, fsj_0 fsj_02, axb_2 axb_24, boolean bl8, boolean bl9, boolean bl10, boolean bl11, boolean bl12) {
        this.lEo = l;
        this.lEq = s;
        this.lEr = n;
        this.lEu = bl;
        this.lEv = bl12;
        this.lEs.op(axb_24.aTn());
        this.lEF.op(axb_22.aTn());
        this.lEE.op(axb_23.aTn());
        this.lEp = mo_1Array;
        this.lEt = by;
        this.lEx = bl2;
        this.lEy = bl3;
        this.lEz = bl4;
        this.lEA = bl5;
        this.lEB = bl6;
        this.lEC = bl7;
        this.lED = fsj_02;
        this.lEG = s2;
        this.lEI = bl9;
        this.lEH = bl8;
        this.lEJ = bl10;
        this.lEw = bl11;
    }

    bzq_2(ByteBuffer byteBuffer) {
        int n;
        int n2;
        this.lEo = byteBuffer.getLong();
        this.lEq = byteBuffer.getLong();
        this.lEr = byteBuffer.getInt();
        this.lEF.op(byteBuffer.getInt());
        this.lEE.op(byteBuffer.getInt());
        byte by = byteBuffer.get();
        if (by == 0) {
            this.lEp = null;
        } else {
            this.lEp = new mo_1[by];
            for (n2 = 0; n2 < this.lEp.length; ++n2) {
                this.lEp[n2] = new mo_1(byteBuffer);
            }
        }
        this.lEt = byteBuffer.get();
        this.lEu = byteBuffer.get() != 0;
        this.lEw = byteBuffer.get() != 0;
        this.lEv = byteBuffer.get() != 0;
        this.lEx = byteBuffer.get() != 0;
        this.lEJ = byteBuffer.get() != 0;
        this.lEy = byteBuffer.get() != 0;
        this.lEz = byteBuffer.get() != 0;
        this.lEA = byteBuffer.get() != 0;
        this.lEB = byteBuffer.get() != 0;
        this.lEC = byteBuffer.get() != 0;
        this.lED = fsj_0.hH(byteBuffer.get());
        this.lEs.op(byteBuffer.getInt());
        this.lEI = byteBuffer.get() != 0;
        this.lEH = byteBuffer.get() != 0;
        this.lEG = byteBuffer.getShort();
        n2 = byteBuffer.get() & 0xFF;
        for (n = 0; n < n2; ++n) {
            bJK bJK2 = new bJK();
            bJK2.fK(this.lEo);
            bJK2.eO(byteBuffer);
            if (fsk_0.tcp.contains((long)bJK2.d())) continue;
            this.lEK.put((long)bJK2.d(), (Object)bJK2);
            fpk.sNF.e(bJK2);
        }
        n = byteBuffer.get() & 0xFF;
        for (int i = 0; i < n; ++i) {
            bzr_2 bzr_22 = new bzr_2(byteBuffer);
            this.lEL.put(bzr_22.lEM, (Object)bzr_22);
        }
    }

    @Override
    public boolean eqw() {
        return this.lEv;
    }

    @Override
    public boolean dYb() {
        return this.lEu;
    }

    @Override
    public boolean eqx() {
        return this.lEw;
    }

    public boolean eqy() {
        return this.lEy || this.lEz || this.lEA;
    }

    @Override
    public boolean eqz() {
        return this.lEA;
    }

    public void a(bzr_2 bzr_22) {
        this.lEL.put(bzr_22.lEM, (Object)bzr_22);
    }

    public void g(bJK bJK2) {
        this.lEK.put((long)bJK2.d(), (Object)bJK2);
    }

    public final Vf eqA() {
        return Vf.ah(this.lEt);
    }

    public void b(fs_0 fs_02) {
        int n;
        int n2;
        fs_02.cq(this.lEo);
        fs_02.cq(this.lEq);
        fs_02.mz(this.lEr);
        fs_02.mz(this.lEF.aTn());
        fs_02.mz(this.lEE.aTn());
        if (this.lEp == null) {
            fs_02.g((byte)0);
        } else {
            fs_02.g((byte)this.lEp.length);
            for (n2 = 0; n2 < this.lEp.length; ++n2) {
                this.lEp[n2].a(fs_02);
            }
        }
        fs_02.g(this.lEt);
        fs_02.g((byte)(this.lEu ? 1 : 0));
        fs_02.g((byte)(this.lEw ? 1 : 0));
        fs_02.g((byte)(this.lEv ? 1 : 0));
        fs_02.g((byte)(this.lEx ? 1 : 0));
        fs_02.g((byte)(this.lEJ ? 1 : 0));
        fs_02.g((byte)(this.lEy ? 1 : 0));
        fs_02.g((byte)(this.lEz ? 1 : 0));
        fs_02.g((byte)(this.lEA ? 1 : 0));
        fs_02.g((byte)(this.lEB ? 1 : 0));
        fs_02.g((byte)(this.lEC ? 1 : 0));
        fs_02.g(this.lED.aJr());
        fs_02.mz(this.lEs.aTn());
        fs_02.g(this.lEI ? (byte)1 : 0);
        fs_02.g(this.lEH ? (byte)1 : 0);
        fs_02.k(this.lEG);
        n2 = this.lEK.size();
        if (n2 >= 255) {
            throw new IllegalArgumentException("trop de territoire dans le monde " + this.lEo);
        }
        fs_02.g((byte)n2);
        TLongObjectIterator tLongObjectIterator = this.lEK.iterator();
        for (n = 0; n < n2; ++n) {
            tLongObjectIterator.advance();
            ((bJK)tLongObjectIterator.value()).a(fs_02);
        }
        n = this.lEL.size();
        if (n >= 255) {
            throw new IllegalArgumentException("trop de territoire dans le monde " + this.lEo);
        }
        fs_02.g((byte)n);
        TIntObjectIterator tIntObjectIterator = this.lEL.iterator();
        for (int i = 0; i < n; ++i) {
            tIntObjectIterator.advance();
            ((bzr_2)tIntObjectIterator.value()).a(fs_02);
        }
    }

    public bJK JN(int n) {
        return (bJK)this.lEK.get((long)n);
    }

    public bzr_2 JO(int n) {
        return (bzr_2)this.lEL.get(n);
    }

    public TLongObjectIterator<bJK> eqB() {
        return this.lEK.iterator();
    }

    public int eqC() {
        return this.lEp == null ? 0 : this.lEp.length;
    }

    public mo_1 JP(int n) {
        return this.lEp[n];
    }

    public bzq_2 a(long l, bzq_2 bzq_22) {
        return new bzq_2(l, (short)bzq_22.lEq, bzq_22.lEr, bzq_22.lEF, bzq_22.lEE, bzq_22.lEt, bzq_22.lEu, bzq_22.lEx, bzq_22.lEy, bzq_22.lEz, bzq_22.lEA, bzq_22.lEp, bzq_22.lEB, bzq_22.lEC, bzq_22.lEG, bzq_22.lED, bzq_22.lEs, bzq_22.lEH, bzq_22.lEI, bzq_22.lEJ, bzq_22.eqx(), bzq_22.lEv);
    }
}

