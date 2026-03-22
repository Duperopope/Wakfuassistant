/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from btK
 */
abstract class btk_1
implements btj_1 {
    final bsS jmk;
    final bgt_0 jml;
    final byte jmm;

    btk_1(bsS bsS2, bgt_0 bgt_02, byte by) {
        this.jmk = bsS2;
        this.jml = bgt_02;
        this.jmm = by;
    }

    @Override
    public euf_0 dIg() {
        return this.jmk.a(this.jml, this.jmm);
    }
}

