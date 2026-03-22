/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eLm
 */
public final class elm_0
extends Enum<elm_0> {
    public static final /* enum */ elm_0 qFE = new elm_0(0);
    public static final /* enum */ elm_0 qFF = new elm_0(1);
    public static final /* enum */ elm_0 qFG = new elm_0(2);
    public static final /* enum */ elm_0 qFH = new elm_0(3);
    public static final /* enum */ elm_0 qFI = new elm_0(4);
    public static final /* enum */ elm_0 qFJ = new elm_0(5);
    private final byte qFK;
    private static final /* synthetic */ elm_0[] qFL;

    public static elm_0[] values() {
        return (elm_0[])qFL.clone();
    }

    public static elm_0 valueOf(String string) {
        return Enum.valueOf(elm_0.class, string);
    }

    private elm_0(byte by) {
        this.qFK = by;
    }

    public static elm_0 eY(byte by) {
        for (elm_0 elm_02 : elm_0.values()) {
            if (elm_02.qFK != by) continue;
            return elm_02;
        }
        return null;
    }

    public byte aJr() {
        return this.qFK;
    }

    private static /* synthetic */ elm_0[] fzD() {
        return new elm_0[]{qFE, qFF, qFG, qFH, qFI, qFJ};
    }

    static {
        qFL = elm_0.fzD();
    }
}

