/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.base.Function;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

public final class eAs {
    public static final Function<foP, foI> pvY = new eaa_0();
    public static final Function<foI, TIntObjectHashMap<abm_1>> pvZ = new eAw();
    public static final Function<foI, TIntObjectHashMap<abm_1>> pwa = new eAy();
    public static final Function<abm_1, Integer> pwb = new eav_0();
    public static final Function<abm_1, Integer> pwc = new eau_0();
    public static final Function<foM, foP> pwd = new eAx();
    public static final Function<foM, Boolean> pwe = new eab_0();
    public static final Function<foP, fpb> pwf = new eAz();
    private static final List<eyo_0> pwg = Collections.emptyList();

    private eAs() {
    }

    public static exP k(Object object, Object object2, Object object3, Object object4) {
        eyo_0 eyo_02 = eAs.m(object, object2, object3, object4);
        if (eyo_02 instanceof exP) {
            return (exP)eyo_02;
        }
        return null;
    }

    public static exP a(boolean bl, Object object, Object object2, Object object3, Object object4) {
        eyo_0 eyo_02 = eAs.b(bl, object, object2, object3, object4);
        if (eyo_02 instanceof exP) {
            return (exP)eyo_02;
        }
        return null;
    }

    public static exP a(ehl_0 ehl_02, Object object, Object object2, Object object3, Object object4) {
        eyo_0 eyo_02 = eAs.b(ehl_02, object, object2, object3, object4);
        if (eyo_02 instanceof exP) {
            return (exP)eyo_02;
        }
        return null;
    }

    public static eyo_0 b(boolean bl, Object object, Object object2, Object object3, Object object4) {
        Object object5;
        Object object6 = object5 = bl ? object2 : object;
        if (object5 instanceof eyo_0) {
            return (eyo_0)object5;
        }
        return eAs.a(ehl_0.pFp, object2, object3, object4);
    }

    public static eyo_0 b(ehl_0 ehl_02, Object object, Object object2, Object object3, Object object4) {
        if (ehl_02 == ehl_0.pFq && object instanceof eyo_0) {
            return (eyo_0)object;
        }
        if (ehl_02 == ehl_0.pFr && object2 instanceof eyo_0) {
            return (eyo_0)object2;
        }
        return eAs.a(ehl_02, object2, object3, object4);
    }

    public static List<eyo_0> c(boolean bl, Object object, Object object2, Object object3, Object object4) {
        Object object5;
        Object object6 = object5 = bl ? object2 : object;
        if (object5 instanceof eyo_0) {
            return Collections.singletonList((eyo_0)object5);
        }
        return eAs.b(ehl_0.pFp, object2, object3, object4);
    }

    public static List<eyo_0> c(ehl_0 ehl_02, Object object, Object object2, Object object3, Object object4) {
        if (ehl_02 == ehl_0.pFq && object instanceof eyo_0) {
            return Collections.singletonList((eyo_0)object);
        }
        if (ehl_02 == ehl_0.pFr && object2 instanceof eyo_0) {
            return Collections.singletonList((eyo_0)object2);
        }
        return eAs.b(ehl_02, object2, object3, object4);
    }

    public static acd_1 d(boolean bl, Object object, Object object2, Object object3, Object object4) {
        Object object5;
        Object object6 = object5 = bl ? object2 : object;
        if (object5 instanceof acd_1) {
            return (acd_1)object5;
        }
        if (object5 instanceof eyo_0) {
            return ((eyo_0)object5).aZw();
        }
        return null;
    }

    @Nullable
    public static acd_1[] aN(Object object) {
        acd_1 acd_12 = eAs.d(true, null, object, null, null);
        if (acd_12 == null) {
            return null;
        }
        if (object instanceof amg_1) {
            byte by = ((amg_1)object).bcO();
            int n = (2 * by + 1) * (2 * by + 1);
            acd_1[] acd_1Array = new acd_1[n];
            int n2 = 0;
            for (int i = acd_12.getX() - by; i <= acd_12.getX() + by; ++i) {
                for (int j = acd_12.getY() - by; j <= acd_12.getY() + by; ++j) {
                    acd_1Array[n2] = new acd_1(i, j, acd_12.bdi());
                    ++n2;
                }
            }
            return acd_1Array;
        }
        return new acd_1[]{acd_12};
    }

