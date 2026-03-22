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
 * Renamed from mW
 */
public final class mw_1
extends GeneratedMessageV3
implements mZ {
    private static final long MK = 0L;
    int an;
    public static final int ML = 1;
    long MM;
    public static final int MN = 2;
    kW Fc;
    public static final int MO = 3;
    int jq;
    public static final int MP = 5;
    long Kf;
    public static final int MQ = 6;
    long MR;
    private byte Y = (byte)-1;
    private static final mw_1 MS = new mw_1();
    @Deprecated
    public static final Parser<mw_1> MT = new mx_1();

    mw_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private mw_1() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new mw_1();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    mw_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block15: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block15;
                    }
                    case 8: {
                        this.an |= 1;
                        this.MM = codedInputStream.readInt64();
                        continue block15;
                    }
                    case 18: {
                        kY kY2 = null;
                        if ((this.an & 2) != 0) {
                            kY2 = this.Fc.aem();
                        }
                        this.Fc = (kW)codedInputStream.readMessage(kW.Hs, extensionRegistryLite);
                        if (kY2 != null) {
                            kY2.h(this.Fc);
                            this.Fc = kY2.aes();
                        }
                        this.an |= 2;
                        continue block15;
                    }
                    case 24: {
                        this.an |= 4;
                        this.jq = codedInputStream.readInt32();
                        continue block15;
                    }
                    case 40: {
                        this.an |= 8;
                        this.Kf = codedInputStream.readInt64();
                        continue block15;
                    }
                    case 48: {
                        this.an |= 0x10;
                        this.MR = codedInputStream.readInt64();
                        continue block15;
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

    public static final Descriptors.Descriptor aoG() {
        return mv_0.MI;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return mv_0.MJ.ensureFieldAccessorsInitialized(mw_1.class, my_1.class);
    }

    @Override
    public boolean aoH() {
        return (this.an & 1) != 0;
    }

    @Override
    public long aoI() {
        return this.MM;
    }

    @Override
    public boolean aaz() {
        return (this.an & 2) != 0;
    }

    @Override
    public kW aaA() {
        return this.Fc == null ? kW.aen() : this.Fc;
    }

    @Override
    public lh aaB() {
        return this.Fc == null ? kW.aen() : this.Fc;
    }

    @Override
    public boolean oO() {
        return (this.an & 4) != 0;
    }

    @Override
    public int oP() {
        return this.jq;
    }

    @Override
    public boolean akc() {
        return (this.an & 8) != 0;
    }

    @Override
    public long akd() {
        return this.Kf;
    }

    @Override
    public boolean aoJ() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public long aoK() {
        return this.MR;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.aoH()) {
            this.Y = 0;
            return false;
        }
        if (!this.aaz()) {
            this.Y = 0;
            return false;
        }
        if (!this.oO()) {
            this.Y = 0;
            return false;
        }
        if (!this.akc()) {
            this.Y = 0;
            return false;
        }
        if (!this.aoJ()) {
            this.Y = 0;
            return false;
        }
        if (!this.aaA().isInitialized()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt64(1, this.MM);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeMessage(2, (MessageLite)this.aaA());
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeInt32(3, this.jq);
        }
        if ((this.an & 8) != 0) {
            codedOutputStream.writeInt64(5, this.Kf);
        }
        if ((this.an & 0x10) != 0) {
            codedOutputStream.writeInt64(6, this.MR);
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
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.MM);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.aaA());
        }
        if ((this.an & 4) != 0) {
            n += CodedOutputStream.computeInt32Size((int)3, (int)this.jq);
        }
        if ((this.an & 8) != 0) {
            n += CodedOutputStream.computeInt64Size((int)5, (long)this.Kf);
        }
        if ((this.an & 0x10) != 0) {
            n += CodedOutputStream.computeInt64Size((int)6, (long)this.MR);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof mw_1)) {
            return super.equals(object);
        }
        mw_1 mw_12 = (mw_1)object;
        if (this.aoH() != mw_12.aoH()) {
            return false;
        }
        if (this.aoH() && this.aoI() != mw_12.aoI()) {
            return false;
        }
        if (this.aaz() != mw_12.aaz()) {
            return false;
        }
        if (this.aaz() && !this.aaA().equals(mw_12.aaA())) {
            return false;
        }
        if (this.oO() != mw_12.oO()) {
            return false;
        }
        if (this.oO() && this.oP() != mw_12.oP()) {
            return false;
        }
        if (this.akc() != mw_12.akc()) {
            return false;
        }
        if (this.akc() && this.akd() != mw_12.akd()) {
            return false;
        }
        if (this.aoJ() != mw_12.aoJ()) {
            return false;
        }
        if (this.aoJ() && this.aoK() != mw_12.aoK()) {
            return false;
        }
        return this.unknownFields.equals((Object)mw_12.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + mw_1.aoG().hashCode();
        if (this.aoH()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.aoI());
        }
        if (this.aaz()) {
            n = 37 * n + 2;
            n = 53 * n + this.aaA().hashCode();
        }
        if (this.oO()) {
            n = 37 * n + 3;
            n = 53 * n + this.oP();
        }
        if (this.akc()) {
            n = 37 * n + 5;
            n = 53 * n + Internal.hashLong((long)this.akd());
        }
        if (this.aoJ()) {
            n = 37 * n + 6;
            n = 53 * n + Internal.hashLong((long)this.aoK());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static mw_1 ch(ByteBuffer byteBuffer) {
        return (mw_1)MT.parseFrom(byteBuffer);
    }

    public static mw_1 cd(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (mw_1)MT.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static mw_1 ds(ByteString byteString) {
        return (mw_1)MT.parseFrom(byteString);
    }

    public static mw_1 cd(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (mw_1)MT.parseFrom(byteString, extensionRegistryLite);
    }

    public static mw_1 ce(byte[] byArray) {
        return (mw_1)MT.parseFrom(byArray);
    }

    public static mw_1 cd(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (mw_1)MT.parseFrom(byArray, extensionRegistryLite);
    }

    public static mw_1 fg(InputStream inputStream) {
        return (mw_1)GeneratedMessageV3.parseWithIOException(MT, (InputStream)inputStream);
    }

    public static mw_1 fg(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mw_1)GeneratedMessageV3.parseWithIOException(MT, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static mw_1 fh(InputStream inputStream) {
        return (mw_1)GeneratedMessageV3.parseDelimitedWithIOException(MT, (InputStream)inputStream);
    }

    public static mw_1 fh(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mw_1)GeneratedMessageV3.parseDelimitedWithIOException(MT, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static mw_1 cd(CodedInputStream codedInputStream) {
        return (mw_1)GeneratedMessageV3.parseWithIOException(MT, (CodedInputStream)codedInputStream);
    }

    public static mw_1 ij(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mw_1)GeneratedMessageV3.parseWithIOException(MT, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public my_1 aoL() {
        return mw_1.aoM();
    }

    public static my_1 aoM() {
        return MS.aoN();
    }

    public static my_1 a(mw_1 mw_12) {
        return MS.aoN().c(mw_12);
    }

    public my_1 aoN() {
        return this == MS ? new my_1() : new my_1().c(this);
    }

    protected my_1 cd(GeneratedMessageV3.BuilderParent builderParent) {
        my_1 my_12 = new my_1(builderParent);
        return my_12;
    }

    public static mw_1 aoO() {
        return MS;
    }

    public static Parser<mw_1> z() {
        return MT;
    }

    public Parser<mw_1> getParserForType() {
        return MT;
    }

    public mw_1 aoP() {
        return MS;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.cd(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.aoN();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.aoL();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.aoN();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.aoL();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aoP();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aoP();
    }

    static /* synthetic */ boolean oV() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(mw_1 mw_12) {
        return mw_12.unknownFields;
    }
}

