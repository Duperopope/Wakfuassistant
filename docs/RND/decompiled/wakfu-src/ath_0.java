/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.antlr.runtime.BaseRecognizer
 *  org.antlr.runtime.DFA
 */
import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.DFA;

/*
 * Renamed from aTH
 */
public class ath_0
extends DFA {
    public ath_0(aTG aTG2, BaseRecognizer baseRecognizer) {
        this.recognizer = baseRecognizer;
        this.decisionNumber = 93;
        this.eot = aTG.fdt;
        this.eof = aTG.fdu;
        this.min = aTG.fdv;
        this.max = aTG.fdw;
        this.accept = aTG.fdx;
        this.special = aTG.fdy;
        this.transition = aTG.fdz;
    }

    public String getDescription() {
        return "258:1: FLOAT : ( NUMBER | NUMBER '.' ( NUMERAL )+ );";
    }
}

