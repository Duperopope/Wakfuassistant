/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntObjectProcedure
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.procedure.TIntObjectProcedure;
import gnu.trove.procedure.TObjectProcedure;
import org.apache.log4j.Logger;

/*
 * Renamed from eXd
 */
class exd_1 {
    private static final Logger rCZ = Logger.getLogger(exd_1.class);
    private final exf_2[] rDa = new exf_2[exx_2.fOO() + 1];

    exd_1() {
    }

    public boolean Z(byte by) {
        return this.rDa[by] != null;
    }

    public exf_2 fO(byte by) {
        return this.rDa[by];
    }

    public void a(byte by, exf_2 exf_22) {
        this.rDa[by] = exf_22;
    }

    public void c(TIntObjectProcedure<exf_2> tIntObjectProcedure) {
        int n = this.rDa.length;
        for (int i = 0; i < n; ++i) {
            exf_2 exf_22 = this.rDa[i];
            if (exf_22 == null || tIntObjectProcedure.execute(i, (Object)exf_22)) continue;
            return;
        }
    }

    public void D(TObjectProcedure<exf_2> tObjectProcedure) {
        for (exf_2 exf_22 : this.rDa) {
            if (exf_22 == null || tObjectProcedure.execute((Object)exf_22)) continue;
            return;
        }
    }
}

