=== DECOMPILATION CHAINE bgG ===

bgG.class: 10932B -> 13601 chars
Lignes pertinentes (53):
  *  gnu.trove.iterator.TLongObjectIterator
  *  gnu.trove.map.hash.TLongObjectHashMap
  *  gnu.trove.procedure.TLongObjectProcedure
  import gnu.trove.iterator.TLongObjectIterator;
  import gnu.trove.map.hash.TLongObjectHashMap;
  import gnu.trove.procedure.TLongObjectProcedure;
  private final TLongObjectHashMap<bgy> icQ = new TLongObjectHashMap();
  public static bgG dlO() {
  TLongObjectHashMap<bgy> tLongObjectHashMap = this.icQ;
  synchronized (tLongObjectHashMap) {
  icO.error((Object)("Ajout de ce CharacterInfo impossible : il existe d\u00e9j\u00e0 : " + bgy2.Sn() + " - " + String.valueOf(bgy2) + " - " + String.valueOf(this.icQ.get(bgy2.Sn()))));
  this.icQ.put(bgy2.Sn(), (Object)bgy2);
  public boolean a(TLongObjectProcedure<bgy> tLongObjectProcedure) {
  TLongObjectHashMap<bgy> tLongObjectHashMap = this.icQ;
  synchronized (tLongObjectHashMap) {
  bl = this.icQ.forEachEntry(tLongObjectProcedure);
  for (int i = 0; i < n && (bl = tObjectProcedure.execute((Object)this.icR.get(i))); ++i) {
  bgy bgy2 = this.icR.get(i);
  TLongObjectHashMap<bgy> tLongObjectHashMap = this.icQ;
  synchronized (tLongObjectHashMap) {

bYT.class: 1404B -> 1960 chars
Picked up JAVA_TOOL_OPTIONS: -javaagent:H:\Code\Wakfuassistant\agent\wakfu-spy-agent.jar --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  GC
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.list.array.TShortArrayList
 */
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.list.array.TShortArrayList;

public abstract class bYT {
    private final TIntArrayList lBv = new TIntArrayList();
    private final TShortArrayList lBw = new TShortArrayList();
    private int lBx = -1;
    private short bol = 0;

    protected abstract void bop();

    protected final void JG(int n) {
        int n2 = this.lBv.indexOf(n);
        if (n2 == -1) {
            n2 = this.lBv.size();
            this.lBv.add(n);
            this.lBw.add((short)0);
        }
        this.lBw.setQuick(n2, (short)(this.lBw.getQuick(n2) + 1));
    }

    int epB() {
        return this.lBx;
    }

    short bfd() {
        return this.bol;
    }

    private void bot() {
        this.bol = 0;
        this.lBx = -1;
        int n = this.lBw.size();
        for (int i = 0; i < n; ++i) {
            short s = this.lBw.getQuick(i);
            if (s <= this.bol) continue;
            this.bol = s;
            this.lBx = this.lBv.getQuick(i);
        }
    }

    void epC() {
        int n;
        this.bol = 0;
        this.lBx = -1;
        int n2 = 0;
        int n3 = this.lBw.size();
        for (n = 0; n < n3; ++n) {
            n2 += this.lBw.getQuick(n);
        }
        n = GC.mR((int)n2);
        for (int i = 0; i < n3; ++i) {
            if ((n -= this.lBw.getQuick(i)) >= 0) continue;
            this.lBx = this.lBv.getQuick(i);
            this.bol = this.lBw.getQuick(i);
            return;
        }
    }
}

bgK.class: 657B -> 825 chars
Picked up JAVA_TOOL_OPTIONS: -javaagent:H:\Code\Wakfuassistant\agent\wakfu-spy-agent.jar --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  bgy
 *  gnu.trove.procedure.TLongObjectProcedure
 */
import gnu.trove.procedure.TLongObjectProcedure;

class bgK
implements TLongObjectProcedure<bgy> {
    final /* synthetic */ bgJ icV;

    bgK(bgJ bgJ2) {
        this.icV = bgJ2;
    }

    public boolean a(long l, bgy bgy2) {
        int n = bgy2.doV().cqy();
        bgJ.a(this.icV, n);
        return true;
    }

    public /* synthetic */ boolean execute(long l, Object object) {
        return this.a(l, (bgy)object);
    }
}

eNf.class: 36561B -> 45614 chars
Lignes pertinentes (27):
  *  eOy
  public static final eNg qSD = new eNg(1001, (eRO)new eOW(), (VD)qPA, -1, "Charac : Copie la valeur de la charac calcul\u00e9e a l'application (caster -> cible, pas de rollback)", QF.bhD);
  public static final eNg qSJ = new eNg(1, (eRO)new ePq(eNd.qOY, eSo.rjE), (VD)qPA, 1001, "Dommage : Neutre", QF.bhC);
  public static final eNg qSU = new eNg(25, (eRO)new ePp(eNd.qOY, eSo.rjE), (VD)qPA, 1002, "Soin : Neutre", QF.bhB);
  public static final eNg qTh = new eNg(2000, (eRO)new ePu(eJe.qyz, 2), (VD)qPA, -1, "Job : Modifie les chances de r\u00e9ussir une plantation", QF.bhD);
  public static final eNg qTi = new eNg(2001, (eRO)new ePu(eJe.qyy, 3), (VD)qPA, -1, "Job : Modifie la quantit\u00e9 d'objets r\u00e9colt\u00e9e", QF.bhD);
  public static final eNg qTj = new eNg(2002, (eRO)new ePu(eJe.qyv, 8), (VD)qPA, -1, "Job : Modifie la vitesse de craft", QF.bhD);
  public static final eNg qTk = new eNg(2003, (eRO)new ePu(eJe.qyx, 2), (VD)qPA, -1, "Job : Modifie la vitesse de plantation", QF.bhD);
  public static final eNg qTl = new eNg(2004, (eRO)new ePu(eJe.qyw, 3), (VD)qPA, -1, "Job : Modifie la vitesse de collecte", QF.bhD);
  public static final eNg qTn = new eNg(2006, (eRO)new ePu(eJe.qyu, 8), (VD)qPA, -1, "Job : Modifie l'xp de craft des m\u00e9tiers", QF.bhD);
  public static final eNg qTo = new eNg(2007, (eRO)new ePu(eJe.qyu, 2), (VD)qPA, -1, "Job : Modifie l'xp de plantation des m\u00e9tiers", QF.bhD);
  public static final eNg qTp = new eNg(2008, (eRO)new ePu(eJe.qyu, 3), (VD)qPA, -1, "Job : Modifie l'xp de collecte des m\u00e9tiers", QF.bhD);
  public static final eNg qTt = new eNg(912, (eRO)new eQq(), (VD)qPA, -1, "REG : niveau des enfants fonction de la valeur de l'action cost d\u00e9clencheur", QF.bhD);
  public static final eNg qUA = new eNg(334, (eRO)new eOy(), (VD)qPA, -1, "Movement : Porte la cible", QF.bhD);
  public static final eNg qUE = new eNg(47, (eRO)new eQY(), (VD)qPA, -1, "[DISABLED] - Will have no effect - Spell : Gain de niveau de sort", QF.bhB);
  public static final eNg qUF = new eNg(832, (eRO)new ePg(), (VD)qPA, -1, "[DISABLED] - Will have no effect - Spell : Gain de niveaux de sorts dans une branche", QF.bhB);
  public static final eNg qUG = new eNg(979, (eRO)new eOm(), (VD)qPA, -1, "[DISABLED] - Will have no effect - Spell : Gain de niveau de sort tous \u00e9l\u00e9ments (sauf support)", QF.bhB);
  public static final eNg qUR = new eNg(304, (eRO)new eOr(), (VD)qPA, 1015, "State : Applique un \u00e9tat", QF.bhD);
  public static final eNg qUS = new eNg(350, (eRO)new eOs(), (VD)qPA, -1, "State : Applique un \u00e9tat sans le notifier", QF.bhD);
  public static final eNg qUT = new eNg(321, (eRO)new eRf(), (VD)qPA, -1, "State : D\u00e9sapplique un \u00e9tat", QF.bhD);

=== 68.bin EXPLORATION ===

=== 35.bin HEADER ===
35.bin: 3053966 bytes (2982KB)
ASCII (256B): ?z??$M..s.......K........????????'...?...??.......g...????SK.......?...h...B_.......?...!...K........?..."...n?...........s...??.......?.......??.......?...??????.......?........w.......c...?...$?.......7...?...?........?...?...??....... ...????v....
