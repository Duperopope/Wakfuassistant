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

public final class gG
extends GeneratedMessageV3
implements gJ {
    private static final long sH = 0L;
    int an;
    public static final int sI = 1;
    long sJ;
    public static final int sK = 2;
    int sL;
    public static final int sM = 3;
    long sN;
    private byte Y = (byte)-1;
    private static final gG sO = new gG();
    @Deprecated
    public static final Parser<gG> sP = new gH();

    gG(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private gG() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new gG();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    gG(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block13: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block13;
                    }
                    case 8: {
                        this.an |= 1;
                        this.sJ = codedInputStream.readInt64();
                        continue block13;
                    }
                    case 16: {
                        this.an |= 2;
                        this.sL = codedInputStream.readInt32();
                        continue block13;
                    }
                    case 24: {
                        this.an |= 4;
                        this.sN = codedInputStream.readInt64();
                        continue block13;
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

    public static final Descriptors.Descriptor EU() {
        return gc_0.sz;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return gc_0.sA.ensureFieldAccessorsInitialized(gG.class, gI.class);
    }

    @Override
    public boolean EV() {
        return (this.an & 1) != 0;
    }

    @Override
    public long EW() {
        return this.sJ;
    }

    @Override
    public boolean EX() {
        return (this.an & 2) != 0;
    }

    @Override
    public int EY() {
        return this.sL;
    }

    @Override
    public boolean EZ() {
        return (this.an & 4) != 0;
    }

    @Override
    public long Fa() {
        return this.sN;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.EV()) {
            this.Y = 0;
            return false;
        }
        if (!this.EX()) {
            this.Y = 0;
            return false;
        }
        if (!this.EZ()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt64(1, this.sJ);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt32(2, this.sL);
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeInt64(3, this.sN);
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
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.sJ);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.sL);
        }
        if ((this.an & 4) != 0) {
            n += CodedOutputStream.computeInt64Size((int)3, (long)this.sN);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof gG)) {
            return super.equals(object);
        }
        gG gG2 = (gG)object;
        if (this.EV() != gG2.EV()) {
            return false;
        }
        if (this.EV() && this.EW() != gG2.EW()) {
            return false;
        }
        if (this.EX() != gG2.EX()) {
            return false;
        }
        if (this.EX() && this.EY() != gG2.EY()) {
            return false;
        }
        if (this.EZ() != gG2.EZ()) {
            return false;
        }
        if (this.EZ() && this.Fa() != gG2.Fa()) {
            return false;
        }
        return this.unknownFields.equals((Object)gG2.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + gG.EU().hashCode();
        if (this.EV()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.EW());
        }
        if (this.EX()) {
            n = 37 * n + 2;
            n = 53 * n + this.EY();
        }
        if (this.EZ()) {
            n = 37 * n + 3;
            n = 53 * n + Internal.hashLong((long)this.Fa());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static gG aK(ByteBuffer byteBuffer) {
        return (gG)sP.parseFrom(byteBuffer);
    }

    public static gG aG(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (gG)sP.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static gG bz(ByteString byteString) {
        return (gG)sP.parseFrom(byteString);
    }

    public static gG aG(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (gG)sP.parseFrom(byteString, extensionRegistryLite);
    }

    public static gG aH(byte[] byArray) {
        return (gG)sP.parseFrom(byArray);
    }

    public static gG aG(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (gG)sP.parseFrom(byArray, extensionRegistryLite);
    }

    public static gG cm(InputStream inputStream) {
        return (gG)GeneratedMessageV3.parseWithIOException(sP, (InputStream)inputStream);
    }

    public static gG cm(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (gG)GeneratedMessageV3.parseWithIOException(sP, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static gG cn(InputStream inputStream) {
        return (gG)GeneratedMessageV3.parseDelimitedWithIOException(sP, (InputStream)inputStream);
    }

    public static gG cn(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (gG)GeneratedMessageV3.parseDelimitedWithIOException(sP, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static gG aG(CodedInputStream codedInputStream) {
        return (gG)GeneratedMessageV3.parseWithIOException(sP, (CodedInputStream)codedInputStream);
    }

    public static gG dS(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (gG)GeneratedMessageV3.parseWithIOException(sP, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public gI Fb() {
        return gG.Fc();
    }

    public static gI Fc() {
        return sO.Fd();
    }

    public static gI b(gG gG2) {
        return sO.Fd().d(gG2);
    }

    public gI Fd() {
        return this == sO ? new gI() : new gI().d(this);
    }

    protected gI aG(GeneratedMessageV3.BuilderParent builderParent) {
        gI gI2 = new gI(builderParent);
        return gI2;
    }

    public static gG Fe() {
        return sO;
    }

    public static Parser<gG> z() {
        return sP;
    }

    public Parser<gG> getParserForType() {
        return sP;
    }

    public gG Ff() {
        return sO;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.aG(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.Fd();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.Fb();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.Fd();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.Fb();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.Ff();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.Ff();
    }

    static /* synthetic */ boolean oV() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet c(gG gG2) {
        return gG2.unknownFields;
    }
}

