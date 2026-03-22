/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntIntIterator
 *  gnu.trove.map.hash.TIntIntHashMap
 */
import gnu.trove.iterator.TIntIntIterator;
import gnu.trove.map.hash.TIntIntHashMap;
import java.nio.ByteBuffer;

/*
 * Renamed from eLf
 */
public final class elf_0 {
    public static byte[] b(TIntIntHashMap tIntIntHashMap) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(tIntIntHashMap.size() * 8);
        TIntIntIterator tIntIntIterator = tIntIntHashMap.iterator();
        while (tIntIntIterator.hasNext()) {
            tIntIntIterator.advance();
            byteBuffer.putInt(tIntIntIterator.key());
            byteBuffer.putInt(tIntIntIterator.value());
        }
        return byteBuffer.array();
    }

    public static byte[] a(elc_0 elc_02) {
        azg_1 azg_12 = new azg_1();
        azg_12.gK(elc_02.LV());
        azg_12.vC(elc_02.rX());
        azg_12.gK(elc_02.bfl());
        azg_12.gK(elc_02.exO());
        azg_12.gK(elc_02.dzt());
        azg_12.aF(elc_02.fzq().aJr());
        azg_12.dH(elf_0.b(elc_02.fzo()));
        return azg_12.bTe();
    }

    public static elc_0 fv(ByteBuffer byteBuffer) {
        elc_0 elc_02 = new elc_0(byteBuffer.getLong(), byteBuffer.getInt(), byteBuffer.getLong(), byteBuffer.getLong());
        elc_02.lQ(byteBuffer.getLong());
        elc_02.a(elm_0.eY(byteBuffer.get()));
        elc_02.a(elf_0.fw(byteBuffer));
        return elc_02;
    }

    private static byte[] b(eLh eLh2) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(25);
        byteBuffer.putLong(eLh2.LV());
        byteBuffer.putLong(eLh2.fzt());
        byteBuffer.put(eLh2.fzw().aJr());
        byteBuffer.putLong(eLh2.eEh().bjB());
        return byteBuffer.array();
    }

    public static eLh fw(ByteBuffer byteBuffer) {
        eLh eLh2 = new eLh(byteBuffer.getLong(), byteBuffer.getLong());
        eLh2.a(elo_0.eZ(byteBuffer.get()));
        eLh2.D(uw_0.fn(byteBuffer.getLong()));
        return eLh2;
    }

    public static byte[] a(elb_0 elb_02) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(13);
        byteBuffer.putInt(elb_02.avr());
        byteBuffer.putLong(elb_02.pf());
        byteBuffer.put((byte)(elb_02.cum() ? 1 : 0));
        return byteBuffer.array();
    }

    public static elb_0 fx(ByteBuffer byteBuffer) {
        elb_0 elb_02 = new elb_0(byteBuffer.getInt());
        elb_02.ij(byteBuffer.getLong());
        elb_02.lJ(byteBuffer.get() == 1);
        return elb_02;
    }

    public static byte[] a(elk_0 elk_02) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(22);
        byteBuffer.putLong(elk_02.fzy());
        byteBuffer.putLong(elk_02.fzz());
        byteBuffer.putShort(elk_02.fzA());
        byteBuffer.putShort(elk_02.fzB());
        byteBuffer.putShort(elk_02.fzC());
        return byteBuffer.array();
    }

    public static elk_0 fy(ByteBuffer byteBuffer) {
        elk_0 elk_02 = new elk_0(byteBuffer.getLong(), byteBuffer.getLong(), byteBuffer.getShort(), byteBuffer.getShort(), byteBuffer.getShort());
        return elk_02;
    }
}

