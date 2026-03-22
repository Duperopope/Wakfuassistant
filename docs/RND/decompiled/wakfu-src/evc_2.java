/*
 * Decompiled with CFR 0.152.
 */
import java.sql.Timestamp;

/*
 * Renamed from evc
 */
public class evc_2 {
    private final int osE;
    private final Timestamp osF;
    private final Timestamp osG;

    public evc_2(int n, Timestamp timestamp, Timestamp timestamp2) {
        this.osE = n;
        this.osF = timestamp;
        this.osG = timestamp2;
    }

    public int arF() {
        return this.osE;
    }

    public Timestamp fdJ() {
        return this.osF;
    }

    public Timestamp fdK() {
        return this.osG;
    }

    public String toString() {
        return "SubscriptionPeriod{m_subscriptionLevel=" + this.osE + ", m_startDate=" + String.valueOf(this.osF) + ", m_endDate=" + String.valueOf(this.osG) + "}";
    }
}

