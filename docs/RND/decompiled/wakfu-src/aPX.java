/*
 * Decompiled with CFR 0.152.
 */
public class aPX
extends apw_0 {
    public aPX(aPl aPl2) {
        super(aPl2);
    }

    @Override
    public void g(api_0 api_02) {
        this.l(api_02);
        super.g(api_02);
    }

    @Override
    public void a(api_0 api_02, String string) {
        this.l(api_02);
        super.a(api_02, string);
    }

    private void l(api_0 api_02) {
        String string = api_02.czo();
        if (this.jg(string) == null) {
            this.jf(string);
        }
    }

    @Override
    public void jf(String string) {
        apw_0 apw_02 = new apw_0(this.czu(), string);
        this.a(string, apw_02);
    }
}

