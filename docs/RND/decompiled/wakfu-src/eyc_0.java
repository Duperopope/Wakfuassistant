/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

/*
 * Renamed from eyC
 */
class eyc_0
extends eyD {
    private final byte pjV;
    private final float pjW;

    eyc_0(byte by, float f2) {
        this.pjV = by;
        this.pjW = f2;
    }

    public int dp(short s) {
        return (int)Math.floor((float)s * this.pjW);
    }

    @Override
    protected void a(exa_1<exf_2> exa_12, short s, short s2) {
        exf_2 exf_22 = exa_12.b(exx_2.c(this.pjV));
        int n = this.dp(s2) - this.dp(s);
        exf_22.or(n);
        exf_22.nt(n);
    }

    @Override
    public void a(Map<exx_2, Integer> map, short s, short s2) {
        int n = this.dp(s2) - this.dp(s);
        map.merge(exx_2.c(this.pjV), n, Integer::sum);
    }

    @Override
    public int a(exx_2 exx_22, short s, short s2) {
        if (this.pjV != exx_22.aJr()) {
            return 0;
        }
        return this.dp(s2) - this.dp(s);
    }
}

