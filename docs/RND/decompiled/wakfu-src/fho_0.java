/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Contract
 *  org.jetbrains.annotations.Nullable
 */
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fhO
 */
public class fho_0 {
    public static final int sqc = 0;
    public static final fho_0 sqd = new fho_0(null, 0);
    private final int sqe;
    private final int sqf;
    @Nullable
    private final fhg_0 sqg;
    private final int sqh;
    private final int sqi;

    private fho_0(@Nullable fhg_0 fhg_02, int n) {
        this.sqe = fhg_02 == null ? 0 : fhg_02.AK();
        if (this.sqe == 0 != (n == 0)) {
            throw new IllegalArgumentException(String.format("bonusItemId (%s) and shards amount (%s) must be both 0 or different from 0", this.sqe, n));
        }
        this.sqf = n;
        if (this.sqe == 0) {
            this.sqg = null;
            this.sqh = 0;
            this.sqi = 0;
        } else {
            this.sqg = fhg_02;
            this.sqh = this.sqg.Vz(this.sqf);
            this.sqi = this.sqf - this.sqg.Vy(this.sqh);
        }
    }

    public static fho_0 i(@Nullable fhn_0 fhn_02) {
        if (fhn_02 != null && fhn_02.fYK()) {
            return new fho_0(fhh_0.spN.VC(fhn_02.air()), fhn_02.dSU());
        }
        return sqd;
    }

    public static fho_0 fT(int n, int n2) {
        if (n == 0) {
            return sqd;
        }
        fhg_0 fhg_02 = fhh_0.spN.VC(n);
        if (fhg_02 == null) {
            throw new IllegalArgumentException("Unknown bonus item id: " + n);
        }
        return new fho_0(fhg_02, fhg_02.Vy(n2));
    }

    public fho_0 VJ(int n) {
        if (this.sqe == 0 && n != 0) {
            throw new IllegalArgumentException("Cannot set level of empty bonus to anything other than 0");
        }
        if (n == 0) {
            return sqd;
        }
        return new fho_0(this.sqg, this.sqg.Vy(n));
    }

    public int dBc() {
        return this.sqe;
    }

    @Contract(pure=true)
    public boolean aJG() {
        return this.sqe == fho_0.sqd.sqe;
    }

    public int aiv() {
        return this.sqf;
    }

    public Optional<fhg_0> fYW() {
        return Optional.ofNullable(this.sqg);
    }

    public int tL() {
        return this.sqh;
    }

    public int fYY() {
        return this.sqi;
    }

    public OptionalInt fYZ() {
        if (this.sqg == null) {
            return OptionalInt.empty();
        }
        return OptionalInt.of(this.sqg.Fq());
    }

    public boolean fZa() {
        OptionalInt optionalInt = this.fYZ();
        return optionalInt.isEmpty() || this.sqh >= optionalInt.getAsInt();
    }

    public OptionalInt VK(int n) {
        if (this.sqg == null) {
            return OptionalInt.empty();
        }
        return OptionalInt.of(this.sqg.VA(n));
    }

    public OptionalInt fZb() {
        if (this.sqg == null) {
            return OptionalInt.empty();
        }
        int[] nArray = this.sqg.fYG();
        if (this.sqh + 1 >= nArray.length) {
            return OptionalInt.of(nArray[nArray.length - 1]);
        }
        int n = this.sqg.VB(this.sqh);
        if (n < 0) {
            return OptionalInt.empty();
        }
        return OptionalInt.of(n);
    }

    public OptionalInt fZc() {
        if (this.sqg == null) {
            return OptionalInt.empty();
        }
        int n = this.sqg.Vx(this.sqh + 1);
        return OptionalInt.of(n - this.sqi);
    }

    public void d(azg_1 azg_12) {
        azg_12.vC(this.sqe);
        if (this.sqe != 0) {
            azg_12.vC(this.sqf);
        }
    }

    public static fho_0 gb(ByteBuffer byteBuffer) {
        int n = byteBuffer.getInt();
        if (n == 0) {
            return new fho_0(null, 0);
        }
        return new fho_0(fhh_0.spN.VC(n), byteBuffer.getInt());
    }

    public static int fZd() {
        return 8;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        fho_0 fho_02 = (fho_0)object;
        return this.sqe == fho_02.sqe && this.sqf == fho_02.sqf;
    }

    public int hashCode() {
        return Objects.hash(this.sqe, this.sqf);
    }

    public String toString() {
        return "SlotBonus{m_bonusItemId=" + this.sqe + ", m_level=" + this.sqh + "}";
    }
}

