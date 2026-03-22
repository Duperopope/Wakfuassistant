/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.lang.runtime.SwitchBootstraps;
import java.util.LinkedHashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from boO
 */
public class boo_1
implements aeh_2 {
    public static final String iSS = "name";
    public static final String iST = "shortName";
    public static final String iSU = "icon";
    public static final String iSV = "value";
    public static final String[] iSW = new String[]{"name", "shortName", "icon", "value"};
    @NotNull
    private final exx_2 iSX;
    private final int iSY;

    private boo_1(@NotNull exx_2 exx_22, int n) {
        this.iSX = exx_22;
        this.iSY = n;
    }

    public static List<boo_1> a(@NotNull fho_0 fho_02, boolean bl) {
        int n = fho_02.dBc();
        if (n == 0) {
            return List.of();
        }
        bgv_2 bgv_22 = (bgv_2)bEm.dSb().Vd(n);
        if (bgv_22 == null) {
            return List.of();
        }
        LinkedHashMap<exx_2, Integer> linkedHashMap = new LinkedHashMap<exx_2, Integer>();
        for (enk_0 enk_02 : bgv_22.bcx()) {
            exx_2 exx_22;
            if (fho_02.tL() < enk_02.fAv() || fho_02.tL() > enk_02.fAw() || (exx_22 = boo_1.j(enk_02)) == null) continue;
            int n2 = enk_02.a(0, (short)fho_02.tL(), ene_0.qPu);
            if (bl) {
                n2 *= 2;
            }
            linkedHashMap.put(exx_22, n2 + linkedHashMap.getOrDefault(exx_22, 0));
        }
        return linkedHashMap.entrySet().stream().map(entry -> new boo_1((exx_2)entry.getKey(), (Integer)entry.getValue())).toList();
    }

    @Nullable
    private static exx_2 j(enk_0 enk_02) {
        pt_0 pt_02;
        Object object;
        ero_0 ero_02 = (ero_0)enf_0.fBb().pU(enk_02.avZ());
        if (ero_02 == null) {
            return null;
        }
        if (ero_02 instanceof eON) {
            object = (eON)ero_02;
            pt_02 = ((eot_0)object).fCY();
        } else if (ero_02 instanceof eok_0) {
            eok_0 eok_02 = (eok_0)ero_02;
            pt_02 = eok_02.fCY();
        } else {
            return null;
        }
        if (!(pt_02 instanceof exx_2)) {
            return null;
        }
        object = (exx_2)pt_02;
        return object;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        String string2 = string;
        int n = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{iSS, iST, iSU, iSV}, (Object)string2, n)) {
            case 0 -> biK.a(this.iSX);
            case 1 -> biK.g(this.iSX);
            case 2 -> biJ.imm.eu(this.iSX.name());
            case 3 -> this.iSY;
            default -> null;
        };
    }

    @Override
    public String[] bxk() {
        return iSW;
    }

    public String toString() {
        return "SlotCharacteristicView{m_characteristicType=" + String.valueOf(this.iSX) + ", m_value=" + this.iSY + "}";
    }
}

