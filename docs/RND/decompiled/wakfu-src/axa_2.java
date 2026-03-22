/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from axa
 */
public class axa_2
extends awy_2 {
    private static final awx_2 dop = new awx_2(new float[0]);

    public axa_2(boolean bl) {
        super((byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, bl);
    }

    @Override
    public boolean a(byte by, byte by2, byte by3, byte by4, byte by5) {
        return by == by2 && by2 == by3;
    }

    private static void a(byte by, byte by2, byte by3, byte by4, int n) {
        if (n == 17) {
            dop.b(by, by2, by3, by4);
        } else {
            dop.b(by3, by2, by, by4);
        }
    }

    @Override
    public void a(byte[] byArray, int n, byte by) {
        axa_2.a(byArray[n], byArray[n], byArray[n], (byte)-1, by);
        float f2 = dop.aRB();
        axa_2.a(this.dok, this.dol, this.dom, this.don, by);
        dop.S(GC.b(f2 *= dop.bQi(), 0.0f, 1.0f));
        byArray[n] = dop.bQf();
        byArray[n + 1] = dop.bQg();
        byArray[n + 2] = dop.bQh();
        if (this.doo) {
            int n2 = n + 3;
            byArray[n2] = (byte)((float)byArray[n2] * dop.aIX());
        }
    }
}

