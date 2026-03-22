/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from EA
 */
public class ea_1 {
    private fb_1[] ayB;
    private eh_2[] ayC;

    public fb_1[] aIG() {
        return this.ayB;
    }

    public void a(fb_1 ... fb_1Array) {
        this.ayB = (fb_1[])fb_1Array.clone();
    }

    public eh_2[] aIH() {
        return this.ayC;
    }

    public void a(eh_2 ... eh_2Array) {
        this.ayC = (eh_2[])eh_2Array.clone();
    }
}

