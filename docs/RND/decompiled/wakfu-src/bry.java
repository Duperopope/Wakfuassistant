/*
 * Decompiled with CFR 0.152.
 */
public final class bry
implements bru_0 {
    public static final aox_1 jcT = new brw_0(new brv_0("standard", new aou_1[0]), new brv_0("filtr\u00e9", new aou_1("id de l'instance")));
    private final long jcU;

    public bry(long l) {
        this.jcU = l;
    }

    @Override
    public String[] dEy() {
        return new String[]{Long.toString(this.jcU)};
    }

    @Override
    public aox_1 bEt() {
        return jcT;
    }

    @Override
    public int d() {
        return brx_0.jeo.d();
    }

    public String toString() {
        return "ClientEventLeaveInstance{m_instanceId=" + this.jcU + "}";
    }
}

