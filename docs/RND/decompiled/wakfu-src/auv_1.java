/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from auv
 */
public class auv_1
extends aup_1<aus_1> {
    public static final auv_1 deC = new auv_1();

    private auv_1() {
    }

    @Override
    protected byte aJr() {
        return 2;
    }

    public aus_1 z(DataInput dataInput, float f2) {
        boolean bl = dataInput.readBoolean();
        byte by = dataInput.readByte();
        lf_2 lf_22 = lf_2.values()[by];
        int n = auv_1.t(dataInput, f2);
        le_2 le_22 = new le_2();
        le_22.setValue(n);
        le_22.a(lf_22);
        le_22.aG(bl);
        return new aus_1(le_22);
    }

    protected boolean a(aus_1 aus_12, aus_1 aus_13) {
        return aus_12.dez.getValue() == aus_13.dez.getValue();
    }

    @Override
    protected /* synthetic */ boolean equals(Object object, Object object2) {
        return this.a((aus_1)object, (aus_1)object2);
    }

    @Override
    public /* synthetic */ Object c(DataInput dataInput, float f2) {
        return this.z(dataInput, f2);
    }
}

