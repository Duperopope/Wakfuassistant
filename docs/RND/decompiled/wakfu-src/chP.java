/*
 * Decompiled with CFR 0.152.
 */
public abstract class chP
extends nv_0 {
    private String aYX;

    public void op(String string) {
        this.aYX = string;
    }

    @Override
    public byte[] aVX() {
        return this.c(new azg_1());
    }

    private void b(azg_1 azg_12) {
        azg_12.gV(this.aYX);
    }

    byte[] c(azg_1 azg_12) {
        this.b(azg_12);
        return this.a((byte)3, azg_12.bTe());
    }
}

