/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.function.Consumer;

/*
 * Renamed from bDB
 */
public class bdb_0
extends bDy {
    private final bdl_0 jKH;

    public bdb_0(bdl_0 bdl_02) {
        this.jKH = bdl_02;
    }

    @Override
    public Object eu(String string) {
        switch (string) {
            case "bagInventory": {
                return this.jKH.dRx();
            }
            case "bagSize": {
                return this.jKH.dRx().length;
            }
            case "canBeSorted": {
                return false;
            }
        }
        return null;
    }

    @Override
    public void j(Consumer<fgf_0> consumer) {
        this.jKH.M((TObjectProcedure<ffV>)((TObjectProcedure)ffV2 -> {
            consumer.accept((fgf_0)ffV2);
            return true;
        }));
    }

    @Override
    public int aVo() {
        return this.jKH.dRA().stream().mapToInt(ffs_0::aVo).sum();
    }

    public String toString() {
        return "AllBagsView{m_bag=" + String.valueOf(this.jKH) + "}";
    }
}

