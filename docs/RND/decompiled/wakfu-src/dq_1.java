/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
import java.util.Optional;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Renamed from DQ
 */
public final class dq_1 {
    private static final Logger ayc = LoggerFactory.getLogger(dq_1.class);

    private dq_1() {
    }

    @Nullable
    public static fk_0 a(eg_2 eg_22, do_0 do_02) {
        Optional<fl_0> optional = fl_0.mL(do_02.aIy());
        if (optional.isEmpty()) {
            return null;
        }
        fk_0 fk_02 = DO.a(optional);
        if (fk_02 == null) {
            return null;
        }
        dq_1.a(eg_22, do_02, fk_02);
        return fk_02;
    }

    private static void a(eg_2 eg_22, do_0 do_02, fk_0 fk_02) {
        fk_02.a(eg_22);
        switch (fk_02.aKA()) {
            case aAM: {
                DL.a((ff_0)fk_02, do_02);
                return;
            }
            case aAN: {
                DM.a((fh_0)fk_02, do_02);
                return;
            }
            case aAO: {
                dk_0.a((fg_0)fk_02, do_02);
                return;
            }
            case aAP: {
                dj_0.a((fe_1)fk_02, do_02);
                return;
            }
        }
        ayc.error("No known loader for definition {}", (Object)fk_02);
    }
}

