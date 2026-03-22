/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from evY
 */
public final class evy_1 {
    public static final evy_1 oxK = new evy_1();
    private final evz_1 oxL = new evz_1();

    private evy_1() {
    }

    public evx_1 a(long l, evt_1 evt_12) {
        if (evt_12 == evt_1.owK) {
            return evx_1.oxH;
        }
        return this.oxL.N(l, evt_12.d());
    }

    public void a(long l, int n, evx_1 evx_12) {
        this.oxL.a(l, n, evx_12);
    }

    public String toString() {
        return "InstanceInteractionLevelManager{m_instanceInteractionLevelsDictionary=" + String.valueOf(this.oxL) + "}";
    }
}

