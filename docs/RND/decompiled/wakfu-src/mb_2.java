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
 * Renamed from Mb
 */
public final class mb_2
extends GeneratedMessageV3
implements me_2 {
    private static final long aRH = 0L;
    int an;
    public static final int aRI = 1;
    volatile Object aRJ;
    public static final int aRK = 2;
    volatile Object aRL;
    public static final int aRM = 3;
    int ni;
    private byte Y = (byte)-1;
    private static final mb_2 aRN = new mb_2();
    @Deprecated
    public static final Parser<mb_2> aRO = new mc_2();

    mb_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private mb_2() {
        this.aRJ = "";
        this.aRL = "";
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new mb_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    mb_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                    case 10: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.an |= 1;
                        this.aRJ = byteString;
                        continue block13;
                    }
                    case 18: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.an |= 2;
                        this.aRL = byteString;
                        continue block13;
                    }
                    case 24: {
                        this.an |= 4;
                        this.ni = codedInputStream.readInt32();
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

    public static final Descriptors.Descriptor aTF() {
        return ma_2.aRD;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ma_2.aRE.ensureFieldAccessorsInitialized(mb_2.class, md_2.class);
    }

    @Override
    public boolean aTG() {
        return (this.an & 1) != 0;
    }

    @Override
    public String aTH() {
        Object object = this.aRJ;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.aRJ = string;
        }
        return string;
    }

    @Override
    public ByteString aTI() {
        Object object = this.aRJ;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.aRJ = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean aTJ() {
        return (this.an & 2) != 0;
    }

    @Override
    public String aTK() {
        Object object = this.aRL;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.aRL = string;
        }
        return string;
    }

    @Override
    public ByteString aTL() {
        Object object = this.aRL;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.aRL = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean vX() {
        return (this.an & 4) != 0;
    }

    @Override
    public int vY() {
        return this.ni;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.aTG()) {
            this.Y = 0;
            return false;
        }
        if (!this.aTJ()) {
            this.Y = 0;
            return false;
        }
        if (!this.vX()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)1, (Object)this.aRJ);
        }
        if ((this.an & 2) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)2, (Object)this.aRL);
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeInt32(3, this.ni);
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
            n += GeneratedMessageV3.computeStringSize((int)1, (Object)this.aRJ);
        }
        if ((this.an & 2) != 0) {
            n += GeneratedMessageV3.computeStringSize((int)2, (Object)this.aRL);
        }
        if ((this.an & 4) != 0) {
            n += CodedOutputStream.computeInt32Size((int)3, (int)this.ni);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof mb_2)) {
            return super.equals(object);
        }
        mb_2 mb_22 = (mb_2)object;
        if (this.aTG() != mb_22.aTG()) {
            return false;
        }
        if (this.aTG() && !this.aTH().equals(mb_22.aTH())) {
            return false;
        }
        if (this.aTJ() != mb_22.aTJ()) {
            return false;
        }
        if (this.aTJ() && !this.aTK().equals(mb_22.aTK())) {
            return false;
        }
        if (this.vX() != mb_22.vX()) {
            return false;
        }
        if (this.vX() && this.vY() != mb_22.vY()) {
            return false;
        }
        return this.unknownFields.equals((Object)mb_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + mb_2.aTF().hashCode();
        if (this.aTG()) {
            n = 37 * n + 1;
            n = 53 * n + this.aTH().hashCode();
        }
        if (this.aTJ()) {
            n = 37 * n + 2;
            n = 53 * n + this.aTK().hashCode();
        }
        if (this.vX()) {
            n = 37 * n + 3;
            n = 53 * n + this.vY();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static mb_2 eF(ByteBuffer byteBuffer) {
        return (mb_2)aRO.parseFrom(byteBuffer);
    }

    public static mb_2 cR(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (mb_2)aRO.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static mb_2 ew(ByteString byteString) {
        return (mb_2)aRO.parseFrom(byteString);
    }

    public static mb_2 cR(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (mb_2)aRO.parseFrom(byteString, extensionRegistryLite);
    }

    public static mb_2 dk(byte[] byArray) {
        return (mb_2)aRO.parseFrom(byArray);
    }

    public static mb_2 cR(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (mb_2)aRO.parseFrom(byArray, extensionRegistryLite);
    }

    public static mb_2 gK(InputStream inputStream) {
        return (mb_2)GeneratedMessageV3.parseWithIOException(aRO, (InputStream)inputStream);
    }

    public static mb_2 gI(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mb_2)GeneratedMessageV3.parseWithIOException(aRO, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static mb_2 gL(InputStream inputStream) {
        return (mb_2)GeneratedMessageV3.parseDelimitedWithIOException(aRO, (InputStream)inputStream);
    }

    public static mb_2 gJ(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mb_2)GeneratedMessageV3.parseDelimitedWithIOException(aRO, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static mb_2 cR(CodedInputStream codedInputStream) {
        return (mb_2)GeneratedMessageV3.parseWithIOException(aRO, (CodedInputStream)codedInputStream);
    }

    public static mb_2 kz(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mb_2)GeneratedMessageV3.parseWithIOException(aRO, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public md_2 aTM() {
        return mb_2.aTN();
    }

    public static md_2 aTN() {
        return aRN.aTO();
    }

    public static md_2 a(mb_2 mb_22) {
        return aRN.aTO().c(mb_22);
    }

    public md_2 aTO() {
        return this == aRN ? new md_2() : new md_2().c(this);
    }

    protected md_2 cR(GeneratedMessageV3.BuilderParent builderParent) {
        md_2 md_22 = new md_2(builderParent);
        return md_22;
    }

    public static mb_2 aTP() {
        return aRN;
    }

    public static Parser<mb_2> z() {
        return aRO;
    }

    public Parser<mb_2> getParserForType() {
        return aRO;
    }

    public mb_2 aTQ() {
        return aRN;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.cR(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.aTO();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.aTM();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.aTO();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.aTM();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aTQ();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aTQ();
    }

    static /* synthetic */ boolean aJ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(mb_2 mb_22) {
        return mb_22.unknownFields;
    }
}

