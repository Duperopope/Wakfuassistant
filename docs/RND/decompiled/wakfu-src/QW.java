/*
 * Decompiled with CFR 0.152.
 */
public class QW
extends aow_1 {
    public QW(String string, aou_1 ... aou_1Array) {
        super(string, aou_1Array);
    }

    public QW(aou_1 ... aou_1Array) {
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

