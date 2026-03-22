/*
 * Decompiled with CFR 0.152.
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import com.ankama.wakfu.utils.criterion.doc.Parameter;
import com.ankama.wakfu.utils.criterion.doc.Signature;
import com.ankama.wakfu.utils.criterion.doc.VarType;
import java.util.ArrayList;
import java.util.Collection;

@Criterion(description="V\u00e9rifie si il ya une invoc a cot\u00e9 de la cible", signatures={@Signature(description="N'importe quelle invocation", params={@Parameter(name="target", type=VarType.STRING)}), @Signature(description="Invocation sp\u00e9cifique", params={@Parameter(name="target", type=VarType.STRING), @Parameter(name="summonId", type=VarType.NUMBER)}), @Signature(description="N'importe quelle invocation dans le voisinage (MOORE, VON_NEUMANN)", params={@Parameter(name="target", type=VarType.STRING), @Parameter(name="neighbourhoodType", type=VarType.STRING)}), @Signature(description="Invocation sp\u00e9cifique dans le voisinage (MOORE, VON_NEUMANN)", params={@Parameter(name="target", type=VarType.STRING), @Parameter(name="summonId", type=VarType.NUMBER), @Parameter(name="neighbourhoodType", type=VarType.STRING)})})
public final class eEz
extends eet_0 {
    private long prR;

    public eEz(ArrayList<amx_1> arrayList) {
        byte by = this.r(arrayList);
        this.pvJ = ((anh_2)arrayList.get(0)).getValue().equalsIgnoreCase("target");
        switch (by) {
            case 1: {
                this.prR = ((amu_1)arrayList.get(1)).d(null, null, null, null);
                this.pBJ = eEu.pBL;
                break;
            }
            case 2: {
                this.prR = -1L;
                this.rU(((anh_2)arrayList.get(1)).getValue());
                break;
            }
            case 3: {
                this.prR = ((amu_1)arrayList.get(1)).d(null, null, null, null);
                this.rU(((anh_2)arrayList.get(2)).getValue());
            }
        }
    }

    @Override
    protected boolean a(exP exP2, etu_0 etu_02, acd_1 acd_12) {
        ety_0 ety_02 = exP2.dlK();
        if (ety_02 == null) {
            return false;
        }
        Collection collection = ety_02.fKc();
        for (exP exP3 : collection) {
            if (exP3 == exP2 || exP3.dlL() != exP2 || (long)exP3.aWP() != this.prR && this.prR != -1L) continue;
            switch (this.pBJ) {
                case pBK: {
                    if (!acd_12.cJ(exP3.bcC(), exP3.bcD())) break;
                    return true;
                }
                case pBL: {
                    if (!acd_12.cI(exP3.bcC(), exP3.bcD())) break;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pKX;
    }
}

