/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 */
import gnu.trove.iterator.TLongObjectIterator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface RQ<ContentType extends RT> {
    public long Sn();

    public String getName();

    public void a(St var1);

    public void a(long var1, ContentType var3);

    public ContentType dE(long var1);

    public TLongObjectIterator<ContentType> beK();

    default public Map<Long, ContentType> beV() {
        HashMap<Long, RT> hashMap = new HashMap<Long, RT>(this.beI());
        TLongObjectIterator<ContentType> tLongObjectIterator = this.beK();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            hashMap.put(tLongObjectIterator.key(), (RT)tLongObjectIterator.value());
        }
        return hashMap;
    }

    default public List<ContentType> beW() {
        ArrayList<RT> arrayList = new ArrayList<RT>();
        TLongObjectIterator<ContentType> tLongObjectIterator = this.beK();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            arrayList.add((RT)tLongObjectIterator.value());
        }
        arrayList.sort(Comparator.comparingLong(RT::LV));
        return arrayList;
    }

    public boolean aLB();

    public void bj(boolean var1);

    public void dG(long var1);

    public void clear();

    public int beI();

    public boolean beJ();
}

