/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from brF
 */
public class brf_1
implements bru_0 {
    public static final aox_1 jdf = new brw_0(new brv_0("standard", new aou_1[0]), new brv_0("filtr\u00e9", new aou_1("Id de la resource plant\u00e9e"), new aou_1("id de la famille de ressource plant\u00e9e")));
    private final int jdg;
    private final short jdh;

    public brf_1(int n, short s) {
        this.jdg = n;
        this.jdh = s;
    }

    @Override
    public String[] dEy() {
        return new String[]{String.valueOf(this.jdg), String.valueOf(this.jdh)};
    }

    @Override
    public aox_1 bEt() {
        return jdf;
    }

    @Override
    public int d() {
        return brx_0.jdH.d();
    }
}

