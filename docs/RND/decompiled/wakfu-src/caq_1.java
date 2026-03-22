/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  org.jetbrains.annotations.NotNull
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Renamed from caQ
 */
public class caq_1
extends cav_2 {
    private static final Logger lHJ = LoggerFactory.getLogger(caq_1.class);
    private final Map<VN, Set<VN>> lHK = new HashMap<VN, Set<VN>>();
    private final List<cau_1> lHL = new ArrayList<cau_1>();

    caq_1(long l, int n, int n2, int n3, int n4) {
        super(l, n, n2, n3, n4);
    }

    @NotNull
    Collection<VN> N(short s, short s2) {
        return this.lHK.getOrDefault(new VN(s, s2), Collections.emptySet());
    }

    @Override
    public boolean y(TObjectProcedure<fam_0> tObjectProcedure) {
        if (!super.y(tObjectProcedure)) {
            return false;
        }
        for (cau_1 cau_12 : this.lHL) {
            if (tObjectProcedure.execute((Object)cau_12)) continue;
            return false;
        }
        return true;
    }

    void a(@NotNull ftj_0 ftj_02, @NotNull ftt_0 ftt_02) {
        ftj_02.glP().values().forEach(fti_02 -> {
            ftu_0 ftu_02 = (ftu_0)ftt_02.gmh().get(fti_02.cZa());
            ftp_0 ftp_02 = ftu_02 == null ? ftp_0.tfH : ftu_02.gmi();
            switch (ftp_02) {
                case tfH: {
                    for (VN vN2 : fti_02.glM()) {
                        this.lHK.computeIfAbsent(vN2.bkM(), vN -> new HashSet()).add(vN2);
                    }
                    break;
                }
                case tfI: {
                    cau_1 cau_12 = new cau_1((fti_0)fti_02);
                    this.lHL.add(cau_12);
                }
            }
        });
    }

    @NotNull
    cau_1 a(@NotNull fti_0 fti_02) {
        for (VN vN : fti_02.glM()) {
            wy_0 wy_02;
            VN vN2 = vN.bkM();
            Set<VN> set = this.lHK.get(vN2);
            if (set != null) {
                set.remove(vN);
                if (set.isEmpty()) {
                    this.lHK.remove(vN2);
                }
            }
            if ((wy_02 = wa_0.aQ(vN.bkP(), vN.bkQ())) == null) {
                lHJ.error("[Ranch] Could not find topology map at coordinates {} in instance {}", (Object)vN2, (Object)wa_0.bhh());
                continue;
            }
            wy_02.b(vN.bkP(), vN.bkQ(), false);
        }
        cau_1 cau_12 = new cau_1(fti_02);
        this.lHL.add(cau_12);
        return cau_12;
    }
}

