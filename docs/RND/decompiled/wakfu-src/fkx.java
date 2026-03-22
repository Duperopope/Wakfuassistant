/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 */
import gnu.trove.iterator.TLongObjectIterator;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public class fkx {
    private final uw_0 sBV;
    protected final ArrayList<fkw> sBW = new ArrayList();
    protected int sBX = 0;

    public fkx() {
        this.sBV = uw_0.fn(0L);
    }

    public int ekU() {
        return this.sBW.size();
    }

    public int ekZ() {
        return this.sBX;
    }

    public uw_0 gcq() {
        return this.sBV;
    }

    public void d(int n, int n2, ArrayList<fkw> arrayList) {
        int n3 = n + Math.min(n2, this.sBW.size() - n);
        for (int i = n; i < n3; ++i) {
            arrayList.add(this.sBW.get(i));
        }
    }

    public void p(fjo_0 fjo_02) {
        this.sBV.cH(fjo_02.eCK().bjB());
        this.sBX = 0;
        TLongObjectIterator<fkw> tLongObjectIterator = fjo_02.gbz();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            fkw fkw2 = (fkw)tLongObjectIterator.value();
            this.sBW.add(fkw2);
            this.sBX += fkw2.gco();
        }
        this.sBW.sort(exm.oXz);
    }

    public void as(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.sBV.bjB());
        byteBuffer.putInt(this.sBX);
        byteBuffer.putShort((short)this.sBW.size());
        for (int i = 0; i < this.sBW.size(); ++i) {
            this.sBW.get(i).as(byteBuffer);
        }
    }

    public void eL(ByteBuffer byteBuffer) {
        this.sBW.clear();
        this.sBV.cH(byteBuffer.getLong());
        this.sBX = byteBuffer.getInt();
        int n = byteBuffer.getShort();
        for (int i = 0; i < n; ++i) {
            this.sBW.add(fkw.gl(byteBuffer));
        }
    }

    public int DN() {
        int n = 14;
        for (int i = 0; i < this.sBW.size(); ++i) {
            n += this.sBW.get(i).DN();
        }
        return n;
    }

    public void clear() {
        this.sBV.cH(0L);
        this.sBW.clear();
        this.sBX = 0;
    }
}

