/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bIQ
 */
public abstract class biq_1
extends ffi_2<biq_1> {
    public biq_1(long l, axb_2 axb_22, String string, String string2) {
        super(l, axb_22, string, string2);
    }

    public abstract void a(bip_2 var1);

    public boolean dXV() {
        return this.gvG() != null;
    }

    public void c(bip_2 bip_22) {
        biq_1 biq_12 = (biq_1)this.gvG();
        if (biq_12 != null) {
            bip_22.a(biq_12);
        }
    }

    public abstract boolean dYs();

    public abstract boolean dXU();

    @Override
    public abstract void b(bip_2 var1);
}

