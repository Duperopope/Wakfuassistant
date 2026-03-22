/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TLongObjectProcedure
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TLongObjectProcedure;

/*
 * Renamed from eYr
 */
class eyr_1
implements TLongObjectProcedure<exz_1> {
    private final int rJK;
    private final TLongObjectHashMap<exz_1> rJL;

    eyr_1(int n, TLongObjectHashMap<exz_1> tLongObjectHashMap) {
        this.rJK = n;
        this.rJL = tLongObjectHashMap;
    }

    public boolean a(long l, exz_1 exz_12) {
        if (exz_12.aeV() == this.rJK) {
            this.rJL.put(l, (Object)exz_12);
        }
        return true;
    }

    public String toString() {
        return "MembersTypeProcedure{m_type=" + this.rJK + ", m_res=" + String.valueOf(this.rJL) + "}";
    }

    public /* synthetic */ boolean execute(long l, Object object) {
        return this.a(l, (exz_1)object);
    }
}

