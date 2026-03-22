/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.list.array.TLongArrayList
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  lombok.Generated
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.list.array.TLongArrayList;
import gnu.trove.map.hash.TLongObjectHashMap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import lombok.Generated;

/*
 * Renamed from bZP
 */
public class bzp_2
extends fsf {
    private final TLongObjectHashMap<bzq_2> lEn = new TLongObjectHashMap();

    private bzp_2() {
    }

    public static bzp_2 eqt() {
        return (bzp_2)tbp;
    }

    protected static fsf equ() {
        return new bzp_2();
    }

    public void dJ(String string) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(fo_0.by(string));
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        int n2 = byteBuffer.getShort();
        for (int i = 0; i < n2; ++i) {
            bzq_2 bzq_22 = new bzq_2(byteBuffer);
            this.lEn.put(bzq_22.lEo, (Object)bzq_22);
            bzq_22.lEL.forEachEntry((n, bzr_22) -> {
                for (bzs_2 bzs_22 : bzr_22.eqG()) {
                    for (int n2 : bzs_22.eqH()) {
                        bzt_2.lEV.ej(n2, bzr_22.lEM);
                    }
                    for (int n2 : bzs_22.eqI()) {
                        bzt_2.lEV.ek(n2, bzr_22.lEM);
                    }
                }
                return true;
            });
        }
    }

    public bzq_2 mA(long l) {
        boolean bl;
        boolean bl2 = bl = l < 0L;
        if (bl && !this.lEn.containsKey(l)) {
            bzq_2 bzq_22 = (bzq_2)this.lEn.get(375L);
            this.lEn.put(l, (Object)bzq_22.a(l, bzq_22));
        }
        return (bzq_2)this.lEn.get(l);
    }

    public TLongArrayList mB(long l) {
        TLongArrayList tLongArrayList = new TLongArrayList();
        TLongObjectIterator tLongObjectIterator = this.lEn.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            if (((bzq_2)tLongObjectIterator.value()).lEq != l) continue;
            tLongArrayList.add(tLongObjectIterator.key());
        }
        return tLongArrayList;
    }

    public static void bkZ() {
        tbp = new bzp_2();
    }

    @Generated
    public TLongObjectHashMap<bzq_2> eqv() {
        return this.lEn;
    }

    @Override
    public /* synthetic */ fse_0 mC(long l) {
        return this.mA(l);
    }
}

