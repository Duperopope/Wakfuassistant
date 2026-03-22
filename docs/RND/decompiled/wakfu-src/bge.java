/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongIntHashMap
 *  gnu.trove.procedure.TIntProcedure
 *  gnu.trove.procedure.TObjectProcedure
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import gnu.trove.map.hash.TLongIntHashMap;
import gnu.trove.procedure.TIntProcedure;
import gnu.trove.procedure.TObjectProcedure;
import java.util.Optional;

public class bge
implements adk_0,
adl_0,
afl_0,
afm_0,
bLa,
bLb {
    public static final bge hZk = new bge();
    private final TLongIntHashMap hZl = new TLongIntHashMap();
    private final TLongIntHashMap hZm = new TLongIntHashMap();
    private final TLongIntHashMap hZn = new TLongIntHashMap();
    private final long hZo = -1L;
    private static final TIntProcedure hZp = new bgf();

    private bge() {
    }

    private static boolean o(adj_0 adj_02) {
        if (!(adj_02 instanceof bdj_2)) {
            return false;
        }
        if (!(((bdj_2)adj_02).dcP() instanceof bhx_0)) {
            return false;
        }
        bhx_0 bhx_02 = (bhx_0)((bdj_2)adj_02).dcP();
        bji_1 bji_12 = bjl_1.dri().jO(bhx_02.aXa());
        if (bji_12 != null) {
            return bji_12.dre().stream().anyMatch(bjk_12 -> {
                bjz_1 bjz_12 = bja_1.drJ().bC(bjk_12.drh());
                return bjz_12 != null && bjz_12.c(ezj_0.psY);
            });
        }
        return false;
    }

    @Override
    public void onMobileDestruction(adj_0 adj_02) {
        bge.a(adj_02, this.hZl);
    }

    private static void a(ZC zC, TLongIntHashMap tLongIntHashMap) {
        int n = tLongIntHashMap.remove(zC.Sn());
        if (n == 0) {
            return;
        }
        agZ.bzy().so(n);
    }

    @Override
    public void h(bKV bKV2) {
        bge.a(bKV2, this.hZm);
    }

    @Override
    public void g(afk_0 afk_02) {
        if (!afk_02.aVD().c(fcs_0.rUy)) {
            return;
        }
        bge.a(afk_02, this.hZn, 800163);
    }

    @Override
    public void h(afk_0 afk_02) {
        bge.a(afk_02, this.hZn);
    }

    void diW() {
        this.hZl.forEachValue(hZp);
        this.hZl.clear();
        this.hZm.forEachValue(hZp);
        this.hZm.clear();
    }

    private static boolean p(adj_0 adj_02) {
        return adj_02 instanceof bdj_2 && ((bdj_2)adj_02).dcP().a(ezj_0.psG);
    }

    private static void a(ZC zC, TLongIntHashMap tLongIntHashMap, int n) {
        if (tLongIntHashMap.contains(zC.Sn())) {
            int n2 = tLongIntHashMap.remove(zC.Sn());
            agZ.bzy().so(n2);
        }
        FreeParticleSystem freeParticleSystem = agY.bzw().sk(n);
        freeParticleSystem.a(zC);
        agZ.bzy().b(freeParticleSystem);
        tLongIntHashMap.put(zC.Sn(), freeParticleSystem.bLJ());
    }

    @Override
    public void onMobileCreation(adj_0 adj_02) {
        if (!bge.p(adj_02) || bge.o(adj_02)) {
            return;
        }
        Optional<bfT> optional = bfP.dhT().dhS();
        optional.ifPresent(bfT2 -> bge.a(adj_02, this.hZl, bfT2.dii().diZ()));
    }

    @Override
    public void i(bKV bKV2) {
        if (!bKV2.eco().c(fqi_0.sSh)) {
            return;
        }
        Optional<bfT> optional = bfP.dhT().dhS();
        optional.ifPresent(bfT2 -> bge.a(bKV2, this.hZm, bfT2.dii().dja()));
    }

    void diX() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bJK bJK2 = bJJ.kmp.dN(bgt_02.bcC(), bgt_02.bcD());
        for (adj_0 adj_02 : adn_0.bvh().bvk()) {
            bJK bJK3;
            if (!bge.p(adj_02) || bge.o(adj_02) || (bJK3 = bJJ.kmp.dN(adj_02.bcC(), adj_02.bcD())) != bJK2) continue;
            Optional<bfT> optional = bfP.dhT().dhS();
            optional.ifPresent(bfT2 -> bge.a(adj_02, this.hZl, bfT2.dii().diZ()));
        }
        bLe.ecw().u((TObjectProcedure<bKV>)((TObjectProcedure)bKV2 -> {
            if (!bKV2.eco().c(fqi_0.sSh)) {
                return true;
            }
            if (bKV2.ecj() == 0) {
                return true;
            }
            bJK bJK3 = bJJ.kmp.dN(bKV2.bcC(), bKV2.bcD());
            if (bJK3 != bJK2) {
                return true;
            }
            Optional<bfT> optional = bfP.dhT().dhS();
            optional.ifPresent(bfT2 -> bge.a(bKV2, this.hZm, bfT2.dii().dja()));
            return true;
        }));
    }

    public long Sn() {
        return -1L;
    }
}

