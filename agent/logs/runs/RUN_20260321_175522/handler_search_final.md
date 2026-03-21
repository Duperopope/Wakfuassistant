=== MESSAGES SANS HANDLER CONNU ===
  13668 (cru) = MANQUANT | items equipes
  13928 (coR) = MANQUANT | reponse HDV
  13327 (crv) = MANQUANT | ?
  13500 (crw) = MANQUANT | ?
  12860 (crx) = MANQUANT | ?
  13853 (crz) = MANQUANT | ?

=== RECHERCHE HANDLERS PAR PATTERN ===
Scan des classes pour 13668 (0x3564) et 13928 (0x3668)...
Classes racine: 18716
Fichiers .class a scanner: 4700

Classes avec sipush 13668: 0
Classes avec sipush 13928: 0

=== coS COMPLET ===
Picked up JAVA_TOOL_OPTIONS: -javaagent:H:\Code\Wakfuassistant\agent\wakfu-spy-agent.jar --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED
/*
 * Decompiled with CFR 0.152.
 */
public class coS {
    private final byte mdw;
    private final long mdx;
    private final byte[] mdy;

    coS(byte by, long l, byte[] byArray) {
        this.mdw = by;
        this.mdx = l;
        this.mdy = byArray;
    }

    public byte aFW() {
        return this.mdw;
    }

    public long Sn() {
        return this.mdx;
    }

    public byte[] aKU() {
        return this.mdy;
    }
}
