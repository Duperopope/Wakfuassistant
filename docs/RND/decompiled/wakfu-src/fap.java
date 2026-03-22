/*
 * Decompiled with CFR 0.152.
 */
public class fap
extends fan {
    private final long rPg;

    public fap(String string, long l, long l2) {
        super(string, l);
        this.rPg = l2;
    }

    public long aaW() {
        return this.rPg;
    }

    public String toString() {
        return "GuildStorageHistoryMoneyEntry{m_memberName='" + this.rPd + "', m_date=" + this.pov + ", m_amount=" + this.rPg + "}";
    }
}

