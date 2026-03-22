/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.DataInput;
import java.io.DataOutput;
import org.apache.log4j.Logger;

/*
 * Renamed from auc
 */
public class auc_1
extends aum_1<atl_1> {
    public static final auc_1 ddP = new auc_1();
    private static final Logger ddQ = Logger.getLogger(auc_1.class);

    private auc_1() {
    }

    @Override
    protected byte aJr() {
        return 12;
    }

    public atl_1 g(DataInput dataInput, float f2) {
        acp_1 acp_12 = auc_1.h(dataInput, f2);
        acp_1 acp_13 = auc_1.h(dataInput, f2);
        acp_1 acp_14 = auc_1.h(dataInput, f2);
        acp_1 acp_15 = auc_1.h(dataInput, f2);
        aca_2 aca_22 = new aca_2();
        aca_22.ht(0L);
        aca_22.hu(1000000L);
        aca_22.b(acp_12);
        aca_22.c(acp_13);
        aca_22.d(acp_14);
        aca_22.e(acp_15);
        return new atl_1(aca_22);
    }

    private void a(DataOutput dataOutput, acp_1 acp_12, acp_1 acp_13) {
        dataOutput.writeFloat(acp_12.aPY);
        dataOutput.writeFloat(acp_13.aPY);
        dataOutput.writeFloat(acp_12.aPZ);
        dataOutput.writeFloat(acp_13.aPZ);
        dataOutput.writeFloat(acp_12.aQa);
        dataOutput.writeFloat(acp_13.aQa);
    }

    protected boolean a(atl_1 atl_12, atl_1 atl_13) {
        return atl_12.bMe().equals(atl_13.bMe()) && atl_12.bMf().equals(atl_13.bMf()) && atl_12.bMg().equals(atl_13.bMg()) && atl_12.bMg().equals(atl_13.bMh());
    }

    private static acp_1 h(DataInput dataInput, float f2) {
        float f3 = auc_1.u(dataInput, f2);
        float f4 = auc_1.u(dataInput, f2);
        float f5 = auc_1.u(dataInput, f2);
        return new acp_1(f3, f4, f5);
    }

    @Override
    protected /* synthetic */ boolean equals(Object object, Object object2) {
        return this.a((atl_1)object, (atl_1)object2);
    }

    @Override
    public /* synthetic */ Object c(DataInput dataInput, float f2) {
        return this.g(dataInput, f2);
    }
}

