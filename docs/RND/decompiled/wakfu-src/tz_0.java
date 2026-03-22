/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.nio.ByteBuffer;
import java.text.MessageFormat;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from TZ
 */
public class tz_0
implements Comparable<tz_0> {
    private long btF;
    private int btZ;
    private short btf;
    private boolean bub;
    private static final tz_0 buo = new tz_0(0L, 0, -1, false);

    public tz_0() {
    }

    public tz_0(long l, short s, boolean bl) {
        this.bub = bl;
        this.btF = l;
        this.btf = s;
    }

    public tz_0(long l, int n, short s, boolean bl) {
        this.bub = bl;
        this.btF = l;
        this.btZ = n;
        this.btf = s;
    }

    public tz_0(tz_0 tz_02) {
        this(tz_02.btF, tz_02.btZ, tz_02.btf, tz_02.bub);
    }

    public static tz_0 biL() {
        return buo;
    }

    public boolean bbY() {
        return this.btf < 0;
    }

    public long OO() {
        return this.btF;
    }

    public boolean biM() {
        return this.bub;
    }

    public short biN() {
        return this.btf;
    }

    public void pz(int n) {
        this.btZ = n;
    }

    public int Lz() {
        return this.btZ;
    }

    public static tz_0 ff(long l) {
        tz_0 tz_02 = new tz_0();
        tz_02.btF = l;
        return tz_02;
    }

    public tz_0 pA(int n) {
        this.btf = (short)n;
        return this;
    }

    public tz_0 bn(boolean bl) {
        this.bub = bl;
        return this;
    }

    public static int DN() {
        return 11;
    }

    public void as(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.btF);
        byteBuffer.putShort(this.btf);
        byteBuffer.put((byte)(this.bub ? 1 : 0));
    }

    public static tz_0 eR(ByteBuffer byteBuffer) {
        tz_0 tz_02 = new tz_0();
        tz_02.eO(byteBuffer);
        return tz_02;
    }

    void eO(ByteBuffer byteBuffer) {
        this.btF = byteBuffer.getLong();
        this.btf = byteBuffer.getShort();
        this.bub = byteBuffer.get() == 1;
    }

    public String toString() {
        return MessageFormat.format("@T{0}{2}({1})", this.btf, this.btF, this.bub ? "+" : "-");
    }

    public int b(@NotNull tz_0 tz_02) {
        if (this == tz_02) {
            return 0;
        }
        if (this.biO()) {
            return -1;
        }
        if (tz_02 == null || tz_02.biO()) {
            return 1;
        }
        if (tz_02.btF != this.btF) {
            return 0;
        }
        int n = Integer.signum(this.btf - tz_02.btf);
        if (n != 0) {
            return n;
        }
        return (this.bub ? 1 : 0) - (tz_02.bub ? 1 : 0);
    }

    public boolean biO() {
        return this.biN() == buo.biN() && this.OO() == buo.OO() && this.biM() == buo.biM();
    }

    @Override
    public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.b((tz_0)object);
    }
}

