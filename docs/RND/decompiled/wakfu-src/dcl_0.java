/*
 * Decompiled with CFR 0.152.
 */
import java.awt.event.KeyEvent;

/*
 * Renamed from dcL
 */
public class dcl_0
extends dae_0 {
    private final KeyEvent ofH;

    dcl_0(int n, KeyEvent keyEvent) {
        this.ofH = keyEvent;
        this.lK(n);
    }

    public static void m(KeyEvent keyEvent) {
        dcl_0.a((short)17661, keyEvent);
    }

    public static void n(KeyEvent keyEvent) {
        dcl_0.a((short)17354, keyEvent);
    }

    private static void a(short s, KeyEvent keyEvent) {
        dcl_0 dcl_02 = new dcl_0((int)s, keyEvent);
        assert (dcl_02.d() == s);
        aaw_1.bUq().h(dcl_02);
    }

    public KeyEvent fcf() {
        return this.ofH;
    }
}

