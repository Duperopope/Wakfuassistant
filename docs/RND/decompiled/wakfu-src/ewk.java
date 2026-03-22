/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ewk {
    private static final String oBt = "Export-Package:";
    public static final String oBu = "Bundle-RequiredExecutionEnvironment: JavaSE-1.6";
    private String oBv;
    private String oBw;
    private String oBx;
    private Pattern atH;
    private final ArrayList<String> oBy = new ArrayList();
    private final ArrayList<String> oBz = new ArrayList();
    private final ArrayList<String> oBA = new ArrayList();

    public void rD(String string) {
        this.oBx = string;
    }

    public void rE(String string) {
        this.oBv = string;
    }

    public void rF(String string) {
        this.oBw = string;
    }

    public void ke(String string) {
        String[] stringArray = string.split(",");
        if (stringArray.length == 0) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < stringArray.length; ++i) {
            if (i != 0) {
                stringBuilder.append("|");
            }
            stringBuilder.append(this.rG(stringArray[i]));
        }
        this.atH = Pattern.compile(stringBuilder.toString());
    }

    private String rG(String string) {
        String[] stringArray = string.split("\\.");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < stringArray.length; ++i) {
            if (i != 0) {
                stringBuilder.append("|");
            }
            for (int j = 0; j <= i; ++j) {
                if (j != 0) {
                    stringBuilder.append("\\.");
                }
                stringBuilder.append(stringArray[j]);
            }
        }
        stringBuilder.append("|").append(string.replace(".", "\\.")).append(".*");
        return stringBuilder.toString();
    }

    public void bGy() {
        File file = new File(this.oBv);
        if (!file.exists()) {
            System.out.println("Le chemin n'existe pas.");
            return;
        }
        if (!file.isDirectory()) {
            System.out.println("Le chemin n'est pas un r\u00e9pertoire.");
            return;
        }
        this.l(file);
        Collections.sort(this.oBy);
        this.feL();
        try {
            FileWriter fileWriter = new FileWriter(this.oBw);
            this.a(fileWriter);
            fileWriter.close();
        }
        catch (IOException iOException) {
            System.out.println(iOException.getMessage());
        }
    }

    private void feL() {
        try {
            String string;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fq_0.bz(this.oBx)));
            boolean bl = false;
            while ((string = bufferedReader.readLine()) != null) {
                String string2 = string.trim();
                if (string2.startsWith(oBt)) {
                    bl = true;
                }
                if (!bl && !string.equals(oBu)) {
                    this.oBA.add(string);
                    continue;
                }
                bl = string2.endsWith(",");
            }
            bufferedReader.close();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    private void l(File file) {
        File[] fileArray;
        this.oBz.add(file.getName());
        String string = this.feN();
        Matcher matcher = this.atH.matcher(string);
        if (!matcher.matches()) {
            this.oBz.remove(this.oBz.size() - 1);
            return;
        }
        boolean bl = false;
        for (File file2 : fileArray = file.listFiles()) {
            if (file2.getName().equals(".svn")) continue;
            if (file2.isDirectory()) {
                this.l(file2);
                continue;
            }
            if (bl) continue;
            bl = true;
            this.feM();
        }
        this.oBz.remove(this.oBz.size() - 1);
    }

    private void feM() {
        this.oBy.add(this.feN());
    }

    private String feN() {
        StringBuilder stringBuilder = new StringBuilder();
        int n = this.oBz.size();
        for (int i = 0; i < n; ++i) {
            if (i != 0) {
                stringBuilder.append(".");
            }
            stringBuilder.append(this.oBz.get(i));
        }
        return stringBuilder.toString();
    }

    private void a(FileWriter fileWriter) {
        try {
            int n;
            int n2 = this.oBA.size();
            for (n = 0; n < n2; ++n) {
                fileWriter.append(this.oBA.get(n)).append("\n");
            }
            fileWriter.append(oBt);
            n2 = this.oBy.size();
            for (n = 0; n < n2; ++n) {
                fileWriter.append(" ").append(this.oBy.get(n));
                if (n != n2 - 1) {
                    fileWriter.append(",");
                }
                fileWriter.append("\n");
            }
            fileWriter.append(oBu).append('\n');
        }
        catch (IOException iOException) {
            System.out.println(iOException.getMessage());
        }
    }

    public static void main(String[] stringArray) {
        if (stringArray.length != 4) {
            System.out.println("Echec de la cr\u00e9ation du manifest : mauvais nombre de param\u00e8tres");
            return;
        }
        ewk ewk2 = new ewk();
        ewk2.rE(stringArray[0]);
        ewk2.ke(stringArray[1]);
        ewk2.rD(stringArray[2]);
        ewk2.rF(stringArray[3]);
        ewk2.bGy();
    }
}

