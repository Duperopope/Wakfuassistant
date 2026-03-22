/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;
import java.util.Optional;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public class aPG
extends aPF {
    private static final Logger ezX = Logger.getLogger(aPG.class);
    private static final TLongObjectHashMap<fem_1> ezY = new TLongObjectHashMap();
    private static final alu_2 ezZ = new aph_0();

    public static void cAU() {
        TLongObjectIterator tLongObjectIterator = ezY.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            fem_1 fem_12 = (fem_1)tLongObjectIterator.value();
            fem_12.guv();
        }
        ezY.clear();
    }

    public static void ik(long l) {
        fem_1 fem_12 = (fem_1)ezY.remove(l);
        if (fem_12 != null) {
            fem_12.guv();
        }
    }

    @Override
    @Nullable
    public api_0 a(api_0 api_02, axb_2 axb_22) {
        super.a(api_02, axb_22);
        if (api_02 == null) {
            return null;
        }
        Optional<bgy> optional = aPG.j(api_02);
        if (optional.isEmpty()) {
            return api_02;
        }
        bgy bgy2 = optional.get();
        String string = fgh_2.uf(api_02.getMessage());
        long l = bgy2.Sn();
        boolean bl = csz_1.ePn().a(string, l);
        if (bl) {
            return api_02;
        }
        if (string.isEmpty()) {
            return null;
        }
        fem_1 fem_12 = aPG.a(l, api_02);
        if (fem_12 == null) {
            ezX.error((Object)("La bulle stock\u00e9e pour le mobdile de " + api_02.czo() + " n'appartient plus \u00e0 personne !"));
            return api_02;
        }
        api_02.co(StringUtils.replace((String)api_02.getMessage(), (String)string, (String)fem_12.setText(string)));
        adj_0 adj_02 = adn_0.bvh().fM(l);
        if (adj_02 == null) {
            return api_02;
        }
        fem_12.setTarget(adj_02);
        fem_12.setYOffset(ddw_0.eY(0, adj_02.bpX()));
        fem_12.setBubbleIsVisible(true);
        fem_12.gsr();
        awx_2 awx_22 = new awx_2(axb_22);
        awx_22.setAlpha(api_02.czl() == aPl.exq ? 0.0f : 0.75f);
        fem_12.setColor(awx_22);
        if (l != aue_0.cVJ().cVK().Sn()) {
            fem_12.setBubbleObserver(aue_0.cVJ().cVK().ddI());
        }
        return api_02;
    }

    private static fem_1 a(long l, api_0 api_02) {
        fem_1 fem_12 = (fem_1)ezY.get(l);
        if (fem_12 == null || fem_12.isUnloading()) {
            return aPG.b(l, api_02);
        }
        if (!aPG.a(fem_12, l, api_02)) {
            return null;
        }
        return fem_12;
    }

    private static fem_1 b(long l, api_0 api_02) {
        String string = aiw_0.cgD();
        fem_1 fem_12 = aiw_0.iy(string);
        fem_12.A(false, api_02.czr());
        ezY.put(l, (Object)fem_12);
        return fem_12;
    }

    private static boolean a(fem_1 fem_12, long l, api_0 api_02) {
        WQ wQ = fem_12.getTarget();
        if (wQ == null) {
            return false;
        }
        assert (l == ((adj_0)wQ).Sn()) : "Le mobile de " + api_02.czo() + " ne correspond pas \u00e0 l'ancien";
        fem_12.bnz();
        return true;
    }

    private static Optional<bgy> j(api_0 api_02) {
        String string = api_02.czo();
        long l = api_02.czn();
        if (l == -1L) {
            return string == null ? Optional.empty() : Optional.ofNullable(bgg_0.dlO().lI(string));
        }
        if (api_02.czl() == aPl.exC) {
            return Optional.ofNullable(bgg_0.dlO().jv(l));
        }
        if (api_02.czl() == aPl.exr) {
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            if (bgt_02 != null && l == bgt_02.Sn()) {
                return Optional.of(bgt_02);
            }
            return Optional.ofNullable(bgg_0.dlO().lI(string));
        }
        if (api_02.aWv()) {
            return Optional.ofNullable(bgg_0.dlO().ju(l));
        }
        return Optional.ofNullable(bgg_0.dlO().jv(l));
    }

    public static fem_1 cAV() {
        return (fem_1)ezY.get(aue_0.cVJ().cVK().Sn());
    }

    static {
        aie_0.cfn().cft().a(ezZ);
    }
}

