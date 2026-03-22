/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aCd
 */
public class acd_1 {
    private static final Logger dAq = Logger.getLogger(acd_1.class);
    private int bap;
    private int baq;
    private short ban;

    public acd_1() {
    }

    public acd_1(acd_1 acd_12) {
        this.Q(acd_12.bap, acd_12.baq, acd_12.ban);
    }

    public acd_1(int[] nArray) {
        this.u(nArray);
    }

    public acd_1(int n, int n2, short s) {
        this.Q(n, n2, s);
    }

    public acd_1(acd_1 acd_12, acq_1 acq_12) {
        this.Q(acd_12.bap + acq_12.getX(), acd_12.baq + acq_12.getY(), (short)(acd_12.ban + acq_12.NN()));
    }

    public acd_1(int n, int n2) {
        this.bap = n;
        this.baq = n2;
        this.ban = 0;
    }

    public acb_1 bWz() {
        return new acb_1(this.bap, this.baq);
    }

    public acd_1 wQ(int n) {
        this.bap *= n;
        this.baq *= n;
        return this;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || !(object instanceof acd_1)) {
            return false;
        }
        acd_1 acd_12 = (acd_1)object;
        return this.bap == acd_12.bap && this.baq == acd_12.baq && this.ban == acd_12.ban;
    }

    public int hashCode() {
        long l = 1L;
        l = 31L * l + (long)(this.bap & 0xFF);
        l = 31L * l + (long)(this.bap >> 8 & 0xFF);
        l = 31L * l + (long)(this.bap >> 16 & 0xFF);
        l = 31L * l + (long)(this.bap >> 24 & 0xFF);
        l = 31L * l + (long)(this.baq & 0xFF);
        l = 31L * l + (long)(this.baq >> 8 & 0xFF);
        l = 31L * l + (long)(this.baq >> 16 & 0xFF);
        l = 31L * l + (long)(this.baq >> 24 & 0xFF);
        l = 31L * l + (long)(this.ban & 0xFF);
        l = 31L * l + (long)(this.ban >> 8 & 0xFF);
        l = 31L * l + (long)(this.ban >> 16 & 0xFF);
        l = 31L * l + (long)(this.ban >> 24 & 0xFF);
        return (int)(l ^ l >> 32);
    }

    public int bWA() {
        long l = 1L;
        l = 31L * l + (long)(this.bap & 0xFF);
        l = 31L * l + (long)(this.bap >> 8 & 0xFF);
        l = 31L * l + (long)(this.bap >> 16 & 0xFF);
        l = 31L * l + (long)(this.bap >> 24 & 0xFF);
        l = 31L * l + (long)(this.baq & 0xFF);
        l = 31L * l + (long)(this.baq >> 8 & 0xFF);
        l = 31L * l + (long)(this.baq >> 16 & 0xFF);
        l = 31L * l + (long)(this.baq >> 24 & 0xFF);
        return (int)(l ^ l >> 32);
    }

    public String toString() {
        return "{Point3 : (" + this.bap + ", " + this.baq + ", " + this.ban + ")}";
    }

    public void w(int n, int n2, int n3) {
        this.bap += n;
        this.baq += n2;
        this.ban = (short)(this.ban + n3);
    }

    public void w(acd_1 acd_12) {
        this.bap += acd_12.bap;
        this.baq += acd_12.baq;
        this.ban = (short)(this.ban + acd_12.ban);
    }

    public void ap(int n, int n2) {
        this.bap += n;
        this.baq += n2;
    }

    public boolean cF(int n, int n2) {
        return this.bap == n && this.baq == n2;
    }

    public boolean L(int n, int n2, int n3) {
        return this.bap == n && this.baq == n2 && this.ban == n3;
    }

    public boolean ac(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        acd_1 acd_12 = (acd_1)object;
        return this.bap == acd_12.bap && this.baq == acd_12.baq;
    }

    @Nullable
    public abi_1 x(acd_1 acd_12) {
        int n = acd_12.bap - this.bap;
        n = Integer.compare(n, 0);
        int n2 = acd_12.baq - this.baq;
        n2 = Integer.compare(n2, 0);
        return abi_1.cB(n, n2);
    }

    public abi_1 O(int n, int n2, short s) {
        int n3 = n - this.bap;
        n3 = Integer.compare(n3, 0);
        int n4 = n2 - this.baq;
        n4 = Integer.compare(n4, 0);
        return abi_1.cB(n3, n4);
    }

    @Nullable
    public abi_1 y(acd_1 acd_12) {
        int n = Math.abs(acd_12.bap - this.bap);
        int n2 = Math.abs(acd_12.baq - this.baq);
        abi_1 abi_12 = this.x(acd_12);
        return acd_1.a(n, n2, abi_12);
    }

    public static abi_1 a(int n, int n2, abi_1 abi_12) {
        if (abi_12 == null) {
            return null;
        }
        if (abi_12.bVO()) {
            return abi_12;
        }
        switch (abi_12) {
            case dzj: {
                return n > n2 ? abi_1.dzk : abi_1.dzq;
            }
            case dzn: {
                return n > n2 ? abi_1.dzo : abi_1.dzm;
            }
            case dzp: {
                return n > n2 ? abi_1.dzo : abi_1.dzq;
            }
            case dzl: {
                return n > n2 ? abi_1.dzk : abi_1.dzm;
            }
        }
        return null;
    }

    public abi_1 z(acd_1 acd_12) {
        int n = acd_12.bap - this.bap;
        n = n == 0 ? n : n / Math.abs(n);
        int n2 = acd_12.baq - this.baq;
        n2 = n2 == 0 ? n2 : n2 / Math.abs(n2);
        return abi_1.cB(n, n2);
    }

    public int A(acd_1 acd_12) {
        return Math.abs(acd_12.bap - this.bap) + Math.abs(acd_12.baq - this.baq);
    }

    public int P(int n, int n2, short s) {
        return Math.abs(n - this.bap) + Math.abs(n2 - this.baq);
    }

    public int cH(int n, int n2) {
        return Math.abs(n - this.bap) + Math.abs(n2 - this.baq);
    }

    public int t(int[] nArray) {
        assert (nArray != null && nArray.length >= 2);
        return Math.abs(nArray[0] - this.bap) + Math.abs(nArray[1] - this.baq);
    }

    public int B(acd_1 acd_12) {
        int n = this.A(acd_12);
        if (n <= 1) {
            return 0;
        }
        return n - 1;
    }

    public void reset() {
        this.bap = 0;
        this.baq = 0;
        this.ban = 0;
    }

    public void u(int[] nArray) {
        if (nArray.length > 1) {
            this.bap = nArray[0];
            this.baq = nArray[1];
            this.ban = nArray.length > 2 ? (short)nArray[2] : (short)0;
        } else {
            throw new IllegalArgumentException("La longueur du tableau passe en parametre n'est pas adaptee : " + nArray.length);
        }
    }

    public void Q(int n, int n2, short s) {
        this.bap = n;
        this.baq = n2;
        this.ban = s;
    }

    public void C(acd_1 acd_12) {
        this.bap = acd_12.bap;
        this.baq = acd_12.baq;
        this.ban = acd_12.ban;
    }

    public void e(abi_1 abi_12) {
        this.bap += abi_12.dzz;
        this.baq += abi_12.dzA;
    }

    public void f(acp_1 acp_12) {
        this.bap = (int)((float)this.bap + acp_12.aSc());
        this.baq = (int)((float)this.baq + acp_12.aSd());
        this.ban = (short)((float)this.ban + acp_12.aSe());
    }

    public void M(int n, int n2, int n3) {
        this.bap -= n;
        this.baq -= n2;
        this.ban = (short)(this.ban - n3);
    }

    public void D(acd_1 acd_12) {
        this.bap -= acd_12.bap;
        this.baq -= acd_12.baq;
        this.ban = (short)(this.ban - acd_12.ban);
    }

    public int getX() {
        return this.bap;
    }

    public int getY() {
        return this.baq;
    }

    public short bdi() {
        return this.ban;
    }

    public void setX(int n) {
        this.bap = n;
    }

    public void setY(int n) {
        this.baq = n;
    }

    public void aM(short s) {
        this.ban = s;
    }

    public int[] bWB() {
        return new int[]{this.bap, this.baq, this.ban};
    }

    public boolean cI(int n, int n2) {
        return n == this.bap && n2 == this.baq || n == this.bap - 1 && n2 == this.baq || n == this.bap && n2 == this.baq - 1 || n == this.bap + 1 && n2 == this.baq || n == this.bap && n2 == this.baq + 1;
    }

    public boolean cJ(int n, int n2) {
        return this.cI(n, n2) || n == this.bap - 1 && n2 == this.baq - 1 || n == this.bap + 1 && n2 == this.baq + 1 || n == this.bap - 1 && n2 == this.baq + 1 || n == this.bap + 1 && n2 == this.baq - 1;
    }

    public boolean E(acd_1 acd_12) {
        if (acd_12 == null) {
            return false;
        }
        if (this.equals(acd_12)) {
            return false;
        }
        return this.bap == acd_12.bap || this.baq == acd_12.baq;
    }

    public boolean e(acd_1 acd_12, acd_1 acd_13) {
        if (acd_12 == null || acd_13 == null) {
            return false;
        }
        if (this.equals(acd_12) || this.equals(acd_13)) {
            return false;
        }
        return this.bap == acd_12.bap && this.bap == acd_13.bap || this.baq == acd_12.baq && this.baq == acd_13.baq;
    }

    public boolean F(acd_1 acd_12) {
        if (acd_12 == null) {
            return false;
        }
        if (this.equals(acd_12)) {
            return false;
        }
        return Math.abs(this.bap - acd_12.bap) == Math.abs(this.baq - acd_12.baq);
    }

    public boolean f(acd_1 acd_12, acd_1 acd_13) {
        if (acd_12 == null || acd_13 == null) {
            return false;
        }
        if (this.equals(acd_12) || this.equals(acd_13)) {
            return false;
        }
        boolean bl = Math.abs(this.bap - acd_12.bap) == Math.abs(this.baq - acd_12.baq);
        boolean bl2 = Math.abs(this.bap - acd_13.bap) == Math.abs(this.baq - acd_13.baq);
        return bl && bl2;
    }
}

