/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bNj
 */
public final class bnj_0
extends Enum<bnj_0> {
    public static final /* enum */ bnj_0 kBi = new bnj_0(0);
    public static final /* enum */ bnj_0 kBj = new bnj_0(1);
    public static final /* enum */ bnj_0 kBk = new bnj_0(2);
    public static final /* enum */ bnj_0 kBl = new bnj_0(3);
    public static final /* enum */ bnj_0 kBm = new bnj_0(4);
    private final byte kBn;
    private static final /* synthetic */ bnj_0[] kBo;

    public static bnj_0[] values() {
        return (bnj_0[])kBo.clone();
    }

    public static bnj_0 valueOf(String string) {
        return Enum.valueOf(bnj_0.class, string);
    }

    private bnj_0(int n2) {
        this.kBn = GC.ct(n2);
    }

    public String getName() {
        return aum_0.cWf().c("guild.storage.type." + this.kBn, new Object[0]);
    }

    public String byf() {
        return auc_0.cVq().a("guildStorageTypeIconsPath", "defaultIconPath", this.kBn);
    }

    public String efF() {
        return aum_0.cWf().c("guild.storage.unlock.shortDescription." + this.kBn, new Object[0]);
    }

    public String efG() {
        return aum_0.cWf().c("guild.storage.unlock.longDescription." + this.kBn, new Object[0]);
    }

    private static /* synthetic */ bnj_0[] efH() {
        return new bnj_0[]{kBi, kBj, kBk, kBl, kBm};
    }

    static {
        kBo = bnj_0.efH();
    }
}

