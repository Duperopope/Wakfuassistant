/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cbb
 */
public class cbb_1
implements agn_1 {
    private final cbc_1 lIu;

    public cbb_1(cbc_1 cbc_12) {
        this.lIu = cbc_12;
    }

    @Override
    public float bpl() {
        return caz_1.lId.a(this.lIu) - caz_1.lId.b(this.lIu);
    }

    @Override
    public float bpm() {
        return -(caz_1.lId.a(this.lIu) + caz_1.lId.b(this.lIu));
    }

    @Override
    public float bpn() {
        return caz_1.lId.c(this.lIu);
    }

    @Override
    public boolean bpo() {
        return false;
    }

    @Override
    public int bpp() {
        return 0;
    }
}

