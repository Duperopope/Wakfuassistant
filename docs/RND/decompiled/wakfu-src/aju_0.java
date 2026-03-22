/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectByteProcedure
 */
import gnu.trove.procedure.TObjectByteProcedure;

/*
 * Renamed from aJu
 */
class aju_0
implements TObjectByteProcedure<bKV> {
    final /* synthetic */ aJs ebf;

    aju_0(aJs aJs2) {
        this.ebf = aJs2;
    }

    public boolean a(bKV bKV2, byte by) {
        if (by > 0) {
            int n = bKV2.bcC();
            int n2 = bKV2.bcD();
            float[] fArray = (float[])this.ebf.eaU.get(by);
            int n3 = 3;
            this.ebf.eba.c(fArray, by + 1, 3, n - 1, n2 - 1);
            bKV2.eD(1.0f / fArray[by + 2]);
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object, byte by) {
        return this.a((bKV)object, by);
    }
}

