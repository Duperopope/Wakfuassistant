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

public final class S
extends GeneratedMessageV3
implements ah_2 {
    private static final long bQ = 0L;
    public static final int bR = 1;
    bw_2 bS;
    public static final int bT = 2;
    bw_2 bU;
    private byte Y = (byte)-1;
    private static final S bV = new S();
    static final Parser<S> bW = new T();

    S(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private S() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new S();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    S(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block12: while (!bl) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl = true;
                        continue block12;
                    }
                    case 10: {
                        by_1 by_12 = null;
                        if (this.bS != null) {
                            by_12 = this.bS.kO();
                        }
                        this.bS = (bw_2)codedInputStream.readMessage(bw_2.z(), extensionRegistryLite);
                        if (by_12 == null) continue block12;
                        by_12.k(this.bS);
                        this.bS = by_12.kV();
                        continue block12;
                    }
                    case 18: {
                        by_1 by_12 = null;
                        if (this.bU != null) {
                            by_12 = this.bU.kO();
                        }
                        this.bU = (bw_2)codedInputStream.readMessage(bw_2.z(), extensionRegistryLite);
                        if (by_12 == null) continue block12;
                        by_12.k(this.bU);
                        this.bU = by_12.kV();
                        continue block12;
                    }
                }
                if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue;
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
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor cE() {
        return c_0.aV;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return c_0.aW.ensureFieldAccessorsInitialized(S.class, u_0.class);
    }

    @Override
    public boolean cF() {
        return this.bS != null;
    }

    @Override
    public bw_2 cG() {
        return this.bS == null ? bw_2.kP() : this.bS;
    }

    @Override
    public cj_2 cH() {
        return this.cG();
    }

    @Override
    public boolean cI() {
        return this.bU != null;
    }

    @Override
    public bw_2 cJ() {
        return this.bU == null ? bw_2.kP() : this.bU;
    }

    @Override
    public cj_2 cK() {
        return this.cJ();
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.bS != null) {
            codedOutputStream.writeMessage(1, (MessageLite)this.cG());
        }
        if (this.bU != null) {
            codedOutputStream.writeMessage(2, (MessageLite)this.cJ());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if (this.bS != null) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)this.cG());
        }
        if (this.bU != null) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.cJ());
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof S)) {
            return super.equals(object);
        }
        S s = (S)object;
        if (this.cF() != s.cF()) {
            return false;
        }
        if (this.cF() && !this.cG().equals(s.cG())) {
            return false;
        }
        if (this.cI() != s.cI()) {
            return false;
        }
        if (this.cI() && !this.cJ().equals(s.cJ())) {
            return false;
        }
        return this.unknownFields.equals((Object)s.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + S.cE().hashCode();
        if (this.cF()) {
            n = 37 * n + 1;
            n = 53 * n + this.cG().hashCode();
        }
        if (this.cI()) {
            n = 37 * n + 2;
            n = 53 * n + this.cJ().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static S i(ByteBuffer byteBuffer) {
        return (S)bW.parseFrom(byteBuffer);
    }

    public static S i(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (S)bW.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static S B(ByteString byteString) {
        return (S)bW.parseFrom(byteString);
    }

    public static S i(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (S)bW.parseFrom(byteString, extensionRegistryLite);
    }

    public static S i(byte[] byArray) {
        return (S)bW.parseFrom(byArray);
    }

    public static S i(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (S)bW.parseFrom(byArray, extensionRegistryLite);
    }

    public static S q(InputStream inputStream) {
        return (S)GeneratedMessageV3.parseWithIOException(bW, (InputStream)inputStream);
    }

    public static S q(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (S)GeneratedMessageV3.parseWithIOException(bW, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static S r(InputStream inputStream) {
        return (S)GeneratedMessageV3.parseDelimitedWithIOException(bW, (InputStream)inputStream);
    }

    public static S r(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (S)GeneratedMessageV3.parseDelimitedWithIOException(bW, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static S i(CodedInputStream codedInputStream) {
        return (S)GeneratedMessageV3.parseWithIOException(bW, (CodedInputStream)codedInputStream);
    }

    public static S y(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (S)GeneratedMessageV3.parseWithIOException(bW, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public u_0 cL() {
        return S.cM();
    }

    public static u_0 cM() {
        return bV.cN();
    }

    public static u_0 a(S s) {
        return bV.cN().c(s);
    }

    public u_0 cN() {
        return this == bV ? new u_0() : new u_0().c(this);
    }

    protected u_0 i(GeneratedMessageV3.BuilderParent builderParent) {
        u_0 u_02 = new u_0(builderParent);
        return u_02;
    }

    public static S cO() {
        return bV;
    }

    public static Parser<S> z() {
        return bW;
    }

    public Parser<S> getParserForType() {
        return bW;
    }

    public S cP() {
        return bV;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.i(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.cN();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.cL();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.cN();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.cL();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.cP();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.cP();
    }

    static /* synthetic */ boolean cQ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(S s) {
        return s.unknownFields;
    }
}

