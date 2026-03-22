/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  gnu.trove.set.hash.TLongHashSet
 *  lombok.Generated
 *  org.apache.commons.lang3.ArrayUtils
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import gnu.trove.procedure.TObjectProcedure;
import gnu.trove.set.hash.TLongHashSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Generated;
import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from bHZ
 */
public final class bhz_1
extends bhy_2 {
    private static final Map<Integer, bih_1> kdr = new HashMap<Integer, bih_1>();
    public static final String kds = "isSeller";
    public static final String kdt = "remainingDuration";
    public static final String kdu = "sellerNameWithLanguages";
    public static final String kdv = "itemLevel";
    public static final String kdw = "isSlotColorsOrderFixed";
    public static final String kdx = "hasShardSlots";
    public static final String kdy = "shardSlots";
    public static final String kdz = "hasAnySublimation";
    public static final String kdA = "hasBasicSublimation";
    public static final String kdB = "hasSpecialSublimation";
    public static final String kdC = "basicSublimationName";
    public static final String kdD = "formattedSpecialSublimationName";
    public static final String kdE = "canBeFulfilled";
    private static final String[] kdF;
    private final mE kdG;
    private final uz_0 kdH;
    private final bgv_2 kdI;
    private final @Unmodifiable List<bih_1> kdJ;
    private final boolean kdK;

    public bhz_1(mE mE2, long l) {
        this.kdG = mE2;
        this.kdH = bhu_1.B(mE2.akh(), l);
        this.kdI = (bgv_2)bEm.dSb().Vd(this.kdG.AK());
        this.kdJ = this.dXg() ? this.kdG.amL().stream().map(kdr::get).toList() : Collections.emptyList();
        this.kdK = this.dXj();
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "isSeller": {
                return bbs_2.xl() == this.kdG.amB();
            }
            case "remainingDuration": {
                return bhu_1.a(this.kdH);
            }
            case "sellerNameWithLanguages": {
                return bsb_1.a(((bsg_1)aie_0.cfn().bmH()).enc(), this.kdG.amD(), vb_0.pS(this.kdG.amI()), Mv.A((byte)this.kdG.amG()));
            }
            case "itemLevel": {
                if (this.kdG.amJ()) {
                    return this.kdG.amK();
                }
                return this.kdI.cmL();
            }
            case "isSlotColorsOrderFixed": {
                return this.dXg() && this.kdG.amN() && this.kdG.amO();
            }
            case "hasShardSlots": {
                return this.dXg();
            }
            case "shardSlots": {
                return Collections.unmodifiableList(this.kdJ);
            }
            case "hasAnySublimation": {
                return this.dXh() || this.dXi();
            }
            case "hasBasicSublimation": {
                return this.dXh();
            }
            case "hasSpecialSublimation": {
                return this.dXi();
            }
            case "basicSublimationName": {
                return bgv_2.Dm(this.kdG.amQ());
            }
            case "formattedSpecialSublimationName": {
                return ber_0.Gz(this.kdG.amS());
            }
            case "canBeFulfilled": {
                return this.kdK;
            }
        }
        return super.eu(string);
    }

    private boolean dXg() {
        return this.kdI.cpA() > 0 && this.kdG.amM() != 0;
    }

    private boolean dXh() {
        return this.kdG.amP() && this.kdG.amQ() > 0;
    }

    private boolean dXi() {
        return this.kdG.amR() && this.kdG.amS() > 0;
    }

    private boolean dXj() {
        TLongHashSet tLongHashSet = fcL.rUh.sx(bbs_2.xl());
        LP lP = new LP(false);
        for (long l : tLongHashSet.toArray()) {
            Object t = fcL.rUh.sw(l);
            ((exP)t).dod().M((TObjectProcedure<ffV>)((TObjectProcedure)ffV2 -> {
                if (fiv_0.a(ffV2, this.kdG) == fix_0.sup) {
                    lP.aH(true);
                }
                return !lP.aTe();
            }));
            if (!lP.aTe()) continue;
            return true;
        }
        return false;
    }

    @Override
    public String[] bxk() {
        return (String[])ArrayUtils.addAll((Object[])super.bxk(), (Object[])kdF);
    }

    @Override
    public long Lx() {
        return this.kdG.Lx();
    }

    @Override
    public long akd() {
        return this.kdG.akd();
    }

    @Override
    public int oP() {
        return this.kdG.oP();
    }

    @Override
    public ffV getItem() {
        return ffV.a(this.kdI.d(), this.kdI);
    }

    @Generated
    public mE dXk() {
        return this.kdG;
    }

    @Generated
    public uz_0 dXc() {
        return this.kdH;
    }

    @Generated
    public bgv_2 duo() {
        return this.kdI;
    }

    @Generated
    public List<bih_1> dVR() {
        return this.kdJ;
    }

    @Generated
    public boolean dXl() {
        return this.kdK;
    }

    static {
        for (fjd fjd2 : fjd.values()) {
            kdr.put(fjd2.d(), new bih_1(fjd2));
        }
        kdF = new String[]{kds, kdt, kdu, kdv, kdw, kdy, kdx, kdz, kdA, kdB, kdC, kdD, kdE};
    }
}

