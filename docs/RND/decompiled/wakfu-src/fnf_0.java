/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntIntHashMap
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntIntHashMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;

/*
 * Renamed from fnf
 */
public class fnf_0 {
    private static final Logger sHR = Logger.getLogger(fnf_0.class);
    private static final TIntIntHashMap sHS = new TIntIntHashMap();
    private static final Map<Long, fnd_0> sHT = new HashMap<Long, fnd_0>();
    private final TIntObjectHashMap<fnd_0> sHU = new TIntObjectHashMap();
    private final fna_0 sHV;

    public fnf_0(fjo_0 fjo_02) {
        this.sHV = new fna_0(fjo_02);
    }

    private void a(fnd_0 fnd_02) {
        this.sHU.put(fnd_02.d(), (Object)fnd_02);
        sHT.put(fnd_02.dYx(), fnd_02);
        this.sHV.J(fnd_02.d(), fnd_02.emK());
        sHS.put(fnd_02.d(), fnd_02.Xt());
        fnd_02.ems().WF(fnd_02.d());
    }

    private void b(fnd_0 fnd_02) {
        this.sHU.remove(fnd_02.d());
        sHT.remove(fnd_02.dYx());
        this.sHV.Xa(fnd_02.d());
        sHS.remove(fnd_02.d());
    }

    private void a(int n, foZ foZ2, long l) {
        this.sHV.a(foZ2, l);
    }

    private void a(int n, frk frk2, int n2) {
        this.sHV.b(frk2, n2);
    }

    private void K(int n, long l) {
        ((fnd_0)this.sHU.get(n)).uq(l);
        this.sHV.J(n, ((fnd_0)this.sHU.get(n)).emK());
    }

    private void ag(int n, boolean bl) {
        fnd_0 fnd_02 = (fnd_0)this.sHU.get(n);
        if (fnd_02 == null) {
            sHR.error((Object)("Unable to find protector " + n));
            return;
        }
        fnd_02.iP(bl);
    }

    private void ga(int n, int n2) {
        fnd_0 fnd_02 = (fnd_0)this.sHU.get(n);
        if (fnd_02 == null) {
            sHR.error((Object)("Mise a jour de la satisfaction d'un protecteur inconnu " + n));
            return;
        }
        fnd_02.Xb(n2);
    }

    private void a(int n, frk frk2, float f2) {
        ((fnd_0)this.sHU.get(n)).b(frk2, f2);
    }

    private void c(int n, fjo_0 fjo_02) {
        fnd_0 fnd_02 = (fnd_0)this.sHU.get(n);
        this.b(fnd_02);
        fnd_02.h(fjo_02);
        fjo_02.gbC().a(fnd_02);
    }

    public boolean Xc(int n) {
        return this.sHU.containsKey(n);
    }

    public fnd_0 Xd(int n) {
        return (fnd_0)this.sHU.get(n);
    }

    public static fnd_0 Xe(int n) {
        return sHT.get(n);
    }

    public TIntObjectIterator<fnd_0> bgC() {
        return this.sHU.iterator();
    }

    public int aVo() {
        return this.sHU.size();
    }

    public fna_0 gdR() {
        return this.sHV;
    }

    public int emI() {
        return this.sHU.size();
    }

    public void gdS() {
        Object[] objectArray = this.sHU.values();
        for (int i = 0; i < objectArray.length; ++i) {
            this.b((fnd_0)objectArray[i]);
        }
    }

