# Extraction chaine Shard → Effect → State
**Date** : 2026-03-21 20:59:14
**Source** : `H:\Code\Wakfuassistant\docs\RND\decompiled\wakfu-src`

## rd_0 — SlotColorEnum (couleurs de slots)
**Fichier** : `rd_0.java` | **Taille** : 1992 B | **Lignes** : 81

```java
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from Rd
 */
public final class rd_0
extends Enum<rd_0>
implements re_0 {
    public static final /* enum */ rd_0 bjA = new rd_0(0);
    public static final /* enum */ rd_0 bjB = new rd_0(1);
    public static final /* enum */ rd_0 bjC = new rd_0(2);
    public static final /* enum */ rd_0 bjD = new rd_0(3);
    public static final /* enum */ rd_0 bjE = new rd_0(4);
    private static final rd_0[] bjF;
    public static final List<rd_0> bjG;
    public static final List<rd_0> bjH;
    public static final int bjI;
    private final byte bjJ;
    private static final /* synthetic */ rd_0[] bjK;

    public static rd_0[] values() {
        return (rd_0[])bjK.clone();
    }

    public static rd_0 valueOf(String string) {
        return Enum.valueOf(rd_0.class, string);
    }

    private rd_0(int n2) {
        this.bjJ = (byte)n2;
    }

    @Override
    public byte aJr() {
        return this.bjJ;
    }

    @Nullable
    public static rd_0 O(byte by) {
        for (rd_0 rd_02 : bjF) {
            if (rd_02.bjJ != by) continue;
            return rd_02;
        }
        return null;
    }

    @Nullable
    public static rd_0 di(@NotNull String string) {
        for (rd_0 rd_02 : bjF) {
            if (!rd_02.name().equalsIgnoreCase(string)) continue;
            return rd_02;
        }
        return null;
    }

    public ra_0<rd_0> T(short s) {
        return new ra_0<rd_0>(this, s);
    }

    private static /* synthetic */ rd_0[] bdr() {
        return new rd_0[]{bjA, bjB, bjC, bjD, bjE};
    }

    static {
        bjK = rd_0.bdr();
        bjF = rd_0.values();
        bjG = List.of(bjB, bjC, bjD);
        bjH = List.of(bjB, bjC, bjD, bjE);
        bjI = bjF.length;
    }
}


```

## fhc_0 — EffectDefinition (definition d'effet avec composants)
**Fichier** : `fhc_0.java` | **Taille** : 9548 B | **Lignes** : 494

*(Fichier trop long, extraction des lignes cles)*
```java
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 *  org.jetbrains.annotations.Nullable
 */
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.Nullable;

/*
    // ... (lignes 12 - 17 omises) ...
public abstract class fhc_0
implements ffj {
    // ... (lignes 21 - 26 omises) ...
    private final EnumMap<ffj_0, ang_2> spg = new EnumMap(ffj_0.class);
    // ... (lignes 42 - 47 omises) ...
    protected fgl_0 sps;
    // ... (lignes 47 - 52 omises) ...
    private fgl spt;
    // ... (lignes 82 - 87 omises) ...
    void M(Map<ffj_0, ang_2> map) {
    // ... (lignes 163 - 168 omises) ...
        this.spt = fgl2;
    // ... (lignes 320 - 325 omises) ...
    public boolean fYq() {
    // ... (lignes 334 - 339 omises) ...
        this.sps = fgl_02;
    // ... (lignes 340 - 345 omises) ...
        return this.sps;
    // ... (lignes 364 - 369 omises) ...
        return this.spt;
```

## eiy_0 — EffectResult (objet d'effet resultant)
**Fichier** : `eiy_0.java` | **Taille** : 556 B | **Lignes** : 38

```java
/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eIY
 */
public class eiy_0 {
    private final exx_2 qyk;
    private int aQL;
    private int qyl;

    public eiy_0(exx_2 exx_22) {
        this.qyk = exx_22;
    }

    public eiy_0 PX(int n) {
        this.aQL = n;
        return this;
    }

    public eiy_0 PY(int n) {
        this.qyl = n;
        return this;
    }

    public exx_2 fwS() {
        return this.qyk;
    }

    public int getValue() {
        return this.aQL;
    }

    public int fwT() {
        return this.qyl;
    }
}


```

## ffS — EffectContext (contexte passe a y())
**Fichier** : `ffS.java` | **Taille** : 4453 B | **Lignes** : 115

