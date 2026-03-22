/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.list.array.TLongArrayList
 *  gnu.trove.procedure.TIntProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.list.array.TLongArrayList;
import gnu.trove.procedure.TIntProcedure;
import org.apache.log4j.Logger;

public class eIb {
    private static final Logger quq = Logger.getLogger(eIb.class);
    private final int qur;
    private final short qus;
    private final long qut;
    private final boolean quu;
    private final short quv;
    private final TLongArrayList quw = new TLongArrayList();
    private final String qux;
    private final eIc quy;
    private final int quz;
    private final boolean quA;
    private final boolean quB;
    private final TIntArrayList quC = new TIntArrayList();
    private long aZD;

    public eIb(int n, short s, short s2, long l, long[] lArray, int[] nArray, boolean bl, boolean bl2, boolean bl3, String string, short s3, int n2) {
        this.qur = n;
        this.qus = s;
        this.qux = string;
        this.quy = eIc.dA(s3);
        if (s2 < 1 || s2 > 10) {
            quq.error((Object)("The minimal stasis for the dungeon with the id: " + l + " is outside the authorized bounds: " + s2 + ". Check the data validity."));
        }
        this.quv = GC.a(s2, (short)1, (short)10);
        this.qut = l;
        this.quw.add(lArray);
        this.quC.add(nArray);
        this.quA = bl;
        this.quB = bl2;
        this.quu = bl3;
        this.quz = n2;
    }

    public int d() {
        return this.qur;
    }

    public long aqZ() {
        return this.qut;
    }

    public short aVf() {
        return this.qus;
    }

    public boolean d(TIntProcedure tIntProcedure) {
        return this.quC.forEach(tIntProcedure);
    }

    public short cmS() {
        return this.quv;
    }

    public void cZ(long l) {
        this.aZD = l;
    }

    public long fwi() {
        return this.aZD;
    }

    public TLongArrayList fwj() {
        return this.quw;
    }

    public boolean cmT() {
        return this.quA;
    }

    public boolean cmU() {
        return this.quB;
    }

    public boolean cmV() {
        return this.quu;
    }

    public String cmY() {
        return this.qux;
    }

    public eIc dzH() {
        return this.quy;
    }

    public int ayQ() {
        return this.quz;
    }
}

