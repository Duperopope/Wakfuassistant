/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from eYz
 */
class eyz_1
implements TObjectProcedure<ezz_1> {
    private final long rJV;

    eyz_1(long l) {
        this.rJV = l;
    }

    public boolean e(ezz_1 ezz_12) {
        return ezz_12.Xm() != this.rJV;
    }

    public String toString() {
        return "CheckMemberRank{m_rankId=" + this.rJV + "}";
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.e((ezz_1)object);
    }
}

