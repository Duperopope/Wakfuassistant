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

public final class ic
extends GeneratedMessageV3
implements if {
    private static final long wo = 0L;
    int an;
    public static final int wp = 1;
    long wq;
    public static final int wr = 2;
    int ws;
    private byte Y = (byte)-1;
    private static final ic wt = new ic();
    @Deprecated
    public static final Parser<ic> wu = new id();

    ic(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ic() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new ic();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ic(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block12: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block12;
                    }
                    case 8: {
                        this.an |= 1;
                        this.wq = codedInputStream.readInt64();
                        continue block12;
                    }
                    case 16: {
                        this.an |= 2;
                        this.ws = codedInputStream.readInt32();
                        continue block12;
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

    public static final Descriptors.Descriptor Lv() {
        return hL.vI;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return hL.vJ.ensureFieldAccessorsInitialized(ic.class, ie.class);
    }

    @Override
    public boolean Lw() {
        return (this.an & 1) != 0;
    }

    @Override
    public long Lx() {
        return this.wq;
    }

    @Override
    public boolean Ly() {
        return (this.an & 2) != 0;
    }

    @Override
    public int Lz() {
        return this.ws;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.Lw()) {
            this.Y = 0;
            return false;
        }
        if (!this.Ly()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt64(1, this.wq);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt32(2, this.ws);
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
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.wq);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.ws);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ic)) {
            return super.equals(object);
        }
        ic ic2 = (ic)object;
        if (this.Lw() != ic2.Lw()) {
            return false;
        }
        if (this.Lw() && this.Lx() != ic2.Lx()) {
            return false;
        }
        if (this.Ly() != ic2.Ly()) {
            return false;
        }
        if (this.Ly() && this.Lz() != ic2.Lz()) {
            return false;
        }
        return this.unknownFields.equals((Object)ic2.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ic.Lv().hashCode();
        if (this.Lw()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.Lx());
        }
        if (this.Ly()) {
            n = 37 * n + 2;
            n = 53 * n + this.Lz();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ic ba(ByteBuffer byteBuffer) {
        return (ic)wu.parseFrom(byteBuffer);
    }

    public static ic aW(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ic)wu.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ic bR(ByteString byteString) {
        return (ic)wu.parseFrom(byteString);
    }

    public static ic aW(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ic)wu.parseFrom(byteString, extensionRegistryLite);
    }

    public static ic aX(byte[] byArray) {
        return (ic)wu.parseFrom(byArray);
    }

    public static ic aW(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ic)wu.parseFrom(byArray, extensionRegistryLite);
    }

    public static ic cS(InputStream inputStream) {
        return (ic)GeneratedMessageV3.parseWithIOException(wu, (InputStream)inputStream);
    }

    public static ic cS(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ic)GeneratedMessageV3.parseWithIOException(wu, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ic cT(InputStream inputStream) {
        return (ic)GeneratedMessageV3.parseDelimitedWithIOException(wu, (InputStream)inputStream);
    }

    public static ic cT(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ic)GeneratedMessageV3.parseDelimitedWithIOException(wu, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ic aW(CodedInputStream codedInputStream) {
        return (ic)GeneratedMessageV3.parseWithIOException(wu, (CodedInputStream)codedInputStream);
    }

    public static ic eO(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ic)GeneratedMessageV3.parseWithIOException(wu, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ie LA() {
        return ic.LB();
    }

    public static ie LB() {
        return wt.LC();
    }

    public static ie b(ic ic2) {
        return wt.LC().d(ic2);
    }

    public ie LC() {
        return this == wt ? new ie() : new ie().d(this);
    }

    protected ie aW(GeneratedMessageV3.BuilderParent builderParent) {
        ie ie2 = new ie(builderParent);
        return ie2;
    }

    public static ic LD() {
        return wt;
    }

    public static Parser<ic> z() {
        return wu;
    }

    public Parser<ic> getParserForType() {
        return wu;
    }

    public ic LE() {
        return wt;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.aW(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.LC();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.LA();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.LC();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.LA();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.LE();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.LE();
    }

    static /* synthetic */ boolean aJ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet c(ic ic2) {
        return ic2.unknownFields;
    }
}

