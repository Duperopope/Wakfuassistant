/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aEG
 */
public class aeg_2
implements aej_2 {
    private static final aeg_2 dGN = new aeg_2();
    private aej_2 dGO;

    private aeg_2() {
    }

    public static aeg_2 caa() {
        return dGN;
    }

    public void a(aej_2 aej_22) {
        this.dGO = aej_22;
    }

    @Override
    public void a(aef_2 aef_22, String ... stringArray) {
        if (this.dGO != null) {
            this.dGO.a(aef_22, stringArray);
        }
    }

    @Override
    public void f(String string, Object object) {
        if (this.dGO != null) {
            this.dGO.f(string, object);
        }
    }
}

