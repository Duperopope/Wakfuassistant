/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TShortShortHashMap
 *  gnu.trove.procedure.TShortShortProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TShortShortHashMap;
import gnu.trove.procedure.TShortShortProcedure;
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class ewf
extends WH {
    private static final Logger oye = Logger.getLogger(ewf.class);
    private final TShortShortHashMap oyf = new TShortShortHashMap();

    public ewf(int n, int n2) {
        this.bap = n * 18;
        this.baq = n2 * 18;
    }

    public void aj(int n, int n2, short s) {
        assert (this.aK(n, n2));
        short s2 = this.fa(n, n2);
        this.oyf.put(s2, s);
    }

    @Override
    public int a(int n, int n2, wt_0[] wt_0Array, int n3) {
        assert (this.a(n, n2, wt_0Array));
        wt_0 wt_02 = wt_0Array[n3];
        wt_02.bap = n;
        wt_02.baq = n2;
        wt_02.ban = this.eZ(n, n2);
        boolean bl = this.aJ(n, n2);
        wt_02.bNP = (byte)(bl ? -1 : 7);
        wt_02.bNr = false;
        wt_02.aXR = (byte)(bl ? 127 : 0);
        wt_02.bNQ = 0;
        wt_02.bNR = 0;
        return 1;
    }

    @Override
    public short aL(int n, int n2) {
        return 0;
    }

    @Override
    public int a(int n, int n2, wu_0[] wu_0Array, int n3) {
        assert (this.a(n, n2, wu_0Array));
        wu_0 wu_02 = wu_0Array[n3];
        wu_02.bap = n;
        wu_02.baq = n2;
        wu_02.ban = this.eZ(n, n2);
        wu_02.bNr = false;
        wu_02.aXR = (byte)(this.aJ(n, n2) ? 127 : 0);
        return 1;
    }

    public void d(azg_1 azg_12) {
        int n = this.oyf.size();
        azg_12.aG((short)n);
        this.oyf.forEachEntry((TShortShortProcedure)new ewg(this, azg_12));
    }

    public void eU(ByteBuffer byteBuffer) {
        assert (this.oyf.isEmpty());
        int n = byteBuffer.getShort();
        for (int i = 0; i < n; ++i) {
            short s = byteBuffer.getShort();
            short s2 = byteBuffer.getShort();
            this.oyf.put(s, s2);
        }
    }

    @Override
    public final boolean aJ(int n, int n2) {
        if (!this.oyf.contains(this.fa(n, n2))) {
            return true;
        }
        return super.aJ(n, n2);
    }

    public final short eZ(int n, int n2) {
        short s = this.fa(n, n2);
        short s2 = this.oyf.get(s);
        if (s2 != 0) {
            return s2;
        }
        return this.oyf.contains(s) ? s2 : (short)Short.MIN_VALUE;
    }

    private short fa(int n, int n2) {
        byte by = (byte)(n - this.bap);
        byte by2 = (byte)(n2 - this.baq);
        return GC.d(by, by2);
    }
}

