/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aJo
 */
public class ajo_0
extends adh {
    private static final Logger ear = Logger.getLogger(ajo_0.class);
    public static final int eas = 0;
    protected VL eat;
    private float eau;
    private long eav;
    private long eaw;
    private long eax;
    private long eay;
    private ewa eaz;

    @Override
    public byte bur() {
        return 0;
    }

    public final boolean chv() {
        return ewa.c(this.eaz);
    }

    public boolean R(int n, int n2, short s) {
        return this.S(n, n2, s) == null;
    }

    public abi_1 S(int n, int n2, short s) {
        if (this.eaz == null) {
            return abi_1.dzt;
        }
        if (this.eaz.chv()) {
            ewb ewb2 = (ewb)this.eaz;
            abi_1 abi_12 = ewb2.ai(n, n2, s);
            return abi_12;
        }
        ewc ewc2 = (ewc)this.eaz;
        return this.a(ewc2.feJ(), n, n2, s) ? null : abi_1.dzt;
    }

    private boolean a(ewe ewe2, int n, int n2, short s) {
        if (ewe2 == null) {
            return false;
        }
        byte by = (byte)(n - this.ccg * 18);
        byte by2 = (byte)(n2 - this.cch * 18);
        return ewe2.a(by, by2, s);
    }

    public final boolean S(int n, int n2, int n3) {
        int n4 = n - this.ccg * 18;
        int n5 = n2 - this.cch * 18;
        return this.T(n4, n5, n3);
    }

    public final boolean T(int n, int n2, int n3) {
        return this.V(n, n2, n3) == 0;
    }

    public final short U(int n, int n2, int n3) {
        int n4 = n - this.ccg * 18;
        int n5 = n2 - this.cch * 18;
        return this.V(n4, n5, n3);
    }

    public short V(int n, int n2, int n3) {
        return ewt_0.ffg().a(n, n2, n3, this.eat);
    }

    public float chw() {
        return this.eau;
    }

    public long chx() {
        return this.eav;
    }

    public long chy() {
        return this.eaw;
    }

    public long chz() {
        return this.eax;
    }

    public long chA() {
        return this.eay;
    }

    @Override
    public void a(@NotNull apl_1 apl_12) {
        super.a(apl_12);
        this.y(apl_12);
        this.eau = (float)apl_12.aIy() / 100.0f;
        this.eav = apl_12.bFQ();
        this.eaw = apl_12.bFQ();
        this.eax = apl_12.bFQ();
        this.eay = apl_12.bFQ();
        this.z(apl_12);
    }

    private void y(apl_1 apl_12) {
        this.eat = VL.a(apl_12, (short)0);
    }

    private void z(apl_1 apl_12) {
        this.eaz = ewa.G(apl_12);
    }

    @Override
    public void b(@NotNull fs_0 fs_02) {
        super.b(fs_02);
        this.o(fs_02);
        fs_02.g((byte)(this.eau * 100.0f));
        fs_02.cq(this.eav);
        fs_02.cq(this.eaw);
        fs_02.cq(this.eax);
        fs_02.cq(this.eay);
        this.p(fs_02);
    }

    public final void a(VL vL) {
        this.eat = vL;
    }

    public void ek(float f2) {
        assert (f2 >= 0.0f && f2 <= 1.0f);
        this.eau = f2;
    }

    public void ib(long l) {
        this.eav = l;
    }

    public void ic(long l) {
        this.eaw = l;
    }

    public void id(long l) {
        this.eax = l;
    }

    public void ie(long l) {
        this.eay = l;
    }

    private void o(fs_0 fs_02) {
        if (this.eat == null) {
            fs_02.g((byte)0);
            return;
        }
        this.eat.d(fs_02);
    }

    public void a(ewa ewa2) {
        this.eaz = ewa2;
    }

    private void p(fs_0 fs_02) {
        ewa.a(fs_02, this.eaz);
    }

    @Override
    public void clear() {
        super.clear();
        this.eat = null;
        this.eau = 0.0f;
        this.eav = 0L;
        this.eaw = 0L;
        this.eax = 0L;
        this.eay = 0L;
        this.eaz = null;
    }
}