```java
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import org.jetbrains.annotations.Nullable;

public final class ffS
extends Enum<ffS>
implements aoq_1 {
    public static final /* enum */ ffS sgB = new ffS(0, "desc.equipment.head", "equipHeadBackground", 134);
    public static final /* enum */ ffS sgC = new ffS(1, "", "");
    public static final /* enum */ ffS sgD = new ffS(2, "", "");
    public static final /* enum */ ffS sgE = new ffS(3, "desc.equipment.shoulder", "equipShouldersBackground", 138);
    public static final /* enum */ ffS sgF = new ffS(4, "desc.equipment.neck", "equipNeckBackground", 120);
    public static final /* enum */ ffS sgG = new ffS(5, "desc.equipment.chest", "equipChestBackground", 136);
    public static final /* enum */ ffS sgH = new ffS(6, "desc.equipment.arms", "");
    public static final /* enum */ ffS sgI = new ffS(7, "desc.equipment.leftHand", "equipLeftHandBackground", 103);
    public static final /* enum */ ffS sgJ = new ffS(8, "desc.equipment.rightHand", "equipRightHandBackground", 103);
    public static final /* enum */ ffS sgK = new ffS(9, "desc.equipment.skirt", "");
    public static final /* enum */ ffS sgL = new ffS(10, "desc.equipment.belt", "equipBeltBackground", 133);
    public static final /* enum */ ffS sgM = new ffS(11, "desc.equipment.trousers", "");
    public static final /* enum */ ffS sgN = new ffS(12, "desc.equipment.legs", "equipLegsBackground", 119);
    public static final /* enum */ ffS sgO = new ffS(13, "desc.equipment.back", "equipBackBackground", 132);
    public static final /* enum */ ffS sgP = new ffS(14, "", "");
    public static final /* enum */ ffS sgQ = new ffS(15, "desc.equipment.firstWeapon", "equipFirstWeaponBackground", 100);
    public static final /* enum */ ffS sgR = new ffS(16, "desc.equipment.secondWeapon", "equipSecondWeaponBackground", 100);
    public static final /* enum */ ffS sgS = new ffS(17, "desc.equipment.accessory", "equipInsigneBackground", 646);
    public static final /* enum */ ffS sgT = new ffS(18, "", "");
    public static final /* enum */ ffS sgU = new ffS(19, "", "");
    public static final /* enum */ ffS sgV = new ffS(20, "", "");
    public static final /* enum */ ffS sgW = new ffS(21, "", "");
    public static final /* enum */ ffS sgX = new ffS(22, "desc.equipment.pet", "equipPetBackground", 582);
    @Deprecated
    public static final /* enum */ ffS sgY = new ffS(23, "desc.equipment.costume", "equipCostumeBackground");
    public static final /* enum */ ffS sgZ = new ffS(24, "desc.equipment.mount", "equipMountBackground", 611);
    public static final List<ffS> sha;
    public final byte shb;
    public final String shc;
    public final String shd;
    public final short she;
    private static final /* synthetic */ ffS[] shf;

    public static ffS[] values() {
        return (ffS[])shf.clone();
    }

    public static ffS valueOf(String string) {
        return Enum.valueOf(ffS.class, string);
    }

    private ffS(int n2, String string2, String string3) {
        this(n2, string2, string3, -1);
    }

    private ffS(int n2, String string2, String string3, int n3) {
        this.shb = (byte)n2;
        this.shc = string2;
        this.shd = string3;
        this.she = (short)n3;
    }

    public byte aJr() {
        return this.shb;
    }

    public short fVM() {
        return this.she;
    }

    public static byte fVN() {
        byte by = -1;
        for (ffS ffS2 : ffS.values()) {
            if (ffS2.shb <= by) continue;
            by = ffS2.shb;
        }
        return (byte)(by + 1);
    }

    @Override
    public String aXA() {
        return this.toString();
    }

    @Override
    public String aXB() {
        return this.toString();
    }

    @Nullable
    public static ffS gj(byte by) {
        for (ffS ffS2 : ffS.values()) {
            if (ffS2.shb != by) continue;
            return ffS2;
        }
        return null;
    }

    @Override
    public String aXC() {
        return this.aXB();
    }

    private static /* synthetic */ ffS[] fVO() {
        return new ffS[]{sgB, sgC, sgD, sgE, sgF, sgG, sgH, sgI, sgJ, sgK, sgL, sgM, sgN, sgO, sgP, sgQ, sgR, sgS, sgT, sgU, sgV, sgW, sgX, sgY, sgZ};
    }

    static {
        shf = ffS.fVO();
        sha = List.of(sgB, sgO, sgF, sgE, sgG, sgL, sgI, sgJ, sgN, sgR, sgQ, sgS, sgZ, sgX);
    }
}


```

## fgg_0 — GemColorEnum (enum couleur gemmes pour bonuses)
**Fichier** : `fgg_0.java` | **Taille** : 4541 B | **Lignes** : 92

