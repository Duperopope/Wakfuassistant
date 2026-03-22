/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aPW
 */
public class apw_0
extends apy_0 {
    private final int eBr;
    private final String eBs;

    public apw_0(aPl aPl2) {
        super(aPl2);
        this.eBr = aPl2.d();
        this.eBs = aPl2.czv();
    }

    public apw_0(aPl aPl2, String string) {
        super(aPl2);
        this.eBr = -1;
        this.eBs = "subPipe" + string;
    }

    @Override
    public int d() {
        return this.eBr;
    }

    @Override
    public String czv() {
        return this.eBs;
    }

    @Override
    public void g(api_0 api_02) {
        api_0 api_03 = this.k(api_02);
        if (api_03 != null) {
            super.g(api_03);
        }
    }

    @Override
    public void a(api_0 api_02, String string) {
        api_0 api_03 = this.k(api_02);
        super.a(api_03, string);
    }

    private api_0 k(api_0 api_02) {
        aPF aPF2 = aPh.czg().czj();
        if (!this.exn.isEmpty() && aPF2 != null) {
            return aPF2.a(api_02, this.getColor());
        }
        return api_02;
    }
}

