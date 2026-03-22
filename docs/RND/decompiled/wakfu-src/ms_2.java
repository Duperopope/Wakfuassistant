/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 */
import gnu.trove.list.array.TLongArrayList;
import java.util.ArrayList;

/*
 * Renamed from MS
 */
public abstract class ms_2 {
    private final long aXv;
    private long aXw;
    private ms_2 aXx;
    private final short aXy;
    private final TLongArrayList aXz = new TLongArrayList();
    private final ArrayList<ms_2> aXA = new ArrayList();
    private final ArrayList<mt_2> aXB = new ArrayList();

    protected ms_2(short s, long l) {
        this.aXy = s;
        this.aXv = l;
    }

    public long Sn() {
        return this.aXv;
    }

    public long aVr() {
        return this.aXw;
    }

    protected void a(mt_2 mt_22) {
        this.aXB.add(mt_22);
    }

    public int aVs() {
        return this.aXB.size();
    }

    public mt_2 nO(int n) {
        return this.aXB.get(n);
    }

    public abstract String getDescription();

    public abstract int aVt();

    public abstract void aVu();
}

