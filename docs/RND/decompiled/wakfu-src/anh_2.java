/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from anh
 */
public class anh_2
extends amx_1 {
    private String axs;

    @Override
    public amz_1 bDv() {
        return amz_1.cJx;
    }

    public anh_2(String string) {
        this.axs = string.replace('\"', ' ');
        this.axs = this.axs.trim().intern();
    }

    public String getValue() {
        return this.axs;
    }

    @Override
    public Enum bDq() {
        return amg_2.cIP;
    }
}

