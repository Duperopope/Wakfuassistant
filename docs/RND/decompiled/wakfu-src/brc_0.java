/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from brC
 */
public class brc_0
implements bru_0 {
    public static final aox_1 jcZ = new brw_0(new brv_0("standard", new aou_1[0]), new brv_0("filtr\u00e9", new aou_1("previousNationId"), new aou_1("newNationId")));
    private final int jda;
    private final int jdb;

    public brc_0(int n, int n2) {
        this.jda = n;
        this.jdb = n2;
    }

    @Override
    public String[] dEy() {
        return new String[]{String.valueOf(this.jda), String.valueOf(this.jdb)};
    }

    @Override
    public aox_1 bEt() {
        return jcZ;
    }

    @Override
    public int d() {
        return brx_0.jes.d();
    }
}

