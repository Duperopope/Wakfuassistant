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

/*
 * Renamed from AN
 */
public final class an_0
extends GeneratedMessageV3
implements AW {
    private static final long arl = 0L;
    public static final int arm = 1;
    List<AS> apH;
    private byte Y = (byte)-1;
    private static final an_0 arn = new an_0();
    @Deprecated
    public static final Parser<an_0> aro = new AO();

    an_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private an_0() {
        this.apH = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new an_0();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    an_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block11: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block11;
                    }
                    case 10: {
                        if (!(bl & true)) {
                            this.apH = new ArrayList<AS>();
                            bl |= true;
                        }
                        this.apH.add((AS)codedInputStream.readMessage(AS.arM, extensionRegistryLite));
                        continue block11;
                    }
                }
                if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue;
                bl2 = true;
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
            if (bl & true) {
                this.apH = Collections.unmodifiableList(this.apH);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor aEM() {
        return zS.apv;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zS.apw.ensureFieldAccessorsInitialized(an_0.class, AP.class);
    }

    @Override
    public List<AS> aAR() {
        return this.apH;
    }

    @Override
    public List<? extends AV> aAS() {
        return this.apH;
    }

    @Override
    public int aAT() {
        return this.apH.size();
    }

    @Override
    public AS lp(int n) {
        return this.apH.get(n);
    }

    @Override
    public AV lq(int n) {
        return this.apH.get(n);
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (int i = 0; i < this.aAT(); ++i) {
            if (this.lp(i).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.apH.size(); ++i) {
            codedOutputStream.writeMessage(1, (MessageLite)this.apH.get(i));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (int i = 0; i < this.apH.size(); ++i) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.apH.get(i)));
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof an_0)) {
            return super.equals(object);
        }
        an_0 an_02 = (an_0)object;
        if (!this.aAR().equals(an_02.aAR())) {
            return false;
        }
        return this.unknownFields.equals((Object)an_02.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + an_0.aEM().hashCode();
        if (this.aAT() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.aAR().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static an_0 eB(ByteBuffer byteBuffer) {
        return (an_0)aro.parseFrom(byteBuffer);
    }

    public static an_0 cP(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (an_0)aro.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static an_0 et(ByteString byteString) {
        return (an_0)aro.parseFrom(byteString);
    }

    public static an_0 cP(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (an_0)aro.parseFrom(byteString, extensionRegistryLite);
    }

    public static an_0 cR(byte[] byArray) {
        return (an_0)aro.parseFrom(byArray);
    }

    public static an_0 cP(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (an_0)aro.parseFrom(byArray, extensionRegistryLite);
    }

    public static an_0 gE(InputStream inputStream) {
        return (an_0)GeneratedMessageV3.parseWithIOException(aro, (InputStream)inputStream);
    }

    public static an_0 gE(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (an_0)GeneratedMessageV3.parseWithIOException(aro, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static an_0 gF(InputStream inputStream) {
        return (an_0)GeneratedMessageV3.parseDelimitedWithIOException(aro, (InputStream)inputStream);
    }

    public static an_0 gF(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (an_0)GeneratedMessageV3.parseDelimitedWithIOException(aro, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static an_0 cP(CodedInputStream codedInputStream) {
        return (an_0)GeneratedMessageV3.parseWithIOException(aro, (CodedInputStream)codedInputStream);
    }

    public static an_0 kt(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (an_0)GeneratedMessageV3.parseWithIOException(aro, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public AP aEN() {
        return an_0.aEO();
    }

    public static AP aEO() {
        return arn.aEP();
    }

    public static AP c(an_0 an_02) {
        return arn.aEP().e(an_02);
    }

    public AP aEP() {
        return this == arn ? new AP() : new AP().e(this);
    }

    protected AP cP(GeneratedMessageV3.BuilderParent builderParent) {
        AP aP = new AP(builderParent);
        return aP;
    }

    public static an_0 aEQ() {
        return arn;
    }

    public static Parser<an_0> z() {
        return aro;
    }

    public Parser<an_0> getParserForType() {
        return aro;
    }

    public an_0 aER() {
        return arn;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.cP(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.aEP();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.aEN();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.aEP();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.aEN();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aER();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aER();
    }

    static /* synthetic */ boolean ar() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean afu() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet d(an_0 an_02) {
        return an_02.unknownFields;
    }
}

