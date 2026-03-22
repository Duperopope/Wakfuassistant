/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bpA
 */
public class bpa_1
extends bpx_0 {
    public static final String iWy = "bindTypes";
    public static final String iWz = "types";
    public static final String[] iWA = (String[])ArrayUtils.addAll((Object[])bpx_0.iWa, (Object[])new String[]{"rarities", "acquisitions", "bindTypes", "types"});
    public static final Set<Short> iWB = Set.of(Short.valueOf((short)109));
    private final List<bil_1> iWC = bil_1.a(fgj.siF, fgj.siH, fgj.siG);
    private final List<bqj_1> iWD = bqj_1.a(new bpr_0[0]);
    private final List<bqi_1> iWE = bqi_1.dDZ();
    private final List<bEO> iWF = bpa_1.dDl();
    private final List<Short> iWG = this.dDm();

    public bpa_1() {
        super(bpr_1.iVn);
    }

    private static List<bEO> dDl() {
        ArrayList<bEO> arrayList = new ArrayList<bEO>();
        for (fhy_0 fhy_03 : bew_1.dSk().fZi()) {
            if (!fhy_03.cnk() || iWB.contains(fhy_03.aIi())) continue;
            arrayList.add(new bEO(fhy_03, null, fhy_02 -> true));
        }
        fhy_0 fhy_04 = bew_1.dSk().Gy(551);
        if (fhy_04 != null) {
            arrayList.add(bEO.a(fhy_04, null));
        }
        arrayList.sort(bEO.jRu);
        bpa_1.M(arrayList);
        bpa_1.N(arrayList);
        return arrayList;
    }

    private static void M(List<bEO> list) {
        list.stream().filter(bEO2 -> bEO2.dGh().aIi() == 385).findFirst().ifPresent(bEO2 -> {
            Optional.ofNullable(bew_1.dSk().Gy(218)).ifPresent(fhy_02 -> bEO2.d(bEO.a(fhy_02, bEO2)));
            Optional.ofNullable(bew_1.dSk().Gy(604)).ifPresent(fhy_02 -> bEO2.d(bEO.a(fhy_02, bEO2)));
            Optional.ofNullable(bew_1.dSk().Gy(612)).ifPresent(fhy_02 -> bEO2.d(bEO.a(fhy_02, bEO2)));
        });
    }

    private static void N(List<bEO> list) {
        HashSet hashSet = new HashSet();
        for (bEO iterator2 : list) {
            iterator2.l(bEO2 -> {
                if (bEO2.dSP() != null) {
                    hashSet.add(bEO2.dGh().aIi());
                }
            });
        }
        Collection<? extends bpb_1> collection = bpm_1.dCG().a(bpr_1.iVn, bps_0.iVz);
        Iterator iterator = collection.iterator();
        block1: while (iterator.hasNext()) {
            bpb_1 bpb_12 = (bpb_1)iterator.next();
            bpe_1 bpe_12 = (bpe_1)bpb_12;
            fhy_0 fhy_02 = bpe_12.duo().dGh();
            while (true) {
                hashSet.remove(fhy_02.aIi());
                if (fhy_02.fZm() == null) continue block1;
                fhy_02 = fhy_02.fZm();
            }
        }
        for (bEO bEO3 : list) {
            bEO3.l(bEO2 -> {
                if (bEO2.dSP() != null && hashSet.contains(bEO2.dGh().aIi())) {
                    bEO2.dSP().e((bEO)bEO2);
                }
            });
        }
    }

    private List<Short> dDm() {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.iWF.forEach(bEO3 -> bEO3.l(bEO2 -> arrayDeque.add(bEO2.dGh())));
        ArrayList<Short> arrayList = new ArrayList<Short>();
        while (!arrayDeque.isEmpty()) {
            fhy_0 fhy_02 = (fhy_0)arrayDeque.pop();
            short s = fhy_02.aIi();
            if (s == -1) continue;
            arrayList.add(s);
            fhy_02.fZp().forEach(arrayDeque::add);
        }
        return arrayList;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        return switch (string) {
            case "rarities" -> this.iWC;
            case "acquisitions" -> this.iWD;
            case iWy -> this.iWE;
            case iWz -> this.iWF;
            default -> super.eu(string);
        };
    }

    @Override
    public void gO(boolean bl) {
        this.iWC.forEach(bil_12 -> bil_12.gQ(false));
        this.iWF.forEach(bEO2 -> bEO2.hD(false));
        this.iWD.forEach(bqj_12 -> bqj_12.gQ(false));
        this.iWE.forEach(bqi_12 -> bqi_12.gQ(false));
        super.gO(bl);
    }

    @Override
    protected void dCX() {
        EnumSet enumSet = this.b(buh_0.jov).map(bpV::dDQ).orElseGet(() -> EnumSet.noneOf(fgj.class));
        for (bil_1 object2 : this.iWC) {
            object2.gQ(enumSet.contains(object2.dxF()));
        }
        Set set = this.b(buh_0.jow).map(bpX::dDS).orElseGet(Collections::emptySet);
        for (bEO bEO3 : this.iWF) {
            bEO3.l(bEO2 -> bEO2.setSelected(set.contains(bEO2.dGh().aIi())));
        }
        EnumSet enumSet2 = this.b(buh_0.joI).map(bps_1::dDM).orElseGet(() -> EnumSet.noneOf(bpr_0.class));
        for (bqj_1 bqj_12 : this.iWD) {
            bqj_12.gQ(enumSet2.contains((Object)bqj_12.dDr()));
        }
    }

    public boolean a(@NotNull fhy_0 fhy_02) {
        return !this.iWG.contains(fhy_02.aIi());
    }

    @Override
    public String[] bxk() {
        return iWA;
    }
}

