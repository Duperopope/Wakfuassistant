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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from iZ
 */
public final class iz_2
extends GeneratedMessageV3
implements jc_1 {
    private static final long AF = 0L;
    int an;
    public static final int AG = 1;
    long AH;
    public static final int AI = 2;
    long AJ;
    public static final int AK = 3;
    int oq;
    public static final int AL = 4;
    List<iv_2> AM;
    public static final int AN = 5;
    jx_1 AO;
    public static final int AP = 6;
    int jq;
    private byte Y = (byte)-1;
    private static final iz_2 AQ = new iz_2();
    @Deprecated
    public static final Parser<iz_2> AR = new ja_2();

    iz_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private iz_2() {
        this.AM = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new iz_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    iz_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block16: while (!bl) {
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block16;
                    }
                    case 8: {
                        this.an |= 1;
                        this.AH = codedInputStream.readInt64();
                        continue block16;
                    }
                    case 16: {
                        this.an |= 2;
                        this.AJ = codedInputStream.readInt64();
                        continue block16;
                    }
                    case 24: {
                        this.an |= 4;
                        this.oq = codedInputStream.readInt32();
                        continue block16;
                    }
                    case 34: {
                        if ((n & 8) == 0) {
                            this.AM = new ArrayList<iv_2>();
                            n |= 8;
                        }
                        this.AM.add((iv_2)codedInputStream.readMessage(iv_2.AE, extensionRegistryLite));
                        continue block16;
                    }
                    case 42: {
                        jz_1 jz_12 = null;
                        if ((this.an & 8) != 0) {
                            jz_12 = this.AO.Wa();
                        }
                        this.AO = (jx_1)codedInputStream.readMessage(jx_1.CD, extensionRegistryLite);
                        if (jz_12 != null) {
                            jz_12.g(this.AO);
                            this.AO = jz_12.Wg();
                        }
                        this.an |= 8;
                        continue block16;
                    }
                    case 48: {
                        this.an |= 0x10;
                        this.jq = codedInputStream.readInt32();
                        continue block16;
                    }
                }
                if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n2)) continue;
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
            if ((n & 8) != 0) {
                this.AM = Collections.unmodifiableList(this.AM);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor Sm() {
        return iu_2.Am;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return iu_2.An.ensureFieldAccessorsInitialized(iz_2.class, jb_1.class);
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
    public boolean So() {
        return (this.an & 2) != 0;
    }

    @Override
    public long Sp() {
        return this.AJ;
    }

    @Override
    public boolean xS() {
        return (this.an & 4) != 0;
    }

    @Override
    public int xT() {
        return this.oq;
    }

    @Override
    public List<iv_2> Sq() {
        return this.AM;
    }

    @Override
    public List<? extends iy_2> Sr() {
        return this.AM;
    }

    @Override
    public int Ss() {
        return this.AM.size();
    }

    @Override
    public iv_2 eS(int n) {
        return this.AM.get(n);
    }

    @Override
    public iy_2 eT(int n) {
        return this.AM.get(n);
    }

    @Override
    public boolean St() {
        return (this.an & 8) != 0;
    }

    @Override
    public jx_1 Su() {
        return this.AO == null ? jx_1.Wb() : this.AO;
    }

    @Override
    public ja_1 Sv() {
        return this.AO == null ? jx_1.Wb() : this.AO;
    }

    @Override
    public boolean oO() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public int oP() {
        return this.jq;
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
        if (!this.xS()) {
            this.Y = 0;
            return false;
        }
        for (int i = 0; i < this.Ss(); ++i) {
            if (this.eS(i).isInitialized()) continue;
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
            codedOutputStream.writeInt64(2, this.AJ);
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeInt32(3, this.oq);
        }
        for (int i = 0; i < this.AM.size(); ++i) {
            codedOutputStream.writeMessage(4, (MessageLite)this.AM.get(i));
        }
        if ((this.an & 8) != 0) {
            codedOutputStream.writeMessage(5, (MessageLite)this.Su());
        }
        if ((this.an & 0x10) != 0) {
            codedOutputStream.writeInt32(6, this.jq);
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
            n += CodedOutputStream.computeInt64Size((int)2, (long)this.AJ);
        }
        if ((this.an & 4) != 0) {
            n += CodedOutputStream.computeInt32Size((int)3, (int)this.oq);
        }
        for (int i = 0; i < this.AM.size(); ++i) {
            n += CodedOutputStream.computeMessageSize((int)4, (MessageLite)((MessageLite)this.AM.get(i)));
        }
        if ((this.an & 8) != 0) {
            n += CodedOutputStream.computeMessageSize((int)5, (MessageLite)this.Su());
        }
        if ((this.an & 0x10) != 0) {
            n += CodedOutputStream.computeInt32Size((int)6, (int)this.jq);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof iz_2)) {
            return super.equals(object);
        }
        iz_2 iz_22 = (iz_2)object;
        if (this.oN() != iz_22.oN()) {
            return false;
        }
        if (this.oN() && this.Sn() != iz_22.Sn()) {
            return false;
        }
        if (this.So() != iz_22.So()) {
            return false;
        }
        if (this.So() && this.Sp() != iz_22.Sp()) {
            return false;
        }
        if (this.xS() != iz_22.xS()) {
            return false;
        }
        if (this.xS() && this.xT() != iz_22.xT()) {
            return false;
        }
        if (!this.Sq().equals(iz_22.Sq())) {
            return false;
        }
        if (this.St() != iz_22.St()) {
            return false;
        }
        if (this.St() && !this.Su().equals(iz_22.Su())) {
            return false;
        }
        if (this.oO() != iz_22.oO()) {
            return false;
        }
        if (this.oO() && this.oP() != iz_22.oP()) {
            return false;
        }
        return this.unknownFields.equals((Object)iz_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + iz_2.Sm().hashCode();
        if (this.oN()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.Sn());
        }
        if (this.So()) {
            n = 37 * n + 2;
            n = 53 * n + Internal.hashLong((long)this.Sp());
        }
        if (this.xS()) {
            n = 37 * n + 3;
            n = 53 * n + this.xT();
        }
        if (this.Ss() > 0) {
            n = 37 * n + 4;
            n = 53 * n + this.Sq().hashCode();
        }
        if (this.St()) {
            n = 37 * n + 5;
            n = 53 * n + this.Su().hashCode();
        }
        if (this.oO()) {
            n = 37 * n + 6;
            n = 53 * n + this.oP();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static iz_2 bl(ByteBuffer byteBuffer) {
        return (iz_2)AR.parseFrom(byteBuffer);
    }

    public static iz_2 bh(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (iz_2)AR.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static iz_2 cd(ByteString byteString) {
        return (iz_2)AR.parseFrom(byteString);
    }

    public static iz_2 bh(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (iz_2)AR.parseFrom(byteString, extensionRegistryLite);
    }

    public static iz_2 bi(byte[] byArray) {
        return (iz_2)AR.parseFrom(byArray);
    }

    public static iz_2 bh(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (iz_2)AR.parseFrom(byArray, extensionRegistryLite);
    }

    public static iz_2 do(InputStream inputStream) {
        return (iz_2)GeneratedMessageV3.parseWithIOException(AR, (InputStream)inputStream);
    }

    public static iz_2 do(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (iz_2)GeneratedMessageV3.parseWithIOException(AR, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static iz_2 dp(InputStream inputStream) {
        return (iz_2)GeneratedMessageV3.parseDelimitedWithIOException(AR, (InputStream)inputStream);
    }

    public static iz_2 dp(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (iz_2)GeneratedMessageV3.parseDelimitedWithIOException(AR, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static iz_2 bh(CodedInputStream codedInputStream) {
        return (iz_2)GeneratedMessageV3.parseWithIOException(AR, (CodedInputStream)codedInputStream);
    }

    public static iz_2 fv(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (iz_2)GeneratedMessageV3.parseWithIOException(AR, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public jb_1 Sw() {
        return iz_2.Sx();
    }

    public static jb_1 Sx() {
        return AQ.Sy();
    }

    public static jb_1 a(iz_2 iz_22) {
        return AQ.Sy().c(iz_22);
    }

    public jb_1 Sy() {
        return this == AQ ? new jb_1() : new jb_1().c(this);
    }

    protected jb_1 bh(GeneratedMessageV3.BuilderParent builderParent) {
        jb_1 jb_12 = new jb_1(builderParent);
        return jb_12;
    }

    public static iz_2 Sz() {
        return AQ;
    }

    public static Parser<iz_2> z() {
        return AR;
    }

    public Parser<iz_2> getParserForType() {
        return AR;
    }

    public iz_2 SA() {
        return AQ;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.bh(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.Sy();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.Sw();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.Sy();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.Sw();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.SA();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.SA();
    }

    static /* synthetic */ boolean Y() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean gG() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(iz_2 iz_22) {
        return iz_22.unknownFields;
    }
}

