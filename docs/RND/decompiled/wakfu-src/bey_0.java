/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bEY
 */
public class bey_0
implements Sp,
eyu_1,
ffk_0 {
    private static final bey_0 jSD = new bey_0();
    private final List<bex_0> jSE = new ArrayList<bex_0>();

    public static bey_0 dTc() {
        return jSD;
    }

    private bey_0() {
    }

    @Override
    public void a(eyt_1 eyt_12, exz_1 exz_12) {
        if (exz_12.aXd()) {
            this.dTd();
        }
    }

    @Override
    public void a(eyt_1 eyt_12, exz_1 exz_12, boolean bl) {
        if (exz_12.aXd()) {
            this.dTd();
        }
    }

    @Override
    public void a(eyt_1 eyt_12, long l, long l2) {
    }

    public void Q(exP exP2) {
        exP2.dod().a(this);
        for (ffs_0 ffs_02 : exP2.dod().fVh()) {
            ffs_02.a(this);
        }
    }

    public void R(exP exP2) {
        exP2.dod().b(this);
        for (ffs_0 ffs_02 : exP2.dod().fVh()) {
            ffs_02.b(this);
        }
        this.dTd();
    }

    public void a(bex_0 bex_02) {
        if (!this.jSE.contains(bex_02)) {
            this.jSE.add(bex_02);
        }
    }

    public void b(bex_0 bex_02) {
        this.jSE.remove(bex_02);
    }

    @Override
    public void b(Sl sl) {
        this.e(sl);
    }

    @Override
    public void a(ffs_0 ffs_02) {
        ffs_02.a(this);
        this.dTd();
    }

    @Override
    public void b(ffs_0 ffs_02) {
        ffs_02.b(this);
        this.dTd();
    }

    private void dTd() {
        this.e(null);
    }

    private void e(@Nullable Sl sl) {
        this.jSE.forEach(bex_02 -> bex_02.d(sl));
    }
}

