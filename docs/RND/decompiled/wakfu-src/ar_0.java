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
 *  com.google.protobuf.Internal$ListAdapter
 *  com.google.protobuf.Internal$ListAdapter$Converter
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
 * Renamed from Ar
 */
public final class ar_0
extends GeneratedMessageV3
implements aw_0 {
    private static final long aqs = 0L;
    int an;
    public static final int aqt = 1;
    long Dj;
    public static final int aqu = 2;
    long wf;
    public static final int aqv = 3;
    List<Integer> aqw;
    static final Internal.ListAdapter.Converter<Integer, aq_0> aqx = new as_0();
    public static final int aqy = 4;
    List<Integer> aqz;
    static final Internal.ListAdapter.Converter<Integer, ax_0> aqA = new at_0();
    public static final int aqB = 5;
    int aB;
    public static final int aqC = 6;
    boolean aqD;
    private byte Y = (byte)-1;
    private static final ar_0 aqE = new ar_0();
    @Deprecated
    public static final Parser<ar_0> aqF = new au_0();

    ar_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ar_0() {
        this.aqw = Collections.emptyList();
        this.aqz = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new ar_0();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ar_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block18: while (!bl) {
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block18;
                    }
                    case 8: {
                        this.an |= 1;
                        this.Dj = codedInputStream.readInt64();
                        continue block18;
                    }
                    case 16: {
                        this.an |= 2;
                        this.wf = codedInputStream.readInt64();
                        continue block18;
                    }
                    case 24: {
                        int n3 = codedInputStream.readEnum();
                        aq_0 aq_02 = aq_0.lu(n3);
                        if (aq_02 == null) {
                            builder.mergeVarintField(3, n3);
                            continue block18;
                        }
                        if ((n & 4) == 0) {
                            this.aqw = new ArrayList<Integer>();
                            n |= 4;
                        }
                        this.aqw.add(n3);
                        continue block18;
                    }
                    case 26: {
                        Enum enum_;
                        int n4;
                        int n3 = codedInputStream.readRawVarint32();
                        int n5 = codedInputStream.pushLimit(n3);
                        while (codedInputStream.getBytesUntilLimit() > 0) {
                            n4 = codedInputStream.readEnum();
                            enum_ = aq_0.lu(n4);
                            if (enum_ == null) {
                                builder.mergeVarintField(3, n4);
                                continue;
                            }
                            if ((n & 4) == 0) {
                                this.aqw = new ArrayList<Integer>();
                                n |= 4;
                            }
                            this.aqw.add(n4);
                        }
                        codedInputStream.popLimit(n5);
                        continue block18;
                    }
                    case 32: {
                        int n3 = codedInputStream.readEnum();
                        ax_0 ax_02 = ax_0.lH(n3);
                        if (ax_02 == null) {
                            builder.mergeVarintField(4, n3);
                            continue block18;
                        }
                        if ((n & 8) == 0) {
                            this.aqz = new ArrayList<Integer>();
                            n |= 8;
                        }
                        this.aqz.add(n3);
                        continue block18;
                    }
                    case 34: {
                        Enum enum_;
                        int n4;
                        int n3 = codedInputStream.readRawVarint32();
                        int n6 = codedInputStream.pushLimit(n3);
                        while (codedInputStream.getBytesUntilLimit() > 0) {
                            n4 = codedInputStream.readEnum();
                            enum_ = ax_0.lH(n4);
                            if (enum_ == null) {
                                builder.mergeVarintField(4, n4);
                                continue;
                            }
                            if ((n & 8) == 0) {
                                this.aqz = new ArrayList<Integer>();
                                n |= 8;
                            }
                            this.aqz.add(n4);
                        }
                        codedInputStream.popLimit(n6);
                        continue block18;
                    }
                    case 40: {
                        this.an |= 4;
                        this.aB = codedInputStream.readInt32();
                        continue block18;
                    }
                    case 48: {
                        this.an |= 8;
                        this.aqD = codedInputStream.readBool();
                        continue block18;
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
            if ((n & 4) != 0) {
                this.aqw = Collections.unmodifiableList(this.aqw);
            }
            if ((n & 8) != 0) {
                this.aqz = Collections.unmodifiableList(this.aqz);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor aCO() {
        return zS.app;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zS.apq.ensureFieldAccessorsInitialized(ar_0.class, av_0.class);
    }

    @Override
    public boolean Xh() {
        return (this.an & 1) != 0;
    }

    @Override
    public long Xi() {
        return this.Dj;
    }

    @Override
    public boolean KT() {
        return (this.an & 2) != 0;
    }

    @Override
    public long KU() {
        return this.wf;
    }

    @Override
    public List<aq_0> aCP() {
        return new Internal.ListAdapter(this.aqw, aqx);
    }

    @Override
    public int aCQ() {
        return this.aqw.size();
    }

    @Override
    public aq_0 lk(int n) {
        return (aq_0)((Object)aqx.convert((Object)this.aqw.get(n)));
    }

    @Override
    public List<ax_0> aCR() {
        return new Internal.ListAdapter(this.aqz, aqA);
    }

    @Override
    public int aCS() {
        return this.aqz.size();
    }

    @Override
    public ax_0 ll(int n) {
        return (ax_0)((Object)aqA.convert((Object)this.aqz.get(n)));
    }

    @Override
    public boolean aCT() {
        return (this.an & 4) != 0;
    }

    @Override
    public int aU() {
        return this.aB;
    }

    @Override
    public boolean aCU() {
        return (this.an & 8) != 0;
    }

    @Override
    public boolean aCV() {
        return this.aqD;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.Xh()) {
            this.Y = 0;
            return false;
        }
        if (!this.KT()) {
            this.Y = 0;
            return false;
        }
        if (!this.aCU()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        int n;
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt64(1, this.Dj);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt64(2, this.wf);
        }
        for (n = 0; n < this.aqw.size(); ++n) {
            codedOutputStream.writeEnum(3, this.aqw.get(n).intValue());
        }
        for (n = 0; n < this.aqz.size(); ++n) {
            codedOutputStream.writeEnum(4, this.aqz.get(n).intValue());
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeInt32(5, this.aB);
        }
        if ((this.an & 8) != 0) {
            codedOutputStream.writeBool(6, this.aqD);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n;
        int n2 = this.memoizedSize;
        if (n2 != -1) {
            return n2;
        }
        n2 = 0;
        if ((this.an & 1) != 0) {
            n2 += CodedOutputStream.computeInt64Size((int)1, (long)this.Dj);
        }
        if ((this.an & 2) != 0) {
            n2 += CodedOutputStream.computeInt64Size((int)2, (long)this.wf);
        }
        int n3 = 0;
        for (n = 0; n < this.aqw.size(); ++n) {
            n3 += CodedOutputStream.computeEnumSizeNoTag((int)this.aqw.get(n));
        }
        n2 += n3;
        n2 += 1 * this.aqw.size();
        n3 = 0;
        for (n = 0; n < this.aqz.size(); ++n) {
            n3 += CodedOutputStream.computeEnumSizeNoTag((int)this.aqz.get(n));
        }
        n2 += n3;
        n2 += 1 * this.aqz.size();
        if ((this.an & 4) != 0) {
            n2 += CodedOutputStream.computeInt32Size((int)5, (int)this.aB);
        }
        if ((this.an & 8) != 0) {
            n2 += CodedOutputStream.computeBoolSize((int)6, (boolean)this.aqD);
        }
        this.memoizedSize = n2 += this.unknownFields.getSerializedSize();
        return n2;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ar_0)) {
            return super.equals(object);
        }
        ar_0 ar_02 = (ar_0)object;
        if (this.Xh() != ar_02.Xh()) {
            return false;
        }
        if (this.Xh() && this.Xi() != ar_02.Xi()) {
            return false;
        }
        if (this.KT() != ar_02.KT()) {
            return false;
        }
        if (this.KT() && this.KU() != ar_02.KU()) {
            return false;
        }
        if (!this.aqw.equals(ar_02.aqw)) {
            return false;
        }
        if (!this.aqz.equals(ar_02.aqz)) {
            return false;
        }
        if (this.aCT() != ar_02.aCT()) {
            return false;
        }
        if (this.aCT() && this.aU() != ar_02.aU()) {
            return false;
        }
        if (this.aCU() != ar_02.aCU()) {
            return false;
        }
        if (this.aCU() && this.aCV() != ar_02.aCV()) {
            return false;
        }
        return this.unknownFields.equals((Object)ar_02.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ar_0.aCO().hashCode();
        if (this.Xh()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.Xi());
        }
        if (this.KT()) {
            n = 37 * n + 2;
            n = 53 * n + Internal.hashLong((long)this.KU());
        }
        if (this.aCQ() > 0) {
            n = 37 * n + 3;
            n = 53 * n + this.aqw.hashCode();
        }
        if (this.aCS() > 0) {
            n = 37 * n + 4;
            n = 53 * n + this.aqz.hashCode();
        }
        if (this.aCT()) {
            n = 37 * n + 5;
            n = 53 * n + this.aU();
        }
        if (this.aCU()) {
            n = 37 * n + 6;
            n = 53 * n + Internal.hashBoolean((boolean)this.aCV());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ar_0 ew(ByteBuffer byteBuffer) {
        return (ar_0)aqF.parseFrom(byteBuffer);
    }

    public static ar_0 cK(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ar_0)aqF.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ar_0 em(ByteString byteString) {
        return (ar_0)aqF.parseFrom(byteString);
    }

    public static ar_0 cK(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ar_0)aqF.parseFrom(byteString, extensionRegistryLite);
    }

    public static ar_0 cM(byte[] byArray) {
        return (ar_0)aqF.parseFrom(byArray);
    }

    public static ar_0 cK(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ar_0)aqF.parseFrom(byArray, extensionRegistryLite);
    }

    public static ar_0 gu(InputStream inputStream) {
        return (ar_0)GeneratedMessageV3.parseWithIOException(aqF, (InputStream)inputStream);
    }

    public static ar_0 gu(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ar_0)GeneratedMessageV3.parseWithIOException(aqF, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ar_0 gv(InputStream inputStream) {
        return (ar_0)GeneratedMessageV3.parseDelimitedWithIOException(aqF, (InputStream)inputStream);
    }

    public static ar_0 gv(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ar_0)GeneratedMessageV3.parseDelimitedWithIOException(aqF, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ar_0 cK(CodedInputStream codedInputStream) {
        return (ar_0)GeneratedMessageV3.parseWithIOException(aqF, (CodedInputStream)codedInputStream);
    }

    public static ar_0 ke(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ar_0)GeneratedMessageV3.parseWithIOException(aqF, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public av_0 aCW() {
        return ar_0.aCX();
    }

    public static av_0 aCX() {
        return aqE.aCY();
    }

    public static av_0 a(ar_0 ar_02) {
        return aqE.aCY().c(ar_02);
    }

    public av_0 aCY() {
        return this == aqE ? new av_0() : new av_0().c(this);
    }

    protected av_0 cK(GeneratedMessageV3.BuilderParent builderParent) {
        av_0 av_02 = new av_0(builderParent);
        return av_02;
    }

    public static ar_0 aCZ() {
        return aqE;
    }

    public static Parser<ar_0> z() {
        return aqF;
    }

    public Parser<ar_0> getParserForType() {
        return aqF;
    }

    public ar_0 aDa() {
        return aqE;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.cK(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.aCY();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.aCW();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.aCY();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.aCW();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aDa();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aDa();
    }

    static /* synthetic */ boolean B() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(ar_0 ar_02) {
        return ar_02.unknownFields;
    }
}

