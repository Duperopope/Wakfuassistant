/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntIntIterator
 *  gnu.trove.map.hash.TIntIntHashMap
 *  gnu.trove.procedure.TIntIntProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntIntIterator;
import gnu.trove.map.hash.TIntIntHashMap;
import gnu.trove.procedure.TIntIntProcedure;
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from cmQ
 */
public class cmq_0
extends nv_0 {
    private static final Logger mbd = Logger.getLogger(cmq_0.class);
    private final TIntIntProcedure mbe = new cmr_0(this);
    final TIntIntHashMap mbf = new TIntIntHashMap();
    private long mbg = 0L;

    public void a(TIntIntHashMap tIntIntHashMap) {
        tIntIntHashMap.forEachEntry(this.mbe);
    }

    public void ny(long l) {
        this.mbg = l;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(8 + this.mbf.size() * 8);
        byteBuffer.putLong(this.mbg);
        TIntIntIterator tIntIntIterator = this.mbf.iterator();
        while (tIntIntIterator.hasNext()) {
            tIntIntIterator.advance();
            byteBuffer.putInt(tIntIntIterator.key());
            byteBuffer.putInt(tIntIntIterator.value());
        }
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12538;
    }
}

