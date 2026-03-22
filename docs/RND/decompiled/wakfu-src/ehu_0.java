/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.antlr.runtime.ANTLRStringStream
 *  org.antlr.runtime.CharStream
 *  org.antlr.runtime.CommonTokenStream
 *  org.antlr.runtime.RecognitionException
 *  org.antlr.runtime.TokenSource
 *  org.antlr.runtime.TokenStream
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenSource;
import org.antlr.runtime.TokenStream;
import org.apache.log4j.Logger;

/*
 * Renamed from eHu
 */
public final class ehu_0 {
    private static final Logger qrW = Logger.getLogger(ehu_0.class);

    private ehu_0() {
    }

    public static ArrayList<amx_1> rW(String string) {
        ArrayList<amx_1> arrayList;
        if (string == null || string.trim().length() == 0) {
            return null;
        }
        String string2 = string.replaceAll("[\r\n]", " ");
        ANTLRStringStream aNTLRStringStream = new ANTLRStringStream(string2);
        ehr_0 ehr_02 = new ehr_0((CharStream)aNTLRStringStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream((TokenSource)ehr_02);
        eht_0 eht_02 = new eht_0((TokenStream)commonTokenStream);
        try {
            arrayList = eht_02.fvA();
        }
        catch (RecognitionException recognitionException) {
            throw new RuntimeException("Erreur de syntaxe dans le crit\u00e8re, \u00e0 la ligne " + recognitionException.line + " caract\u00e8re " + recognitionException.charPositionInLine + " sur le Token " + recognitionException.token.toString() + ".", recognitionException);
        }
        if (eht_02.getNumberOfSyntaxErrors() != 0) {
            throw new RuntimeException("Erreur de syntaxe dans le crit\u00e8re", new Exception());
        }
        return arrayList;
    }

    public static anf_2 rX(String string) {
        ArrayList<amx_1> arrayList = ehu_0.rW(string);
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        amx_1 amx_12 = arrayList.get(arrayList.size() - 1);
        if (amx_12.bDv() != amz_1.cJC) {
            qrW.error((Object)("On a un crit\u00e8re de type " + amx_12.bDv().name() + " au lieu d'un bool\u00e9en"));
            return null;
        }
        return (anf_2)amx_12;
    }

    public static ang_2 rY(String string) {
        ArrayList<amx_1> arrayList = ehu_0.rW(string);
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        ang_2 ang_22 = null;
        for (amx_1 amx_12 : arrayList) {
            if (amx_12 == null || amx_12.bDv() != amz_1.cJz) continue;
            if (ang_22 == null) {
                ang_22 = (ang_2)amx_12;
                continue;
            }
            ang_22 = amw_1.b(ang_22, amx_12);
        }
        return ang_22;
    }
}

