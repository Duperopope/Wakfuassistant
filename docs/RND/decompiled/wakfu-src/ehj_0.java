/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import com.ankama.wakfu.utils.criterion.doc.Parameter;
import com.ankama.wakfu.utils.criterion.doc.Signature;
import com.ankama.wakfu.utils.criterion.doc.VarType;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from eHj
 */
@Criterion(description="Count the summoned entity that are aligned with the user and the target cell", signatures={@Signature(description="Count any summon within that range", params={@Parameter(name="minRange", type=VarType.NUMBER), @Parameter(name="maxRange", type=VarType.NUMBER)}), @Signature(description="Count any summon within that range using the targetType as the reference point", params={@Parameter(name="minRange", type=VarType.NUMBER), @Parameter(name="maxRange", type=VarType.NUMBER), @Parameter(name="targetType", type=VarType.STRING)}), @Signature(description="Count the summon of the corresponding breedId within that range using the targetType as the reference point", params={@Parameter(name="minRange", type=VarType.NUMBER), @Parameter(name="maxRange", type=VarType.NUMBER), @Parameter(name="targetType", type=VarType.STRING), @Parameter(name="breedId", type=VarType.NUMBER)}), @Signature(description="Count the summon of the corresponding breedId owned (or not) by the targetType within that range using the targetType as the reference point", params={@Parameter(name="minRange", type=VarType.NUMBER), @Parameter(name="maxRange", type=VarType.NUMBER), @Parameter(name="targetType", type=VarType.STRING), @Parameter(name="breedId", type=VarType.NUMBER), @Parameter(name="onlyOwnSummon", type=VarType.NUMBER)})})
public final class ehj_0
extends eak_0 {
    private amu_1 pxK = new amb_2(-1L);
    private amu_1 pxE = new amb_2(-1L);
    private amu_1 pAJ = new amb_2(-1L);
    private amz_2 pFn = new amz_2(false);
    private String pvH = ehl_0.pFq.foh();

    public ehj_0(ArrayList<amx_1> arrayList) {
        byte by = this.r(arrayList);
        if (by >= 0) {
            this.pxK = (amu_1)arrayList.get(0);
            this.pxE = (amu_1)arrayList.get(1);
        }
        if (by >= 1) {
            this.pvH = ((anh_2)arrayList.get(2)).getValue();
        }
        if (by >= 2) {
            this.pAJ = (amu_1)arrayList.get(3);
        }
        if (by >= 3) {
            this.pFn = (amz_2)arrayList.get(4);
        }
    }

    @Override
    public long d(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        long l;
        eyo_0 eyo_02 = eAs.a(this.pvH, object, object2, object4, object3);
        if (!(eyo_02 instanceof exP)) {
            throw new amf_2("Cannot retrieve the criterion user");
        }
        exP exP2 = (exP)eyo_02;
        ety_0 ety_02 = exP2.dlK();
        if (ety_02 == null) {
            throw new amf_2("Cannot retrieve the fight");
        }
        acd_1 acd_12 = eAs.d(true, object, object2, object4, object3);
        if (acd_12 == null) {
            throw new amf_2("Cannot retrieve the target cell position");
        }
        acd_1 acd_13 = exP2.aZw();
        if (!acd_12.E(acd_13) && !acd_12.F(acd_13)) {
            return 0L;
        }
        long l2 = this.pxK.d(object, object2, object3, object4);
        if (l2 > (l = this.pxE.d(object, object2, object3, object4)) && l != -1L) {
            throw new amf_2("The minimal range cannot be superior to the maximal range");
        }
        long l3 = this.pAJ.d(object, object2, object3, object4);
        boolean bl = this.pFn.a(object, object2, object3, object4) == 0;
        List list = this.a(ety_02, exP2.Sn(), acd_13, acd_12, l2, l, l3, bl);
        return list.size();
    }

    private <F extends exP> @Unmodifiable List<F> a(ety_0<F> ety_02, long l, acd_1 acd_12, acd_1 acd_13, long l2, long l3, long l4, boolean bl) {
        return ety_02.dGs().stream().filter(exP2 -> !exP2.dOp()).filter(exP2 -> l4 == -1L || (long)exP2.aWP() == l4).filter(exP2 -> !bl || exP2.dOo() == l).filter(exP2 -> this.a(acd_12, l2, l3, exP2.aZw())).filter(exP2 -> this.a(acd_12, exP2.aZw(), acd_13)).toList();
    }

    private boolean a(acd_1 acd_12, acd_1 acd_13, acd_1 acd_14) {
        return acd_13.e(acd_12, acd_14) || acd_13.f(acd_12, acd_14);
    }

    private boolean a(acd_1 acd_12, long l, long l2, acd_1 acd_13) {
        if (l == -1L && l2 == -1L) {
            return true;
        }
        int n = acd_13.A(acd_12);
        return (long)n >= l && (long)n <= l;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pNU;
    }

    @Override
    public boolean bDo() {
        return true;
    }
}

