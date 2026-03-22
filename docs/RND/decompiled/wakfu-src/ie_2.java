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
 * Renamed from iE
 */
public final class ie_2
extends GeneratedMessageV3
implements ih_1 {
    private static final long zd = 0L;
    public static final int ze = 1;
    List<ii_2> zf;
    private byte Y = (byte)-1;
    private static final ie_2 zg = new ie_2();
    @Deprecated
    public static final Parser<ie_2> zh = new if_2();

    ie_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ie_2() {
        this.zf = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new ie_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ie_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                            this.zf = new ArrayList<ii_2>();
                            bl |= true;
                        }
                        this.zf.add((ii_2)codedInputStream.readMessage(ii_2.zo, extensionRegistryLite));
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
                this.zf = Collections.unmodifiableList(this.zf);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor PH() {
        return ih_2.wJ;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ih_2.wK.ensureFieldAccessorsInitialized(ie_2.class, ig_2.class);
    }

    @Override
    public List<ii_2> PI() {
        return this.zf;
    }

    @Override
    public List<? extends il_2> PJ() {
        return this.zf;
    }

    @Override
    public int PK() {
        return this.zf.size();
    }

    @Override
    public ii_2 eC(int n) {
        return this.zf.get(n);
    }

    @Override
    public il_2 eD(int n) {
        return this.zf.get(n);
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (int i = 0; i < this.PK(); ++i) {
            if (this.eC(i).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.zf.size(); ++i) {
            codedOutputStream.writeMessage(1, (MessageLite)this.zf.get(i));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (int i = 0; i < this.zf.size(); ++i) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.zf.get(i)));
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ie_2)) {
            return super.equals(object);
        }
        ie_2 ie_22 = (ie_2)object;
        if (!this.PI().equals(ie_22.PI())) {
            return false;
        }
        return this.unknownFields.equals((Object)ie_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ie_2.PH().hashCode();
        if (this.PK() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.PI().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ie_2 bg(ByteBuffer byteBuffer) {
        return (ie_2)zh.parseFrom(byteBuffer);
    }

    public static ie_2 bc(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ie_2)zh.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ie_2 bY(ByteString byteString) {
        return (ie_2)zh.parseFrom(byteString);
    }

    public static ie_2 bc(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ie_2)zh.parseFrom(byteString, extensionRegistryLite);
    }

    public static ie_2 bd(byte[] byArray) {
        return (ie_2)zh.parseFrom(byArray);
    }

    public static ie_2 bc(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ie_2)zh.parseFrom(byArray, extensionRegistryLite);
    }

    public static ie_2 de(InputStream inputStream) {
        return (ie_2)GeneratedMessageV3.parseWithIOException(zh, (InputStream)inputStream);
    }

    public static ie_2 de(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ie_2)GeneratedMessageV3.parseWithIOException(zh, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ie_2 df(InputStream inputStream) {
        return (ie_2)GeneratedMessageV3.parseDelimitedWithIOException(zh, (InputStream)inputStream);
    }

    public static ie_2 df(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ie_2)GeneratedMessageV3.parseDelimitedWithIOException(zh, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ie_2 bc(CodedInputStream codedInputStream) {
        return (ie_2)GeneratedMessageV3.parseWithIOException(zh, (CodedInputStream)codedInputStream);
    }

    public static ie_2 fg(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ie_2)GeneratedMessageV3.parseWithIOException(zh, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ig_2 PL() {
        return ie_2.PM();
    }

    public static ig_2 PM() {
        return zg.PN();
    }

    public static ig_2 c(ie_2 ie_22) {
        return zg.PN().e(ie_22);
    }

    public ig_2 PN() {
        return this == zg ? new ig_2() : new ig_2().e(this);
    }

    protected ig_2 bc(GeneratedMessageV3.BuilderParent builderParent) {
        ig_2 ig_22 = new ig_2(builderParent);
        return ig_22;
    }

    public static ie_2 PO() {
        return zg;
    }

    public static Parser<ie_2> z() {
        return zh;
    }

    public Parser<ie_2> getParserForType() {
        return zh;
    }

    public ie_2 PP() {
        return zg;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.bc(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.PN();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.PL();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.PN();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.PL();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.PP();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.PP();
    }

    static /* synthetic */ boolean gb() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean dM() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet d(ie_2 ie_22) {
        return ie_22.unknownFields;
    }
}

