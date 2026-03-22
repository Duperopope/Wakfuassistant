/*
 * Decompiled with CFR 0.152.
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import com.ankama.wakfu.utils.criterion.doc.Parameter;
import com.ankama.wakfu.utils.criterion.doc.Signature;
import com.ankama.wakfu.utils.criterion.doc.VarType;
import java.util.ArrayList;

/*
 * Renamed from eEC
 */
@Criterion(description="Renvoie true si le client possede deja le MM pass\u00e9 en parametre", signatures={@Signature(params={@Parameter(name="breedId", type=VarType.NUMBER)})})
public final class eec_0
extends eAH {
    private final long pBU;

    public eec_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pBU = ((amu_1)arrayList.get(0)).d(null, null, null, null);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eyo_0 eyo_02 = eAs.b(false, object, object2, object4, object3);
        if (!(eyo_02 instanceof exP)) {
            return -1;
        }
        exP exP2 = (exP)eyo_02;
        if (eJN.qAF.U(exP2.Xi(), (int)this.pBU)) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pLS;
    }

    public short aWP() {
        return (short)this.pBU;
    }
}

