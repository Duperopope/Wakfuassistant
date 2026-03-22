/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from eGv
 */
public final class egv_0
extends eAq {
    public egv_0(ArrayList<amx_1> arrayList) {
        byte by = this.r(arrayList);
        switch (by) {
            case 0: {
                this.pvJ = false;
                break;
            }
            case 1: {
                String string = ((anh_2)arrayList.get(0)).getValue();
                if (!string.equalsIgnoreCase("target")) break;
                this.pvJ = true;
            }
        }
    }

    @Override
    protected boolean a(so_0 so_02) {
        return so_02 == so_0.bpH || so_02 == so_0.bpG;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pKS;
    }
}