    public static Optional<foM> l(Object object, Object object2, Object object3, Object object4) {
        if (object instanceof foP) {
            return Optional.ofNullable(((foP)object).gfS());
        }
        eyo_0 eyo_02 = eAs.m(object, object2, object3, object4);
        if (eyo_02 instanceof exP) {
            return Optional.ofNullable(fpk.sNF.Yn(((exP)eyo_02).dlp()));
        }
        return Optional.empty();
    }

    public static eyo_0 m(Object object, Object object2, Object object3, Object object4) {
        if (object instanceof eyo_0) {
            return (eyo_0)object;
        }
        if (object2 instanceof eyo_0) {
            return (eyo_0)object2;
        }
        return eAs.a(ehl_0.pFp, object2, object3, object4);
    }

    private static eyo_0 a(ehl_0 ehl_02, Object object, Object object2, Object object3) {
        switch (ehl_02) {
            case pFs: {
                return eAs.j(object2, object3);
            }
            case pFt: {
                return eAs.k(object2, object3);
            }
            case pFu: {
                return eAs.i(object, object2);
            }
        }
        eyo_0 eyo_02 = eAs.j(object2, object3);
        if (eyo_02 != null) {
            return eyo_02;
        }
        return eAs.i(object, object2);
    }

    private static eyo_0 i(Object object, Object object2) {
        if (!(object instanceof acd_1)) {
            return null;
        }
        etu_0 etu_02 = eAs.aO(object2);
        if (etu_02 == null) {
            return null;
        }
        acd_1 acd_12 = (acd_1)object;
        return etu_02.ax(acd_12);
    }

    private static eyo_0 j(Object object, Object object2) {
        if (object instanceof ehe_0) {
            ehe_0 ehe_02 = (ehe_0)object;
            return ehe_02.fog();
        }
        if (object2 instanceof ehe_0) {
            ehe_0 ehe_03 = (ehe_0)object2;
            return ehe_03.fog();
        }
        return null;
    }

    private static eyo_0 k(Object object, Object object2) {
        if (object instanceof ehn_0) {
            ehn_0 ehn_02 = (ehn_0)object;
            return (eyo_0)((Object)ehn_02.foj());
        }
        if (object2 instanceof ehn_0) {
            ehn_0 ehn_03 = (ehn_0)object2;
            return (eyo_0)((Object)ehn_03.foj());
        }
        return null;
    }

    private static List<eyo_0> b(ehl_0 ehl_02, Object object, Object object2, Object object3) {
        switch (ehl_02) {
            case pFs: {
                eyo_0 eyo_02 = eAs.j(object2, object3);
                return eyo_02 != null ? Collections.singletonList(eyo_02) : pwg;
            }
            case pFt: {
                eyo_0 eyo_03 = eAs.k(object2, object3);
                return eyo_03 != null ? Collections.singletonList(eyo_03) : pwg;
            }
        }
        eyo_0 eyo_04 = eAs.j(object2, object3);
        if (eyo_04 != null) {
            return Collections.singletonList(eyo_04);
        }
        return eAs.l(object, object2);
    }

    private static List<eyo_0> l(Object object, Object object2) {
        if (!(object instanceof acd_1)) {
            return Collections.emptyList();
        }
        ArrayList<eyo_0> arrayList = new ArrayList<eyo_0>();
        etu_0 etu_02 = eAs.aO(object2);
        if (etu_02 == null) {
            return Collections.emptyList();
        }
        acd_1 acd_12 = (acd_1)object;
        arrayList.add((eyo_0)etu_02.ax(acd_12));
        List<QQ> list = etu_02.bai().f(acd_12);
        int n = list.size();
        for (int i = 0; i < n; ++i) {
            QQ qQ = list.get(i);
            arrayList.add((eyo_0)((Object)qQ));
        }
        return arrayList;
    }

