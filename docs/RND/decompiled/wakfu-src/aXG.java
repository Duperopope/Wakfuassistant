/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public class aXG
implements eJR,
eJT {
    public static final aXG hxc = new aXG();

    @Override
    public void b(eJS eJS2) {
        Optional optional = bbs_2.a(eva_1.owr);
        if (!eJS2.efO()) {
            return;
        }
        if (optional.isPresent()) {
            eKd eKd2 = (eKd)optional.get();
            eKd2.Ql(-eJS2.cmL());
        } else {
            eKd eKd3 = new eKd();
            eKd3.Ql(-eJS2.cmL());
            bbs_2.a(eKd3);
        }
    }

    @Override
    public void c(eJS eJS2) {
        Optional optional = bbs_2.a(eva_1.owr);
        if (!eJS2.efO()) {
            return;
        }
        if (optional.isPresent()) {
            eKd eKd2 = (eKd)optional.get();
            eKd2.Ql(eJS2.cmL());
        } else {
            eKd eKd3 = new eKd();
            eKd3.Ql(eJS2.cmL());
            bbs_2.a(eKd3);
        }
    }

    @Override
    public void a(eJS eJS2, long l) {
        Optional optional;
        if (!eJS2.efO()) {
            return;
        }
        int n = eJS2.cmL() - mz_1.aVX.cR(l);
        if (n > 0 && (optional = bbs_2.a(eva_1.owr)).isPresent()) {
            eKd eKd2 = (eKd)optional.get();
            eKd2.Ql(n);
        }
    }

    @Override
    public void d(eJS eJS2) {
    }

    @Override
    public void e(eJS eJS2) {
    }

    @Override
    public void f(eJS eJS2) {
    }

    @Override
    public void g(eJS eJS2) {
    }

    @Override
    public void h(eJS eJS2) {
        if (!eJS2.efO()) {
            Optional optional = bbs_2.a(eva_1.owr);
            if (optional.isPresent()) {
                eKd eKd2 = (eKd)optional.get();
                eKd2.Ql(-eJS2.cmL());
            } else {
                eKd eKd3 = new eKd();
                eKd3.Ql(-eJS2.cmL());
                bbs_2.a(eKd3);
            }
        }
    }
}

