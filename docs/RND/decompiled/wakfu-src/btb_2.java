/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bTB
 */
final class btb_2
extends Enum<btb_2> {
    public static final /* enum */ btb_2 lpT = new btb_2("negativeBulletPoint", "disconnected");
    public static final /* enum */ btb_2 lpU = new btb_2("neutralBulletPoint", "maintenance");
    public static final /* enum */ btb_2 lpV = new btb_2("neutralBulletPoint", "error.connection.closedBeta");
    public static final /* enum */ btb_2 lpW = new btb_2("neutralBulletPoint", "badVersion");
    public static final /* enum */ btb_2 lpX = new btb_2("positiveBulletPoint", "online");
    final String lpY;
    final String lpZ;
    private static final /* synthetic */ btb_2[] lqa;

    public static btb_2[] values() {
        return (btb_2[])lqa.clone();
    }

    public static btb_2 valueOf(String string) {
        return Enum.valueOf(btb_2.class, string);
    }

    private btb_2(String string2, String string3) {
        this.lpY = string2;
        this.lpZ = string3;
    }

    private static /* synthetic */ btb_2[] eoh() {
        return new btb_2[]{lpT, lpU, lpV, lpW, lpX};
    }

    static {
        lqa = btb_2.eoh();
    }
}

