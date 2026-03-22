/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.list.array.TIntArrayList;
import java.nio.ByteBuffer;

/*
 * Renamed from fkW
 */
public class fkw_0
extends fkl_0 {
    private byte[] mcO = null;
    static final /* synthetic */ boolean sCV;
    final /* synthetic */ fkV sCW;

    public fkw_0(fkV fkV2) {
        this.sCW = fkV2;
    }

    void gcK() {
        this.mcO = null;
    }

    @Override
    public void g(ByteBuffer byteBuffer, int n) {
        int n2;
        int n3;
        this.sCW.gcH();
        int n4 = byteBuffer.getShort();
        TIntArrayList tIntArrayList = new TIntArrayList();
        for (n3 = 0; n3 < n4; ++n3) {
            n2 = byteBuffer.getInt();
            int n5 = byteBuffer.getInt();
            int[] nArray = new int[n5];
            for (int i = 0; i < n5; ++i) {
                nArray[i] = byteBuffer.getInt();
            }
            azm_1 azm_12 = (azm_1)this.sCW.sCS.get(n2);
            if (azm_12 != null && this.sCW.a(nArray, azm_12)) continue;
            this.sCW.sCS.remove(n2);
            this.sCW.j(n2, nArray);
            if (tIntArrayList.contains(n2)) continue;
            tIntArrayList.add(n2);
        }
        this.sCW.gcI();
        n2 = tIntArrayList.size();
        for (n3 = 0; n3 < n2; ++n3) {
            this.sCW.WR(tIntArrayList.getQuick(n3));
        }
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        if (this.mcO != null) {
            if (!sCV && byteBuffer.remaining() < this.mcO.length) {
                throw new AssertionError((Object)("Probl\u00e8me \u00e0 la s\u00e9rialisation : on veut mettre des data s\u00e9rialis\u00e9es d'une taille de " + this.mcO.length + " dans un buffer ou il ne reste que " + byteBuffer.remaining() + " octets"));
            }
            byteBuffer.put(this.mcO);
            return;
        }
        this.mcO = new byte[this.DN()];
        ByteBuffer byteBuffer2 = ByteBuffer.wrap(this.mcO);
        byteBuffer2.putShort((short)this.sCW.sCS.size());
        TIntObjectIterator tIntObjectIterator = this.sCW.sCS.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            byteBuffer2.putInt(tIntObjectIterator.key());
            azm_1 azm_12 = (azm_1)tIntObjectIterator.value();
            int n = azm_12.aVo();
            byteBuffer2.putInt(n);
            for (int i = 0; i < n; ++i) {
                byteBuffer2.putInt(azm_12.vM(i));
            }
        }
        byteBuffer2.flip();
        byteBuffer.put(byteBuffer2);
    }

    @Override
    public int DN() {
        if (this.mcO != null) {
            return this.mcO.length;
        }
        int n = 2 + this.sCW.sCS.size() * 8;
        TIntObjectIterator tIntObjectIterator = this.sCW.sCS.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            azm_1 azm_12 = (azm_1)tIntObjectIterator.value();
            n += 4 * azm_12.aVo();
        }
        return n;
    }

    static {
        sCV = !fkV.class.desiredAssertionStatus();
    }
}

