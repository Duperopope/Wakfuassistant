/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eBi
 */
public class ebi_0
extends eak_0
implements ehm_0 {
    private exx_2 pxh;
    private String pxi;
    private static final ArrayList<amz_1[]> pxj = new ArrayList();

    public static exx_2 rS(String string) {
        if ("hp".equalsIgnoreCase(string)) {
            return exx_2.rGi;
        }
        if ("trap".equalsIgnoreCase(string) || "nbtrap".equalsIgnoreCase(string) || "maxtrap".equalsIgnoreCase(string) || "contr\u00f4le".equalsIgnoreCase(string) || "control".equalsIgnoreCase(string)) {
            return exx_2.rGr;
        }
        if ("mp".equalsIgnoreCase(string) || "pm".equalsIgnoreCase(string)) {
            return exx_2.rGk;
        }
        if ("wp".equalsIgnoreCase(string) || "pw".equalsIgnoreCase(string)) {
            return exx_2.rGl;
        }
        if ("ap".equalsIgnoreCase(string) || "pa".equalsIgnoreCase(string)) {
            return exx_2.rGj;
        }
        if ("summons".equalsIgnoreCase(string) || "nbsummons".equalsIgnoreCase(string) || "commandement".equalsIgnoreCase(string) || "leadership".equalsIgnoreCase(string)) {
            return exx_2.rGr;
        }
        if ("for".equalsIgnoreCase(string) || "strength".equalsIgnoreCase(string) || "force".equalsIgnoreCase(string)) {
            return exx_2.rGM;
        }
        if ("agi".equalsIgnoreCase(string)) {
            return exx_2.rGL;
        }
        if ("int".equalsIgnoreCase(string)) {
            return exx_2.rGN;
        }
        if ("chan".equalsIgnoreCase(string)) {
            return exx_2.rGK;
        }
        if ("sag".equalsIgnoreCase(string)) {
            return exx_2.rGJ;
        }
        if ("dmg_earth".equalsIgnoreCase(string)) {
            return exx_2.rGz;
        }
        if ("dmg_air".equalsIgnoreCase(string)) {
            return exx_2.rGA;
        }
        if ("dmg_fire".equalsIgnoreCase(string)) {
            return exx_2.rGx;
        }
        if ("dmg_water".equalsIgnoreCase(string)) {
            return exx_2.rGy;
        }
        if ("dmg_stasis".equalsIgnoreCase(string)) {
            return exx_2.rHn;
        }
        if ("dmg_light".equalsIgnoreCase(string)) {
            return exx_2.rHF;
        }
        if ("res_earth".equalsIgnoreCase(string)) {
            return exx_2.rGE;
        }
        if ("res_air".equalsIgnoreCase(string)) {
            return exx_2.rGF;
        }
        if ("res_fire".equalsIgnoreCase(string)) {
            return exx_2.rGC;
        }
        if ("res_water".equalsIgnoreCase(string)) {
            return exx_2.rGD;
        }
        if ("res_stasis".equalsIgnoreCase(string)) {
            return exx_2.rHo;
        }
        if ("res_light".equalsIgnoreCase(string)) {
            return exx_2.rHG;
        }
        if ("init".equalsIgnoreCase(string)) {
            return exx_2.rGI;
        }
        if ("prosp".equalsIgnoreCase(string)) {
            return exx_2.rGH;
        }
        if ("chrage".equalsIgnoreCase(string)) {
            return exx_2.rGQ;
        }
        if ("huppermage_resource".equalsIgnoreCase(string) || "bq".equalsIgnoreCase(string)) {
            return exx_2.rHH;
        }
        if ("sp".equalsIgnoreCase(string)) {
            return exx_2.rHT;
        }
        if ("ouginak_resource".equalsIgnoreCase(string)) {
            return exx_2.rHN;
        }
        if ("dmg_in_percent".equalsIgnoreCase(string)) {
            return exx_2.rGw;
        }
        if ("mechanics".equalsIgnoreCase(string)) {
            return exx_2.rGr;
        }
        if ("virtual_hp".equalsIgnoreCase(string)) {
            return exx_2.rHp;
        }
        if ("ferocity".equalsIgnoreCase(string)) {
            return exx_2.rGo;
        }
        if ("fumble_rate".equalsIgnoreCase(string)) {
            return exx_2.rGp;
        }
        if ("critical_bonus".equalsIgnoreCase(string)) {
            return exx_2.rGR;
        }
        if ("osa_invocation_knowledge".equalsIgnoreCase(string) || "invocation_knowledge".equalsIgnoreCase(string) || "ik".equalsIgnoreCase(string) || "InvocationKnowledge".equalsIgnoreCase(string)) {
            return exx_2.rHt;
        }
        if ("armor".equalsIgnoreCase(string) || "armure".equalsIgnoreCase(string)) {
            return exx_2.rHu;
        }
        if ("bomb_cooldown".equalsIgnoreCase(string)) {
            return exx_2.rHi;
        }
        try {
            return exx_2.valueOf(string.toUpperCase());
        }
        catch (IllegalArgumentException illegalArgumentException) {
            pwx.error((Object)("GetCharacteristic criteria with invalid parameter : " + string + " : unknown characteristic " + String.valueOf(illegalArgumentException)));
            return null;
        }
    }

    public exx_2 fnE() {
        return this.pxh;
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pxj;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    public ebi_0(ArrayList<amx_1> arrayList) {
        short s = this.r(arrayList);
        if (s == 0) {
            this.pxh = ebi_0.rS(((anh_2)arrayList.get(0)).getValue());
            this.pxi = "caster";
        }
        if (s == 1) {
            this.pxh = ebi_0.rS(((anh_2)arrayList.get(0)).getValue());
            this.pxi = ((anh_2)arrayList.get(1)).getValue();
        }
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        Object object5;
        long l = 0L;
        anu_1 anu_12 = eAs.a(this.pxi, object, object2, object4, object3);
        if (anu_12 == null) {
            if (this.pxi.equalsIgnoreCase("target") && object2 instanceof acd_1 && object4 instanceof etu_0) {
                object5 = (etu_0)object4;
                acd_1 acd_12 = (acd_1)object2;
                for (qu_0 qu_02 : ((ety_0)object5).a(acd_12)) {
                    if (!qu_02.a(this.pxh)) continue;
                    anu_12 = qu_02;
                    break;
                }
            } else {
                return -1L;
            }
        }
        if (anu_12 instanceof eyo_0) {
            object5 = anu_12;
            if (!object5.a(this.pxh)) {
                return -1L;
            }
            l = object5.c(this.pxh);
            return this.fny() * l;
        }
        return -1L;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pFA;
    }

    @Override
    public boolean fnF() {
        return this.pxi.equalsIgnoreCase("target");
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJx};
        pxj.add(amz_1Array);
        amz_1Array = new amz_1[]{amz_1.cJx, amz_1.cJx};
        pxj.add(amz_1Array);
    }
}

