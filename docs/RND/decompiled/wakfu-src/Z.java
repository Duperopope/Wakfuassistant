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

public final class Z
extends GeneratedMessageV3
implements ac_2 {
    private static final long cf = 0L;
    public static final int cg = 1;
    S cb;
    public static final int ch = 2;
    int bC;
    private byte Y = (byte)-1;
    private static final Z ci = new Z();
    static final Parser<Z> cj = new aa_1();

    Z(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private Z() {
        this.bC = 0;
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Z();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    Z(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                        u_0 u_02 = null;
                        if (this.cb != null) {
                            u_02 = this.cb.cN();
                        }
                        this.cb = (S)codedInputStream.readMessage(S.z(), extensionRegistryLite);
                        if (u_02 == null) continue block12;
                        u_02.c(this.cb);
                        this.cb = u_02.cU();
                        continue block12;
                    }
                    case 16: {
                        int n2;
                        this.bC = n2 = codedInputStream.readEnum();
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

    public static final Descriptors.Descriptor dt() {
        return c_0.aT;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return c_0.aU.ensureFieldAccessorsInitialized(Z.class, ab_1.class);
    }

    @Override
    public boolean dd() {
        return this.cb != null;
    }

    @Override
    public S de() {
        return this.cb == null ? S.cO() : this.cb;
    }

    @Override
    public ah_2 df() {
        return this.de();
    }

    @Override
    public int cl() {
        return this.bC;
    }

    @Override
    public p_0 cm() {
        p_0 p_02 = p_0.l(this.bC);
        return p_02 == null ? p_0.bI : p_02;
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
        if (this.cb != null) {
            codedOutputStream.writeMessage(1, (MessageLite)this.de());
        }
        if (this.bC != p_0.bF.getNumber()) {
            codedOutputStream.writeEnum(2, this.bC);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if (this.cb != null) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)this.de());
        }
        if (this.bC != p_0.bF.getNumber()) {
            n += CodedOutputStream.computeEnumSize((int)2, (int)this.bC);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Z)) {
            return super.equals(object);
        }
        Z z = (Z)object;
        if (this.dd() != z.dd()) {
            return false;
        }
        if (this.dd() && !this.de().equals(z.de())) {
            return false;
        }
        if (this.bC != z.bC) {
            return false;
        }
        return this.unknownFields.equals((Object)z.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + Z.dt().hashCode();
        if (this.dd()) {
            n = 37 * n + 1;
            n = 53 * n + this.de().hashCode();
        }
        n = 37 * n + 2;
        n = 53 * n + this.bC;
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static Z k(ByteBuffer byteBuffer) {
        return (Z)cj.parseFrom(byteBuffer);
    }

    public static Z k(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Z)cj.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Z D(ByteString byteString) {
        return (Z)cj.parseFrom(byteString);
    }

    public static Z k(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Z)cj.parseFrom(byteString, extensionRegistryLite);
    }

    public static Z k(byte[] byArray) {
        return (Z)cj.parseFrom(byArray);
    }

    public static Z k(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Z)cj.parseFrom(byArray, extensionRegistryLite);
    }

    public static Z u(InputStream inputStream) {
        return (Z)GeneratedMessageV3.parseWithIOException(cj, (InputStream)inputStream);
    }

    public static Z u(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Z)GeneratedMessageV3.parseWithIOException(cj, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Z v(InputStream inputStream) {
        return (Z)GeneratedMessageV3.parseDelimitedWithIOException(cj, (InputStream)inputStream);
    }

    public static Z v(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Z)GeneratedMessageV3.parseDelimitedWithIOException(cj, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Z k(CodedInputStream codedInputStream) {
        return (Z)GeneratedMessageV3.parseWithIOException(cj, (CodedInputStream)codedInputStream);
    }

    public static Z E(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Z)GeneratedMessageV3.parseWithIOException(cj, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ab_1 du() {
        return Z.dv();
    }

    public static ab_1 dv() {
        return ci.dw();
    }

    public static ab_1 a(Z z) {
        return ci.dw().c(z);
    }

    public ab_1 dw() {
        return this == ci ? new ab_1() : new ab_1().c(this);
    }

    protected ab_1 k(GeneratedMessageV3.BuilderParent builderParent) {
        ab_1 ab_12 = new ab_1(builderParent);
        return ab_12;
    }

    public static Z dx() {
        return ci;
    }

    public static Parser<Z> z() {
        return cj;
    }

    public Parser<Z> getParserForType() {
        return cj;
    }

    public Z dy() {
        return ci;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.k(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.dw();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.du();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.dw();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.du();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.dy();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.dy();
    }

    static /* synthetic */ boolean B() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(Z z) {
        return z.unknownFields;
    }
}

