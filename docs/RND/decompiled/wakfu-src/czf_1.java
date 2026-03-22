/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.procedure.TObjectProcedure;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cZf
 */
class czf_1
implements TObjectProcedure<fas_0> {
    private int oak;
    private int oal;
    private int oam;

    czf_1() {
    }

    public boolean c(fas_0 fas_02) {
        this.oak += fas_02.bsM();
        this.oal += fas_02.bsN();
        ++this.oam;
        return true;
    }

    @Nullable
    acc_1 eLj() {
        return this.oam > 0 ? new acc_1(this.oak / this.oam, this.oal / this.oam) : null;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.c((fas_0)object);
    }
}

