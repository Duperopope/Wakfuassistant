/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

class aUe
extends DefaultHandler {
    private static final String gwF = "commandList";
    private static final String gwG = "commandSet";
    private static final String gwH = "command";
    private static final String gwI = "name";
    private static final String gwJ = "cmdPattern";
    private static final String gwK = "argsPattern";
    private static final String gwL = "allowNoArg";
    private static final String gwM = "class";
    private static final String gwN = "level";
    private static final String gwO = "autoCompletion";
    private static final String gwP = "default";
    private final Stack<aUd> gwQ = new Stack();

    public aUe(aUd aUd2) {
        this.gwQ.add(aUd2);
    }

    @Override
    public void startElement(String string, String string2, String string3, Attributes attributes) {
        if (!string3.equals(gwF)) {
            boolean bl;
            String string4 = attributes.getValue(gwI);
            String string5 = attributes.getValue(gwJ);
            String string6 = attributes.getValue(gwK);
            boolean bl2 = attributes.getValue(gwL) != null && Boolean.parseBoolean(attributes.getValue(gwL));
            String string7 = attributes.getValue(gwN);
            boolean bl3 = attributes.getValue(gwO) != null && Boolean.parseBoolean(attributes.getValue(gwO));
            boolean bl4 = bl = attributes.getValue(gwP) != null && Boolean.parseBoolean(attributes.getValue(gwP));
            if (string5 == null || string5.length() == 0) {
                aUd.gwB.error((Object)("cmdPattern est invalide pour " + string4 + "!"));
            }
            if (string3.equals(gwG)) {
                aUd aUd2 = new aUd(string5, string6, bl2);
                if (string4 != null) {
                    aUd2.setName(string4);
                }
                if (string7 != null) {
                    aUd2.aV(Byte.valueOf(string7));
                }
                aUd2.gwE = bl;
                if (!this.gwQ.isEmpty()) {
                    aUd aUd3 = (aUd)this.gwQ.lastElement();
                    aUd2.b(aUd3);
                    aUd3.b((aUf)aUd2);
                }
                this.gwQ.add(aUd2);
            } else if (string3.equals(gwH)) {
                String string8 = attributes.getValue(gwM);
                try {
                    aQm aQm2 = null;
                    try {
                        aQm2 = (aQm)this.getClass().getClassLoader().loadClass(string8).newInstance();
                    }
                    catch (InstantiationException instantiationException) {
                        aUd.gwB.error((Object)instantiationException.getMessage());
                    }
                    catch (IllegalAccessException illegalAccessException) {
                        aUd.gwB.error((Object)illegalAccessException.getMessage());
                    }
                    catch (ClassCastException classCastException) {
                        aUd.gwB.error((Object)classCastException.getMessage());
                    }
                    if (!this.gwQ.isEmpty()) {
                        aUc aUc2 = new aUc(string5, string6, aQm2, bl2);
                        if (string4 != null) {
                            aUc2.setName(string4);
                        }
                        if (string7 != null) {
                            aUc2.aV(Byte.valueOf(string7));
                        }
                        aUc2.eS(bl3);
                        ((aUd)this.gwQ.lastElement()).b(aUc2);
                    }
                }
                catch (ClassNotFoundException classNotFoundException) {
                    aUd.gwB.error((Object)"ClassNotFound", (Throwable)classNotFoundException);
                }
            }
        }
    }

    @Override
    public void endElement(String string, String string2, String string3) {
        if (string3.equals(gwG)) {
            this.gwQ.pop();
        }
    }

    @Override
    public void endDocument() {
    }
}

