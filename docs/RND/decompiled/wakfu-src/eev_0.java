/*
 * Decompiled with CFR 0.152.
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import com.ankama.wakfu.utils.criterion.doc.Parameter;
import com.ankama.wakfu.utils.criterion.doc.Signature;
import com.ankama.wakfu.utils.criterion.doc.VarType;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Renamed from eEv
 */
@Criterion(description="V\u00e9rifie si il y a une zone d'effet du type donn\u00e9 a cot\u00e9 de la cible", signatures={@Signature(description="Area type id", params={@Parameter(name="areaTypeId", type=VarType.NUMBER), @Parameter(name="target", type=VarType.STRING)}), @Signature(description="Area type name", params={@Parameter(name="areaTypeName", type=VarType.STRING), @Parameter(name="target", type=VarType.STRING)}), @Signature(description="Area type id + neighbourhood in (MOORE, VON_NEUMANN)", params={@Parameter(name="areaTypeId", type=VarType.NUMBER), @Parameter(name="target", type=VarType.STRING), @Parameter(name="neighbourhoodType", type=VarType.STRING)}), @Signature(description="Area type name + neighbourhood in (MOORE, VON_NEUMANN)", params={@Parameter(name="areaTypeName", type=VarType.STRING), @Parameter(name="target", type=VarType.STRING), @Parameter(name="neighbourhoodType", type=VarType.STRING)}), @Signature(description="Area type id + neighbourhood in (MOORE, VON_NEUMANN) + Specific id", params={@Parameter(name="areaTypeId", type=VarType.NUMBER), @Parameter(name="target", type=VarType.STRING), @Parameter(name="neighbourhoodType", type=VarType.STRING), @Parameter(name="areaSpecificIdInsteadOfTypeId", type=VarType.BOOLEAN)})})
public class eev_0
extends eet_0 {
    private amu_1 pxJ;
    private anh_2 pBN;
    private boolean pBO;

    public eev_0(ArrayList<amx_1> arrayList) {
        byte by = this.r(arrayList);
        if (by == 0) {
            this.pxJ = (amu_1)arrayList.get(0);
            this.pBN = null;
            this.pBJ = eEu.pBL;
            this.pBO = false;
        } else if (by == 1) {
            this.pBN = (anh_2)arrayList.get(0);
            this.pxJ = null;
            this.pBJ = eEu.pBL;
            this.pBO = false;
        } else if (by == 2) {
            this.pxJ = (amu_1)arrayList.get(0);
            this.pBN = null;
            this.rU(((anh_2)arrayList.get(2)).getValue());
            this.pBO = false;
        } else if (by == 3) {
            this.pBN = (anh_2)arrayList.get(0);
            this.pxJ = null;
            this.rU(((anh_2)arrayList.get(2)).getValue());
            this.pBO = false;
        } else if (by == 4) {
            this.pBN = null;
            this.pxJ = (amu_1)arrayList.get(0);
            this.rU(((anh_2)arrayList.get(2)).getValue());
            this.pBO = true;
        }
        this.pvJ = ((anh_2)arrayList.get(1)).getValue().equalsIgnoreCase("target");
    }

    private etm_0 fnV() {
        if (this.pxJ != null) {
            int n = (int)this.pxJ.d(null, null, null, null);
            return etm_0.Sr(n);
        }
        return etm_0.valueOf(this.pBN.getValue().toUpperCase());
    }

    @Override
    protected boolean a(exP exP2, etu_0 etu_02, acd_1 acd_12) {
        Object object;
        int n;
        int n2;
        boolean bl = false;
        if (this.pBO) {
            n2 = (int)this.pxJ.d(null, null, null, null);
            n = -1;
        } else {
            n2 = -1;
            n = this.pxJ != null ? (int)this.pxJ.d(null, null, null, null) : ((object = etm_0.valueOf(this.pBN.getValue().toUpperCase())) != null ? ((etm_0)object).aHp() : -1);
        }
        object = etu_02.bai().bdh();
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            QQ qQ = (QQ)iterator.next();
            if (!this.a(n, n2, qQ, exP2)) continue;
            switch (this.pBJ) {
                case pBK: {
                    if (!acd_12.cJ(qQ.bcC(), qQ.bcD())) break;
                    bl = true;
                    break;
                }
                case pBL: {
                    if (!acd_12.cI(qQ.bcC(), qQ.bcD())) break;
                    bl = true;
                }
            }
        }
        return bl;
    }

    protected boolean a(int n, int n2, QQ qQ, qu_0 qu_02) {
        return qQ.aeV() == n || qQ.bcw() == (long)n2;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pIP;
    }
}