```java
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fgg
 */
public final class fgg_0
extends Enum<fgg_0>
implements aoq_1 {
    public static final /* enum */ fgg_0 shZ = new fgg_0(1, "Objet tr\u00e9sor (interface sp\u00e9ciale)");
    public static final /* enum */ fgg_0 sia = new fgg_0(2, "Objet de qu\u00eate");
    public static final /* enum */ fgg_0 sib = new fgg_0(3, "Prend la couleur de la guilde");
    public static final /* enum */ fgg_0 sic = new fgg_0(4, "Ne peut pas \u00eatre drop\u00e9 par la bourse enutrof");
    public static final /* enum */ fgg_0 sid = new fgg_0(5, "Livre qui peut \u00eatre plac\u00e9 dans une biblioth\u00e8que");
    public static final /* enum */ fgg_0 sie = new fgg_0(6, "Cet item ne demande pas les feedbacks sur les actions qu'il d\u00e9clenche (plantation)");
    public static final /* enum */ fgg_0 sif = new fgg_0(7, "Item propos\u00e9 uniquement au shop");
    public static final /* enum */ fgg_0 sig = new fgg_0(8, "[Relique] Il ne peut y avoir qu'un seul Item ayant cette propri\u00e9t\u00e9 \u00e9quip\u00e9 \u00e0 la fois");
    public static final /* enum */ fgg_0 sih = new fgg_0(9, "Au drop de l'item, un \u00e9v\u00e8nement de jeu est cr\u00e9\u00e9 (pour les qu\u00eates et les scenarios)");
    public static final /* enum */ fgg_0 sii = new fgg_0(10, "Pas de jet bonus de loot pour cet item");
    public static final /* enum */ fgg_0 sij = new fgg_0(11, "1 xp = 1 level, level max = 32000 et ne gagne de l'xp uniquement via la commande admin");
    public static final /* enum */ fgg_0 sik = new fgg_0(12, "[Relique2] Il ne peut y avoir qu'un seul Item ayant cette propri\u00e9t\u00e9 \u00e9quip\u00e9 \u00e0 la fois");
    public static final /* enum */ fgg_0 sil = new fgg_0(13, "L'objet ne peut pas \u00eatre recycl\u00e9");
    public static final /* enum */ fgg_0 sim = new fgg_0(14, "L'objet n'est pas consomm\u00e9 \u00e0 l'utilisation (avec effets uniquement)");
    public static final /* enum */ fgg_0 sin = new fgg_0(15, "N'est pas soumis \u00e0 la condition de niveau pour pouvoir runer des gemmes");
    public static final /* enum */ fgg_0 sio = new fgg_0(16, "La difficult\u00e9 Stasis augmente le nombre de tentatives de loot sur les Transmutations");
    public static final /* enum */ fgg_0 sip = new fgg_0(17, "La difficult\u00e9 Stasis augmente le nombre de tentatives de loot sur les Ressources de Boss");
    public static final /* enum */ fgg_0 siq = new fgg_0(18, "Cache l'objet dans la liste de ressources r\u00e9coltables ou craftables d'un m\u00e9tier");
    public static final /* enum */ fgg_0 sir = new fgg_0(19, "Ajoute un slot de gemme \u00e9pique \u00e0 un objet");
    public static final /* enum */ fgg_0 sis = new fgg_0(20, "Ajoute un slot de gemme relique \u00e0 un objet ");
    public static final /* enum */ fgg_0 sit = new fgg_0(21, "Objet de qu\u00eate li\u00e9 au compte");
    public static final /* enum */ fgg_0 siu = new fgg_0(22, "Objet cach\u00e9 (Applicable qu'aux objets de qu\u00eates)");
    public static final /* enum */ fgg_0 siv = new fgg_0(23, "Objet exclus des listes d'objets comme l'auto compl\u00e9tion ou les offres d'achat");
    public static final /* enum */ fgg_0 siw = new fgg_0(24, "Objet exclus de l'encyclop\u00e9die in-game");
    private final int six;
    private final String siy;
    private static final /* synthetic */ fgg_0[] siz;

    public static fgg_0[] values() {
        return (fgg_0[])siz.clone();
    }

    public static fgg_0 valueOf(String string) {
        return Enum.valueOf(fgg_0.class, string);
    }

    private fgg_0(int n2, String string2) {
        this.six = n2;
        this.siy = string2;
    }

    @Nullable
    public static fgg_0 UZ(int n) {
        for (fgg_0 fgg_02 : fgg_0.values()) {
            if (fgg_02.six != n) continue;
            return fgg_02;
        }
        return null;
    }

    @Override
    public String aXA() {
        return String.valueOf(this.six);
    }

    public int d() {
        return this.six;
    }

    @Override
    public String aXB() {
        return this.siy;
    }

    @Override
    public String aXC() {
        return this.siy;
    }

    private static /* synthetic */ fgg_0[] fWJ() {
        return new fgg_0[]{shZ, sia, sib, sic, sid, sie, sif, sig, sih, sii, sij, sik, sil, sim, sin, sio, sip, siq, sir, sis, sit, siu, siv, siw};
    }

    static {
        siz = fgg_0.fWJ();
    }
}


```

