/*
 * Decompiled with CFR 0.152.
 */
public class ckA
extends nv_0 {
    private boolean bmw;

    public void bj(boolean bl) {
        this.bmw = bl;
    }

    @Override
    public byte[] aVX() {
        byte[] byArray = new byte[]{this.bmw ? (byte)1 : 0};
        return this.a((byte)3, byArray);
    }

    @Override
    public int d() {
        return 13835;
    }
}

