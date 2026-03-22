/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from brr
 */
public final class brr_0
implements bru_0 {
    public static final aox_1 jcF = new brw_0(new brv_0("standard", new aou_1[0]), new brv_0("filtr\u00e9", new aou_1("id du groupe")));
    private final long jcG;

    public brr_0(long l) {
        this.jcG = l;
    }

    @Override
    public int d() {
        return brx_0.jeq.d();
    }

    @Override
    public String[] dEy() {
        return new String[]{Long.toString(this.jcG)};
    }

    @Override
    public aox_1 bEt() {
        return jcF;
    }

    public String toString() {
        return "ClientEventGroupKilled{m_groupId=" + this.jcG + "}";
    }
}

