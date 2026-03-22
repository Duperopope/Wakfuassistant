/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from fnO
 */
public class fno_0 {
    public static final fno_0 sKx = new fno_0();
    private final ArrayList<fnn_0> sKy = new ArrayList();

    private fno_0() {
    }

    public boolean a(fnn_0 fnn_02) {
        return this.sKy.add(fnn_02);
    }

    public fnl_0 g(fov_0 fov_02) {
        fnr_0 fnr_02 = new fnr_0();
        fnr_02.h(fov_02);
        this.a(fnr_02);
        return fnr_02;
    }

    public fnl_0 b(wg_2 wg_22) {
        fnr_0 fnr_02 = new fnr_0();
        fnr_02.d(wg_22);
        this.a(fnr_02);
        return fnr_02;
    }

    public fnl_0 f(ly_1 ly_12) {
        fnr_0 fnr_02 = new fnr_0();
        fnr_02.h(foy_0.sLJ.XP(ly_12.agf()));
        fnr_02.setName(ly_12.getName());
        fnr_02.Xy(ly_12.agI());
        fnr_02.Xz(ly_12.agK());
        fnr_02.Xx(ly_12.agM());
        fnr_02.lQ(ly_12.agN());
        fnr_02.ac(uw_0.fn(ly_12.agP()));
        fnr_02.ad(uw_0.fn(ly_12.agR()));
        fnr_02.Xw(ly_12.agT());
        fnr_02.af(uw_0.fn(ly_12.agV()));
        this.a(fnr_02);
        return fnr_02;
    }

    public fnl_0 h(fnl_0 fnl_02) {
        fnr_0 fnr_02 = new fnr_0();
        fnr_02.h(fnl_02.geL());
        fnr_02.setName(fnl_02.getName());
        fnr_02.Xy(fnl_02.agI());
        fnr_02.Xz(fnl_02.agK());
        fnr_02.Xx(fnl_02.agM());
        fnr_02.lQ(fnl_02.agN());
        fnr_02.ac(fnl_02.geN());
        fnr_02.ad(fnl_02.geO());
        fnr_02.Xw(fnl_02.agT());
        fnr_02.af(fnl_02.geP());
        this.a(fnr_02);
        return fnr_02;
    }

    private void a(fnr_0 fnr_02) {
        int n = this.sKy.size();
        for (int i = 0; i < n; ++i) {
            this.sKy.get(i).g(fnr_02);
        }
    }

    public String toString() {
        return "PetFactory{m_listeners=" + this.sKy.size() + "}";
    }
}

