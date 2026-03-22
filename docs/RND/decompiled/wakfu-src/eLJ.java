/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TByteObjectProcedure
 */
import gnu.trove.procedure.TByteObjectProcedure;
import java.util.Iterator;

class eLJ
implements TByteObjectProcedure<ele_0> {
    private float qHz;

    eLJ(float f2) {
        this.qHz = f2;
    }

    public boolean a(byte by, ele_0 ele_02) {
        Object r = fgD.fXh().Vd(ele_02.dut());
        Iterator<enk_0> iterator = ((fhc_0)r).fYj();
        while (iterator.hasNext()) {
            enk_0 enk_02 = iterator.next();
            if (enk_02.avZ() == enf_0.qPB.d()) continue;
            float f2 = enk_02.Rz(0);
            this.qHz *= f2;
        }
        return true;
    }

    public float fzO() {
        return this.qHz;
    }

    public /* synthetic */ boolean execute(byte by, Object object) {
        return this.a(by, (ele_0)object);
    }
}

