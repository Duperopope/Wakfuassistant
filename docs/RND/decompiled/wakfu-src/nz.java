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

public final class nz
extends GeneratedMessageV3
implements nc_0 {
    private static final long NT = 0L;
    int an;
    public static final int NU = 1;
    long AH;
    public static final int NV = 2;
    volatile Object bs;
    public static final int NW = 3;
    int ws;
    private byte Y = (byte)-1;
    private static final nz NX = new nz();
    @Deprecated
    public static final Parser<nz> NY = new na_0();

    nz(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private nz() {
        this.bs = "";
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new nz();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    nz(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                        this.AH = codedInputStream.readInt64();
                        continue block13;
                    }
                    case 18: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.an |= 2;
                        this.bs = byteString;
                        continue block13;
                    }
                    case 24: {
                        this.an |= 4;
                        this.ws = codedInputStream.readInt32();
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

    public static final Descriptors.Descriptor aqx() {
        return nq.Nv;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return nq.Nw.ensureFieldAccessorsInitialized(nz.class, nb_0.class);
    }

    @Override
    public boolean oN() {
        return (this.an & 1) != 0;
    }

    @Override
    public long Sn() {
        return this.AH;
    }

    @Override
    public boolean wq() {
        return (this.an & 2) != 0;
    }

    @Override
    public String getName() {
        Object object = this.bs;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.bs = string;
        }
        return string;
    }

    @Override
    public ByteString bW() {
        Object object = this.bs;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.bs = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean Ly() {
        return (this.an & 4) != 0;
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
        if (!this.oN()) {
            this.Y = 0;
            return false;
        }
        if (!this.wq()) {
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
            codedOutputStream.writeInt64(1, this.AH);
        }
        if ((this.an & 2) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)2, (Object)this.bs);
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeInt32(3, this.ws);
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
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.AH);
        }
        if ((this.an & 2) != 0) {
            n += GeneratedMessageV3.computeStringSize((int)2, (Object)this.bs);
        }
        if ((this.an & 4) != 0) {
            n += CodedOutputStream.computeInt32Size((int)3, (int)this.ws);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof nz)) {
            return super.equals(object);
        }
        nz nz2 = (nz)object;
        if (this.oN() != nz2.oN()) {
            return false;
        }
        if (this.oN() && this.Sn() != nz2.Sn()) {
            return false;
        }
        if (this.wq() != nz2.wq()) {
            return false;
        }
        if (this.wq() && !this.getName().equals(nz2.getName())) {
            return false;
        }
        if (this.Ly() != nz2.Ly()) {
            return false;
        }
        if (this.Ly() && this.Lz() != nz2.Lz()) {
            return false;
        }
        return this.unknownFields.equals((Object)nz2.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + nz.aqx().hashCode();
        if (this.oN()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.Sn());
        }
        if (this.wq()) {
            n = 37 * n + 2;
            n = 53 * n + this.getName().hashCode();
        }
        if (this.Ly()) {
            n = 37 * n + 3;
            n = 53 * n + this.Lz();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static nz cl(ByteBuffer byteBuffer) {
        return (nz)NY.parseFrom(byteBuffer);
    }

    public static nz ch(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (nz)NY.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static nz dA(ByteString byteString) {
        return (nz)NY.parseFrom(byteString);
    }

    public static nz ch(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (nz)NY.parseFrom(byteString, extensionRegistryLite);
    }

    public static nz cj(byte[] byArray) {
        return (nz)NY.parseFrom(byArray);
    }

    public static nz ch(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (nz)NY.parseFrom(byArray, extensionRegistryLite);
    }

    public static nz fo(InputStream inputStream) {
        return (nz)GeneratedMessageV3.parseWithIOException(NY, (InputStream)inputStream);
    }

    public static nz fo(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (nz)GeneratedMessageV3.parseWithIOException(NY, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static nz fp(InputStream inputStream) {
        return (nz)GeneratedMessageV3.parseDelimitedWithIOException(NY, (InputStream)inputStream);
    }

    public static nz fp(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (nz)GeneratedMessageV3.parseDelimitedWithIOException(NY, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static nz ch(CodedInputStream codedInputStream) {
        return (nz)GeneratedMessageV3.parseWithIOException(NY, (CodedInputStream)codedInputStream);
    }

    public static nz iv(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (nz)GeneratedMessageV3.parseWithIOException(NY, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public nb_0 aqy() {
        return nz.aqz();
    }

    public static nb_0 aqz() {
        return NX.aqA();
    }

    public static nb_0 b(nz nz2) {
        return NX.aqA().d(nz2);
    }

    public nb_0 aqA() {
        return this == NX ? new nb_0() : new nb_0().d(this);
    }

    protected nb_0 ch(GeneratedMessageV3.BuilderParent builderParent) {
        nb_0 nb_02 = new nb_0(builderParent);
        return nb_02;
    }

    public static nz aqB() {
        return NX;
    }

    public static Parser<nz> z() {
        return NY;
    }

    public Parser<nz> getParserForType() {
        return NY;
    }

    public nz aqC() {
        return NX;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.ch(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.aqA();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.aqy();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.aqA();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.aqy();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aqC();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aqC();
    }

    static /* synthetic */ boolean bg() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet c(nz nz2) {
        return nz2.unknownFields;
    }
}

