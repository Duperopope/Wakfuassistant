/*
 * Decompiled with CFR 0.152.
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import java.util.ArrayList;
import java.util.Optional;

@Criterion(description="Get the global protector satisfaction level (@see ProtectorSatisfactionLevel.java)")
public class eCN
extends eak_0 {
    @Override
    public boolean bDo() {
        return true;
    }

    public eCN(ArrayList<amx_1> arrayList) {
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        Optional<foM> optional = eAs.l(object, object2, object3, object4);
        Optional<fpb> optional2 = optional.map(arg_0 -> eAs.pwd.apply(arg_0)).map(arg_0 -> eAs.pwf.apply(arg_0));
        if (optional2.isEmpty()) {
            throw new amf_2("Unable to retrieve territory");
        }
        return this.fny() * (long)optional2.get().aJr();
    }

    @Override
    public Enum bDq() {
        return ehq_0.pHR;
    }
}

