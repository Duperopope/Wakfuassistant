/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TByteObjectProcedure
 */
import gnu.trove.procedure.TByteObjectProcedure;
import java.util.Iterator;

class eLB
implements TByteObjectProcedure<ele_0> {
    private long cwe;

    eLB(long l) {
        this.cwe = l;
    }

    public boolean a(byte by, ele_0 ele_02) {
        Object r = fgD.fXh().Vd(ele_02.dut());
        Iterator<enk_0> iterator = ((fhc_0)r).fYj();
        while (iterator.hasNext()) {
            enk_0 enk_02 = iterator.next();
            if (enk_02.avZ() == enf_0.qPB.d()) continue;
            float f2 = enk_02.Rz(0);
            this.cwe = (long)((float)this.cwe * f2);
        }
        return true;
    }

    public long Tz() {
        return this.cwe;
    }

    public /* synthetic */ boolean execute(byte by, Object object) {
        return this.a(by, (ele_0)object);
    }
}

