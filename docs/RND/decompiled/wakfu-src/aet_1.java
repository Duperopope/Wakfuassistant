/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.lang.invoke.CallSite;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URL;
import java.net.URLClassLoader;
import java.text.MessageFormat;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from aEt
 */
public final class aet_1 {
    private static final Logger dGn = Logger.getLogger(aet_1.class);
    public static final String[] dGo;
    public static final boolean dGp;

    private aet_1() {
    }

    public static boolean ht(String string) {
        block30: {
            if (dGp) {
                try {
                    Desktop.getDesktop().browse(URI.create(string));
                    return true;
                }
                catch (IOException iOException) {
                    dGn.error((Object)("Unable to open url " + string + " with " + String.valueOf(Desktop.class)), (Throwable)iOException);
                    return false;
                }
            }
            try {
                if (dGo == null || dGo.length == 0) {
                    if (ady_1.bYZ() == ady_1.dEC) {
                        Class<?> clazz;
                        Object object;
                        boolean bl = false;
                        try {
                            if (new File("/System/Library/Java/com/apple/cocoa/application/NSWorkspace.class").exists()) {
                                object = new URLClassLoader(new URL[]{new File("/System/Library/Java").toURI().toURL()});
                                clazz = Class.forName("com.apple.cocoa.application.NSWorkspace", true, (ClassLoader)object);
                            } else {
                                clazz = Class.forName("com.apple.cocoa.application.NSWorkspace");
                            }
                            object = clazz.getMethod("sharedWorkspace", new Class[0]);
                            Object object2 = ((Method)object).invoke(null, new Object[0]);
                            Method method = clazz.getMethod("openURL", Class.forName("java.net.URL"));
                            bl = (Boolean)method.invoke(object2, new URL(string));
                        }
                        catch (Exception exception) {
                            // empty catch block
                        }
                        if (bl) break block30;
                        try {
                            clazz = Class.forName("com.apple.mrj.MRJFileUtils");
                            object = clazz.getMethod("openURL", Class.forName("java.lang.String"));
                            ((Method)object).invoke(null, string);
                            break block30;
                        }
                        catch (Exception exception) {
                            throw new IOException(exception);
                        }
                    }
                    throw new IOException();
                }
                new URL(string);
                String[] stringArray = new String[]{aet_1.hu(string)};
                String string2 = null;
                boolean bl = false;
                try {
                    for (int i = 0; i < dGo.length && !bl; ++i) {
                        try {
                            Object object;
                            String string3;
                            string2 = MessageFormat.format(dGo[i], stringArray);
                            ArrayList<String> arrayList = new ArrayList<String>();
                            aes_1 aes_12 = new aes_1(new StringReader(string2));
                            while ((string3 = aes_12.bZy()) != null) {
                                arrayList.add(string3);
                            }
                            String[] stringArray2 = new String[arrayList.size()];
                            stringArray2 = arrayList.toArray(stringArray2);
                            boolean bl2 = false;
                            if (stringArray2[0].equals("rundll32") && stringArray2[1].equals("url.dll,FileProtocolHandler")) {
                                if (stringArray2[2].startsWith("file:/")) {
                                    if (stringArray2[2].charAt(6) != '/') {
                                        stringArray2[2] = "file://" + stringArray2[2].substring(6);
                                    }
                                    if (stringArray2[2].charAt(7) != '/') {
                                        stringArray2[2] = "file:///" + stringArray2[2].substring(7);
                                    }
                                    bl2 = true;
                                } else if (stringArray2[2].toLowerCase().endsWith("html") || stringArray2[2].toLowerCase().endsWith("htm")) {
                                    bl2 = true;
                                }
                            }
                            if (bl2) {
                                object = File.createTempFile("OpenInBrowser", ".url");
                                object = ((File)object).getCanonicalFile();
                                ((File)object).deleteOnExit();
                                PrintWriter printWriter = new PrintWriter(new FileWriter((File)object));
                                printWriter.println("[InternetShortcut]");
                                printWriter.println("URL=" + stringArray2[2]);
                                printWriter.close();
                                stringArray2[2] = ((File)object).getCanonicalPath();
                            }
                            object = Runtime.getRuntime().exec(stringArray2);
                            for (int j = 0; j < 2; ++j) {
                                try {
                                    Thread.currentThread();
                                    Thread.sleep(1000L);
                                    continue;
                                }
                                catch (InterruptedException interruptedException) {
                                    // empty catch block
                                }
                            }
                            if (((Process)object).exitValue() != 0) continue;
                            bl = true;
                            continue;
                        }
                        catch (IOException iOException) {
                            // empty catch block
                        }
                    }
                    if (!bl) {
                        throw new IOException();
                    }
                }
                catch (IllegalThreadStateException illegalThreadStateException) {}
            }
            catch (Exception exception) {
                dGn.error((Object)("Unable to open url " + string + " in browser"), (Throwable)exception);
                return false;
            }
        }
        return true;
    }

    public static String hu(String string) {
        StringBuilder stringBuilder = new StringBuilder(string.length());
        for (int i = 0; i < string.length(); ++i) {
            char c2 = string.charAt(i);
            if (c2 >= 'a' && c2 <= 'z' || c2 >= 'A' && c2 <= 'Z' || c2 >= '0' && c2 <= '9' || c2 == '.' || c2 == ':' || c2 == '&' || c2 == '@' || c2 == '/' || c2 == '?' || c2 == '%' || c2 == '+' || c2 == '=' || c2 == '#' || c2 == '-' || c2 == '\\') {
                stringBuilder.append(c2);
                continue;
            }
            if ((c2 = (char)(c2 & 0xFF)) < '\u0010') {
                stringBuilder.append("%0" + Integer.toHexString(c2));
                continue;
            }
            stringBuilder.append("%" + Integer.toHexString(c2));
        }
        return stringBuilder.toString();
    }

