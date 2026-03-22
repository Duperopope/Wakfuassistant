/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cWG
 */
class cwg_2
implements aeh_2,
cbb_0 {
    public static final String nTt = "name";
    public static final String nTu = "lastAdded";
    private final cba_0 nTv;
    private String nTw;

    cwg_2(cba_0 cba_02) {
        this.nTv = cba_02;
        this.nTv.a(this);
    }

    public void clear() {
        this.nTv.a((cbb_0)null);
    }

    @Override
    public void g(ahk_1 ahk_12) {
        this.nTw = ahk_12.ccQ();
    }

    @Override
    public String[] bxk() {
        return null;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(nTt)) {
            return this.nTv.getName();
        }
        if (string.equals(nTu)) {
            return this.nTw;
        }
        return null;
    }
}

