/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.nio.ByteBuffer;

/*
 * Renamed from cjd
 */
public class cjd_0
extends nv_0 {
    private final long lVN;
    private TIntArrayList lVO = new TIntArrayList();
    private TIntObjectHashMap<blb_2> lVP = new TIntObjectHashMap();

    public cjd_0(long l) {
        this.lVN = l;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(8 + (this.lVO != null ? this.lVO.size() : 0) * 4 + 2 + 21 * (this.lVP != null ? this.lVP.size() : 0) + 2);
        byteBuffer.putLong(this.lVN);
        if (this.lVO != null) {
            byteBuffer.putShort((short)this.lVO.size());
            for (int i = 0; i < this.lVO.size(); ++i) {
                byteBuffer.putInt(this.lVO.get(i));
            }
            this.lVO = null;
        } else {
            byteBuffer.putShort((short)0);
        }
        if (this.lVP != null) {
            byteBuffer.putShort((short)this.lVP.size());
            TIntObjectIterator tIntObjectIterator = this.lVP.iterator();
            while (tIntObjectIterator.hasNext()) {
                tIntObjectIterator.advance();
                byteBuffer.putInt(tIntObjectIterator.key());
                yi_2 yi_22 = new yi_2();
                ((blb_2)tIntObjectIterator.value()).c(yi_22);
                yi_22.aF(byteBuffer);
            }
            this.lVP = null;
        } else {
            byteBuffer.putShort((short)0);
        }
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 13058;
    }

    public void a(byte by, byte by2, byte by3, blb_2 blb_22) {
        int n = this.d(by, by2, by3);
        this.lVP.put(n, (Object)blb_22);
    }

    public void c(byte by, byte by2, byte by3) {
        this.lVO.add(this.d(by, by2, by3));
    }

    private int d(byte by, byte by2, byte by3) {
        return (by << 16) + (by2 << 8) + by3;
    }
}

