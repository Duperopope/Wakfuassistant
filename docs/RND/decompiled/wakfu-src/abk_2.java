/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aBK
 */
public class abk_2 {
    public final abi_1 dzJ;
    public final int dzK;

    public abk_2(abi_1 abi_12, int n) {
        this.dzJ = abi_12;
        this.dzK = n;
    }

    public boolean equals(Object object) {
        if (object == null || !(object instanceof abk_2)) {
            return false;
        }
        abk_2 abk_22 = (abk_2)object;
        return abk_22.dzJ == this.dzJ && abk_22.dzK == this.dzK;
    }
}