    public static etu_0 aO(Object object) {
        if (object == null) {
            return null;
        }
        if (object instanceof etu_0) {
            return (etu_0)object;
        }
        if (object instanceof ent_0) {
            return ((ent_0)object).fBq();
        }
        return null;
    }

    public static qu_0 aP(Object object) {
        if (object == null) {
            return null;
        }
        if (object instanceof exP) {
            return ((exP)object).dlL();
        }
        if (object instanceof QP) {
            return eAs.aP(((QP)object).bci());
        }
        if (object instanceof qu_0) {
            return (qu_0)object;
        }
        return null;
    }

    @Nullable
    public static ero_0 aQ(Object object) {
        if (object == null) {
            return null;
        }
        if (!(object instanceof ero_0)) {
            return null;
        }
        ero_0 ero_02 = (ero_0)object;
        if (ero_02.fHr() != null) {
            return (ero_0)ero_02.fHr();
        }
        enq_0 enq_02 = (enq_0)((QD)object).bbg();
        if (enq_02 == null) {
            return null;
        }
        return enq_02.fBh();
    }

    @Nullable
    public static qu_0 aR(Object object) {
        ero_0 ero_02 = eAs.aQ(object);
        if (ero_02 == null) {
            return null;
        }
        return ero_02.bbd();
    }

    @Nullable
    public static qu_0 aS(Object object) {
        ero_0 ero_02 = eAs.aQ(object);
        if (ero_02 == null) {
            return null;
        }
        return ero_02.bbc();
    }

    public static etu_0<?> m(Object object, Object object2) {
        if (object2 instanceof etu_0) {
            return (etu_0)object2;
        }
        if (object2 instanceof ent_0) {
            return ((ent_0)object2).fBq();
        }
        if (!(object instanceof eyo_0)) {
            throw new amf_2("On essaie de compter les fighters d'un caster qui n'est pas un perso");
        }
        if (object instanceof exP) {
            return (etu_0)((exP)object).dlK();
        }
        return null;
    }

    public static eyo_0 a(String string, Object object, Object object2, Object object3, Object object4) {
        eyo_0 eyo_02 = null;
        if (string == null || string.equalsIgnoreCase("caster")) {
            eyo_02 = eAs.b(false, object, object2, object3, object4);
        } else if (string.equalsIgnoreCase("target")) {
            eyo_02 = eAs.b(true, object, object2, object3, object4);
        } else if (string.equalsIgnoreCase("triggeringCaster")) {
            qu_0 qu_02 = eAs.aS(object4);
            if (qu_02 instanceof eyo_0) {
                eyo_02 = (eyo_0)((Object)qu_02);
            }
        } else if (string.equalsIgnoreCase("triggeringTarget")) {
            qu_0 qu_03 = eAs.aR(object4);
            if (qu_03 instanceof eyo_0) {
                eyo_02 = (eyo_0)((Object)qu_03);
            }
        } else if (string.equalsIgnoreCase("casterController")) {
            eyo_0 eyo_03 = eAs.b(false, object, object2, object3, object4);
            if (eyo_03 == null) {
                return null;
            }
            etu_0 etu_02 = eAs.aO(object3);
            if (etu_02 == null) {
                return null;
            }
            eyo_02 = etu_02.qJ(eyo_03.dOo());
        } else if (string.equalsIgnoreCase("eventTarget")) {
            eAG eAG2;
            eAG eAG3 = object3 instanceof ehn_0 ? ((ehn_0)object3).foj() : (eAG2 = object4 instanceof ehn_0 ? ((ehn_0)object4).foj() : null);
            if (!(eAG2 instanceof eyo_0)) {
                return null;
            }
            eyo_02 = (eyo_0)((Object)eAG2);
        }
        return eyo_02;
    }

    public static eki_0 n(Object object, Object object2, Object object3, Object object4) {
        exP exP2 = eAs.k(object, object2, object3, object4);
        if (!(exP2 instanceof ekf_0)) {
            throw new amf_2("Unable to get criterion target");
        }
        Optional<eki_0> optional = ((ekf_0)((Object)exP2)).dpJ();
        if (optional.isEmpty()) {
            throw new amf_2("Unable to get craftHandler of user");
        }
        return optional.get();
    }
}

