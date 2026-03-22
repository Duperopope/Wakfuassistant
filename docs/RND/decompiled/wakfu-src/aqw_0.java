/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import lombok.Generated;

/*
 * Renamed from aQW
 */
public class aqw_0
extends aRY {
    private static final byte eIo = 0;
    private static final byte eIp = 1;
    private static final byte eIq = 2;
    private final byte eIr;
    private final int eIs;
    private final String eIt;
    private final short eIu;
    private final short eIv;
    private final boolean eIw;

    public aqw_0(int n, short s, boolean bl) {
        this.eIr = 0;
        this.eIs = n;
        this.eIt = null;
        this.eIu = (short)-1;
        this.eIv = s;
        this.eIw = bl;
    }

    public aqw_0(String string, short s, boolean bl) {
        this.eIr = 1;
        this.eIs = -1;
        this.eIt = string;
        this.eIu = (short)-1;
        this.eIv = s;
        this.eIw = bl;
    }

    public aqw_0(short s, short s2, boolean bl) {
        this.eIr = (byte)2;
        this.eIs = -1;
        this.eIt = null;
        this.eIu = s;
        this.eIv = s2;
        this.eIw = bl;
    }

    @Override
    public boolean isValid() {
        if (this.eIv <= 0) {
            return false;
        }
        return switch (this.eIr) {
            case 0 -> {
                if (this.eIs >= 0) {
                    yield true;
                }
                yield false;
            }
            case 1 -> {
                if (this.eIt != null) {
                    yield true;
                }
                yield false;
            }
            case 2 -> {
                if (this.eIu >= 0) {
                    yield true;
                }
                yield false;
            }
            default -> false;
        };
    }

    @Override
    public void bGy() {
        if (this.eIr == 0) {
            this.cCs();
        } else if (this.eIr == 1) {
            this.cCt();
        } else if (this.eIr == 2) {
            this.cCu();
        }
    }

    private void cCs() {
        bgv_2 bgv_22 = (bgv_2)fgD.fXh().Vd(this.eIs);
        if (bgv_22 == null) {
            aqh_0.cBI().jI("Item Ref ID " + this.eIs + " not found.");
            return;
        }
        this.zm(this.eIs);
    }

    private void cCt() {
        List<bgv_2> list = asm_0.jU(this.eIt);
        String string = asm_0.b(list, this.eIt);
        aqh_0.cBI().n(string, 0xFFFFFF);
        if (list.size() == 1) {
            this.zm(list.get(0).d());
            return;
        }
        String string2 = BH.aT(this.eIt);
        List<bgv_2> list2 = list.stream().filter(bgv_22 -> bgv_22.dah().equals(string2)).sorted(Collections.reverseOrder((bgv_22, bgv_23) -> {
            byte by = bgv_22.dwg() == null ? fgj.siA.fWK() : bgv_22.dwg().fWK();
            byte by2 = bgv_23.dwg() == null ? fgj.siA.fWK() : bgv_23.dwg().fWK();
            return Byte.compare(by, by2);
        })).toList();
        if (!list2.isEmpty()) {
            aqh_0.cBI().n("\nExact match found.", 0xFFFFFF);
            bgv_2 bgv_24 = list2.get(0);
            if (list2.size() > 1) {
                String string3 = aum_0.cWf().c("item.rarity." + bgv_24.dwg().name(), new Object[0]);
                aqh_0.cBI().n("Creating highest rarity: " + string3.toUpperCase(), 0xFFFFFF);
            }
            this.zm(bgv_24.d());
        }
    }

    private void cCu() {
        Optional<bgv_2> optional = bEm.dSb().fXi().stream().filter(bgv_22 -> bgv_22.cpz() > 0).filter(bgv_22 -> bgv_22.bcx().aVo() > 0).filter(bgv_22 -> {
            for (ffS ffS2 : bgv_22.dGh().fZq()) {
                if (!ffS.sha.contains(ffS2)) continue;
                return true;
            }
            return false;
        }).min(Comparator.comparingInt(bgv_22 -> Math.abs(bgv_22.cmL() - this.eIu)));
        if (optional.isEmpty()) {
            aqw_0.jI("No matching items found");
            return;
        }
        this.zm(optional.get().d());
    }

    private void zm(int n) {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        long l = aqw_0.cCv();
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)20);
        ns_02.cX(l);
        ns_02.nX(n);
        ns_02.R(this.eIv);
        ns_02.aN(this.eIw);
        ayf_22.d(ns_02);
        fgF.mX(this.eIw);
        aqh_0.cBI().n("\nCreated " + this.eIv + "x " + n, 0xFFFFFF);
    }

    static long cCv() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        long l = fcI.fSM() ? (aue_0.cVJ().c(cvo_2.eUK()) ? cvo_2.eUK().KU() : fcK.rUe.sq(bgt_02.Xi())) : bgt_02.Sn();
        return l;
    }

    @Generated
    public int avr() {
        return this.eIs;
    }
}

