/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aao
 */
public class aao_0 {
    private final azz_1<aap> bYN = new azz_1<aap>(aap.bYO);

    public void a(byte by, float f2, float f3, float f4) {
        this.bYN.add(new aap(by, f2, f3, f4));
    }

    public aap rc(int n) {
        aap aap2 = this.bYN.getLast();
        int n2 = this.bYN.size();
        for (int i = 0; i < n2; ++i) {
            aap aap3 = (aap)this.bYN.get(i);
            if (n < aap3.bYP) {
                return aap2;
            }
            aap2 = aap3;
        }
        return this.bYN.getLast();
    }

    public aap a(aap aap2) {
        int n = this.bYN.indexOf(aap2);
        return n < this.bYN.size() - 1 ? (aap)this.bYN.get(n + 1) : this.bYN.getFirst();
    }
}

