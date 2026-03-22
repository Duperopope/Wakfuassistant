/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aoP
 */
public final class aop_1
extends aow_1 {
    public aop_1(String string, aou_1 ... aou_1Array) {
        super(string, aou_1Array);
    }

    public aop_1(aou_1 ... aou_1Array) {
        super(aou_1Array);
    }

    @Override
    public final aou_1[] bdl() {
        aou_1[] aou_1Array = new aou_1[this.bEJ()];
        for (int i = 0; i < this.bEJ(); ++i) {
            aou_1Array[i] = this.tl(i);
        }
        return aou_1Array;
    }
}

