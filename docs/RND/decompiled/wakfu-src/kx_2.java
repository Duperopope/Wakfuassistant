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

/*
 * Renamed from kx
 */
public final class kx_2
extends GeneratedMessageV3
implements ke_2 {
    private static final long FC = 0L;
    int an;
    public static final int FD = 2;
    long DJ;
    public static final int FE = 3;
    long ur;
    public static final int FF = 4;
    volatile Object ut;
    private byte Y = (byte)-1;
    private static final kx_2 FG = new kx_2();
    @Deprecated
    public static final Parser<kx_2> FH = new ky_2();

    kx_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private kx_2() {
        this.ut = "";
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new kx_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    kx_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                    case 16: {
                        this.an |= 1;
                        this.DJ = codedInputStream.readInt64();
                        continue block13;
                    }
                    case 24: {
                        this.an |= 2;
                        this.ur = codedInputStream.readInt64();
                        continue block13;
                    }
                    case 34: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.an |= 4;
                        this.ut = byteString;
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

    public static final Descriptors.Descriptor abJ() {
        return kw_2.Fy;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kw_2.Fz.ensureFieldAccessorsInitialized(kx_2.class, kz_2.class);
    }

    @Override
    public boolean XZ() {
        return (this.an & 1) != 0;
    }

    @Override
    public long Ya() {
        return this.DJ;
    }

    @Override
    public boolean HO() {
        return (this.an & 2) != 0;
    }

    @Override
    public long HP() {
        return this.ur;
    }

    @Override
    public boolean HQ() {
        return (this.an & 4) != 0;
    }

    @Override
    public String HR() {
        Object object = this.ut;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.ut = string;
        }
        return string;
    }

    @Override
    public ByteString HS() {
        Object object = this.ut;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.ut = byteString;
            return byteString;
        }
        return (ByteString)object;
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
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt64(2, this.DJ);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt64(3, this.ur);
        }
        if ((this.an & 4) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)4, (Object)this.ut);
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
            n += CodedOutputStream.computeInt64Size((int)2, (long)this.DJ);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt64Size((int)3, (long)this.ur);
        }
        if ((this.an & 4) != 0) {
            n += GeneratedMessageV3.computeStringSize((int)4, (Object)this.ut);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof kx_2)) {
            return super.equals(object);
        }
        kx_2 kx_22 = (kx_2)object;
        if (this.XZ() != kx_22.XZ()) {
            return false;
        }
        if (this.XZ() && this.Ya() != kx_22.Ya()) {
            return false;
        }
        if (this.HO() != kx_22.HO()) {
            return false;
        }
        if (this.HO() && this.HP() != kx_22.HP()) {
            return false;
        }
        if (this.HQ() != kx_22.HQ()) {
            return false;
        }
        if (this.HQ() && !this.HR().equals(kx_22.HR())) {
            return false;
        }
        return this.unknownFields.equals((Object)kx_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + kx_2.abJ().hashCode();
        if (this.XZ()) {
            n = 37 * n + 2;
            n = 53 * n + Internal.hashLong((long)this.Ya());
        }
        if (this.HO()) {
            n = 37 * n + 3;
            n = 53 * n + Internal.hashLong((long)this.HP());
        }
        if (this.HQ()) {
            n = 37 * n + 4;
            n = 53 * n + this.HR().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static kx_2 bD(ByteBuffer byteBuffer) {
        return (kx_2)FH.parseFrom(byteBuffer);
    }

    public static kx_2 bz(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (kx_2)FH.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static kx_2 cH(ByteString byteString) {
        return (kx_2)FH.parseFrom(byteString);
    }

    public static kx_2 bz(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (kx_2)FH.parseFrom(byteString, extensionRegistryLite);
    }

    public static kx_2 bA(byte[] byArray) {
        return (kx_2)FH.parseFrom(byArray);
    }

    public static kx_2 bz(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (kx_2)FH.parseFrom(byArray, extensionRegistryLite);
    }

    public static kx_2 dY(InputStream inputStream) {
        return (kx_2)GeneratedMessageV3.parseWithIOException(FH, (InputStream)inputStream);
    }

    public static kx_2 dY(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kx_2)GeneratedMessageV3.parseWithIOException(FH, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static kx_2 dZ(InputStream inputStream) {
        return (kx_2)GeneratedMessageV3.parseDelimitedWithIOException(FH, (InputStream)inputStream);
    }

    public static kx_2 dZ(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kx_2)GeneratedMessageV3.parseDelimitedWithIOException(FH, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static kx_2 bz(CodedInputStream codedInputStream) {
        return (kx_2)GeneratedMessageV3.parseWithIOException(FH, (CodedInputStream)codedInputStream);
    }

    public static kx_2 gx(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kx_2)GeneratedMessageV3.parseWithIOException(FH, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public kz_2 abK() {
        return kx_2.abL();
    }

    public static kz_2 abL() {
        return FG.abM();
    }

    public static kz_2 a(kx_2 kx_22) {
        return FG.abM().c(kx_22);
    }

    public kz_2 abM() {
        return this == FG ? new kz_2() : new kz_2().c(this);
    }

    protected kz_2 bz(GeneratedMessageV3.BuilderParent builderParent) {
        kz_2 kz_22 = new kz_2(builderParent);
        return kz_22;
    }

    public static kx_2 abN() {
        return FG;
    }

    public static Parser<kx_2> z() {
        return FH;
    }

    public Parser<kx_2> getParserForType() {
        return FH;
    }

    public kx_2 abO() {
        return FG;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.bz(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.abM();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.abK();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.abM();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.abK();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.abO();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.abO();
    }

    static /* synthetic */ boolean aJ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(kx_2 kx_22) {
        return kx_22.unknownFields;
    }
}

