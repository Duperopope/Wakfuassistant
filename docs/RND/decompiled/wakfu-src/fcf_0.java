/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from fcf
 */
public class fcf_0
implements TObjectProcedure<fam_0> {
    private final short rTj;
    private int dvq;

    public fcf_0(short s) {
        this.rTj = this.eI(s);
    }

    public boolean a(fam_0 fam_02) {
        if (this.rTj == this.eI(fam_02.erN().aIi())) {
            ++this.dvq;
        }
        return true;
    }

    private short eI(short s) {
        short s2 = s;
        fbu_0 fbu_02 = fbw_0.rSQ.eF(s);
        while (fbu_02 != null) {
            s2 = fbu_02.fSk();
            fbu_02 = fbw_0.rSQ.eF(fbu_02.fSk());
        }
        return s2;
    }

    public int eEl() {
        return this.dvq;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((fam_0)object);
    }
}

