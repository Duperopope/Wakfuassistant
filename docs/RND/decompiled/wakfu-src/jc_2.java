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

/*
 * Renamed from jC
 */
public final class jc_2
extends GeneratedMessageV3
implements jj_2 {
    private static final long CI = 0L;
    int an;
    public static final int CJ = 1;
    int dL;
    private byte Y = (byte)-1;
    private static final jc_2 CK = new jc_2();
    @Deprecated
    public static final Parser<jc_2> CL = new jd_2();

    jc_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private jc_2() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new jc_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    jc_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                    case 8: {
                        this.an |= 1;
                        this.dL = codedInputStream.readInt32();
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
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor Wp() {
        return jb_2.CE;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return jb_2.CF.ensureFieldAccessorsInitialized(jc_2.class, je_2.class);
    }

    @Override
    public boolean oN() {
        return (this.an & 1) != 0;
    }

    @Override
    public int d() {
        return this.dL;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.oN()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt32(1, this.dL);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.an & 1) != 0) {
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.dL);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof jc_2)) {
            return super.equals(object);
        }
        jc_2 jc_22 = (jc_2)object;
        if (this.oN() != jc_22.oN()) {
            return false;
        }
        if (this.oN() && this.d() != jc_22.d()) {
            return false;
        }
        return this.unknownFields.equals((Object)jc_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + jc_2.Wp().hashCode();
        if (this.oN()) {
            n = 37 * n + 1;
            n = 53 * n + this.d();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static jc_2 bs(ByteBuffer byteBuffer) {
        return (jc_2)CL.parseFrom(byteBuffer);
    }

    public static jc_2 bo(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (jc_2)CL.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static jc_2 cl(ByteString byteString) {
        return (jc_2)CL.parseFrom(byteString);
    }

    public static jc_2 bo(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (jc_2)CL.parseFrom(byteString, extensionRegistryLite);
    }

    public static jc_2 bp(byte[] byArray) {
        return (jc_2)CL.parseFrom(byArray);
    }

    public static jc_2 bo(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (jc_2)CL.parseFrom(byArray, extensionRegistryLite);
    }

    public static jc_2 dC(InputStream inputStream) {
        return (jc_2)GeneratedMessageV3.parseWithIOException(CL, (InputStream)inputStream);
    }

    public static jc_2 dC(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jc_2)GeneratedMessageV3.parseWithIOException(CL, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static jc_2 dD(InputStream inputStream) {
        return (jc_2)GeneratedMessageV3.parseDelimitedWithIOException(CL, (InputStream)inputStream);
    }

    public static jc_2 dD(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jc_2)GeneratedMessageV3.parseDelimitedWithIOException(CL, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static jc_2 bo(CodedInputStream codedInputStream) {
        return (jc_2)GeneratedMessageV3.parseWithIOException(CL, (CodedInputStream)codedInputStream);
    }

    public static jc_2 fQ(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jc_2)GeneratedMessageV3.parseWithIOException(CL, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public je_2 Wq() {
        return jc_2.Wr();
    }

    public static je_2 Wr() {
        return CK.Ws();
    }

    public static je_2 a(jc_2 jc_22) {
        return CK.Ws().c(jc_22);
    }

    public je_2 Ws() {
        return this == CK ? new je_2() : new je_2().c(this);
    }

    protected je_2 bo(GeneratedMessageV3.BuilderParent builderParent) {
        je_2 je_22 = new je_2(builderParent);
        return je_22;
    }

    public static jc_2 Wt() {
        return CK;
    }

    public static Parser<jc_2> z() {
        return CL;
    }

    public Parser<jc_2> getParserForType() {
        return CL;
    }

    public jc_2 Wu() {
        return CK;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.bo(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.Ws();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.Wq();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.Ws();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.Wq();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.Wu();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.Wu();
    }

    static /* synthetic */ boolean aJ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(jc_2 jc_22) {
        return jc_22.unknownFields;
    }
}

