/*
 * Decompiled with CFR 0.152.
 */
public class aWa
extends aga_2 {
    private final bhx_0 htV;
    private final bhJ htW;

    public aWa(int n, int n2, int n3, int n4, bhx_0 bhx_02, bhJ bhJ2) {
        super(n, n2, n3);
        this.htV = bhx_02;
        this.htW = bhJ2;
        this.f(new bvi_1(this));
        this.xV(n4);
    }

    public bhx_0 cXa() {
        return this.htV;
    }

    public bhJ cXb() {
        return this.htW;
    }

    @Override
    public long cbk() {
        long l = super.cbk();
        if (l != -1L || this.dKk) {
            this.caT();
            this.dKk = false;
        }
        return -1L;
    }
}

