/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aJl
 */
public class ajl_0
extends aef_0 {
    private static final ajl_0 eao = new ajl_0();

    public static ajl_0 cht() {
        return eao;
    }

    private ajl_0() {
    }

    @Override
    public void a(adx_0 adx_02, int n) {
        if (adx_02.dZ("AnimCourse02")) {
            adx_02.dT("AnimCourse02");
        } else if (adx_02.dZ("AnimCourse")) {
            adx_02.dT("AnimCourse");
        } else {
            adx_02.dT("AnimMarche");
        }
    }

    @Override
    public aea_0 bwe() {
        return aea_0.cmx;
    }
}

