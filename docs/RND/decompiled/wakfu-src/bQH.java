/*
 * Decompiled with CFR 0.152.
 */
public class bQH
implements aeh_2 {
    public static final String kWj = "guildName";
    public static final String kWk = "guildBlazon";
    public static final String kWl = "guildId";
    public static final String kWm = "isOpen";
    private static final String kWn = "isGuildOnly";
    private static final String kWo = "canOpen";
    private static final String kWp = "canEnter";
    public static final String[] kWq = new String[]{"guildName", "guildBlazon", "guildId", "isOpen", "isGuildOnly", "canOpen", "canEnter"};
    private static final int kWr = 5;
    private final String kWs;
    private final long kWt;
    private final long kWu;
    private final boolean kWv;
    private final boolean kWw;

    public bQH(String string, long l, long l2, boolean bl, boolean bl2) {
        this.kWs = string;
        this.kWt = l;
        this.kWu = l2;
        this.kWv = bl;
        this.kWw = bl2;
    }

    @Override
    public String[] bxk() {
        return kWq;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(kWj)) {
            return this.kWs != null && !this.kWs.isEmpty() ? this.kWs : aum_0.cWf().c("noOwner", new Object[0]);
        }
        if (string.equals(kWl)) {
            return this.kWt;
        }
        if (kWk.equals(string)) {
            if (this.kWu < 1L) {
                return String.format(auc_0.cVq().l("guildBlazonBackgroundPartPath", ""), 5);
            }
            return buK.dJw().a(new buJ(new ezb(this.kWu)));
        }
        if (kWm.equals(string)) {
            return this.kWv;
        }
        if (kWn.equals(string)) {
            return this.kWw;
        }
        if (kWo.equals(string)) {
            if (this.kWv) {
                return false;
            }
            return this.ejO() || bQH.ejP();
        }
        if (kWp.equals(string)) {
            if (!this.kWv) {
                return false;
            }
            return !this.kWw || this.ejO() || bQH.ejP();
        }
        return null;
    }

    private boolean ejO() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            return false;
        }
        return this.kWt == bgt_02.Ya();
    }

    public long Ya() {
        return this.kWt;
    }

    private static boolean ejP() {
        return evm_2.b(aue_0.cVJ().cVO().cWq(), evn_2.ovs);
    }
}

