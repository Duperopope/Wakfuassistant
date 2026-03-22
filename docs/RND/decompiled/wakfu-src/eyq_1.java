/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.List;

/*
 * Renamed from eYq
 */
class eyq_1
implements TObjectProcedure<exz_1> {
    private final long rJI;
    private final List<exz_1> rJJ;

    eyq_1(long l, List<exz_1> list) {
        this.rJI = l;
        this.rJJ = list;
    }

    public boolean c(exz_1 exz_12) {
        if (exz_12.aZj() == this.rJI) {
            this.rJJ.add(exz_12);
        }
        return true;
    }

    public String toString() {
        return "GetOwnedMembersProcedure{m_clientId=" + this.rJI + ", m_res=" + String.valueOf(this.rJJ) + "}";
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.c((exz_1)object);
    }
}

