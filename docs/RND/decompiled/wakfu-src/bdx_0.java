/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bDX
 */
public class bdx_0
extends fej_0
implements aeh_2,
ffo {
    public static final String jLV = "temporaryBagInventory";
    public static final String jLW = "temporaryBagSize";
    public static final String jLX = "recycleAllPopup";
    @NotNull
    private final bhJ jLY;
    @Nullable
    ArrayList<ffV> jLZ;
    @Nullable
    private String jMa;

    public bdx_0(feh_0 feh_02, @NotNull bhJ bhJ2) {
        super(bhJ2.Xi(), feh_02);
        this.jLY = bhJ2;
    }

    @Override
    public String[] bxk() {
        return null;
    }

    @Override
    public Object eu(String string) {
        String string2 = string;
        int n = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{jLV, jLW, jLX}, (Object)string2, n)) {
            case 0 -> {
                if (this.jLZ == null) {
                    this.dRL();
                }
                yield this.jLZ;
            }
            case 1 -> 2;
            case 2 -> {
                if (this.jMa == null) {
                    this.dRL();
                }
                yield this.jMa;
            }
            default -> null;
        };
    }

    @Override
    protected ffs_0 lf(long l) {
        Object t = fcI.ab(aue_0.cVJ().cVK().Xi(), l);
        if (t == null) {
            return null;
        }
        return ((exP)t).dod().sY(l);
    }

    private void dRJ() {
        this.jLZ = null;
        fse_1.gFu().a((aef_2)this, jLV, jLW);
        if (aue_0.cVJ().c(cus_2.eRQ())) {
            cus_2.eRQ().d(null);
        }
    }

    @Override
    public void ah(ffV ffV2) {
        bgt_0 bgt_02;
        aue_0 aue_02 = aue_0.cVJ();
        if (!aue_02.c(cyv_2.eXZ())) {
            aue_02.a(cyv_2.eXZ());
        }
        if ((bgt_02 = aue_02.cVK()) == null) {
            this.dRJ();
            return;
        }
        ArrayList<bgt_0> arrayList = new ArrayList<bgt_0>();
        for (long l : fcL.rUh.sx(bgt_02.Xi())) {
            feh_0 feh_02;
            bgt_0 bgt_03 = (bgt_0)fcL.rUh.sw(l);
            if (bgt_03 == null || (feh_02 = (feh_0)bgt_03.a(fez_0.seq)).aJG()) continue;
            arrayList.add(bgt_03);
        }
        fse_1.gFu().b("heroesParty", arrayList, "temporaryTransferInventoryDialog");
        aPd.f("temporaryInventory.itemAdded", ffV2.bfd(), ffV2.getName());
        this.dRJ();
    }

    @Override
    public void ai(ffV ffV2) {
        feh_0 feh_02 = this.fUI();
        if (feh_02.aJG()) {
            Object object = fse_1.gFu().aW("heroesParty", "temporaryTransferInventoryDialog");
            if (object instanceof List) {
                ArrayList arrayList = new ArrayList((List)object);
                arrayList.remove(cyv_2.eXZ().daL());
                fse_1.gFu().b("heroesParty", arrayList, "temporaryTransferInventoryDialog");
            }
            boolean bl = true;
            for (long l : fcL.rUh.sx(aue_0.cVJ().cVK().Xi())) {
                feh_0 feh_03;
                bgt_0 bgt_02 = (bgt_0)fcL.rUh.sw(l);
                if (bgt_02 == null || (feh_03 = (feh_0)bgt_02.a(fez_0.seq)).aJG()) continue;
                dae_0 dae_02 = new dae_0(16179);
                dae_02.gj(l);
                aaw_1.bUq().h(dae_02);
                bl = false;
                break;
            }
            if (aue_0.cVJ().c(cyv_2.eXZ()) && bl) {
                aue_0.cVJ().b(cyv_2.eXZ());
                return;
            }
        }
        this.dRJ();
    }

    @Override
    public void aj(ffV ffV2) {
        this.dRJ();
    }

    @Override
    public void dRK() {
        this.dRJ();
    }

    private void dRL() {
        this.jLZ = new ArrayList();
        feh_0 feh_02 = this.fUI();
        feh_02.a(new bdy_0(this));
        bdw_0 bdw_02 = bdr_0.a(fgt.a(this.jLZ, 27083), this.jLY);
        this.jMa = bdw_02.dRF() == 0 ? aum_0.cWf().c("temporary.inventory.recycle.none", new Object[0]) : aum_0.cWf().c("temporary.inventory.recycle.all", bdw_02.dRF(), bdw_02.dRI());
    }
}

