/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from dae
 */
public class dae_0
extends ama_1 {
    public dae_0() {
        super(aue_0.cVJ());
    }

    public dae_0(short s) {
        super(aue_0.cVJ());
        this.lK(s);
    }

    public dae_0(short s, Object object) {
        super(aue_0.cVJ());
        this.lK(s);
        this.D(object);
    }

    public static void cV(short s) {
        aaw_1.bUq().h(new dae_0(s));
    }

    public static void b(short s, Object object) {
        dae_0 dae_02 = new dae_0(s);
        dae_02.D(object);
        aaw_1.bUq().h(dae_02);
    }
}