    public void go(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.sHU.size());
        TIntObjectIterator tIntObjectIterator = this.sHU.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            ((fnd_0)tIntObjectIterator.value()).as(byteBuffer);
        }
    }

    public void gp(ByteBuffer byteBuffer) {
        int n = byteBuffer.getInt();
        for (int i = 0; i < n; ++i) {
            this.a(fnd_0.gn(byteBuffer));
        }
    }

    public int gdT() {
        return 4 + this.sHU.size() * fnd_0.DN();
    }

    public static void c(fnd_0 fnd_02) {
        int n = fnd_02.Xt();
        int n2 = fnd_02.d();
        fjo_0 fjo_02 = fjt.syH.WG(n);
        if (fjo_02 == null) {
            sHR.error((Object)("Nation " + n + " inconnue pour le protecteur " + n2));
            return;
        }
        fnf_0 fnf_02 = fjo_02.gbC();
        fnd_0 fnd_03 = (fnd_0)fnf_02.sHU.get(n2);
        if (fnd_03 != null) {
            sHR.warn((Object)("Demande de remplacement des informations du protecteur " + String.valueOf(fnd_03)));
            fnf_02.b(fnd_03);
            return;
        }
        sHR.info((Object)("Enregistrement du protecteur " + String.valueOf(fnd_02)));
        fnf_02.a(fnd_02);
    }

    public static void a(int n, long l, int n2, boolean bl, long l2, float f2, int n3, int n4, String string) {
        fjo_0 fjo_02 = fjt.syH.WG(n2);
        if (fjo_02 == null) {
            sHR.error((Object)("Nation " + n2 + " inconnue pour le protecteur " + n));
            return;
        }
        fnf_0 fnf_02 = fjo_02.gbC();
        fnd_0 fnd_02 = (fnd_0)fnf_02.sHU.get(n);
        if (fnd_02 != null) {
            sHR.warn((Object)("Demande de remplacement des informations du protecteur " + String.valueOf(fnd_02)));
            fnf_02.b(fnd_02);
            return;
        }
        fnd_0 fnd_03 = new fnd_0(n, l, fjo_02, bl, l2, f2, n3, n4, string);
        sHR.info((Object)("Enregistrement du protecteur " + String.valueOf(fnd_03)));
        fnf_02.a(fnd_03);
    }

    public static void b(int n, foZ foZ2, long l) {
        int n2 = sHS.get(n);
        fjo_0 fjo_02 = fjt.syH.WG(n2);
        if (fjo_02 == null) {
            sHR.error((Object)("Nation " + n2 + " inconnue pour le protecteur " + n));
            return;
        }
        fnf_0 fnf_02 = fjo_02.gbC();
        sHR.info((Object)("Achat d'un item de type " + String.valueOf((Object)foZ2) + " au prix de " + l + " sur le protecteur " + n));
        fnf_02.a(n, foZ2, l);
    }

    public static void b(int n, frk frk2, int n2) {
        int n3 = sHS.get(n);
        fjo_0 fjo_02 = fjt.syH.WG(n3);
        if (fjo_02 == null) {
            sHR.error((Object)("Nation " + n3 + " inconnue pour le protecteur " + n));
            return;
        }
        fnf_0 fnf_02 = fjo_02.gbC();
        fnf_02.a(n, frk2, n2);
    }

    public static void L(int n, long l) {
        int n2 = sHS.get(n);
        fjo_0 fjo_02 = fjt.syH.WG(n2);
        if (fjo_02 == null) {
            sHR.error((Object)("Nation " + n2 + " inconnue pour le protecteur " + n));
            return;
        }
        fnf_0 fnf_02 = fjo_02.gbC();
        sHR.info((Object)("Update de wallet du protecteur " + n + " pour un montant de " + l));
        fnf_02.K(n, l);
    }

    public static void ah(int n, boolean bl) {
        int n2 = sHS.get(n);
        fjo_0 fjo_02 = fjt.syH.WG(n2);
        if (fjo_02 == null) {
            sHR.error((Object)("Nation " + n2 + " inconnue pour le protecteur " + n));
            return;
        }
        fnf_0 fnf_02 = fjo_02.gbC();
        sHR.info((Object)("Update de chaos du protecteur " + n + ", chaos = " + bl));
        fnf_02.ag(n, bl);
    }

    public static void gb(int n, int n2) {
        int n3 = sHS.get(n);
        fjo_0 fjo_02 = fjt.syH.WG(n3);
        if (fjo_02 == null) {
            sHR.error((Object)("Nation " + n3 + " inconnue pour le protecteur " + n));
            return;
        }
        fnf_0 fnf_02 = fjo_02.gbC();
        sHR.info((Object)("Update de la satisfaction du protecteur " + n + ". Nouvelle satisfaction : " + n2));
        fnf_02.ga(n, n2);
    }

    public static void b(int n, frk frk2, float f2) {
        int n2 = sHS.get(n);
        fjo_0 fjo_02 = fjt.syH.WG(n2);
        if (fjo_02 == null) {
            sHR.error((Object)("Nation " + n2 + " inconnue pour le protecteur " + n));
            return;
        }
        fnf_0 fnf_02 = fjo_02.gbC();
        sHR.info((Object)("Update de la valeur de taxe " + String.valueOf((Object)frk2) + " \u00e0 une valeur de " + f2 + " pour le protecteur " + n));
        fnf_02.a(n, frk2, f2);
    }

    public static void gc(int n, int n2) {
        int n3 = sHS.get(n);
        fjo_0 fjo_02 = fjt.syH.WG(n3);
        if (fjo_02 == null) {
            sHR.error((Object)("Nation " + n3 + " inconnue pour le protecteur " + n));
            return;
        }
        fnf_0 fnf_02 = fjo_02.gbC();
        sHR.info((Object)("Update de la nation du protecteur " + n + ". Nouvelle nation : " + n2));
        fnf_02.c(n, fjt.syH.WG(n2));
    }

    public static int Xf(int n) {
        return sHS.get(n);
    }

    public static int Xg(int n) {
        fnd_0 fnd_02 = fnf_0.Xe(n);
        if (fnd_02 == null) {
            return 0;
        }
        return fnf_0.Xf(fnd_02.d());
    }
}

