/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class eFz
extends eAq {
    public eFz(ArrayList<amx_1> arrayList) {
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
        return so_02 == so_0.bpI;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pHC;
    }
}

