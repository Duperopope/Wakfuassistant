/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.wakfu.client.console.command.HelpCommand;
import com.ankamagames.wakfu.client.console.command.NavigateToParentCommandSetCommand;
import java.net.URL;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

/*
 * Renamed from aQg
 */
public final class aqg_0
extends aqe_0 {
    private static final Logger eBE = Logger.getLogger(aqg_0.class);
    private static final String eBF = ";";
    private static final String eBG = "/";
    private static final String eBH = "!";
    private static final String eBI = ">";
    private static final Pattern eBJ = Pattern.compile("^((/(\\w+))+/)|^(((\\w+)/)+)|^(/\\w+)");
    public static final int eBK = 0xFFFFFF;
    private static final aUc eBL = new aUc("[.]{2}", null, new NavigateToParentCommandSetCommand(), false);
    private static final aUc eBM = new aUc("/\\?", null, new HelpCommand(), false);
    private static final aqg_0 eBN = new aqg_0();
    private final aUd eBO;
    private aUd eBP;
    private aQm eBQ;
    private boolean eBR = true;
    private boolean eBS = true;
    private byte eBT = (byte)127;

    public aqg_0() {
        this.eBO = new aUd();
        this.eBO.b(eBL);
        this.eBO.b(eBM);
        this.eBP = new aUd();
    }

    public static aqg_0 cBA() {
        return eBN;
    }

    public void a(aQm aQm2) {
        this.eBQ = aQm2;
    }

    public boolean cBB() {
        return this.eBR;
    }

    public void eP(boolean bl) {
        this.eBR = bl;
    }

    public boolean cBC() {
        return this.eBS;
    }

    public void eQ(boolean bl) {
        this.eBS = bl;
    }

    public byte cBD() {
        return this.eBT;
    }

    public void aR(byte by) {
        this.eBT = by;
    }

    public aUd cBE() {
        return this.eBO;
    }

    public void cBF() {
        if (this.eBP != null && this.eBP.cUj() != null) {
            this.a(this.eBP.cUj());
        }
    }

    public void a(aUd aUd2) {
        if (aUd2 != null && aUd2 != this.eBP) {
            this.eBP = aUd2;
            String string = this.cBH();
            for (aqi_0 aqi_02 : aqh_0.cBI().cBJ()) {
                aqi_02.jJ(string);
            }
        }
    }

    public boolean g(URL uRL) {
        aUd aUd2;
        if (this.eBP != null && (aUd2 = this.eBP.cUl()) != null) {
            return aUd2.g(uRL);
        }
        return false;
    }

    public aUd cBG() {
        return this.eBP;
    }

    public String cBH() {
        if (this.eBP != null) {
            return this.eBP.bpu() + eBI;
        }
        return "";
    }

    public void jE(String string) {
        this.A(string, true);
    }

    public void A(String string, boolean bl) {
        if (bl) {
            this.jB(string);
        }
        String[] stringArray = null;
        stringArray = this.cBB() ? string.split(eBF) : new String[]{string};
        for (String string2 : stringArray) {
            Object object;
            Object object2;
            Object object3;
            Object object4;
            string2 = string2.trim();
            aUd aUd2 = null;
            if (this.cBC() && string2.startsWith(eBH)) {
                string2 = string2.substring(1);
                aUd2 = this.eBP;
            }
            if (this.cBC() && ((Matcher)(object4 = eBJ.matcher(string2))).find()) {
                object3 = ((Matcher)object4).group();
                boolean bl2 = ((String)object3).startsWith(eBG);
                if (bl2) {
                    object2 = ((String)object3).substring(1).split(eBG);
                    object = this.eBP.cUl();
                } else {
                    object2 = ((String)object3).split(eBG);
                    object = this.eBP;
                }
                if (((String[])object2).length == 1 && !((String)object3).endsWith(eBG)) {
                    string2 = string2.substring(1);
                } else {
                    for (String string3 : object2) {
                        ArrayList<aUf> arrayList = ((aUd)object).c(string3, this.eBT);
                        if (arrayList.isEmpty()) {
                            aqh_0.cBI().jI("Chemin " + string3 + " invalide");
                            break;
                        }
                        if (arrayList.size() == 1) {
                            aUf aUf2 = arrayList.get(0);
                            if (!(aUf2 instanceof aUd)) {
                                aqh_0.cBI().jI("Chemin " + string3 + " invalide");
                                break;
                            }
                        } else {
                            aqh_0.cBI().jI("Trop de possibilit\u00e9s");
                            break;
                        }
                        object = (aUd)arrayList.get(0);
                    }
                    string2 = string2.substring(((String)object3).length());
                }
                this.a((aUd)object);
            }
            object4 = new ArrayList();
            ((ArrayList)object4).addAll(this.eBP.c(string2, this.eBT));
            ((ArrayList)object4).addAll(this.eBO.c(string2, this.eBT));
            if (((ArrayList)object4).isEmpty()) {
                if (this.eBQ != null) {
                    object3 = new ArrayList<String>();
                    ((ArrayList)object3).add(string2);
                    this.eBQ.a(null, (ArrayList<String>)object3);
                } else {
                    aqh_0.cBI().jI("Commande '" + string2 + "' invalide");
                }
            } else {
                object3 = ((ArrayList)object4).iterator();
                while (object3.hasNext()) {
                    aUf aUf3 = (aUf)object3.next();
                    object = aUf3.cUi();
                    object2 = aUf3.cUq();
                    Matcher matcher = ((Pattern)object2).matcher(string2);
                    if (matcher.matches()) {
                        matcher.reset();
                        ArrayList<String> arrayList = new ArrayList<String>();
                        while (matcher.find()) {
                            for (int i = 0; i <= matcher.groupCount(); ++i) {
                                arrayList.add(matcher.group(i));
                            }
                        }
                        try {
                            object.a(aUf3, arrayList);
                        }
                        catch (Exception exception) {
                            aqh_0.cBI().jI("Exception dans l'ex\u00e9cution de la commande \u00e0 la ligne : " + string2);
                            eBE.error((Object)("Exception dans l'ex\u00e9cution de la commande \u00e0 la ligne : " + string2), (Throwable)exception);
                        }
                    } else if (((Pattern)object2).pattern().length() != 0) {
                        aqh_0.cBI().jI("Les param\u00e8tres de commande ne correspondent pas !");
                        aPd.e("error.chat.malformedCommand", new Object[0]);
                    }
                    if (object.cAW()) continue;
                    break;
                }
            }
            if (aUd2 == null) continue;
            this.a(aUd2);
        }
    }
}

