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
 * Renamed from Mf
 */
public final class mf_2
extends GeneratedMessageV3
implements mi_2 {
    private static final long aRP = 0L;
    int an;
    public static final int aRQ = 1;
    volatile Object aRJ;
    public static final int aRR = 2;
    volatile Object aRL;
    public static final int aRS = 3;
    int ni;
    private byte Y = (byte)-1;
    private static final mf_2 aRT = new mf_2();
    @Deprecated
    public static final Parser<mf_2> aRU = new mg_2();

    mf_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private mf_2() {
        this.aRJ = "";
        this.aRL = "";
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new mf_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    mf_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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

    public static final Descriptors.Descriptor aTZ() {
        return ma_2.aRF;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ma_2.aRG.ensureFieldAccessorsInitialized(mf_2.class, mh_2.class);
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
        if (!(object instanceof mf_2)) {
            return super.equals(object);
        }
        mf_2 mf_22 = (mf_2)object;
        if (this.aTG() != mf_22.aTG()) {
            return false;
        }
        if (this.aTG() && !this.aTH().equals(mf_22.aTH())) {
            return false;
        }
        if (this.aTJ() != mf_22.aTJ()) {
            return false;
        }
        if (this.aTJ() && !this.aTK().equals(mf_22.aTK())) {
            return false;
        }
        if (this.vX() != mf_22.vX()) {
            return false;
        }
        if (this.vX() && this.vY() != mf_22.vY()) {
            return false;
        }
        return this.unknownFields.equals((Object)mf_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + mf_2.aTZ().hashCode();
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

    public static mf_2 eG(ByteBuffer byteBuffer) {
        return (mf_2)aRU.parseFrom(byteBuffer);
    }

    public static mf_2 cS(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (mf_2)aRU.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static mf_2 ez(ByteString byteString) {
        return (mf_2)aRU.parseFrom(byteString);
    }

    public static mf_2 cS(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (mf_2)aRU.parseFrom(byteString, extensionRegistryLite);
    }

    public static mf_2 dl(byte[] byArray) {
        return (mf_2)aRU.parseFrom(byArray);
    }

    public static mf_2 cS(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (mf_2)aRU.parseFrom(byArray, extensionRegistryLite);
    }

    public static mf_2 gM(InputStream inputStream) {
        return (mf_2)GeneratedMessageV3.parseWithIOException(aRU, (InputStream)inputStream);
    }

    public static mf_2 gK(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mf_2)GeneratedMessageV3.parseWithIOException(aRU, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static mf_2 gN(InputStream inputStream) {
        return (mf_2)GeneratedMessageV3.parseDelimitedWithIOException(aRU, (InputStream)inputStream);
    }

    public static mf_2 gL(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mf_2)GeneratedMessageV3.parseDelimitedWithIOException(aRU, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static mf_2 cS(CodedInputStream codedInputStream) {
        return (mf_2)GeneratedMessageV3.parseWithIOException(aRU, (CodedInputStream)codedInputStream);
    }

    public static mf_2 kC(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mf_2)GeneratedMessageV3.parseWithIOException(aRU, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public mh_2 aUa() {
        return mf_2.aUb();
    }

    public static mh_2 aUb() {
        return aRT.aUc();
    }

    public static mh_2 a(mf_2 mf_22) {
        return aRT.aUc().c(mf_22);
    }

    public mh_2 aUc() {
        return this == aRT ? new mh_2() : new mh_2().c(this);
    }

    protected mh_2 cS(GeneratedMessageV3.BuilderParent builderParent) {
        mh_2 mh_22 = new mh_2(builderParent);
        return mh_22;
    }

    public static mf_2 aUd() {
        return aRT;
    }

    public static Parser<mf_2> z() {
        return aRU;
    }

    public Parser<mf_2> getParserForType() {
        return aRU;
    }

    public mf_2 aUe() {
        return aRT;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.cS(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.aUc();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.aUa();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.aUc();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.aUa();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aUe();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aUe();
    }

    static /* synthetic */ boolean fa() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(mf_2 mf_22) {
        return mf_22.unknownFields;
    }
}