## yd_2 — Serializer (serialisation des shards)
**Fichier** : `yd_2.java` | **Taille** : 4600 B | **Lignes** : 157

```java
/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from yd
 */
public class yd_2
implements gs_0 {
    public final ArrayList<yf_1> alb = new ArrayList(0);
    public final ArrayList<ye_2> alc = new ArrayList(0);
    public int ald = 0;
    public int ale = 0;
    public byte alf = (byte)-1;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl;
        gs_0 gs_02;
        int n;
        if (this.alb.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.alb.size());
        for (n = 0; n < this.alb.size(); ++n) {
            gs_02 = this.alb.get(n);
            bl = ((yf_1)gs_02).aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        if (this.alc.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.alc.size());
        for (n = 0; n < this.alc.size(); ++n) {
            gs_02 = this.alc.get(n);
            bl = ((ye_2)gs_02).aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        byteBuffer.putInt(this.ald);
        byteBuffer.putInt(this.ale);
        byteBuffer.put(this.alf);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.alb.clear();
        this.alb.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            yf_1 yf_12 = new yf_1();
            boolean bl = yf_12.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.alb.add(yf_12);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        this.alc.clear();
        this.alc.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            ye_2 ye_22 = new ye_2();
            boolean bl = ye_22.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.alc.add(ye_22);
        }
        this.ald = byteBuffer.getInt();
        this.ale = byteBuffer.getInt();
        this.alf = byteBuffer.get();
        return true;
    }

    @Override
    public void clear() {
        this.alb.clear();
        this.alc.clear();
        this.ald = 0;
        this.ale = 0;
        this.alf = (byte)-1;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10069001) {
            yh_2 yh_22 = new yh_2(this);
            boolean bl = yh_22.b(byteBuffer, n);
            if (bl) {
                yh_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        gs_0 gs_02;
        int n;
        int n2 = 0;
        n2 += 2;
        for (n = 0; n < this.alb.size(); ++n) {
            gs_02 = this.alb.get(n);
            n2 += ((yf_1)gs_02).DN();
        }
        n2 += 2;
        for (n = 0; n < this.alc.size(); ++n) {
            gs_02 = this.alc.get(n);
            n2 += ((ye_2)gs_02).DN();
        }
        n2 += 4;
        n2 += 4;
        return ++n2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.ev(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void ev(StringBuilder stringBuilder, String string) {
        gs_0 gs_02;
        int n;
        stringBuilder.append(string).append("shardSlot=");
        if (this.alb.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.alb.size()).append(" elements)...\n");
            for (n = 0; n < this.alb.size(); ++n) {
                gs_02 = this.alb.get(n);
                ((yf_1)gs_02).ex(stringBuilder, string + n + "/ ");
            }
        }
        stringBuilder.append(string).append("additionalGems=");
        if (this.alc.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.alc.size()).append(" elements)...\n");
            for (n = 0; n < this.alc.size(); ++n) {
                gs_02 = this.alc.get(n);
                ((ye_2)gs_02).ew(stringBuilder, string + n + "/ ");
            }
        }
        stringBuilder.append(string).append("sublimationItemId=").append(this.ald).append('\n');
        stringBuilder.append(string).append("specialSublimationItemId=").append(this.ale).append('\n');
        stringBuilder.append(string).append("charges=").append(this.alf).append('\n');
    }
}


```

## sg_0 — Interface ShardsContainer (implementee par fhi_0)
**Fichier** : `sg_0.java` | **Taille** : 257 B | **Lignes** : 16

```java
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from SG
 */
public interface sg_0 {
    @Nullable
    public String beT();
}


```

## Recherche des appelants de fhn_0 (deserialisation)

- **fhi_0.java** : 43 references
- **fhk_0.java** : 24 references
- **fhn_0.java** : 13 references
- **bow_0.java** : 12 references
- **bES.java** : 7 references
- **ffV.java** : 6 references
- **fhj_0.java** : 6 references
- **fga_0.java** : 4 references
- **fgt.java** : 3 references
- **boz_0.java** : 3 references
- **box_0.java** : 3 references
- **bom_0.java** : 3 references
- **bok_0.java** : 3 references
- **bod_0.java** : 3 references
- **fho_0.java** : 3 references
- **ber_0.java** : 3 references
- **bhp_2.java** : 2 references
- **eiz_0.java** : 1 references
- **eMi.java** : 1 references
- **fiZ.java** : 1 references

