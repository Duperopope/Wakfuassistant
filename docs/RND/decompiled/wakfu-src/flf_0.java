/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 */
import gnu.trove.iterator.TLongObjectIterator;
import java.nio.ByteBuffer;

/*
 * Renamed from flf
 */
public class flf_0
extends fkl_0 {
    final /* synthetic */ fld_0 sDP;

    public flf_0(fld_0 fld_02) {
        this.sDP = fld_02;
    }

    @Override
    public void g(ByteBuffer byteBuffer, int n) {
        this.sDP.sDv.clear();
        int n2 = byteBuffer.getInt();
        while (n2-- > 0) {
            fkw fkw2 = fkw.gl(byteBuffer);
            this.sDP.sDv.put(fkw2.Sn(), (Object)fkw2);
        }
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.sDP.sDv.size());
        TLongObjectIterator tLongObjectIterator = this.sDP.sDv.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            fkw fkw2 = (fkw)tLongObjectIterator.value();
            fkw2.b(byteBuffer, true);
        }
    }

    @Override
    public int DN() {
        int n = 4;
        TLongObjectIterator tLongObjectIterator = this.sDP.sDv.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            n += ((fkw)tLongObjectIterator.value()).DN();
        }
        return n;
    }
}

