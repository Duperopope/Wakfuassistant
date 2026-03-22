/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongLongIterator
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongLongHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.iterator.TLongLongIterator;
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongLongHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;

public class fkJ {
    protected final fjo_0 sCg;
    private final TLongObjectHashMap<fkH> sCh = new TLongObjectHashMap();
    private final TLongLongHashMap sCi = new TLongLongHashMap();
    private final ArrayList<fkI> sCj = new ArrayList();

    public fkJ(fjo_0 fjo_02) {
        this.sCg = fjo_02;
    }

    public void a(fkI fkI2) {
        if (!this.sCj.contains(fkI2)) {
            this.sCj.add(fkI2);
        }
    }

    public void b(fkI fkI2) {
        this.sCj.remove(fkI2);
    }

    public void d(fkH fkH2) {
        if (this.sCi.contains(fkH2.Sn()) || this.sCh.contains(fkH2.emF().Sn())) {
            this.rx(fkH2.Sn());
        }
        this.sCh.put(fkH2.emF().Sn(), (Object)fkH2);
        this.sCi.put(fkH2.Sn(), fkH2.emF().Sn());
        for (int i = 0; i < this.sCj.size(); ++i) {
            this.sCj.get(i).b(fkH2);
        }
    }

    public void rx(long l) {
        long l2 = this.sCi.remove(l);
        fkH fkH2 = (fkH)this.sCh.remove(l2);
        for (int i = 0; i < this.sCj.size(); ++i) {
            this.sCj.get(i).c(fkH2);
        }
    }

    public void d(fkL fkL2) {
        fkH fkH2 = (fkH)this.sCh.get(fkL2.Sn());
        if (fkH2 != null) {
            this.rx(fkH2.Sn());
        }
    }

    public void gcv() {
        TLongLongIterator tLongLongIterator = this.sCi.iterator();
        while (tLongLongIterator.hasNext()) {
            tLongLongIterator.advance();
            fkH fkH2 = (fkH)this.sCh.remove(tLongLongIterator.value());
            tLongLongIterator.remove();
            for (int i = 0; i < this.sCj.size(); ++i) {
                this.sCj.get(i).c(fkH2);
            }
        }
    }

    public void clear() {
        this.sCh.clear();
        this.sCi.clear();
    }

    @Nullable
    public fkH gcw() {
        return (fkH)this.sCh.get(fkL.sCr.Sn());
    }

    @Nullable
    public fkH uc(long l) {
        return (fkH)this.sCh.get(this.sCi.get(l));
    }

    @Nullable
    public fkH e(fkL fkL2) {
        return (fkH)this.sCh.get(fkL2.Sn());
    }

    public TLongObjectIterator<fkH> gcx() {
        return this.sCh.iterator();
    }

    public void as(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.sCh.size());
        TLongObjectIterator tLongObjectIterator = this.sCh.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            ((fkH)tLongObjectIterator.value()).as(byteBuffer);
        }
    }

    public void eL(ByteBuffer byteBuffer) {
        int n = byteBuffer.getInt();
        for (int i = 0; i < n; ++i) {
            fkH fkH2 = fkH.gm(byteBuffer);
            this.sCh.put(fkH2.emF().Sn(), (Object)fkH2);
            this.sCi.put(fkH2.Sn(), fkH2.emF().Sn());
        }
    }

    public int DN() {
        int n = 4;
        TLongObjectIterator tLongObjectIterator = this.sCh.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            n += ((fkH)tLongObjectIterator.value()).DN();
        }
        return n;
    }
}

