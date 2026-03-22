/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.GeneratedMessageV3$UnusedPrivateParameter
 *  com.google.protobuf.Internal
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.Parser
 *  com.google.protobuf.UninitializedMessageException
 *  com.google.protobuf.UnknownFieldSet
 *  com.google.protobuf.UnknownFieldSet$Builder
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class AS
extends GeneratedMessageV3
implements AV {
    private static final long arB = 0L;
    int an;
    public static final int arC = 1;
    long apU;
    public static final int arD = 2;
    af_0 arE;
    public static final int arF = 3;
    List<aj_0> arG;
    public static final int arH = 4;
    long wf;
    public static final int arI = 5;
    List<Ab> arJ;
    public static final int arK = 6;
    volatile Object aqa;
    private byte Y = (byte)-1;
    private static final AS arL = new AS();
    @Deprecated
    public static final Parser<AS> arM = new AT();

    AS(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private AS() {
        this.arG = Collections.emptyList();
        this.arJ = Collections.emptyList();
        this.aqa = "";
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new AS();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    AS(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block16: while (!bl) {
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block16;
                    }
                    case 8: {
                        this.an |= 1;
                        this.apU = codedInputStream.readInt64();
                        continue block16;
                    }
                    case 18: {
                        Object object = null;
                        if ((this.an & 2) != 0) {
                            object = this.arE.aEi();
                        }
                        this.arE = (af_0)codedInputStream.readMessage(af_0.ard, extensionRegistryLite);
                        if (object != null) {
                            ((AH)object).c(this.arE);
                            this.arE = ((AH)object).aEp();
                        }
                        this.an |= 2;
                        continue block16;
                    }
                    case 26: {
                        if ((n & 4) == 0) {
                            this.arG = new ArrayList<aj_0>();
                            n |= 4;
                        }
                        this.arG.add((aj_0)codedInputStream.readMessage(aj_0.arj, extensionRegistryLite));
                        continue block16;
                    }
                    case 32: {
                        this.an |= 4;
                        this.wf = codedInputStream.readInt64();
                        continue block16;
                    }
                    case 42: {
                        if ((n & 0x10) == 0) {
                            this.arJ = new ArrayList<Ab>();
                            n |= 0x10;
                        }
                        this.arJ.add((Ab)codedInputStream.readMessage(Ab.aqc, extensionRegistryLite));
                        continue block16;
                    }
                    case 50: {
                        Object object = codedInputStream.readBytes();
                        this.an |= 8;
                        this.aqa = object;
                        continue block16;
                    }
                }
                if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n2)) continue;
                bl = true;
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (UninitializedMessageException uninitializedMessageException) {
            throw uninitializedMessageException.asInvalidProtocolBufferException().setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            if ((n & 4) != 0) {
                this.arG = Collections.unmodifiableList(this.arG);
            }
            if ((n & 0x10) != 0) {
                this.arJ = Collections.unmodifiableList(this.arJ);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor aFb() {
        return zS.apx;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zS.apy.ensureFieldAccessorsInitialized(AS.class, AU.class);
    }

    @Override
    @Deprecated
    public boolean aBC() {
        return (this.an & 1) != 0;
    }

    @Override
    @Deprecated
    public long aBD() {
        return this.apU;
    }

    @Override
    public boolean Yd() {
        return (this.an & 2) != 0;
    }

    @Override
    public af_0 aFc() {
        return this.arE == null ? af_0.aEj() : this.arE;
    }

    @Override
    public AI aFd() {
        return this.arE == null ? af_0.aEj() : this.arE;
    }

    @Override
    public List<aj_0> aFe() {
        return this.arG;
    }

    @Override
    public List<? extends AM> aFf() {
        return this.arG;
    }

    @Override
    public int aFg() {
        return this.arG.size();
    }

    @Override
    public aj_0 lx(int n) {
        return this.arG.get(n);
    }

    @Override
    public AM ly(int n) {
        return this.arG.get(n);
    }

    @Override
    public boolean KT() {
        return (this.an & 4) != 0;
    }

    @Override
    public long KU() {
        return this.wf;
    }

    @Override
    public List<Ab> aFh() {
        return this.arJ;
    }

    @Override
    public List<? extends Ae> aFi() {
        return this.arJ;
    }

    @Override
    public int aFj() {
        return this.arJ.size();
    }

    @Override
    public Ab lz(int n) {
        return this.arJ.get(n);
    }

    @Override
    public Ae lA(int n) {
        return this.arJ.get(n);
    }

    @Override
    public boolean aBG() {
        return (this.an & 8) != 0;
    }

    @Override
    public String aBH() {
        Object object = this.aqa;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.aqa = string;
        }
        return string;
    }

    @Override
    public ByteString aBI() {
        Object object = this.aqa;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.aqa = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public final boolean isInitialized() {
        int n;
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.Yd()) {
            this.Y = 0;
            return false;
        }
        if (!this.aFc().isInitialized()) {
            this.Y = 0;
            return false;
        }
        for (n = 0; n < this.aFg(); ++n) {
            if (this.lx(n).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        for (n = 0; n < this.aFj(); ++n) {
            if (this.lz(n).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        int n;
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt64(1, this.apU);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeMessage(2, (MessageLite)this.aFc());
        }
        for (n = 0; n < this.arG.size(); ++n) {
            codedOutputStream.writeMessage(3, (MessageLite)this.arG.get(n));
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeInt64(4, this.wf);
        }
        for (n = 0; n < this.arJ.size(); ++n) {
            codedOutputStream.writeMessage(5, (MessageLite)this.arJ.get(n));
        }
        if ((this.an & 8) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)6, (Object)this.aqa);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n;
        int n2 = this.memoizedSize;
        if (n2 != -1) {
            return n2;
        }
        n2 = 0;
        if ((this.an & 1) != 0) {
            n2 += CodedOutputStream.computeInt64Size((int)1, (long)this.apU);
        }
        if ((this.an & 2) != 0) {
            n2 += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.aFc());
        }
        for (n = 0; n < this.arG.size(); ++n) {
            n2 += CodedOutputStream.computeMessageSize((int)3, (MessageLite)((MessageLite)this.arG.get(n)));
        }
        if ((this.an & 4) != 0) {
            n2 += CodedOutputStream.computeInt64Size((int)4, (long)this.wf);
        }
        for (n = 0; n < this.arJ.size(); ++n) {
            n2 += CodedOutputStream.computeMessageSize((int)5, (MessageLite)((MessageLite)this.arJ.get(n)));
        }
        if ((this.an & 8) != 0) {
            n2 += GeneratedMessageV3.computeStringSize((int)6, (Object)this.aqa);
        }
        this.memoizedSize = n2 += this.unknownFields.getSerializedSize();
        return n2;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof AS)) {
            return super.equals(object);
        }
        AS aS = (AS)object;
        if (this.aBC() != aS.aBC()) {
            return false;
        }
        if (this.aBC() && this.aBD() != aS.aBD()) {
            return false;
        }
        if (this.Yd() != aS.Yd()) {
            return false;
        }
        if (this.Yd() && !this.aFc().equals(aS.aFc())) {
            return false;
        }
        if (!this.aFe().equals(aS.aFe())) {
            return false;
        }
        if (this.KT() != aS.KT()) {
            return false;
        }
        if (this.KT() && this.KU() != aS.KU()) {
            return false;
        }
        if (!this.aFh().equals(aS.aFh())) {
            return false;
        }
        if (this.aBG() != aS.aBG()) {
            return false;
        }
        if (this.aBG() && !this.aBH().equals(aS.aBH())) {
            return false;
        }
        return this.unknownFields.equals((Object)aS.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + AS.aFb().hashCode();
        if (this.aBC()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.aBD());
        }
        if (this.Yd()) {
            n = 37 * n + 2;
            n = 53 * n + this.aFc().hashCode();
        }
        if (this.aFg() > 0) {
            n = 37 * n + 3;
            n = 53 * n + this.aFe().hashCode();
        }
        if (this.KT()) {
            n = 37 * n + 4;
            n = 53 * n + Internal.hashLong((long)this.KU());
        }
        if (this.aFj() > 0) {
            n = 37 * n + 5;
            n = 53 * n + this.aFh().hashCode();
        }
        if (this.aBG()) {
            n = 37 * n + 6;
            n = 53 * n + this.aBH().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static AS eC(ByteBuffer byteBuffer) {
        return (AS)arM.parseFrom(byteBuffer);
    }

    public static AS cQ(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (AS)arM.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static AS eu(ByteString byteString) {
        return (AS)arM.parseFrom(byteString);
    }

    public static AS cQ(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (AS)arM.parseFrom(byteString, extensionRegistryLite);
    }

    public static AS cS(byte[] byArray) {
        return (AS)arM.parseFrom(byArray);
    }

    public static AS cQ(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (AS)arM.parseFrom(byArray, extensionRegistryLite);
    }

    public static AS gG(InputStream inputStream) {
        return (AS)GeneratedMessageV3.parseWithIOException(arM, (InputStream)inputStream);
    }

    public static AS gG(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AS)GeneratedMessageV3.parseWithIOException(arM, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AS gH(InputStream inputStream) {
        return (AS)GeneratedMessageV3.parseDelimitedWithIOException(arM, (InputStream)inputStream);
    }

    public static AS gH(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AS)GeneratedMessageV3.parseDelimitedWithIOException(arM, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AS cQ(CodedInputStream codedInputStream) {
        return (AS)GeneratedMessageV3.parseWithIOException(arM, (CodedInputStream)codedInputStream);
    }

    public static AS kw(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AS)GeneratedMessageV3.parseWithIOException(arM, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public AU aFk() {
        return AS.aFl();
    }

    public static AU aFl() {
        return arL.aFm();
    }

    public static AU f(AS aS) {
        return arL.aFm().h(aS);
    }

    public AU aFm() {
        return this == arL ? new AU() : new AU().h(this);
    }

    protected AU cQ(GeneratedMessageV3.BuilderParent builderParent) {
        AU aU = new AU(builderParent);
        return aU;
    }

    public static AS aFn() {
        return arL;
    }

    public static Parser<AS> z() {
        return arM;
    }

    public Parser<AS> getParserForType() {
        return arM;
    }

    public AS aFo() {
        return arL;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.cQ(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.aFm();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.aFk();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.aFm();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.aFk();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aFo();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aFo();
    }

    static /* synthetic */ boolean BA() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean fK() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean aFp() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet g(AS aS) {
        return aS.unknownFields;
    }
}

