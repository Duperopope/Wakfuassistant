/*
 * Decompiled with CFR 0.152.
 */
public class fao
extends fan {
    private final kW rPe;
    private final short rPf;

    public fao(String string, long l, kW kW2, short s) {
        super(string, l);
        this.rPe = kW2;
        this.rPf = s;
    }

    public kW aaA() {
        return this.rPe;
    }

    public short fQY() {
        return this.rPf;
    }

    public String toString() {
        return "GuildStorageHistoryItemEntry{m_item=" + String.valueOf(this.rPe) + "}";
    }
}