    static {
        boolean bl = dGp = Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE);
        if (dGp) {
            dGo = null;
        } else {
            switch (ady_1.bYZ()) {
                case dEB: {
                    dGo = new String[]{"rundll32 url.dll,FileProtocolHandler {0}"};
                    break;
                }
                case dEC: {
                    ArrayList<String> arrayList = new ArrayList<String>();
                    try {
                        Process process = Runtime.getRuntime().exec("which open");
                        if (process.waitFor() == 0) {
                            arrayList.add("open {0}");
                        }
                    }
                    catch (IOException | InterruptedException exception) {
                        // empty catch block
                    }
                    if (arrayList.isEmpty()) {
                        dGo = null;
                        break;
                    }
                    dGo = arrayList.toArray(new String[0]);
                    break;
                }
                case dED: {
                    dGo = new String[]{"/usr/dt/bin/sdtwebclient {0}"};
                    break;
                }
                case dEE: {
                    ArrayList<CallSite> arrayList = new ArrayList<CallSite>();
                    try {
                        BufferedReader bufferedReader;
                        Process process;
                        boolean bl2;
                        Process process2 = Runtime.getRuntime().exec("which x-www-browser");
                        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(process2.getInputStream()));
                        String string = null;
                        String string2 = null;
                        while ((string = bufferedReader2.readLine()) != null) {
                            string2 = string;
                        }
                        boolean bl3 = bl2 = process2.waitFor() == 0;
                        if (!bl2) {
                            process = Runtime.getRuntime().exec("which www-browser");
                            bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                            while ((string = bufferedReader.readLine()) != null) {
                                string2 = string;
                            }
                            boolean bl4 = bl2 = process.waitFor() == 0;
                        }
                        if (!bl2) {
                            process = Runtime.getRuntime().exec("which xdg-open");
                            bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                            while ((string = bufferedReader.readLine()) != null) {
                                string2 = string;
                            }
                            boolean bl5 = bl2 = process.waitFor() == 0;
                        }
                        if (!bl2) {
                            process = Runtime.getRuntime().exec("which gnome-open");
                            bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                            while ((string = bufferedReader.readLine()) != null) {
                                string2 = string;
                            }
                            boolean bl6 = bl2 = process.waitFor() == 0;
                        }
                        if (!bl2) {
                            process = Runtime.getRuntime().exec("which kde-open");
                            bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                            while ((string = bufferedReader.readLine()) != null) {
                                string2 = string;
                            }
                            boolean bl7 = bl2 = process.waitFor() == 0;
                        }
                        if (bl2) {
                            arrayList.add((CallSite)((Object)(string2 + " {0}")));
                        }
                    }
                    catch (IOException | InterruptedException exception) {
                        // empty catch block
                    }
                    if (arrayList.isEmpty()) {
                        dGo = null;
                        break;
                    }
                    dGo = arrayList.toArray(new String[0]);
                    break;
                }
                default: {
                    Process process;
                    ArrayList<String> arrayList = new ArrayList<String>();
                    try {
                        process = Runtime.getRuntime().exec("which firebird");
                        if (process.waitFor() == 0) {
                            arrayList.add("firebird -remote openURL({0})");
                            arrayList.add("firebird {0}");
                        }
                    }
                    catch (IOException | InterruptedException exception) {
                        // empty catch block
                    }
                    try {
                        process = Runtime.getRuntime().exec("which mozilla");
                        if (process.waitFor() == 0) {
                            arrayList.add("mozilla -remote openURL({0})");
                            arrayList.add("mozilla {0}");
                        }
                    }
                    catch (IOException | InterruptedException exception) {
                        // empty catch block
                    }
                    try {
                        process = Runtime.getRuntime().exec("which opera");
                        if (process.waitFor() == 0) {
                            arrayList.add("opera -remote openURL({0})");
                            arrayList.add("opera {0}");
                        }
                    }
                    catch (IOException | InterruptedException exception) {
                        // empty catch block
                    }
                    try {
                        process = Runtime.getRuntime().exec("which galeon");
                        if (process.waitFor() == 0) {
                            arrayList.add("galeon {0}");
                        }
                    }
                    catch (IOException | InterruptedException exception) {
                        // empty catch block
                    }
                    try {
                        process = Runtime.getRuntime().exec("which konqueror");
                        if (process.waitFor() == 0) {
                            arrayList.add("konqueror {0}");
                        }
                    }
                    catch (IOException | InterruptedException exception) {
                        // empty catch block
                    }
                    try {
                        process = Runtime.getRuntime().exec("which netscape");
                        if (process.waitFor() == 0) {
                            arrayList.add("netscape -remote openURL({0})");
                            arrayList.add("netscape {0}");
                        }
                    }
                    catch (IOException | InterruptedException exception) {
                        // empty catch block
                    }
                    try {
                        process = Runtime.getRuntime().exec("which xterm");
                        if (process.waitFor() == 0 && (process = Runtime.getRuntime().exec("which lynx")).waitFor() == 0) {
                            arrayList.add("xterm -e lynx {0}");
                        }
                    }
                    catch (IOException | InterruptedException exception) {
                        // empty catch block
                    }
                    dGo = arrayList.isEmpty() ? null : arrayList.toArray(new String[0]);
                }
            }
        }
    }
}

