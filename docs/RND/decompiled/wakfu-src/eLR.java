/*
 * Decompiled with CFR 0.152.
 */
public class eLR {
    private final Object qLP;
    private final Object qLQ;
    private final Object qLR;
    private final Object qLS;
    private final boolean qLT;

    public eLR(Object object, Object object2, Object object3, Object object4) {
        this.qLP = object;
        this.qLQ = object2;
        this.qLR = object3;
        this.qLS = object4;
        this.qLT = false;
    }

    public eLR(Object object, Object object2, Object object3, Object object4, boolean bl) {
        this.qLP = object;
        this.qLQ = object2;
        this.qLR = object3;
        this.qLS = object4;
        this.qLT = bl;
    }

    public Object fzZ() {
        return this.qLP;
    }

    public Object fAa() {
        return this.qLQ;
    }

    public Object fAb() {
        return this.qLR;
    }

    public Object dFa() {
        return this.qLS;
    }

    public boolean fAc() {
        return this.qLT;
    }
}

