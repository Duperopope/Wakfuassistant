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

public final class bHZ
extends bHY {
    private static final Map<Integer, bIh> kdr = new HashMap<Integer, bIh>();
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
    private final Uz kdH;
    private final bGV kdI;
    private final @Unmodifiable List<bIh> kdJ;
    private final boolean kdK;

    public bHZ(mE mE2, long l) {
        this.kdG = mE2;
        this.kdH = bHU.B(mE2.akh(), l);
        this.kdI = (bGV)bEm.dSb().Vd(this.kdG.AK());
        this.kdJ = this.dXg() ? this.kdG.amL().stream().map(kdr::get).toList() : Collections.emptyList();
        this.kdK = this.dXj();
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "isSeller": {
                return bbS.xl() == this.kdG.amB();
            }
            case "remainingDuration": {
                return bHU.a(this.kdH);
            }
            case "sellerNameWithLanguages": {
                return bSB.a(((bSG)aIe.cfn().bmH()).enc(), this.kdG.amD(), VB.pS(this.kdG.amI()), Mv.A((byte)this.kdG.amG()));
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
                return bGV.Dm(this.kdG.amQ());
            }
            case "formattedSpecialSublimationName": {
                return bER.Gz(this.kdG.amS());
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
        TLongHashSet tLongHashSet = fcL.rUh.sx(bbS.xl());
        LP lP = new LP(false);
        for (long l : tLongHashSet.toArray()) {
            Object t = fcL.rUh.sw(l);
            ((exP)t).dod().M((TObjectProcedure<ffV>)((TObjectProcedure)ffV2 -> {
                if (fiV.a(ffV2, this.kdG) == fiX.sup) {
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
    public Uz dXc() {
        return this.kdH;
    }

    @Generated
    public bGV duo() {
        return this.kdI;
    }

    @Generated
    public List<bIh> dVR() {
        return this.kdJ;
    }

    @Generated
    public boolean dXl() {
        return this.kdK;
    }

    static {
        for (fjd fjd2 : fjd.values()) {
            kdr.put(fjd2.d(), new bIh(fjd2));
        }
        kdF = new String[]{kds, kdt, kdu, kdv, kdw, kdy, kdx, kdz, kdA, kdB, kdC, kdD, kdE};
    }
}
