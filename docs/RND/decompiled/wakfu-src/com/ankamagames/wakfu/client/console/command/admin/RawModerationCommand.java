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
package com.ankamagames.wakfu.client.console.command.admin;

import java.util.ArrayList;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenSource;
import org.antlr.runtime.TokenStream;
import org.apache.log4j.Logger;

public class RawModerationCommand
implements aQm {
    private static final Logger eCk = Logger.getLogger(RawModerationCommand.class);

    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        aRY aRY2;
        if (arrayList == null || arrayList.size() < 1) {
            eCk.error((Object)"Commande vide.");
            return;
        }
        String string = arrayList.get(1);
        String[] stringArray = string.trim().split("[ ]+", 2);
        if (string.length() > 0) {
            stringArray[0] = stringArray[0].toLowerCase();
        }
        Object object2 = "";
        for (String string2 : stringArray) {
            object2 = (String)object2 + string2 + " ";
        }
        eCk.info((Object)("Ex\u00e9cution de la commande brute : " + (String)object2));
        aTG aTG2 = new aTG((CharStream)new ANTLRStringStream((String)object2 + "\n"));
        CommonTokenStream commonTokenStream = new CommonTokenStream((TokenSource)aTG2);
        aTJ aTJ2 = new aTJ((TokenStream)commonTokenStream);
        try {
            aRY2 = aTJ2.cQA();
        }
        catch (RecognitionException exception) {
            String string4 = "Erreur de syntaxe dans la commande (ligne " + exception.line + ", caract\u00e8re " + exception.charPositionInLine + ", token " + exception.token.toString() + ")";
            eCk.error((Object)string4);
            aqh_0.cBI().jI(string4);
            return;
        }
        catch (amw_2 string5) {
            String string3 = "Erreur de syntaxe :" + String.valueOf(string5);
            eCk.error((Object)string3);
            aqh_0.cBI().jI(string3);
            return;
        }
        catch (Exception exception) {
            String string4 = "Commande incorrecte : " + String.valueOf(exception);
            eCk.error((Object)string4);
            aqh_0.cBI().jI(string4);
            return;
        }
        if (aRY2 != null && aRY2.isValid()) {
            aRY2.bGy();
        } else {
            String string5 = "Le parseur de commande n'a retourn\u00e9 aucun objet valide.";
            eCk.error((Object)"Le parseur de commande n'a retourn\u00e9 aucun objet valide.");
            aqh_0.cBI().jI("Le parseur de commande n'a retourn\u00e9 aucun objet valide.");
        }
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

